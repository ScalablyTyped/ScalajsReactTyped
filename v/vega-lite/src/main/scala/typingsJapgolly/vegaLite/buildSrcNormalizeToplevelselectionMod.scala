package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecMapMod.SpecMapper
import typingsJapgolly.vegaLite.buildSrcSpecMod.NormalizedSpec
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.TopLevel
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeToplevelselectionMod {
  
  @JSImport("vega-lite/build/src/normalize/toplevelselection", "TopLevelSelectionsNormalizer")
  @js.native
  open class TopLevelSelectionsNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          NormalizedUnitSpec, 
          GenericLayerSpec[NormalizedUnitSpec], 
          NormalizedUnitSpec, 
          scala.Nothing, 
          FieldName
        ] {
    
    def map(spec: TopLevel[NormalizedSpec], normParams: NormalizerParams): TopLevel[NormalizedSpec] = js.native
  }
}
