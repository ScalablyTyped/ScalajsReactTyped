package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.accordionMod.AccordionTabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AccordionTab {
  def apply(
    contentClassName: String = null,
    contentStyle: js.Object = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: String = null,
    headerStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AccordionTabProps, 
    typingsJapgolly.primereact.mod.AccordionTab, 
    Unit, 
    AccordionTabProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.accordionMod.AccordionTabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.mod.AccordionTab](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.accordionMod.AccordionTabProps])(children: _*)
  }
  @JSImport("primereact/accordion", "AccordionTab")
  @js.native
  object componentImport extends js.Object
  
}

