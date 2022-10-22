package typingsJapgolly.firmata.mod

import typingsJapgolly.firmata.anon.ACCEL
import typingsJapgolly.firmata.anon.CCW
import typingsJapgolly.firmata.anon.DRIVER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepperConstants extends StObject {
  
  var DIRECTION: CCW
  
  var RUNSTATE: ACCEL
  
  var TYPE: DRIVER
}
object StepperConstants {
  
  inline def apply(DIRECTION: CCW, RUNSTATE: ACCEL, TYPE: DRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION.asInstanceOf[js.Any], RUNSTATE = RUNSTATE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperConstants]
  }
  
  extension [Self <: StepperConstants](x: Self) {
    
    inline def setDIRECTION(value: CCW): Self = StObject.set(x, "DIRECTION", value.asInstanceOf[js.Any])
    
    inline def setRUNSTATE(value: ACCEL): Self = StObject.set(x, "RUNSTATE", value.asInstanceOf[js.Any])
    
    inline def setTYPE(value: DRIVER): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
  }
}
