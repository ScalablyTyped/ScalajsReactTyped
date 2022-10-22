package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChannelMod.ExtendedChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldRefOption
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.ModelWithField
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcSortMod.EncodingSortField
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.EncodingFacetMapping
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.FacetFieldDef
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.NormalizedFacetSpec
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileFacetMod {
  
  @JSImport("vega-lite/build/src/compile/facet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/facet", "FacetModel")
  @js.native
  open class FacetModel protected () extends ModelWithField {
    def this(spec: NormalizedFacetSpec, parent: Model, parentGivenName: String, config: Config[SignalRef]) = this()
    
    /* private */ var assembleFacet: Any = js.native
    
    /* private */ var assembleLabelTitle: Any = js.native
    
    def channelHasField(channel: ExtendedChannel): Boolean = js.native
    
    val child: Model = js.native
    
    /* private */ var columnDistinctSignal: Any = js.native
    
    val facet: EncodingFacetMapping[String, SignalRef] = js.native
    
    /* private */ var facetSortFields: Any = js.native
    
    /* private */ var facetSortOrder: Any = js.native
    
    def fieldDef(channel: ExtendedChannel): TypedFieldDef[String, Any, Boolean | BinParams | binned | Null] = js.native
    
    /**
      * Aggregate cardinality for calculating size
      */
    /* private */ var getCardinalityAggregateForChild: Any = js.native
    
    /* private */ var getHeaderLayoutMixins: Any = js.native
    
    /* private */ var initFacet: Any = js.native
    
    /* private */ var initFacetFieldDef: Any = js.native
  }
  
  inline def facetSortFieldName(fieldDef: FacetFieldDef[String, ExprRef | SignalRef], sort: EncodingSortField[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("facetSortFieldName")(fieldDef.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def facetSortFieldName(
    fieldDef: FacetFieldDef[String, ExprRef | SignalRef],
    sort: EncodingSortField[String],
    opt: FieldRefOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("facetSortFieldName")(fieldDef.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
