package typingsJapgolly.reactAddToCalendar.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAddToCalendar.mod.AddToCalendarEvent
import typingsJapgolly.reactAddToCalendar.mod.AddToCalendarProps
import typingsJapgolly.reactAddToCalendar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAddToCalendar {
  def apply(
    event: AddToCalendarEvent,
    buttonClassClosed: String = null,
    buttonClassOpen: String = null,
    buttonIconClass: String = null,
    buttonLabel: String = null,
    buttonTemplate: js.Any = null,
    buttonWrapperClass: String = null,
    displayItemIcons: js.UndefOr[Boolean] = js.undefined,
    dropdownClass: String = null,
    listItems: js.Array[_] = null,
    optionsOpen: js.UndefOr[Boolean] = js.undefined,
    rootClass: String = null,
    useFontAwesomeIcons: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AddToCalendarProps, default, Unit, AddToCalendarProps] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
      if (buttonClassClosed != null) __obj.updateDynamic("buttonClassClosed")(buttonClassClosed.asInstanceOf[js.Any])
    if (buttonClassOpen != null) __obj.updateDynamic("buttonClassOpen")(buttonClassOpen.asInstanceOf[js.Any])
    if (buttonIconClass != null) __obj.updateDynamic("buttonIconClass")(buttonIconClass.asInstanceOf[js.Any])
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (buttonTemplate != null) __obj.updateDynamic("buttonTemplate")(buttonTemplate.asInstanceOf[js.Any])
    if (buttonWrapperClass != null) __obj.updateDynamic("buttonWrapperClass")(buttonWrapperClass.asInstanceOf[js.Any])
    if (!js.isUndefined(displayItemIcons)) __obj.updateDynamic("displayItemIcons")(displayItemIcons.asInstanceOf[js.Any])
    if (dropdownClass != null) __obj.updateDynamic("dropdownClass")(dropdownClass.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsOpen)) __obj.updateDynamic("optionsOpen")(optionsOpen.asInstanceOf[js.Any])
    if (rootClass != null) __obj.updateDynamic("rootClass")(rootClass.asInstanceOf[js.Any])
    if (!js.isUndefined(useFontAwesomeIcons)) __obj.updateDynamic("useFontAwesomeIcons")(useFontAwesomeIcons.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAddToCalendar.mod.AddToCalendarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAddToCalendar.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAddToCalendar.mod.AddToCalendarProps])(children: _*)
  }
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

