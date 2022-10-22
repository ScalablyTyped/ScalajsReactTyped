package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Mark
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Position2Def
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.ExtraNormalizer
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.Normalize
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecMod.GenericSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typingsJapgolly.vegaLite.vegaLiteStrings.line
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeRuleforrangedlineMod {
  
  @JSImport("vega-lite/build/src/normalize/ruleforrangedline", "RuleForRangedLineNormalizer")
  @js.native
  open class RuleForRangedLineNormalizer ()
    extends StObject
       with ExtraNormalizer[
          RangedLineSpec, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any]): /* is vega-lite.vega-lite/build/src/normalize/ruleforrangedline.RangedLineSpec */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: RangedLineSpec,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  trait EncodingX2Mixins extends StObject {
    
    var x2: js.UndefOr[Position2Def[Field]] = js.undefined
  }
  object EncodingX2Mixins {
    
    inline def apply(): EncodingX2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingX2Mixins]
    }
    
    extension [Self <: EncodingX2Mixins](x: Self) {
      
      inline def setX2(value: Position2Def[Field]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    }
  }
  
  trait EncodingY2Mixins extends StObject {
    
    var y2: js.UndefOr[Position2Def[Field]] = js.undefined
  }
  object EncodingY2Mixins {
    
    inline def apply(): EncodingY2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingY2Mixins]
    }
    
    extension [Self <: EncodingY2Mixins](x: Self) {
      
      inline def setY2(value: Position2Def[Field]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  type RangedLineSpec = GenericUnitSpec[
    (EncodingX2Mixins & Encoding[Field]) | (EncodingY2Mixins & Encoding[Field]), 
    line | Mark, 
    SelectionParameter[SelectionType]
  ]
}
