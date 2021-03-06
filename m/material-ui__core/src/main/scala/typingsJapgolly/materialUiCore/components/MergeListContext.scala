package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.mergeListContextMod.MergeWithListContextProps
import typingsJapgolly.materialUiCore.mergeListContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MergeListContext {
  def apply(
    dense: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MergeWithListContextProps, default, Unit, MergeWithListContextProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.mergeListContextMod.MergeWithListContextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.mergeListContextMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.mergeListContextMod.MergeWithListContextProps])(children: _*)
  }
  @JSImport("@material-ui/core/ListItem/MergeListContext", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

