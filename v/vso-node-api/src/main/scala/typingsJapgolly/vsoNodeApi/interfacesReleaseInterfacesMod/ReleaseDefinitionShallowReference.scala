package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionShallowReference extends StObject {
  
  /**
    * Gets the links to related resources, APIs, and views for the release definition.
    */
  var _links: Any
  
  /**
    * Gets the unique identifier of release definition.
    */
  var id: Double
  
  /**
    * Gets or sets the name of the release definition.
    */
  var name: String
  
  /**
    * Gets the REST API url to access the release definition.
    */
  var url: String
}
object ReleaseDefinitionShallowReference {
  
  inline def apply(_links: Any, id: Double, name: String, url: String): ReleaseDefinitionShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionShallowReference]
  }
  
  extension [Self <: ReleaseDefinitionShallowReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
