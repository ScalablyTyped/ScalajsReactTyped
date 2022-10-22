package typingsJapgolly.jsYaml

import typingsJapgolly.jsYaml.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsYamlStrings {
  
  @js.native
  sealed trait Quotationmark extends StObject
  inline def Quotationmark: Quotationmark = "\"".asInstanceOf[Quotationmark]
  
  @js.native
  sealed trait close
    extends StObject
       with EventType
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait mapping extends StObject
  inline def mapping: mapping = "mapping".asInstanceOf[mapping]
  
  @js.native
  sealed trait open
    extends StObject
       with EventType
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait scalar extends StObject
  inline def scalar: scalar = "scalar".asInstanceOf[scalar]
  
  @js.native
  sealed trait sequence extends StObject
  inline def sequence: sequence = "sequence".asInstanceOf[sequence]
}
