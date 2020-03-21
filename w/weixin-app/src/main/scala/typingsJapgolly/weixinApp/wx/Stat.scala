package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var lastAccessedTime: Double
  var lastModifiedTime: Double
  var mode: String
  var size: Double
  def isDirectory(): Boolean
  def isFile(): Boolean
}

object Stat {
  @scala.inline
  def apply(
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    lastAccessedTime: Double,
    lastModifiedTime: Double,
    mode: String,
    size: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(lastAccessedTime = lastAccessedTime.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    __obj.asInstanceOf[Stat]
  }
}

