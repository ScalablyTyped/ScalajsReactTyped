package typingsJapgolly.recase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exceptions extends StObject {
    
    var exceptions: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Exceptions {
    
    inline def apply(): Exceptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exceptions]
    }
    
    extension [Self <: Exceptions](x: Self) {
      
      inline def setExceptions(value: StringDictionary[String]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
      
      inline def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    }
  }
}
