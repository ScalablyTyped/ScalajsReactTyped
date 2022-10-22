package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyStatement_
  extends StObject
     with BaseNode
     with Node
     with Standardized
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement_ : EmptyStatement
}
object EmptyStatement_ {
  
  inline def apply(): EmptyStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[EmptyStatement_]
  }
  
  extension [Self <: EmptyStatement_](x: Self) {
    
    inline def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
