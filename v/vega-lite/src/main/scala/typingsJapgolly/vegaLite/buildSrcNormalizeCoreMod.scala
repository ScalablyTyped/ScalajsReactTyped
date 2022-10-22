package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.LayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecMapMod.SpecMapper
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.FacetedUnitSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeCoreMod {
  
  @JSImport("vega-lite/build/src/normalize/core", "CoreNormalizer")
  @js.native
  open class CoreNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          FacetedUnitSpec[Field, SelectionParameter[SelectionType]], 
          LayerSpec[Field], 
          NormalizedUnitSpec, 
          scala.Nothing, 
          FieldName
        ] {
    
    /* private */ var getFacetMappingAndLayout: Any = js.native
    
    /* private */ var mapFacetedUnit: Any = js.native
    
    /* private */ var mapLayerRepeat: Any = js.native
    
    /* private */ var mapNonLayerRepeat: Any = js.native
    
    def mapUnit(spec: UnitSpec[Field], params: NormalizerParams): NormalizedUnitSpec | NormalizedLayerSpec = js.native
    
    /* private */ var mapUnitWithParentEncodingOrProjection: Any = js.native
    
    /* private */ var nonFacetUnitNormalizers: Any = js.native
  }
}
