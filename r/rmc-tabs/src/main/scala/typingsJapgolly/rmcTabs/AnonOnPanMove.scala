package typingsJapgolly.rmcTabs

import typingsJapgolly.rcGesture.mod.IGestureStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnPanMove extends js.Object {
  def onPanEnd(): Unit = js.native
  def onPanMove(status: IGestureStatus): Unit = js.native
  def onPanStart(status: IGestureStatus): Unit = js.native
  def setCurrentOffset(offset: String): String | Double = js.native
  def setCurrentOffset(offset: Double): String | Double = js.native
}

