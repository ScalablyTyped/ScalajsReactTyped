package typingsJapgolly.styletronReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.styletronReact.mod.DebugEngine
import typingsJapgolly.styletronReact.mod.DevProviderProps
import typingsJapgolly.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DevProvider {
  def apply(
    value: StandardEngine,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DevProviderProps, 
    typingsJapgolly.styletronReact.mod.DevProvider, 
    Unit, 
    DevProviderProps
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styletronReact.mod.DevProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styletronReact.mod.DevProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styletronReact.mod.DevProviderProps])(children: _*)
  }
  @JSImport("styletron-react", "DevProvider")
  @js.native
  object componentImport extends js.Object
  
}

