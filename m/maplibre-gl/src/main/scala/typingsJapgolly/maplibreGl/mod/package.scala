package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MessagePort
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLUniformLocation
import org.scalajs.dom.WheelEvent
import typingsJapgolly.glMatrix.mod.mat4
import typingsJapgolly.maplibreGl.anon.Casesensitive
import typingsJapgolly.maplibreGl.anon.Currency
import typingsJapgolly.maplibreGl.anon.Fontscale
import typingsJapgolly.maplibreGl.anon.Target
import typingsJapgolly.maplibreGl.anon.inPositionAnchorPointLike
import typingsJapgolly.maplibreGl.maplibreGlStrings.Asterisk
import typingsJapgolly.maplibreGl.maplibreGlStrings.EqualssignEqualssign
import typingsJapgolly.maplibreGl.maplibreGlStrings.Exclamationmark
import typingsJapgolly.maplibreGl.maplibreGlStrings.ExclamationmarkEqualssign
import typingsJapgolly.maplibreGl.maplibreGlStrings.Exclamationmarkhas
import typingsJapgolly.maplibreGl.maplibreGlStrings.Exclamationmarkin
import typingsJapgolly.maplibreGl.maplibreGlStrings.Greaterthansign
import typingsJapgolly.maplibreGl.maplibreGlStrings.GreaterthansignEqualssign
import typingsJapgolly.maplibreGl.maplibreGlStrings.Lessthansign
import typingsJapgolly.maplibreGl.maplibreGlStrings.LessthansignEqualssign
import typingsJapgolly.maplibreGl.maplibreGlStrings.Percentsign
import typingsJapgolly.maplibreGl.maplibreGlStrings.Plussign
import typingsJapgolly.maplibreGl.maplibreGlStrings.Slash
import typingsJapgolly.maplibreGl.maplibreGlStrings.^
import typingsJapgolly.maplibreGl.maplibreGlStrings.`-_`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`case`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`cubic-bezier`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`feature-state`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`geometry-type`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`heatmap-density`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`index-of`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`interpolate-hcl`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`interpolate-lab`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`is-supported-script`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`line-progress`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`match`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`number-format`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`object`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`resolved-locale`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`to-boolean`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`to-color`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`to-number`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`to-rgba`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`to-string`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`var`
import typingsJapgolly.maplibreGl.maplibreGlStrings.abs
import typingsJapgolly.maplibreGl.maplibreGlStrings.accumulated
import typingsJapgolly.maplibreGl.maplibreGlStrings.acos
import typingsJapgolly.maplibreGl.maplibreGlStrings.all
import typingsJapgolly.maplibreGl.maplibreGlStrings.any
import typingsJapgolly.maplibreGl.maplibreGlStrings.array
import typingsJapgolly.maplibreGl.maplibreGlStrings.asin
import typingsJapgolly.maplibreGl.maplibreGlStrings.at
import typingsJapgolly.maplibreGl.maplibreGlStrings.atan
import typingsJapgolly.maplibreGl.maplibreGlStrings.boolean
import typingsJapgolly.maplibreGl.maplibreGlStrings.ceil
import typingsJapgolly.maplibreGl.maplibreGlStrings.coalesce
import typingsJapgolly.maplibreGl.maplibreGlStrings.collator
import typingsJapgolly.maplibreGl.maplibreGlStrings.concat
import typingsJapgolly.maplibreGl.maplibreGlStrings.cos
import typingsJapgolly.maplibreGl.maplibreGlStrings.distance
import typingsJapgolly.maplibreGl.maplibreGlStrings.downcase
import typingsJapgolly.maplibreGl.maplibreGlStrings.exponential
import typingsJapgolly.maplibreGl.maplibreGlStrings.feature_
import typingsJapgolly.maplibreGl.maplibreGlStrings.floor
import typingsJapgolly.maplibreGl.maplibreGlStrings.format
import typingsJapgolly.maplibreGl.maplibreGlStrings.get_
import typingsJapgolly.maplibreGl.maplibreGlStrings.has
import typingsJapgolly.maplibreGl.maplibreGlStrings.id
import typingsJapgolly.maplibreGl.maplibreGlStrings.image_
import typingsJapgolly.maplibreGl.maplibreGlStrings.in
import typingsJapgolly.maplibreGl.maplibreGlStrings.interpolate
import typingsJapgolly.maplibreGl.maplibreGlStrings.length
import typingsJapgolly.maplibreGl.maplibreGlStrings.let
import typingsJapgolly.maplibreGl.maplibreGlStrings.linear
import typingsJapgolly.maplibreGl.maplibreGlStrings.literal
import typingsJapgolly.maplibreGl.maplibreGlStrings.ln
import typingsJapgolly.maplibreGl.maplibreGlStrings.ln2
import typingsJapgolly.maplibreGl.maplibreGlStrings.log10
import typingsJapgolly.maplibreGl.maplibreGlStrings.log2
import typingsJapgolly.maplibreGl.maplibreGlStrings.max
import typingsJapgolly.maplibreGl.maplibreGlStrings.min
import typingsJapgolly.maplibreGl.maplibreGlStrings.none
import typingsJapgolly.maplibreGl.maplibreGlStrings.number
import typingsJapgolly.maplibreGl.maplibreGlStrings.pi
import typingsJapgolly.maplibreGl.maplibreGlStrings.properties
import typingsJapgolly.maplibreGl.maplibreGlStrings.rgb
import typingsJapgolly.maplibreGl.maplibreGlStrings.rgba
import typingsJapgolly.maplibreGl.maplibreGlStrings.round
import typingsJapgolly.maplibreGl.maplibreGlStrings.sin
import typingsJapgolly.maplibreGl.maplibreGlStrings.slice
import typingsJapgolly.maplibreGl.maplibreGlStrings.sqrt
import typingsJapgolly.maplibreGl.maplibreGlStrings.step
import typingsJapgolly.maplibreGl.maplibreGlStrings.string
import typingsJapgolly.maplibreGl.maplibreGlStrings.tan
import typingsJapgolly.maplibreGl.maplibreGlStrings.upcase
import typingsJapgolly.maplibreGl.maplibreGlStrings.within
import typingsJapgolly.maplibreGl.maplibreGlStrings.zoom
import typingsJapgolly.std.GLenum
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.std.Record
import typingsJapgolly.std.TexImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlendEquationType = GLenum

