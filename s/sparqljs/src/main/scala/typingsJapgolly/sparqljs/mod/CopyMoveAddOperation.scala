package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.add
import typingsJapgolly.sparqljs.sparqljsStrings.copy
import typingsJapgolly.sparqljs.sparqljsStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyMoveAddOperation
  extends StObject
     with ManagementOperation {
  
  var destination: GraphOrDefault
  
  var silent: Boolean
  
  var source: GraphOrDefault
  
  var `type`: copy | move | add
}
object CopyMoveAddOperation {
  
  inline def apply(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
  
  extension [Self <: CopyMoveAddOperation](x: Self) {
    
    inline def setDestination(value: GraphOrDefault): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSource(value: GraphOrDefault): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: copy | move | add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
