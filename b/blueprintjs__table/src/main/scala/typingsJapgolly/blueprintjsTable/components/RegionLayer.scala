package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.regionsMod.IRegionLayerProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RegionLayer {
  def apply(
    className: String = null,
    regionStyles: js.Array[CSSProperties] = null,
    regions: js.Array[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IRegionLayerProps, 
    typingsJapgolly.blueprintjsTable.regionsMod.RegionLayer, 
    Unit, 
    IRegionLayerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (regionStyles != null) __obj.updateDynamic("regionStyles")(regionStyles.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.regionsMod.IRegionLayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.regionsMod.RegionLayer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.regionsMod.IRegionLayerProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/layers/regions", "RegionLayer")
  @js.native
  object componentImport extends js.Object
  
}

