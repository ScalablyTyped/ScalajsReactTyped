package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formatjsIntlRelativetimeformat.mod.Unit
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactIntl.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedRelativeTime {
  def apply(
    format: String = null,
    unit: Unit = null,
    updateIntervalInSeconds: Int | Double = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* value */ String => CallbackTo[ReactChild] = null
  ): UnmountedWithRoot[Props, typingsJapgolly.reactIntl.mod.FormattedRelativeTime, scala.Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => children(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (updateIntervalInSeconds != null) __obj.updateDynamic("updateIntervalInSeconds")(updateIntervalInSeconds.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactIntl.mod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactIntl.mod.FormattedRelativeTime](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.mod.Props])
  }
  @JSImport("react-intl", "FormattedRelativeTime")
  @js.native
  object componentImport extends js.Object
  
}

