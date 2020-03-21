package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.noSsrMod.default
import typingsJapgolly.materialUiCore.noSsrNoSsrMod.NoSsrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoSsr {
  def apply(
    fallback: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoSsrProps, default, Unit, NoSsrProps] = {
    val __obj = js.Dynamic.literal()
  
      if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.noSsrNoSsrMod.NoSsrProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.noSsrMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.noSsrNoSsrMod.NoSsrProps])(children: _*)
  }
  @JSImport("@material-ui/core/NoSsr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

