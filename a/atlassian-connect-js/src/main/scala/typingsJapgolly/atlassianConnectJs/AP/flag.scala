package typingsJapgolly.atlassianConnectJs.AP

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flags are the primary method for providing system feedback in the product user interface.
  * Messages include notifications of various kinds: alerts, confirmations, notices, warnings, info and errors.
  */
object flag {
  
  trait Flag extends StObject {
    
    /**
      * Closes the Flag.
      */
    def close(): Unit
  }
  object Flag {
    
    inline def apply(close: Callback): Flag = {
      val __obj = js.Dynamic.literal(close = close.toJsFn)
      __obj.asInstanceOf[Flag]
    }
    
    extension [Self <: Flag](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    }
  }
}
