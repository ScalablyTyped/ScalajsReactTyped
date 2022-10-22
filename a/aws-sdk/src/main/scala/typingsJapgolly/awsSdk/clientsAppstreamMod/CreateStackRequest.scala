package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStackRequest extends StObject {
  
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined
  
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.ApplicationSettings] = js.undefined
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.Description] = js.undefined
  
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.DisplayName] = js.undefined
  
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions. 
    */
  var EmbedHostDomains: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.EmbedHostDomains] = js.undefined
  
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.FeedbackURL] = js.undefined
  
  /**
    * The name of the stack.
    */
  var Name: typingsJapgolly.awsSdk.clientsAppstreamMod.Name
  
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.RedirectURL] = js.undefined
  
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
  
  /**
    * The streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
    */
  var StreamingExperienceSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.StreamingExperienceSettings] = js.undefined
  
  /**
    * The tags to associate with the stack. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.Tags] = js.undefined
  
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. 
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.undefined
}
object CreateStackRequest {
  
  inline def apply(Name: Name): CreateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackRequest]
  }
  
  extension [Self <: CreateStackRequest](x: Self) {
    
    inline def setAccessEndpoints(value: AccessEndpointList): Self = StObject.set(x, "AccessEndpoints", value.asInstanceOf[js.Any])
    
    inline def setAccessEndpointsUndefined: Self = StObject.set(x, "AccessEndpoints", js.undefined)
    
    inline def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = StObject.set(x, "AccessEndpoints", js.Array(value*))
    
    inline def setApplicationSettings(value: ApplicationSettings): Self = StObject.set(x, "ApplicationSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationSettingsUndefined: Self = StObject.set(x, "ApplicationSettings", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmbedHostDomains(value: EmbedHostDomains): Self = StObject.set(x, "EmbedHostDomains", value.asInstanceOf[js.Any])
    
    inline def setEmbedHostDomainsUndefined: Self = StObject.set(x, "EmbedHostDomains", js.undefined)
    
    inline def setEmbedHostDomainsVarargs(value: EmbedHostDomain*): Self = StObject.set(x, "EmbedHostDomains", js.Array(value*))
    
    inline def setFeedbackURL(value: FeedbackURL): Self = StObject.set(x, "FeedbackURL", value.asInstanceOf[js.Any])
    
    inline def setFeedbackURLUndefined: Self = StObject.set(x, "FeedbackURL", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: RedirectURL): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "RedirectURL", js.undefined)
    
    inline def setStorageConnectors(value: StorageConnectorList): Self = StObject.set(x, "StorageConnectors", value.asInstanceOf[js.Any])
    
    inline def setStorageConnectorsUndefined: Self = StObject.set(x, "StorageConnectors", js.undefined)
    
    inline def setStorageConnectorsVarargs(value: StorageConnector*): Self = StObject.set(x, "StorageConnectors", js.Array(value*))
    
    inline def setStreamingExperienceSettings(value: StreamingExperienceSettings): Self = StObject.set(x, "StreamingExperienceSettings", value.asInstanceOf[js.Any])
    
    inline def setStreamingExperienceSettingsUndefined: Self = StObject.set(x, "StreamingExperienceSettings", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUserSettings(value: UserSettingList): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
    
    inline def setUserSettingsVarargs(value: UserSetting*): Self = StObject.set(x, "UserSettings", js.Array(value*))
  }
}
