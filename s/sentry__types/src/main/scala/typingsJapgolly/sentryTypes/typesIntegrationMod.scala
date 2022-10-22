package typingsJapgolly.sentryTypes

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationMod {
  
  trait Integration extends StObject {
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    var name: String
    
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit
  }
  object Integration {
    
    inline def apply(
      name: String,
      setupOnce: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Callback
    ): Integration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], setupOnce = js.Any.fromFunction2((t0: js.Function1[/* callback */ EventProcessor, Unit], t1: js.Function0[Hub]) => (setupOnce(t0, t1)).runNow()))
      __obj.asInstanceOf[Integration]
    }
    
    extension [Self <: Integration](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSetupOnce(value: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Callback): Self = StObject.set(x, "setupOnce", js.Any.fromFunction2((t0: js.Function1[/* callback */ EventProcessor, Unit], t1: js.Function0[Hub]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait IntegrationClass[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T] {
    
    /**
      * Property that holds the integration name
      */
    var id: String = js.native
  }
}
