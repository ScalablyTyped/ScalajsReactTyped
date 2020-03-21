package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonIndex
import typingsJapgolly.primereact.accordionMod.AccordionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  def apply(
    activeIndex: js.Any = null,
    className: String = null,
    id: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onTabChange: /* e */ AnonIndex => Callback = null,
    onTabClose: /* e */ AnonIndex => Callback = null,
    onTabOpen: /* e */ AnonIndex => Callback = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AccordionProps, typingsJapgolly.primereact.mod.Accordion, Unit, AccordionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabChange(t0).runNow()))
    if (onTabClose != null) __obj.updateDynamic("onTabClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabClose(t0).runNow()))
    if (onTabOpen != null) __obj.updateDynamic("onTabOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabOpen(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.accordionMod.AccordionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.mod.Accordion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.accordionMod.AccordionProps])(children: _*)
  }
  @JSImport("primereact/accordion", "Accordion")
  @js.native
  object componentImport extends js.Object
  
}

