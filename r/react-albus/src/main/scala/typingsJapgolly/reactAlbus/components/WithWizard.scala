package typingsJapgolly.reactAlbus.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAlbus.mod.WithWizard_
import typingsJapgolly.reactAlbus.mod.WizardContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithWizard {
  def AnonRender(
    render: /* wizard */ WizardContext => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactAlbus.AnonRender, 
    WithWizard_, 
    Unit, 
    typingsJapgolly.reactAlbus.AnonRender
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAlbus.AnonRender, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAlbus.mod.WithWizard_](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAlbus.AnonRender])(children: _*)
  }
  def AnonChildren(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: WizardContext => CallbackTo[Node]
  ): UnmountedWithRoot[
    typingsJapgolly.reactAlbus.AnonChildren, 
    WithWizard_, 
    Unit, 
    typingsJapgolly.reactAlbus.AnonChildren
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactAlbus.mod.WizardContext) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAlbus.AnonChildren, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactAlbus.mod.WithWizard_](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAlbus.AnonChildren])
  }
  @JSImport("react-albus", "WithWizard")
  @js.native
  object componentImport extends js.Object
  
}

