package typingsJapgolly.sinonMongoose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object sinonMod {
  
  trait SinonStub extends StObject {
    
    /**
      * When called, the stub will create a new stub to represent a mongoose chained function.
      */
    def chain(name: String): SinonStub
  }
  object SinonStub {
    
    inline def apply(chain: String => SinonStub): SinonStub = {
      val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain))
      __obj.asInstanceOf[SinonStub]
    }
    
    extension [Self <: SinonStub](x: Self) {
      
      inline def setChain(value: String => SinonStub): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
    }
  }
}
