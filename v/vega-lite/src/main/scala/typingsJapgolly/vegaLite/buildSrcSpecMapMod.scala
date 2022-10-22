package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecConcatMod.GenericConcatSpec
import typingsJapgolly.vegaLite.buildSrcSpecConcatMod.GenericHConcatSpec
import typingsJapgolly.vegaLite.buildSrcSpecConcatMod.GenericVConcatSpec
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.GenericFacetSpec
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecMod.GenericSpec
import typingsJapgolly.vegaLite.buildSrcSpecRepeatMod.RepeatSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpecMapMod {
  
  /* note: abstract class */ @JSImport("vega-lite/build/src/spec/map", "SpecMapper")
  @js.native
  open class SpecMapper[P, UI /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, LI /* <: GenericLayerSpec[Any] */, UO /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, RO /* <: RepeatSpec */, FO /* <: Field */] () extends StObject {
    
    def map(spec: GenericSpec[UI, LI, RepeatSpec, Field], params: P): GenericSpec[UO, GenericLayerSpec[UO], RO, FO] = js.native
    
    /* protected */ def mapConcat(spec: GenericConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapFacet(spec: GenericFacetSpec[UI, LI, Field], params: P): GenericFacetSpec[UO, GenericLayerSpec[UO], FO] = js.native
    
    /* protected */ def mapHConcat(spec: GenericHConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericHConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapLayer(spec: LI, params: P): GenericLayerSpec[UO] = js.native
    
    def mapLayerOrUnit(spec: LI | UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapRepeat(spec: RepeatSpec, params: P): GenericSpec[UO, Any, RO, FO] = js.native
    
    def mapUnit(spec: UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapVConcat(spec: GenericVConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericVConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
  }
}
