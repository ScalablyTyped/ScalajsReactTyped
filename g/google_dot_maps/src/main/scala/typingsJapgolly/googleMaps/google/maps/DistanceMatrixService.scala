package typingsJapgolly.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service for computing distances between multiple origins and
  * destinations.
  */
@js.native
trait DistanceMatrixService extends StObject {
  
  /**
    * Issues a distance matrix request.
    */
  def getDistanceMatrix(request: DistanceMatrixRequest): js.Promise[DistanceMatrixResponse] = js.native
  def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[/* a */ DistanceMatrixResponse | Null, /* b */ DistanceMatrixStatus, Unit]
  ): js.Promise[DistanceMatrixResponse] = js.native
}
