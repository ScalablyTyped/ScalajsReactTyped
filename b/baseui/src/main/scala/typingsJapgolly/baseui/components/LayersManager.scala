package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.layerMod.LayersManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LayersManager {
  def apply(
    zIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LayersManagerProps, 
    typingsJapgolly.baseui.layerMod.LayersManager, 
    Unit, 
    LayersManagerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.layerMod.LayersManagerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.layerMod.LayersManager](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.layerMod.LayersManagerProps])(children: _*)
  }
  @JSImport("baseui/layer", "LayersManager")
  @js.native
  object componentImport extends js.Object
  
}

