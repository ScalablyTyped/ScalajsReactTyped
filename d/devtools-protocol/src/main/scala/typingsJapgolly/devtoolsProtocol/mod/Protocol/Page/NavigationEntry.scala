package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEntry extends StObject {
  
  /**
    * Unique id of the navigation history entry.
    */
  var id: integer
  
  /**
    * Title of the navigation history entry.
    */
  var title: String
  
  /**
    * Transition type.
    */
  var transitionType: TransitionType
  
  /**
    * URL of the navigation history entry.
    */
  var url: String
  
  /**
    * URL that the user typed in the url bar.
    */
  var userTypedURL: String
}
object NavigationEntry {
  
  inline def apply(id: integer, title: String, transitionType: TransitionType, url: String, userTypedURL: String): NavigationEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userTypedURL = userTypedURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEntry]
  }
  
  extension [Self <: NavigationEntry](x: Self) {
    
    inline def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTransitionType(value: TransitionType): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUserTypedURL(value: String): Self = StObject.set(x, "userTypedURL", value.asInstanceOf[js.Any])
  }
}
