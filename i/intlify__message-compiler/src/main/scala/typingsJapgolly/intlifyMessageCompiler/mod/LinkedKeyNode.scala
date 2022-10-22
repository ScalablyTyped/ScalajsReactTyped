package typingsJapgolly.intlifyMessageCompiler.mod

import typingsJapgolly.intlifyMessageCompiler.intlifyMessageCompilerInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedKeyNode
  extends StObject
     with Node2 {
  
  @JSName("type")
  var type_LinkedKeyNode: `7`
  
  var value: String
}
object LinkedKeyNode {
  
  inline def apply(end: Double, start: Double, value: String): LinkedKeyNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(7)
    __obj.asInstanceOf[LinkedKeyNode]
  }
  
  extension [Self <: LinkedKeyNode](x: Self) {
    
    inline def setType(value: `7`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
