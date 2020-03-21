package typingsJapgolly.reactAlbus.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactAlbus.mod.WizardContext
import typingsJapgolly.reactAlbus.mod.WizardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wizard {
  def apply(
    basename: String = null,
    history: History[LocationState] = null,
    onNext: /* wizard */ WizardContext => Callback = null,
    render: /* wizard */ WizardContext => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WizardProps, typingsJapgolly.reactAlbus.mod.Wizard, Unit, WizardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => onNext(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAlbus.mod.WizardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAlbus.mod.Wizard](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAlbus.mod.WizardProps])(children: _*)
  }
  @JSImport("react-albus", "Wizard")
  @js.native
  object componentImport extends js.Object
  
}

