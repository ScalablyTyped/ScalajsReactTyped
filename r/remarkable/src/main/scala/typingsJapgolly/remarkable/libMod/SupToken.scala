package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.sup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait SupToken
  extends StObject
     with ContentToken {
  
  @JSName("content")
  var content_SupToken: String
  
  @JSName("type")
  var type_SupToken: sup
}
object SupToken {
  
  inline def apply(content: String, level: Double): SupToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sup")
    __obj.asInstanceOf[SupToken]
  }
  
  extension [Self <: SupToken](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: sup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
