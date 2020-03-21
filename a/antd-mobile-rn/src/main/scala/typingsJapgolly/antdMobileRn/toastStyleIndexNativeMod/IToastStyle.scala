package typingsJapgolly.antdMobileRn.toastStyleIndexNativeMod

import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastStyle extends js.Object {
  var centering: ViewStyle
  var container: ViewStyle
  var content: TextStyle
  var iconToast: ViewStyle
  var image: ImageStyle
  var innerContainer: ViewStyle
  var innerWrap: ViewStyle
  var textToast: ViewStyle
}

object IToastStyle {
  @scala.inline
  def apply(
    centering: ViewStyle,
    container: ViewStyle,
    content: TextStyle,
    iconToast: ViewStyle,
    image: ImageStyle,
    innerContainer: ViewStyle,
    innerWrap: ViewStyle,
    textToast: ViewStyle
  ): IToastStyle = {
    val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IToastStyle]
  }
}

