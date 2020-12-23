import scala.scalajs.js
import js.Dynamic.literal
import build.BuildInfo
import miniprogram._


object Main {
  val app = literal(
    globalData = literal("label" -> "welcome to miniprogram"),
    getWxHost = () => BuildInfo.wxrequest,
    getWxCdn = () => BuildInfo.wxdownload,
    getRevision = () => s"v${BuildInfo.version} ${BuildInfo.gitHeadCommit.get.substring(0,10)}"
  )
  def main(args: Array[String]): Unit = {
    App(app)
  }
}
