package typingsJapgolly.signalsJs

import typingsJapgolly.signalsJs.libOrgOsflashSignalsOnceSignalMod.OnceSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOrgOsflashSignalsPromiseMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/Promise", "Promise")
  @js.native
  open class Promise protected () extends OnceSignal {
    /**
      * Creates a Signal instance to dispatch value objects.
      * @param    valueClasses Any number of class references that enable type checks in dispatch().
      * For example, new Signal(String, uint)
      * would allow: signal.dispatch("the Answer", 42)
      * but not: signal.dispatch(true, 42.5)
      * nor: signal.dispatch()
      *
      * NOTE: In AS3, subclasses cannot call super.apply(null, valueClasses),
      * but this constructor has logic to support super(valueClasses).
      */
    def this(valueClasses: Any*) = this()
    
    /* private */ var isDispatched: Any = js.native
    
    /* private */ var valueObjects: Any = js.native
  }
}
