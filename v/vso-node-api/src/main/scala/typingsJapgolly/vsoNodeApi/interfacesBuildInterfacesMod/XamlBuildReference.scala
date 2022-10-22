package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XamlBuildReference extends StObject {
  
  /**
    * Id of the resource
    */
  var id: Double
  
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String
  
  /**
    * Full http link to the resource
    */
  var url: String
}
object XamlBuildReference {
  
  inline def apply(id: Double, name: String, url: String): XamlBuildReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[XamlBuildReference]
  }
  
  extension [Self <: XamlBuildReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
