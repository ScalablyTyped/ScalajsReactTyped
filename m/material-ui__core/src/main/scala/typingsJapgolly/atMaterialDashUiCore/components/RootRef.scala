package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atMaterialDashUiCore.rootRefMod.default
import typingsJapgolly.atMaterialDashUiCore.rootRefRootRefMod.RootRefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootRef {
  def apply(
    rootRef: (js.Function1[/* instance */ js.Any | Null, Unit]) | RefHandle[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RootRefProps[js.Any], default, Unit, RootRefProps[js.Any]] = {
    val __obj = js.Dynamic.literal()
  
      if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.rootRefRootRefMod.RootRefProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.rootRefMod.default](js.constructorOf[typingsJapgolly.atMaterialDashUiCore.rootRefMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.rootRefRootRefMod.RootRefProps[js.Any]])(children: _*)
  }
}

