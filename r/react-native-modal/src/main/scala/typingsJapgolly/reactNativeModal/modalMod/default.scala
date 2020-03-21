package typingsJapgolly.reactNativeModal.modalMod

import typingsJapgolly.reactNativeModal.AnonAnimationIn
import typingsJapgolly.reactNativeModal.AnonAnimationInTiming
import typingsJapgolly.reactNativeModal.AnonIsVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal/dist/modal", JSImport.Default)
@js.native
class default protected () extends ReactNativeModal {
  def this(props: ModalProps) = this()
}

/* static members */
@JSImport("react-native-modal/dist/modal", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: AnonAnimationInTiming = js.native
  var propTypes: AnonAnimationIn = js.native
  def getDerivedStateFromProps(nextProps: ModalProps, state: State): AnonIsVisible | Null = js.native
}

