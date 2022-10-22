package typingsJapgolly.iotaLibJs.anon

import typingsJapgolly.iotaLibJs.mod.TransactionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsArray extends StObject {
  
  var inputs: js.Array[TransactionObject]
}
object InputsArray {
  
  inline def apply(inputs: js.Array[TransactionObject]): InputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsArray]
  }
  
  extension [Self <: InputsArray](x: Self) {
    
    inline def setInputs(value: js.Array[TransactionObject]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TransactionObject*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
