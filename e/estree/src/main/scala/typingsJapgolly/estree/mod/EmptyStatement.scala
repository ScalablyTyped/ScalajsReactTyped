package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyStatement
  extends StObject
     with BaseNode
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement: typingsJapgolly.estree.estreeStrings.EmptyStatement
}
object EmptyStatement {
  
  inline def apply(): EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[EmptyStatement]
  }
  
  extension [Self <: EmptyStatement](x: Self) {
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
