package typingsJapgolly.signalsJs

import typingsJapgolly.signalsJs.libOrgOsflashSignalsIslotMod.ISlot
import typingsJapgolly.signalsJs.libOrgOsflashSignalsOnceSignalMod.OnceSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOrgOsflashSignalsSignalMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.signalsJs.libOrgOsflashSignalsIoncesignalMod.IOnceSignal because Already inherited
  - typingsJapgolly.signalsJs.libOrgOsflashSignalsIsignalMod.ISignal because var conflicts: numListeners, valueClasses. Inlined add */ @JSImport("signals.js/lib/org/osflash/signals/Signal", "Signal")
  @js.native
  open class Signal protected () extends OnceSignal {
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
    
    /**
      * @inheritDoc
      * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
      * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
      */
    /**
      * Subscribes a listener for the signal.
      * @param    listener A function with arguments
      * that matches the value classes dispatched by the signal.
      * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def add(listener: js.Function): ISlot = js.native
  }
}
