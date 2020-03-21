package typingsJapgolly.reachTabs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachTabs.mod.TabPanelProps
import typingsJapgolly.reachTabs.mod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  def apply(
    TabPanelProps: TabPanelProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[TabProps, MountedWithRawType[TabProps, js.Object, RawMounted[TabProps, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      if (TabPanelProps != null) js.Dynamic.global.Object.assign(__obj, TabPanelProps)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reachTabs.mod.TabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachTabs.mod.TabProps])(children: _*)
  }
  @JSImport("@reach/tabs", "Tab")
  @js.native
  object componentImport extends js.Object
  
}

