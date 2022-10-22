package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginMount extends StObject {
  
  var Description: String
  
  var Destination: String
  
  var Name: String
  
  var Options: js.Array[String]
  
  var Settable: js.Array[String]
  
  var Source: String
  
  var Type: String
}
object PluginMount {
  
  inline def apply(
    Description: String,
    Destination: String,
    Name: String,
    Options: js.Array[String],
    Settable: js.Array[String],
    Source: String,
    Type: String
  ): PluginMount = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMount]
  }
  
  extension [Self <: PluginMount](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "Options", js.Array(value*))
    
    inline def setSettable(value: js.Array[String]): Self = StObject.set(x, "Settable", value.asInstanceOf[js.Any])
    
    inline def setSettableVarargs(value: String*): Self = StObject.set(x, "Settable", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
