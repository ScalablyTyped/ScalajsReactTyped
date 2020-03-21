package typingsJapgolly.antdMobileRn.stepsIndexNativeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.horizontal
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.vertical
import typingsJapgolly.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsNativeProps extends StepsProps {
  @JSName("styles")
  var styles_StepsNativeProps: js.UndefOr[IStepsStyle] = js.undefined
}

object StepsNativeProps {
  @scala.inline
  def apply(
    children: js.Array[Element],
    current: Int | Double = null,
    direction: vertical | horizontal = null,
    finishIcon: String = null,
    size: String = null,
    styles: IStepsStyle = null
  ): StepsNativeProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (finishIcon != null) __obj.updateDynamic("finishIcon")(finishIcon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsNativeProps]
  }
}

