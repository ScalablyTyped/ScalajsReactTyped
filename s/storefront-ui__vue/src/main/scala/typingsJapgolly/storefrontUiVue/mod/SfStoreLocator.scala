package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfStoreLocator extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfStoreLocator")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var computedMapOptions: js.Object
    
    var internalCenter: js.Array[Double] | js.Object
  }
  object Computed {
    
    inline def apply(computedMapOptions: js.Object, internalCenter: js.Array[Double] | js.Object): Computed = {
      val __obj = js.Dynamic.literal(computedMapOptions = computedMapOptions.asInstanceOf[js.Any], internalCenter = internalCenter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setComputedMapOptions(value: js.Object): Self = StObject.set(x, "computedMapOptions", value.asInstanceOf[js.Any])
      
      inline def setInternalCenter(value: js.Array[Double] | js.Object): Self = StObject.set(x, "internalCenter", value.asInstanceOf[js.Any])
      
      inline def setInternalCenterVarargs(value: Double*): Self = StObject.set(x, "internalCenter", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: CallbackTo[Data], methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var loaded: Boolean
    
    var mapReady: Boolean
    
    var stores: js.Array[Any]
    
    var userPosition: js.Array[Double]
  }
  object Data {
    
    inline def apply(loaded: Boolean, mapReady: Boolean, stores: js.Array[Any], userPosition: js.Array[Double]): Data = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], mapReady = mapReady.asInstanceOf[js.Any], stores = stores.asInstanceOf[js.Any], userPosition = userPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setMapReady(value: Boolean): Self = StObject.set(x, "mapReady", value.asInstanceOf[js.Any])
      
      inline def setStores(value: js.Array[Any]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresVarargs(value: Any*): Self = StObject.set(x, "stores", js.Array(value*))
      
      inline def setUserPosition(value: js.Array[Double]): Self = StObject.set(x, "userPosition", value.asInstanceOf[js.Any])
      
      inline def setUserPositionVarargs(value: Double*): Self = StObject.set(x, "userPosition", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def centerOn(latlng: Any): Unit
    
    def getGeoDistance(start: Any, end: Any): Double
    
    def latLngEquality(a: Double, b: Double): Boolean
    
    def locateUser(): Unit
    
    def locationFound(location: Any): Unit
    
    def onMapReady(mapObject: Any): Unit
    
    def registerStore(store: Any): Unit
    
    def removeStore(store: Any): Unit
    
    def updateCenter(latlng: Any): Unit
  }
  object Methods {
    
    inline def apply(
      centerOn: Any => Callback,
      getGeoDistance: (Any, Any) => Double,
      latLngEquality: (Double, Double) => Boolean,
      locateUser: Callback,
      locationFound: Any => Callback,
      onMapReady: Any => Callback,
      registerStore: Any => Callback,
      removeStore: Any => Callback,
      updateCenter: Any => Callback
    ): Methods = {
      val __obj = js.Dynamic.literal(centerOn = js.Any.fromFunction1((t0: Any) => centerOn(t0).runNow()), getGeoDistance = js.Any.fromFunction2(getGeoDistance), latLngEquality = js.Any.fromFunction2(latLngEquality), locateUser = locateUser.toJsFn, locationFound = js.Any.fromFunction1((t0: Any) => locationFound(t0).runNow()), onMapReady = js.Any.fromFunction1((t0: Any) => onMapReady(t0).runNow()), registerStore = js.Any.fromFunction1((t0: Any) => registerStore(t0).runNow()), removeStore = js.Any.fromFunction1((t0: Any) => removeStore(t0).runNow()), updateCenter = js.Any.fromFunction1((t0: Any) => updateCenter(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCenterOn(value: Any => Callback): Self = StObject.set(x, "centerOn", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setGetGeoDistance(value: (Any, Any) => Double): Self = StObject.set(x, "getGeoDistance", js.Any.fromFunction2(value))
      
      inline def setLatLngEquality(value: (Double, Double) => Boolean): Self = StObject.set(x, "latLngEquality", js.Any.fromFunction2(value))
      
      inline def setLocateUser(value: Callback): Self = StObject.set(x, "locateUser", value.toJsFn)
      
      inline def setLocationFound(value: Any => Callback): Self = StObject.set(x, "locationFound", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnMapReady(value: Any => Callback): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRegisterStore(value: Any => Callback): Self = StObject.set(x, "registerStore", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRemoveStore(value: Any => Callback): Self = StObject.set(x, "removeStore", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setUpdateCenter(value: Any => Callback): Self = StObject.set(x, "updateCenter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var center: js.Array[Double] | js.Object
    
    var flyToStoreZoom: Double
    
    var mapOptions: js.Object
    
    var markerIconSize: js.Array[Double]
    
    var markerOptions: js.Object
    
    var maxZoom: Double
    
    var tileLayerOptions: js.Object
    
    var tileServerAttribution: String
    
    var tileServerUrl: String
    
    var zoom: Double
  }
  object Props {
    
    inline def apply(
      center: js.Array[Double] | js.Object,
      flyToStoreZoom: Double,
      mapOptions: js.Object,
      markerIconSize: js.Array[Double],
      markerOptions: js.Object,
      maxZoom: Double,
      tileLayerOptions: js.Object,
      tileServerAttribution: String,
      tileServerUrl: String,
      zoom: Double
    ): Props = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], flyToStoreZoom = flyToStoreZoom.asInstanceOf[js.Any], mapOptions = mapOptions.asInstanceOf[js.Any], markerIconSize = markerIconSize.asInstanceOf[js.Any], markerOptions = markerOptions.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], tileLayerOptions = tileLayerOptions.asInstanceOf[js.Any], tileServerAttribution = tileServerAttribution.asInstanceOf[js.Any], tileServerUrl = tileServerUrl.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCenter(value: js.Array[Double] | js.Object): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setFlyToStoreZoom(value: Double): Self = StObject.set(x, "flyToStoreZoom", value.asInstanceOf[js.Any])
      
      inline def setMapOptions(value: js.Object): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
      
      inline def setMarkerIconSize(value: js.Array[Double]): Self = StObject.set(x, "markerIconSize", value.asInstanceOf[js.Any])
      
      inline def setMarkerIconSizeVarargs(value: Double*): Self = StObject.set(x, "markerIconSize", js.Array(value*))
      
      inline def setMarkerOptions(value: js.Object): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setTileLayerOptions(value: js.Object): Self = StObject.set(x, "tileLayerOptions", value.asInstanceOf[js.Any])
      
      inline def setTileServerAttribution(value: String): Self = StObject.set(x, "tileServerAttribution", value.asInstanceOf[js.Any])
      
      inline def setTileServerUrl(value: String): Self = StObject.set(x, "tileServerUrl", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfStoreLocator.foo` */
  override def _to: Constructor = ^
}
