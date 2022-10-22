package typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacesServiceStatusTypes extends StObject
@JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/types", "PlacesServiceStatusTypes")
@js.native
object PlacesServiceStatusTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlacesServiceStatusTypes & String] = js.native
  
  @js.native
  sealed trait InvalidRequest
    extends StObject
       with PlacesServiceStatusTypes
  /* "INVALID_REQUEST" */ val InvalidRequest: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.InvalidRequest & String = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with PlacesServiceStatusTypes
  /* "NOT_FOUND" */ val NotFound: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.NotFound & String = js.native
  
  @js.native
  sealed trait Ok
    extends StObject
       with PlacesServiceStatusTypes
  /* "OK" */ val Ok: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.Ok & String = js.native
  
  @js.native
  sealed trait OverQueryLimit
    extends StObject
       with PlacesServiceStatusTypes
  /* "OVER_QUERY_LIMIT" */ val OverQueryLimit: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.OverQueryLimit & String = js.native
  
  @js.native
  sealed trait RequestDenied
    extends StObject
       with PlacesServiceStatusTypes
  /* "REQUEST_DENIED" */ val RequestDenied: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.RequestDenied & String = js.native
  
  @js.native
  sealed trait UnknownError
    extends StObject
       with PlacesServiceStatusTypes
  /* "UNKNOWN_ERROR" */ val UnknownError: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.UnknownError & String = js.native
  
  @js.native
  sealed trait ZeroResults
    extends StObject
       with PlacesServiceStatusTypes
  /* "ZERO_RESULTS" */ val ZeroResults: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.PlacesServiceStatusTypes.ZeroResults & String = js.native
}
