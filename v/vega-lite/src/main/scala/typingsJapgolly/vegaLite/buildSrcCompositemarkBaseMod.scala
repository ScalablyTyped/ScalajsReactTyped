package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcMarkMod.GenericMarkDef
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
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkBaseMod {
  
  @JSImport("vega-lite/build/src/compositemark/base", "CompositeMarkNormalizer")
  @js.native
  open class CompositeMarkNormalizer[M /* <: String */] protected ()
    extends StObject
       with ExtraNormalizer[
          CompositeMarkUnitSpec[M], 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any]
        ] {
    def this(
      name: String,
      run: js.Function3[
            /* spec */ CompositeMarkUnitSpec[M], 
            /* params */ NormalizerParams, 
            /* normalize */ Normalize[
              (GenericUnitSpec[Encoding[FieldName], M, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
              NormalizedLayerSpec | NormalizedUnitSpec
            ], 
            NormalizedLayerSpec | NormalizedUnitSpec
          ]
    ) = this()
    
    def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any]): /* is vega-lite.vega-lite/build/src/compositemark/base.CompositeMarkUnitSpec<M> */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: CompositeMarkUnitSpec[M],
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type CompositeMarkUnitSpec[M /* <: String */] = GenericUnitSpec[Any, M | GenericMarkDef[M], SelectionParameter[SelectionType]]
}
