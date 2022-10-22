package typingsJapgolly.karmaSinonChai

import typingsJapgolly.chai.Chai.Assert
import typingsJapgolly.chai.Chai.ExpectStatic
import typingsJapgolly.chai.Chai.Should
import typingsJapgolly.karmaSinonChai.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("assert")
    @js.native
    val assert: Assert = js.native
    
    @JSGlobal("expect")
    @js.native
    val expect: ExpectStatic = js.native
    
    @JSGlobal("should")
    @js.native
    val should: Should = js.native
  }
  
  /* augmented module */
  object karmaAugmentingMod {
    
    trait ClientOptions extends StObject {
      
      /**
        * chai config
        */
      var chai: js.UndefOr[PartialConfig] = js.undefined
    }
    object ClientOptions {
      
      inline def apply(): ClientOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClientOptions]
      }
      
      extension [Self <: ClientOptions](x: Self) {
        
        inline def setChai(value: PartialConfig): Self = StObject.set(x, "chai", value.asInstanceOf[js.Any])
        
        inline def setChaiUndefined: Self = StObject.set(x, "chai", js.undefined)
      }
    }
  }
}
