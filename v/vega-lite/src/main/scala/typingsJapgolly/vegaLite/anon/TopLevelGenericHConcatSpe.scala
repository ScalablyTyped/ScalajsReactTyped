package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcResolveMod.Resolve
import typingsJapgolly.vegaLite.buildSrcSpecMod.NonNormalizedSpec
import typingsJapgolly.vegaLite.buildSrcSpecMod._TopLevelSpec
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.AutoSizeParams
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.AutosizeType
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.Padding
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.TopLevelParameter
import typingsJapgolly.vegaLite.buildSrcTitleMod.TitleParams
import typingsJapgolly.vegaLite.buildSrcTransformMod.Transform
import typingsJapgolly.vegaLite.buildSrcUtilMod.Dict
import typingsJapgolly.vegaLite.vegaLiteStrings.flush
import typingsJapgolly.vegaLite.vegaLiteStrings.full
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Text
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<vega-lite.vega-lite/build/src/spec.NonNormalizedSpec>> */
trait TopLevelGenericHConcatSpe
  extends StObject
     with _TopLevelSpec {
  
  /**
    * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v5.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
    * @format uri
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  /**
    * How the visualization size should be determined. If a string, should be one of `"pad"`, `"fit"` or `"none"`.
    * Object values can additionally specify parameters for content sizing and automatic resizing.
    *
    * __Default value__: `pad`
    */
  var autosize: js.UndefOr[AutosizeType | AutoSizeParams] = js.undefined
  
  /**
    * CSS color property to use as the background of the entire view.
    *
    * __Default value:__ `"white"`
    */
  var background: js.UndefOr[typingsJapgolly.vegaTypings.typesSpecColorMod.Color | ExprRef | SignalRef] = js.undefined
  
  /**
    * The bounds calculation method to use for determining the extent of a sub-plot. One of `full` (the default) or `flush`.
    *
    * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will be used.
    * - If set to `flush`, only the specified width and height values for the sub-view will be used. The `flush` setting can be useful when attempting to place sub-plots without axes or legends into a uniform grid structure.
    *
    * __Default value:__ `"full"`
    */
  var bounds: js.UndefOr[full | flush] = js.undefined
  
  /**
    * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
    *
    * __Default value:__ `false`
    */
  var center: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
    */
  var config: js.UndefOr[typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]] = js.undefined
  
  /**
    * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
    */
  var data: js.UndefOr[typingsJapgolly.vegaLite.buildSrcDataMod.Data | Null] = js.undefined
  
  /**
    * A global data store for named datasets. This is a mapping from names to inline datasets.
    * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
    */
  var datasets: js.UndefOr[typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.Datasets] = js.undefined
  
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of views to be concatenated and put into a row.
    */
  var hconcat: js.Array[NonNormalizedSpec]
  
  /**
    * Name of the visualization for later reference.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle. If a number, specifies padding for all sides.
    * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
    *
    * __Default value__: `5`
    */
  var padding: js.UndefOr[Padding | ExprRef | SignalRef] = js.undefined
  
  /**
    * Dynamic variables or selections that parameterize a visualization.
    */
  var params: js.UndefOr[js.Array[TopLevelParameter]] = js.undefined
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
  
  /**
    * The spacing in pixels between sub-views of the concat operator.
    *
    * __Default value__: `10`
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Title for the plot.
    */
  var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.undefined
  
  /**
    * An array of data transformations such as filter and new field calculation.
    */
  var transform: js.UndefOr[js.Array[Transform]] = js.undefined
  
  /**
    * Optional metadata that will be passed to Vega.
    * This object is completely ignored by Vega and Vega-Lite and can be used for custom metadata.
    */
  var usermeta: js.UndefOr[Dict[Any]] = js.undefined
}
object TopLevelGenericHConcatSpe {
  
  inline def apply(hconcat: js.Array[NonNormalizedSpec]): TopLevelGenericHConcatSpe = {
    val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelGenericHConcatSpe]
  }
  
  extension [Self <: TopLevelGenericHConcatSpe](x: Self) {
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    inline def setBackground(value: typingsJapgolly.vegaTypings.typesSpecColorMod.Color | ExprRef | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setConfig(value: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: typingsJapgolly.vegaLite.buildSrcDataMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDatasets(value: typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHconcat(value: js.Array[NonNormalizedSpec]): Self = StObject.set(x, "hconcat", value.asInstanceOf[js.Any])
    
    inline def setHconcatVarargs(value: NonNormalizedSpec*): Self = StObject.set(x, "hconcat", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPadding(value: Padding | ExprRef | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setParams(value: js.Array[TopLevelParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: TopLevelParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setUsermeta(value: Dict[Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
    
    inline def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
  }
}
