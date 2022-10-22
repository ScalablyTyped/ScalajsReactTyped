package typingsJapgolly.humanSignals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Signal extends StObject {
    
    /**
      * What is the default action for this signal when it is not handled.
      */
    var action: SignalAction
    
    /**
      * Human-friendly description for the signal, for example
      * 'User interruption with CTRL-C'.
      */
    var description: String
    
    /**
      * Whether the signal's default action cannot be prevented.
      * This is true for SIGTERM, SIGKILL and SIGSTOP.
      */
    var forced: Boolean
    
    /**
      * Standard name of the signal, for example 'SIGINT'.
      */
    var name: SignalName
    
    /**
      * Code number of the signal, for example 2.
      * While most number are cross-platform, some are different between different
      * OS.
      */
    var number: SignalNumber
    
    /**
      * Which standard defined that signal.
      */
    var standard: SignalStandard
    
    /**
      * Whether the current OS can handle this signal in Node.js using
      * `process.on(name, handler)`. The list of supported signals is OS-specific.
      */
    var supported: Boolean
  }
  object Signal {
    
    inline def apply(
      action: SignalAction,
      description: String,
      forced: Boolean,
      name: SignalName,
      number: SignalNumber,
      standard: SignalStandard,
      supported: Boolean
    ): Signal = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signal]
    }
    
    extension [Self <: Signal](x: Self) {
      
      inline def setAction(value: SignalAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      inline def setName(value: SignalName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: SignalNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: SignalStandard): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humanSignals.humanSignalsStrings.terminate
    - typingsJapgolly.humanSignals.humanSignalsStrings.core
    - typingsJapgolly.humanSignals.humanSignalsStrings.ignore
    - typingsJapgolly.humanSignals.humanSignalsStrings.pause
    - typingsJapgolly.humanSignals.humanSignalsStrings.unpause
  */
  trait SignalAction extends StObject
  object SignalAction {
    
    inline def core: typingsJapgolly.humanSignals.humanSignalsStrings.core = "core".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.core]
    
    inline def ignore: typingsJapgolly.humanSignals.humanSignalsStrings.ignore = "ignore".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.ignore]
    
    inline def pause: typingsJapgolly.humanSignals.humanSignalsStrings.pause = "pause".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.pause]
    
    inline def terminate: typingsJapgolly.humanSignals.humanSignalsStrings.terminate = "terminate".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.terminate]
    
    inline def unpause: typingsJapgolly.humanSignals.humanSignalsStrings.unpause = "unpause".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.unpause]
  }
  
  type SignalName = /* template literal string: SIG${string} */ String
  
  type SignalNumber = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humanSignals.humanSignalsStrings.ansi
    - typingsJapgolly.humanSignals.humanSignalsStrings.posix
    - typingsJapgolly.humanSignals.humanSignalsStrings.bsd
    - typingsJapgolly.humanSignals.humanSignalsStrings.systemv
    - typingsJapgolly.humanSignals.humanSignalsStrings.other
  */
  trait SignalStandard extends StObject
  object SignalStandard {
    
    inline def ansi: typingsJapgolly.humanSignals.humanSignalsStrings.ansi = "ansi".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.ansi]
    
    inline def bsd: typingsJapgolly.humanSignals.humanSignalsStrings.bsd = "bsd".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.bsd]
    
    inline def other: typingsJapgolly.humanSignals.humanSignalsStrings.other = "other".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.other]
    
    inline def posix: typingsJapgolly.humanSignals.humanSignalsStrings.posix = "posix".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.posix]
    
    inline def systemv: typingsJapgolly.humanSignals.humanSignalsStrings.systemv = "systemv".asInstanceOf[typingsJapgolly.humanSignals.humanSignalsStrings.systemv]
  }
}