type BlendFuncConstant = GLenum

type BlendFuncType = js.Tuple2[BlendFuncConstant, BlendFuncConstant]

type Callback[T] = js.Function2[
/* error */ js.UndefOr[js.Error | Null], 
/* result */ js.UndefOr[T | Null], 
scala.Unit]

type CollatorExpressionSpecification = js.Tuple2[collator, Casesensitive]

type ColorMaskType = js.Tuple4[Boolean, Boolean, Boolean, Boolean]

type ColorSpecification = String

type CompareFuncType = GLenum

type Coordinates = js.Tuple4[
js.Tuple2[Double, Double], 
js.Tuple2[Double, Double], 
js.Tuple2[Double, Double], 
js.Tuple2[Double, Double]]

type CrossTileID = String | Double

type CullFaceModeType = GLenum

type CustomRenderMethod = js.Function2[/* gl */ WebGLRenderingContext, /* matrix */ mat4, scala.Unit]

/* Rewritten from type alias, can be one of: 
  - T
  - typingsJapgolly.maplibreGl.mod.CameraFunctionSpecification[T]
  - typingsJapgolly.maplibreGl.mod.SourceFunctionSpecification[T]
  - typingsJapgolly.maplibreGl.mod.CompositeFunctionSpecification[T]
  - typingsJapgolly.maplibreGl.mod.ExpressionSpecification
*/
type DataDrivenPropertyValueSpecification[T] = _DataDrivenPropertyValueSpecification[T] | T | ExpressionSpecification

type DepthFuncType = CompareFuncType

type DepthMaskType = Boolean

type DepthRangeType = js.Tuple2[Double, Double]

type DrawMode = GLenum

type ExpressionFilterSpecification = Boolean | ExpressionSpecification

type ExpressionInputType = String | Double | Boolean

type ExpressionParameters = js.Array[zoom | feature_ | `feature-state` | `heatmap-density` | `line-progress`]

