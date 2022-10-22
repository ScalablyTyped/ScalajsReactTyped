package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the states of a property value in the process of obtaining the value (asynchronously).
  * @see PropertyValueInfo
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait PropertyValueState extends StObject
object PropertyValueState {
  
  /** The given property name/handle is invalid. */
  inline def INVALID_NAME: `2` = 2.asInstanceOf[`2`]
  
  /** The given property type is invalid. */
  inline def INVALID_TYPE: `3` = 3.asInstanceOf[`3`]
  
  /** The value was obtained. <p>The value is stored in PropertyValueInfo::Value. */
  inline def PROCESSED: `1` = 1.asInstanceOf[`1`]
  
  /** The property value was not obtained yet. */
  inline def UNPROCESSED: `0` = 0.asInstanceOf[`0`]
}
