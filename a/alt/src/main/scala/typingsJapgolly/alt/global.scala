package typingsJapgolly.alt

import typingsJapgolly.alt.AltJS.AltConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AltJS {
    
    @JSGlobal("AltJS.Alt")
    @js.native
    open class Alt ()
      extends StObject
         with typingsJapgolly.alt.AltJS.Alt {
      def this(config: AltConfig) = this()
    }
    
    @JSGlobal("AltJS.lifeCycleEvents")
    @js.native
    object lifeCycleEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.alt.AltJS.lifeCycleEvents & Double] = js.native
      
      /* 0 */ val bootstrap: typingsJapgolly.alt.AltJS.lifeCycleEvents.bootstrap & Double = js.native
      
      /* 4 */ val error: typingsJapgolly.alt.AltJS.lifeCycleEvents.error & Double = js.native
      
      /* 2 */ val init: typingsJapgolly.alt.AltJS.lifeCycleEvents.init & Double = js.native
      
      /* 3 */ val rollback: typingsJapgolly.alt.AltJS.lifeCycleEvents.rollback & Double = js.native
      
      /* 1 */ val snapshot: typingsJapgolly.alt.AltJS.lifeCycleEvents.snapshot & Double = js.native
    }
  }
}
