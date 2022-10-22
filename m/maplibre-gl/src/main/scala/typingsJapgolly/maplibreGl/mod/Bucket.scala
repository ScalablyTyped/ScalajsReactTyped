package typingsJapgolly.maplibreGl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /**
  	 * Release the WebGL resources associated with the buffers. Note that because
  	 * buckets are shared between layers having the same layout properties, they
  	 * must be destroyed in groups (all buckets for a tile, or all symbol buckets).
  	 *
  	 * @private
  	 */
  def destroy(): scala.Unit
  
  var hasPattern: Boolean
  
  def isEmpty(): Boolean
  
  var layerIds: js.Array[String]
  
  val layers: js.Array[Any]
  
  def populate(features: js.Array[IndexedFeature], options: PopulateParameters, canonical: CanonicalTileID): scala.Unit
  
  val stateDependentLayerIds: js.Array[String]
  
  val stateDependentLayers: js.Array[Any]
  
  def update(states: FeatureStates, vtLayer: VectorTileLayer, imagePositions: StringDictionary[ImagePosition]): scala.Unit
  
  def upload(context: Context): scala.Unit
  
  def uploadPending(): Boolean
}
object Bucket {
  
  inline def apply(
    destroy: japgolly.scalajs.react.Callback,
    hasPattern: Boolean,
    isEmpty: CallbackTo[Boolean],
    layerIds: js.Array[String],
    layers: js.Array[Any],
    populate: (js.Array[IndexedFeature], PopulateParameters, CanonicalTileID) => japgolly.scalajs.react.Callback,
    stateDependentLayerIds: js.Array[String],
    stateDependentLayers: js.Array[Any],
    update: (FeatureStates, VectorTileLayer, StringDictionary[ImagePosition]) => japgolly.scalajs.react.Callback,
    upload: Context => japgolly.scalajs.react.Callback,
    uploadPending: CallbackTo[Boolean]
  ): Bucket = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hasPattern = hasPattern.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, layerIds = layerIds.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], populate = js.Any.fromFunction3((t0: js.Array[IndexedFeature], t1: PopulateParameters, t2: CanonicalTileID) => (populate(t0, t1, t2)).runNow()), stateDependentLayerIds = stateDependentLayerIds.asInstanceOf[js.Any], stateDependentLayers = stateDependentLayers.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: FeatureStates, t1: VectorTileLayer, t2: StringDictionary[ImagePosition]) => (update(t0, t1, t2)).runNow()), upload = js.Any.fromFunction1((t0: Context) => upload(t0).runNow()), uploadPending = uploadPending.toJsFn)
    __obj.asInstanceOf[Bucket]
  }
  
  extension [Self <: Bucket](x: Self) {
    
    inline def setDestroy(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHasPattern(value: Boolean): Self = StObject.set(x, "hasPattern", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setLayerIds(value: js.Array[String]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "layerIds", js.Array(value*))
    
    inline def setLayers(value: js.Array[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: Any*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setPopulate(
      value: (js.Array[IndexedFeature], PopulateParameters, CanonicalTileID) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "populate", js.Any.fromFunction3((t0: js.Array[IndexedFeature], t1: PopulateParameters, t2: CanonicalTileID) => (value(t0, t1, t2)).runNow()))
    
    inline def setStateDependentLayerIds(value: js.Array[String]): Self = StObject.set(x, "stateDependentLayerIds", value.asInstanceOf[js.Any])
    
    inline def setStateDependentLayerIdsVarargs(value: String*): Self = StObject.set(x, "stateDependentLayerIds", js.Array(value*))
    
    inline def setStateDependentLayers(value: js.Array[Any]): Self = StObject.set(x, "stateDependentLayers", value.asInstanceOf[js.Any])
    
    inline def setStateDependentLayersVarargs(value: Any*): Self = StObject.set(x, "stateDependentLayers", js.Array(value*))
    
    inline def setUpdate(
      value: (FeatureStates, VectorTileLayer, StringDictionary[ImagePosition]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: FeatureStates, t1: VectorTileLayer, t2: StringDictionary[ImagePosition]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpload(value: Context => japgolly.scalajs.react.Callback): Self = StObject.set(x, "upload", js.Any.fromFunction1((t0: Context) => value(t0).runNow()))
    
    inline def setUploadPending(value: CallbackTo[Boolean]): Self = StObject.set(x, "uploadPending", value.toJsFn)
  }
}
