package typingsJapgolly.azureMsalCommon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoIguidgeneratorMod {
  
  trait IGuidGenerator extends StObject {
    
    def generateGuid(): String
    
    def isGuid(guid: String): Boolean
  }
  object IGuidGenerator {
    
    inline def apply(generateGuid: CallbackTo[String], isGuid: String => Boolean): IGuidGenerator = {
      val __obj = js.Dynamic.literal(generateGuid = generateGuid.toJsFn, isGuid = js.Any.fromFunction1(isGuid))
      __obj.asInstanceOf[IGuidGenerator]
    }
    
    extension [Self <: IGuidGenerator](x: Self) {
      
      inline def setGenerateGuid(value: CallbackTo[String]): Self = StObject.set(x, "generateGuid", value.toJsFn)
      
      inline def setIsGuid(value: String => Boolean): Self = StObject.set(x, "isGuid", js.Any.fromFunction1(value))
    }
  }
}
