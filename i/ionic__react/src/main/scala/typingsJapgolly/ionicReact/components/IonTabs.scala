package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicReact.ionTabsMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabs {
  def apply(
    onIonTabsDidChange: /* event */ CustomEvent => Callback = null,
    onIonTabsWillChange: /* event */ CustomEvent => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.ionicReact.mod.IonTabs, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsDidChange(t0).runNow()))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsWillChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.ionicReact.ionTabsMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.ionicReact.mod.IonTabs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ionicReact.ionTabsMod.Props])(children: _*)
  }
  @JSImport("@ionic/react", "IonTabs")
  @js.native
  object componentImport extends js.Object
  
}

