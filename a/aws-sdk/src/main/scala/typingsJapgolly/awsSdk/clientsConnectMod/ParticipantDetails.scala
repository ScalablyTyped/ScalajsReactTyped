package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantDetails extends StObject {
  
  /**
    * Display name of the participant.
    */
  var DisplayName: typingsJapgolly.awsSdk.clientsConnectMod.DisplayName
}
object ParticipantDetails {
  
  inline def apply(DisplayName: DisplayName): ParticipantDetails = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantDetails]
  }
  
  extension [Self <: ParticipantDetails](x: Self) {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
  }
}