type ExpressionSpecification = (js.Tuple2[
array | image_ | literal | `to-boolean` | `to-string` | `feature-state` | length | Exclamationmark | within | `var` | downcase | `is-supported-script` | `resolved-locale` | upcase | `to-rgba` | abs | acos | asin | atan | ceil | cos | distance | floor | ln | log10 | log2 | round | sin | sqrt | tan, 
Any | Boolean | CollatorExpressionSpecification | ColorSpecification | Double | (Record[String, Any]) | String]) | (js.Tuple3[
array | `number-format` | at | get_ | has | in | `index-of` | slice | `-_` | Slash | Percentsign | ^, 
Any | Double | ExpressionInputType | String, 
js.UndefOr[Any | Currency | Double | ExpressionInputType | (Record[String, Any])]]) | (js.Tuple4[
array | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | rgb, 
Any | Double | ExpressionInputType, 
Any | Double | ExpressionInputType, 
js.UndefOr[Any | CollatorExpressionSpecification | Double]]) | (Array[
boolean | format | number | `object` | string | `to-color` | `to-number` | all | any | `case` | coalesce | `match` | interpolate | `interpolate-hcl` | `interpolate-lab` | step | let | concat | Asterisk | Plussign | max | min | Any | (js.Array[Double | ExpressionInputType]) | Boolean | ColorSpecification | Double | ExpressionInputType | Fontscale | InterpolationSpecification | String | (js.Tuple2[image_, Any])]) | CollatorExpressionSpecification | (js.Array[
accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`]) | (js.Tuple5[rgba, Double | Any, Double | Any, Double | Any, Double | Any])

type FeatureState = StringDictionary[Any]

type FeatureStates = StringDictionary[FeatureState]

type FilterExpression = js.Function3[
/* globalProperties */ GlobalProperties, 
/* feature */ Feature, 
/* canonical */ js.UndefOr[CanonicalTileID], 
Boolean]

type FilterSpecification = Any | LegacyFilterSpecification

type FormattedSpecification = String

type FrontFaceType = GLenum

type GetImageCallback = js.Function3[
/* error */ js.UndefOr[js.Error | Null], 
/* image */ js.UndefOr[HTMLImageElement | ImageBitmap | Null], 
/* expiry */ js.UndefOr[ExpiryData | Null], 
scala.Unit]

type GlyphPositions = StringDictionary[NumberDictionary[GlyphPosition]]

type InputEvent = MouseEvent | TouchEvent | KeyboardEvent | WheelEvent

type InterpolationSpecification = js.Array[linear] | (js.Tuple2[exponential, Double | Any]) | (js.Tuple5[`cubic-bezier`, Double | Any, Double | Any, Double | Any, Double | Any])

type LayerFeatureStates = StringDictionary[FeatureStates]

type LegacyFilterSpecification = (js.Tuple2[has | Exclamationmarkhas, String]) | (js.Tuple3[
EqualssignEqualssign | ExclamationmarkEqualssign | Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign, 
String, 
Boolean | Double | String]) | (Array[in | Exclamationmarkin | all | any | none | Any | Boolean | Double | String])

type Listener = js.Function1[/* a */ Any, Any]

type Listeners = StringDictionary[js.Array[Listener]]

type LngLatBoundsLike = LngLatBounds | (js.Tuple2[LngLatLike, LngLatLike]) | (js.Tuple4[Double, Double, Double, Double])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.mod.LngLat
  - typingsJapgolly.maplibreGl.anon.Lat
  - typingsJapgolly.maplibreGl.anon.Lon
  - js.Tuple2[scala.Double, scala.Double]
*/
type LngLatLike = _LngLatLike | (js.Tuple2[Double, Double])

type MessageListener = js.Function1[/* a */ Target, Any]

type Offset = Double | PointLike | inPositionAnchorPointLike

type PaddingSpecification = Double | js.Array[Double]

type PluginStateSyncCallback = js.Function1[/* state */ PluginState, scala.Unit]

type PointLike = typingsJapgolly.mapboxPointGeometry.mod.^ | (js.Tuple2[Double, Double])

type PromoteIdSpecification = StringDictionary[String] | String

type PropertyValueSpecification[T] = T | CameraFunctionSpecification[T] | Any

type RequestTransformFunction = js.Function2[/* url */ String, /* resourceType */ js.UndefOr[ResourceTypeEnum], RequestParameters]

type RequireAtLeastOne[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<keyof T, K>>>}[keyof T] */ js.Any

type ResolvedImageSpecification = String

type ResponseCallback[T] = js.Function4[
/* error */ js.UndefOr[js.Error | Null], 
/* data */ js.UndefOr[T | Null], 
/* cacheControl */ js.UndefOr[String | Null], 
/* expires */ js.UndefOr[String | Null], 
scala.Unit]

type StencilOpConstant = GLenum

type StencilOpType = js.Tuple3[StencilOpConstant, StencilOpConstant, StencilOpConstant]

type SymbolInstance = SymbolInstanceStruct

type TaskID = Double

type TextureFilter = GLenum

type TextureFormat = GLenum

type TextureImage = TexImageSource | DataTextureImage

type TextureUnitType = Double

type TextureWrap = GLenum

type TimePoint = Double

type Transferable = js.typedarray.ArrayBuffer | MessagePort | ImageBitmap

type UniformBindings = StringDictionary[Uniform[Any]]

type UniformLocations = StringDictionary[WebGLUniformLocation]

type UniformValues[Us /* <: js.Object */] = ObjMap[Us, js.Function1[/* u */ Uniform[Any], Any]]

type Validator = js.Function1[/* a */ Any, js.Array[ValidationError]]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - java.lang.String
  - scala.Boolean
  - scala.Double
  - typingsJapgolly.maplibreGl.mod.Color
  - typingsJapgolly.maplibreGl.mod.Collator
  - typingsJapgolly.maplibreGl.mod.Formatted
  - typingsJapgolly.maplibreGl.mod.Padding
  - typingsJapgolly.maplibreGl.mod.ResolvedImage
  - js.Array[scala.Any]
  - org.scalablytyped.runtime.StringDictionary[scala.Any]
*/
type Value = _Value | js.Array[Any] | StringDictionary[Any] | Null | String | Boolean | Double

type ViewportType = js.Tuple4[Double, Double, Double, Double]
