package typingsJapgolly.isReference

import typingsJapgolly.isReference.isReferenceStrings.PropertyDefinition
import typingsJapgolly.isReference.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Computed extends StObject {
    
    var computed: Boolean
    
    var `type`: PropertyDefinition
    
    var value: Node
  }
  object Computed {
    
    inline def apply(computed: Boolean, value: Node): Computed = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PropertyDefinition")
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setType(value: PropertyDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Node): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
