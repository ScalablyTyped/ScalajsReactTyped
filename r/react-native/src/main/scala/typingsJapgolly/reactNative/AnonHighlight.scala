package typingsJapgolly.reactNative

import typingsJapgolly.reactNative.reactNativeStrings.leading
import typingsJapgolly.reactNative.reactNativeStrings.trailing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHighlight extends js.Object {
  def highlight(): Unit = js.native
  def unhighlight(): Unit = js.native
  @JSName("updateProps")
  def updateProps_leading(select: leading, newProps: js.Any): Unit = js.native
  @JSName("updateProps")
  def updateProps_trailing(select: trailing, newProps: js.Any): Unit = js.native
}

