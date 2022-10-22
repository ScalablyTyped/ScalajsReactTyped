package typingsJapgolly.formsyReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.formsyReact.distFormsyMod.FormsyProps
import typingsJapgolly.formsyReact.distInterfacesMod.IModel
import typingsJapgolly.formsyReact.distInterfacesMod.IResetModel
import typingsJapgolly.formsyReact.distInterfacesMod.IUpdateInputsWithError
import typingsJapgolly.formsyReact.mod.default
import typingsJapgolly.react.mod.FormHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormsyReact {
  
  inline def apply(
    disabled: Boolean,
    onChange: (IModel, Boolean) => Callback,
    onInvalid: Callback,
    onInvalidSubmit: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError, /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => Callback,
    onValid: Callback
  ): SharedBuilder_FormsyProps1979329973[default] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: IModel, t1: Boolean) => (onChange(t0, t1)).runNow()), onInvalid = onInvalid.toJsFn, onInvalidSubmit = js.Any.fromFunction4((t0: /* model */ IModel, t1: /* resetModel */ IResetModel, t2: /* updateInputsWithError */ IUpdateInputsWithError, t3: /* event */ ReactEventFrom[FormHTMLAttributes[Any] & Element]) => (onInvalidSubmit(t0, t1, t2, t3)).runNow()), onValid = onValid.toJsFn)
    new SharedBuilder_FormsyProps1979329973[default](js.Array(this.component, __props.asInstanceOf[FormsyProps]))
  }
  
  @JSImport("formsy-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormsyProps): SharedBuilder_FormsyProps1979329973[default] = new SharedBuilder_FormsyProps1979329973[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
