package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Denotes the access possibilities via {@link XIdlField2} to an interface attribute, enum or compound type (struct/exception). */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait FieldAccessMode extends StObject
object FieldAccessMode {
  
  /**
    * Deprecated. Not used anymore.
    * @deprecated Deprecated
    */
  inline def CONST: `3` = 3.asInstanceOf[`3`]
  
  /** readable only */
  inline def READONLY: `1` = 1.asInstanceOf[`1`]
  
  /** readable and writeable */
  inline def READWRITE: `0` = 0.asInstanceOf[`0`]
  
  /** writeable only */
  inline def WRITEONLY: `2` = 2.asInstanceOf[`2`]
}
