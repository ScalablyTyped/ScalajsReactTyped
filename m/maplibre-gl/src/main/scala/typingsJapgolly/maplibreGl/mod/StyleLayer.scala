package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.glMatrix.mod.mat4
import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.mapboxVectorTile.mod.VectorTileFeature
import typingsJapgolly.maplibreGl.maplibreGlStrings.`fill-extrusion`
import typingsJapgolly.maplibreGl.maplibreGlStrings.background_
import typingsJapgolly.maplibreGl.maplibreGlStrings.circle
import typingsJapgolly.maplibreGl.maplibreGlStrings.custom
import typingsJapgolly.maplibreGl.maplibreGlStrings.fill
import typingsJapgolly.maplibreGl.maplibreGlStrings.heatmap
import typingsJapgolly.maplibreGl.maplibreGlStrings.hillshade
import typingsJapgolly.maplibreGl.maplibreGlStrings.line
import typingsJapgolly.maplibreGl.maplibreGlStrings.none
import typingsJapgolly.maplibreGl.maplibreGlStrings.raster
import typingsJapgolly.maplibreGl.maplibreGlStrings.symbol
import typingsJapgolly.maplibreGl.maplibreGlStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleLayer extends Evented {
  
  var _crossfadeParameters: CrossfadeParameters = js.native
  
  var _featureFilter: FeatureFilter = js.native
  
  def _handleOverridablePaintPropertyUpdate[T, R](name: String, oldValue: PropertyValue[T, R], newValue: PropertyValue[T, R]): Boolean = js.native
  
  def _handleSpecialPaintPropertyUpdate(_underscore: String): scala.Unit = js.native
  
  var _transitionablePaint: Transitionable[Any] = js.native
  
  var _transitioningPaint: Transitioning[Any] = js.native
  
  var _unevaluatedLayout: Layout[Any] = js.native
  
  def _validate(validate: js.Function, key: String, name: String, value: Any): Boolean = js.native
  def _validate(validate: js.Function, key: String, name: String, value: Any, options: StyleSetterOptions): Boolean = js.native
  
  var filter: FilterSpecification | scala.Unit = js.native
  
  def getCrossfadeParameters(): CrossfadeParameters = js.native
  
  def getLayoutProperty(name: String): Any = js.native
  
  def getPaintProperty(name: String): Any = js.native
  
  def hasOffscreenPass(): Boolean = js.native
  
  def hasTransition(): Boolean = js.native
  
  var id: String = js.native
  
  def is3D(): Boolean = js.native
  
  def isHidden(zoom: Double): Boolean = js.native
  
  def isStateDependent(): Boolean = js.native
  
  def isTileClipped(): Boolean = js.native
  
  val layout: Any = js.native
  
  var maxzoom: Double = js.native
  
  var metadata: Any = js.native
  
  var minzoom: Double = js.native
  
  def onAdd(map: Map): scala.Unit = js.native
  
  def onRemove(map: Map): scala.Unit = js.native
  
  val paint: Any = js.native
  
  var queryIntersectsFeature: js.UndefOr[
    js.Function8[
      /* queryGeometry */ js.Array[^], 
      /* feature */ VectorTileFeature, 
      /* featureState */ FeatureState, 
      /* geometry */ js.Array[js.Array[^]], 
      /* zoom */ Double, 
      /* transform */ Transform, 
      /* pixelsToTileUnits */ Double, 
      /* pixelPosMatrix */ mat4, 
      Boolean | Double
    ]
  ] = js.native
  
  var queryRadius: js.UndefOr[js.Function1[/* bucket */ Bucket, Double]] = js.native
  
  def recalculate(parameters: EvaluationParameters, availableImages: js.Array[String]): scala.Unit = js.native
  
  def resize(): scala.Unit = js.native
  
  def serialize(): LayerSpecification = js.native
  
  def setLayoutProperty(name: String, value: Any): scala.Unit = js.native
  def setLayoutProperty(name: String, value: Any, options: StyleSetterOptions): scala.Unit = js.native
  
  def setPaintProperty(name: String, value: Any): Boolean = js.native
  def setPaintProperty(name: String, value: Any, options: StyleSetterOptions): Boolean = js.native
  
  var source: String = js.native
  
  var sourceLayer: String = js.native
  
  var `type`: fill | line | symbol | circle | heatmap | `fill-extrusion` | raster | hillshade | background_ | custom = js.native
  
  def updateTransitions(parameters: TransitionParameters): scala.Unit = js.native
  
  var visibility: visible | none | scala.Unit = js.native
}
