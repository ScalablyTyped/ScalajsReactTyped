package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.glMatrix.mod.mat4
import typingsJapgolly.mapboxPointGeometry.mod.^
import typingsJapgolly.mapboxVectorTile.mod.VectorTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CircleStyleLayer")
@js.native
open class CircleStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_CircleStyleLayer: Transitionable[CirclePaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_CircleStyleLayer: Transitioning[CirclePaintProps] = js.native
  
  @JSName("_unevaluatedLayout")
  var _unevaluatedLayout_CircleStyleLayer: Layout[CircleLayoutProps] = js.native
  
  def createBucket(parameters: BucketParameters[Any]): CircleBucket[Any] = js.native
  
  @JSName("layout")
  var layout_CircleStyleLayer: PossiblyEvaluated[CircleLayoutProps, CircleLayoutPropsPossiblyEvaluated] = js.native
  
  @JSName("paint")
  var paint_CircleStyleLayer: PossiblyEvaluated[CirclePaintProps, CirclePaintPropsPossiblyEvaluated] = js.native
  
  @JSName("queryIntersectsFeature")
  def queryIntersectsFeature_MCircleStyleLayer(
    queryGeometry: js.Array[^],
    feature: VectorTileFeature,
    featureState: FeatureState,
    geometry: js.Array[js.Array[^]],
    zoom: Double,
    transform: Transform,
    pixelsToTileUnits: Double,
    pixelPosMatrix: mat4
  ): Boolean = js.native
  
  @JSName("queryRadius")
  def queryRadius_MCircleStyleLayer(bucket: Bucket): Double = js.native
}
