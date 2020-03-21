package typingsJapgolly.antDesignReactNative.imagePickerMod

import typingsJapgolly.antDesignReactNative.AnonCloseText
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePicker
  extends Component[ImagePickerProps, js.Any, js.Any] {
  var plusText: js.Any = js.native
  var plusWrap: js.Any = js.native
  def addImage(imageObj: js.Any): Unit = js.native
  def hideImageRoll(): Unit = js.native
  def onImageClick(index: Double): Unit = js.native
  def onPressIn(styles: AnonCloseText): js.Function0[Unit] = js.native
  def onPressOut(styles: AnonCloseText): js.Function0[Unit] = js.native
  def removeImage(idx: Double): Unit = js.native
  def showPicker(): Unit = js.native
}

