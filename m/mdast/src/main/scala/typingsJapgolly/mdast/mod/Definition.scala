package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.definition
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition
  extends StObject
     with Node[Data]
     with Association
     with Resource {
  
  @JSName("type")
  var type_Definition: definition
}
object Definition {
  
  inline def apply(identifier: String, url: String): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[Definition]
  }
  
  extension [Self <: Definition](x: Self) {
    
    inline def setType(value: definition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
