package typingsJapgolly.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromBeginning extends StObject {
  
  var fromBeginning: Boolean
}
object FromBeginning {
  
  inline def apply(fromBeginning: Boolean): FromBeginning = {
    val __obj = js.Dynamic.literal(fromBeginning = fromBeginning.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromBeginning]
  }
  
  extension [Self <: FromBeginning](x: Self) {
    
    inline def setFromBeginning(value: Boolean): Self = StObject.set(x, "fromBeginning", value.asInstanceOf[js.Any])
  }
}
