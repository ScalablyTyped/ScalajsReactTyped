package typingsJapgolly.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domSerialStrings {
  
  @js.native
  sealed trait even
    extends StObject
       with ParityType
  inline def even: even = "even".asInstanceOf[even]
  
  @js.native
  sealed trait hardware
    extends StObject
       with FlowControlType
  inline def hardware: hardware = "hardware".asInstanceOf[hardware]
  
  @js.native
  sealed trait mark
    extends StObject
       with ParityType
  inline def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait none
    extends StObject
       with FlowControlType
       with ParityType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait odd
    extends StObject
       with ParityType
  inline def odd: odd = "odd".asInstanceOf[odd]
  
  @js.native
  sealed trait space
    extends StObject
       with ParityType
  inline def space: space = "space".asInstanceOf[space]
}
