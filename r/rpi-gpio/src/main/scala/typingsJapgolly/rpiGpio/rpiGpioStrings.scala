package typingsJapgolly.rpiGpio

import typingsJapgolly.rpiGpio.mod.EDGE
import typingsJapgolly.rpiGpio.mod.MODE
import typingsJapgolly.rpiGpio.mod.PinDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpiGpioStrings {
  
  @js.native
  sealed trait both
    extends StObject
       with EDGE
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait falling
    extends StObject
       with EDGE
  inline def falling: falling = "falling".asInstanceOf[falling]
  
  @js.native
  sealed trait high
    extends StObject
       with PinDirection
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait in
    extends StObject
       with PinDirection
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait low
    extends StObject
       with PinDirection
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait mode_bcm
    extends StObject
       with MODE
  inline def mode_bcm: mode_bcm = "mode_bcm".asInstanceOf[mode_bcm]
  
  @js.native
  sealed trait mode_rpi
    extends StObject
       with MODE
  inline def mode_rpi: mode_rpi = "mode_rpi".asInstanceOf[mode_rpi]
  
  @js.native
  sealed trait none
    extends StObject
       with EDGE
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait out
    extends StObject
       with PinDirection
  inline def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait rising
    extends StObject
       with EDGE
  inline def rising: rising = "rising".asInstanceOf[rising]
}
