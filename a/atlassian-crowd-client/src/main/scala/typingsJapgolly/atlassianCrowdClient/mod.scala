package typingsJapgolly.atlassianCrowdClient

import typingsJapgolly.atlassianCrowdClient.anon.Attributes
import typingsJapgolly.atlassianCrowdClient.anon.Authenticate
import typingsJapgolly.atlassianCrowdClient.anon.Children
import typingsJapgolly.atlassianCrowdClient.anon.Cookie
import typingsJapgolly.atlassianCrowdClient.anon.Create
import typingsJapgolly.atlassianCrowdClient.anon.Group
import typingsJapgolly.atlassianCrowdClient.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atlassian-crowd-client", JSImport.Namespace)
  @js.native
  open class ^ protected () extends CrowdClient {
    def this(settings: Settings) = this()
  }
  
  @js.native
  trait CrowdClient
    extends typingsJapgolly.atlassianCrowdClient.apiMod.^ {
    
    var authentication: Authenticate = js.native
    
    var config: Cookie = js.native
    
    var group: Children = js.native
    
    var search: Group = js.native
    
    var session: Create = js.native
    
    var user: Attributes = js.native
  }
}
