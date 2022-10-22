package typingsJapgolly.mapboxMapboxSdk

import typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiRequestMod.MapboxProfile
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.all
import typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod.DirectionsAnnotation
import typingsJapgolly.mapboxMapboxSdk.servicesMapMatchingMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMatrixMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): MatrixService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[MatrixService]
  inline def default(config: typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.default): MatrixService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[MatrixService]
  
  trait Destination extends StObject {
    
    var location: js.Array[Double]
    
    var name: String
  }
  object Destination {
    
    inline def apply(location: js.Array[Double], name: String): Destination = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Destination]
    }
    
    extension [Self <: Destination](x: Self) {
      
      inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatrixRequest extends StObject {
    
    var annotations: js.UndefOr[js.Array[DirectionsAnnotation]] = js.undefined
    
    var destinations: js.UndefOr[js.Array[Double] | all] = js.undefined
    
    var points: js.Array[Point]
    
    var profile: js.UndefOr[MapboxProfile] = js.undefined
    
    var sources: js.UndefOr[js.Array[Double] | all] = js.undefined
  }
  object MatrixRequest {
    
    inline def apply(points: js.Array[Point]): MatrixRequest = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixRequest]
    }
    
    extension [Self <: MatrixRequest](x: Self) {
      
      inline def setAnnotations(value: js.Array[DirectionsAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: DirectionsAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setDestinations(value: js.Array[Double] | all): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
      
      inline def setDestinationsVarargs(value: Double*): Self = StObject.set(x, "destinations", js.Array(value*))
      
      inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setProfile(value: MapboxProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSources(value: js.Array[Double] | all): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: Double*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  trait MatrixResponse extends StObject {
    
    var code: String
    
    var destinations: js.Array[Destination]
    
    var distances: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    var durations: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    var sources: js.Array[Destination]
  }
  object MatrixResponse {
    
    inline def apply(code: String, destinations: js.Array[Destination], sources: js.Array[Destination]): MatrixResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixResponse]
    }
    
    extension [Self <: MatrixResponse](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDestinations(value: js.Array[Destination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "destinations", js.Array(value*))
      
      inline def setDistances(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "distances", value.asInstanceOf[js.Any])
      
      inline def setDistancesUndefined: Self = StObject.set(x, "distances", js.undefined)
      
      inline def setDistancesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "distances", js.Array(value*))
      
      inline def setDurations(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
      
      inline def setDurationsUndefined: Self = StObject.set(x, "durations", js.undefined)
      
      inline def setDurationsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "durations", js.Array(value*))
      
      inline def setSources(value: js.Array[Destination]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: Destination*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  trait MatrixService extends StObject {
    
    /**
      * Get a duration and/or distance matrix showing travel times and distances between coordinates.
      * @param request
      */
    def getMatrix(request: MatrixRequest): MapiRequest[MatrixResponse]
  }
  object MatrixService {
    
    inline def apply(getMatrix: MatrixRequest => MapiRequest[MatrixResponse]): MatrixService = {
      val __obj = js.Dynamic.literal(getMatrix = js.Any.fromFunction1(getMatrix))
      __obj.asInstanceOf[MatrixService]
    }
    
    extension [Self <: MatrixService](x: Self) {
      
      inline def setGetMatrix(value: MatrixRequest => MapiRequest[MatrixResponse]): Self = StObject.set(x, "getMatrix", js.Any.fromFunction1(value))
    }
  }
}
