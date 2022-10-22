package typingsJapgolly.bmapgl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bmapgl.anon.Coordinates
import typingsJapgolly.bmapgl.bmapglStrings.blank
import typingsJapgolly.bmapgl.bmapglStrings.bmap
import typingsJapgolly.bmapgl.bmapglStrings.cesium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapVGL {
  
  trait Effects extends StObject
  
  trait GeoJSON
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var geometry: Coordinates
    
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object GeoJSON {
    
    inline def apply(geometry: Coordinates): GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    extension [Self <: GeoJSON](x: Self) {
      
      inline def setGeometry(value: Coordinates): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  trait Layer extends StObject {
    
    def destroy(): Unit
    
    def getData(): js.Array[GeoJSON]
    
    def getDefaultOptions(): LayerOptions
    
    def getOptions(): LayerOptions
    
    def setData(x: js.Array[GeoJSON]): Unit
    
    def setOptions(x: LayerOptions): Unit
  }
  object Layer {
    
    inline def apply(
      destroy: Callback,
      getData: CallbackTo[js.Array[GeoJSON]],
      getDefaultOptions: CallbackTo[LayerOptions],
      getOptions: CallbackTo[LayerOptions],
      setData: js.Array[GeoJSON] => Callback,
      setOptions: LayerOptions => Callback
    ): Layer = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getData = getData.toJsFn, getDefaultOptions = getDefaultOptions.toJsFn, getOptions = getOptions.toJsFn, setData = js.Any.fromFunction1((t0: js.Array[GeoJSON]) => setData(t0).runNow()), setOptions = js.Any.fromFunction1((t0: LayerOptions) => setOptions(t0).runNow()))
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetData(value: CallbackTo[js.Array[GeoJSON]]): Self = StObject.set(x, "getData", value.toJsFn)
      
      inline def setGetDefaultOptions(value: CallbackTo[LayerOptions]): Self = StObject.set(x, "getDefaultOptions", value.toJsFn)
      
      inline def setGetOptions(value: CallbackTo[LayerOptions]): Self = StObject.set(x, "getOptions", value.toJsFn)
      
      inline def setSetData(value: js.Array[GeoJSON] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: js.Array[GeoJSON]) => value(t0).runNow()))
      
      inline def setSetOptions(value: LayerOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: LayerOptions) => value(t0).runNow()))
    }
  }
  
  trait LayerOptions
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var data: js.UndefOr[js.Array[GeoJSON]] = js.undefined
    
    var repeat: js.UndefOr[Boolean] = js.undefined
  }
  object LayerOptions {
    
    inline def apply(): LayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerOptions]
    }
    
    extension [Self <: LayerOptions](x: Self) {
      
      inline def setData(value: js.Array[GeoJSON]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: GeoJSON*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    }
  }
  
  trait View extends StObject {
    
    def addLayer(x: Layer): Unit
    
    def destroy(): Unit
    
    def getAllLayers(x: Layer): js.Array[Layer]
    
    def getAllThreeLayers(x: Layer): js.Array[Layer]
    
    def removeLayer(x: Layer): Unit
  }
  object View {
    
    inline def apply(
      addLayer: Layer => Callback,
      destroy: Callback,
      getAllLayers: Layer => js.Array[Layer],
      getAllThreeLayers: Layer => js.Array[Layer],
      removeLayer: Layer => Callback
    ): View = {
      val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction1((t0: Layer) => addLayer(t0).runNow()), destroy = destroy.toJsFn, getAllLayers = js.Any.fromFunction1(getAllLayers), getAllThreeLayers = js.Any.fromFunction1(getAllThreeLayers), removeLayer = js.Any.fromFunction1((t0: Layer) => removeLayer(t0).runNow()))
      __obj.asInstanceOf[View]
    }
    
    extension [Self <: View](x: Self) {
      
      inline def setAddLayer(value: Layer => Callback): Self = StObject.set(x, "addLayer", js.Any.fromFunction1((t0: Layer) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetAllLayers(value: Layer => js.Array[Layer]): Self = StObject.set(x, "getAllLayers", js.Any.fromFunction1(value))
      
      inline def setGetAllThreeLayers(value: Layer => js.Array[Layer]): Self = StObject.set(x, "getAllThreeLayers", js.Any.fromFunction1(value))
      
      inline def setRemoveLayer(value: Layer => Callback): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1((t0: Layer) => value(t0).runNow()))
    }
  }
  
  trait ViewOptions extends StObject {
    
    var effects: js.UndefOr[js.Array[Effects]] = js.undefined
    
    var map: js.UndefOr[js.Object] = js.undefined
    
    var mapType: js.UndefOr[bmap | blank | cesium] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    extension [Self <: ViewOptions](x: Self) {
      
      inline def setEffects(value: js.Array[Effects]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setEffectsVarargs(value: Effects*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapType(value: bmap | blank | cesium): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
