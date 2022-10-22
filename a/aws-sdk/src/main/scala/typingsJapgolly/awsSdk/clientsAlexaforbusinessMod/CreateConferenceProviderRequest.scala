package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConferenceProviderRequest extends StObject {
  
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ConferenceProviderName
  
  /**
    * Represents a type within a list of predefined types.
    */
  var ConferenceProviderType: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ConferenceProviderType
  
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.IPDialIn] = js.undefined
  
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.MeetingSetting
  
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.PSTNDialIn] = js.undefined
  
  /**
    * The tags to be added to the specified resource. Do not provide system tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConferenceProviderRequest {
  
  inline def apply(
    ConferenceProviderName: ConferenceProviderName,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting
  ): CreateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderName = ConferenceProviderName.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConferenceProviderRequest]
  }
  
  extension [Self <: CreateConferenceProviderRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setConferenceProviderName(value: ConferenceProviderName): Self = StObject.set(x, "ConferenceProviderName", value.asInstanceOf[js.Any])
    
    inline def setConferenceProviderType(value: ConferenceProviderType): Self = StObject.set(x, "ConferenceProviderType", value.asInstanceOf[js.Any])
    
    inline def setIPDialIn(value: IPDialIn): Self = StObject.set(x, "IPDialIn", value.asInstanceOf[js.Any])
    
    inline def setIPDialInUndefined: Self = StObject.set(x, "IPDialIn", js.undefined)
    
    inline def setMeetingSetting(value: MeetingSetting): Self = StObject.set(x, "MeetingSetting", value.asInstanceOf[js.Any])
    
    inline def setPSTNDialIn(value: PSTNDialIn): Self = StObject.set(x, "PSTNDialIn", value.asInstanceOf[js.Any])
    
    inline def setPSTNDialInUndefined: Self = StObject.set(x, "PSTNDialIn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
