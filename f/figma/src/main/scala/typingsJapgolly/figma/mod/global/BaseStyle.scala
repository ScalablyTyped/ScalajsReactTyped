package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseStyle extends StObject {
  
  var description: String
  
  val id: String
  
  val key: String
  
  var name: String
  
  var remote: Boolean
  
  // The key to use with "importStyleByKeyAsync"
  def remove(): Unit
  
  val `type`: StyleType
}
object BaseStyle {
  
  inline def apply(
    description: String,
    id: String,
    key: String,
    name: String,
    remote: Boolean,
    remove: Callback,
    `type`: StyleType
  ): BaseStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = remove.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStyle]
  }
  
  extension [Self <: BaseStyle](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setType(value: StyleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
