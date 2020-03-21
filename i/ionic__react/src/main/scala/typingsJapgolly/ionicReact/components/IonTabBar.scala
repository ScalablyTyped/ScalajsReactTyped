package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicReact.ionTabBarMod.Props
import typingsJapgolly.ionicReact.ionicReactStrings.bottom
import typingsJapgolly.ionicReact.ionicReactStrings.ios
import typingsJapgolly.ionicReact.ionicReactStrings.md
import typingsJapgolly.ionicReact.ionicReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabBar {
  def apply(
    color: Color = null,
    currentPath: String = null,
    mode: ios | md = null,
    onIonTabsDidChange: /* event */ CustomEvent => Callback = null,
    onIonTabsWillChange: /* event */ CustomEvent => Callback = null,
    selectedTab: String = null,
    slot: bottom | top = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[Props, MountedWithRawType[Props, js.Object, RawMounted[Props, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsDidChange(t0).runNow()))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsWillChange(t0).runNow()))
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.ionicReact.ionTabBarMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ionicReact.ionTabBarMod.Props])(children: _*)
  }
  @JSImport("@ionic/react", "IonTabBar")
  @js.native
  object componentImport extends js.Object
  
}

