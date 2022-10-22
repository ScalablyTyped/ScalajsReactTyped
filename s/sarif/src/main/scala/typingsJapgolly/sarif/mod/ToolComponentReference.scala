package typingsJapgolly.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolComponentReference extends StObject {
  
  /**
    * The 'guid' property of the referenced toolComponent.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * An index into the referenced toolComponent in tool.extensions.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The 'name' property of the referenced toolComponent.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the toolComponentReference.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object ToolComponentReference {
  
  inline def apply(): ToolComponentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolComponentReference]
  }
  
  extension [Self <: ToolComponentReference](x: Self) {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
