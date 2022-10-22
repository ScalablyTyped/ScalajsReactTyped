package typingsJapgolly.xmldsigjs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Crypto
import org.scalajs.dom.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesApplicationMod {
  
  @JSImport("xmldsigjs/build/types/application", "Application")
  @js.native
  open class Application () extends StObject
  /* static members */
  object Application {
    
    @JSImport("xmldsigjs/build/types/application", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isNodePlugin(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePlugin")().asInstanceOf[Boolean]
    
    /**
      * Sets crypto engine for the current Application
      * @param  {string} name
      * @param  {Crypto} crypto
      * @returns void
      */
    inline def setEngine(name: String, crypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait CryptoEx
    extends StObject
       with typingsJapgolly.std.Crypto {
    
    var name: String
  }
  object CryptoEx {
    
    inline def apply(getRandomValues: Any => Any, name: String, randomUUID: CallbackTo[String], subtle: SubtleCrypto): CryptoEx = {
      val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), name = name.asInstanceOf[js.Any], randomUUID = randomUUID.toJsFn, subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoEx]
    }
    
    extension [Self <: CryptoEx](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
