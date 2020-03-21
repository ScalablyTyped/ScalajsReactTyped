package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.rootRefMod.default
import typingsJapgolly.materialUiCore.rootRefRootRefMod.RootRefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootRef {
  def apply(
    rootRef: (js.Function1[/* instance */ js.Any | Null, Unit]) | RefHandle[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RootRefProps[js.Any], default, Unit, RootRefProps[js.Any]] = {
    val __obj = js.Dynamic.literal()
  
      if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.rootRefRootRefMod.RootRefProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.rootRefMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.rootRefRootRefMod.RootRefProps[js.Any]])(children: _*)
  }
  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

