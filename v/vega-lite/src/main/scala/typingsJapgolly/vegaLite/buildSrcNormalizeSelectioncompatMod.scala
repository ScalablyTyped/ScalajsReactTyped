package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.LayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecMapMod.SpecMapper
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.FacetedUnitSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeSelectioncompatMod {
  
  @JSImport("vega-lite/build/src/normalize/selectioncompat", "SelectionCompatibilityNormalizer")
  @js.native
  open class SelectionCompatibilityNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          FacetedUnitSpec[Field, SelectionParameter[SelectionType]], 
          LayerSpec[Field], 
          UnitSpec[Field], 
          scala.Nothing, 
          FieldName
        ] {
    
    def mapLayerOrUnit(spec: LayerSpec[Field], normParams: NormalizerParams): UnitSpec[Field] | GenericLayerSpec[UnitSpec[Field]] = js.native
    def mapLayerOrUnit(spec: FacetedUnitSpec[Field, SelectionParameter[SelectionType]], normParams: NormalizerParams): UnitSpec[Field] | GenericLayerSpec[UnitSpec[Field]] = js.native
    
    def mapUnit(spec: UnitSpec[Field], normParams: NormalizerParams): Any = js.native
  }
}
