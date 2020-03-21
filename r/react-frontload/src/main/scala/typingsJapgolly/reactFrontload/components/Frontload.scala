package typingsJapgolly.reactFrontload.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFrontload.mod.FrontloadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Frontload {
  def apply(
    noServerRender: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FrontloadProps, typingsJapgolly.reactFrontload.mod.Frontload, Unit, FrontloadProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(noServerRender)) __obj.updateDynamic("noServerRender")(noServerRender.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFrontload.mod.FrontloadProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFrontload.mod.Frontload](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFrontload.mod.FrontloadProps])(children: _*)
  }
  @JSImport("react-frontload", "Frontload")
  @js.native
  object componentImport extends js.Object
  
}

