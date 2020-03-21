package typingsJapgolly.reactAriaMenubutton.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactAriaMenubutton.mod.WrapperProps
import typingsJapgolly.reactAriaMenubutton.mod.WrapperState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wrapper {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    onMenuToggle: /* obj */ WrapperState => CallbackTo[js.Any] = null,
    onSelection: (/* value */ js.Any, /* event */ ReactEventFrom[HTMLElement]) => CallbackTo[js.Any] = null,
    tag: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    WrapperProps[HTMLElement], 
    typingsJapgolly.reactAriaMenubutton.mod.Wrapper, 
    Unit, 
    WrapperProps[HTMLElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.reactAriaMenubutton.mod.WrapperState) => onMenuToggle(t0).runNow()))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSelection(t0, t1).runNow()))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAriaMenubutton.mod.WrapperProps[org.scalajs.dom.raw.HTMLElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAriaMenubutton.mod.Wrapper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAriaMenubutton.mod.WrapperProps[org.scalajs.dom.raw.HTMLElement]])(children: _*)
  }
  @JSImport("react-aria-menubutton", "Wrapper")
  @js.native
  object componentImport extends js.Object
  
}

