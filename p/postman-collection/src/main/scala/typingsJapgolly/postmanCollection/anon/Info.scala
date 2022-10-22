package typingsJapgolly.postmanCollection.anon

import typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var info: PropertyBaseDefinition
}
object Info {
  
  inline def apply(info: PropertyBaseDefinition): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setInfo(value: PropertyBaseDefinition): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
