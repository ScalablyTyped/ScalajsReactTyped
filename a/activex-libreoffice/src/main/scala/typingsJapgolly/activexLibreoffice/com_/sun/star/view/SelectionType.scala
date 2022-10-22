package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a selection type for a view that supports a selection model. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait SelectionType extends StObject
object SelectionType {
  
  /** The selection can contain zero or more objects. */
  inline def MULTI: `2` = 2.asInstanceOf[`2`]
  
  /**
    * No selection is possible.
    *
    * The selection is always empty.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The selection can contain zero or more objects.
    *
    * all selected objects must be part of a continues range
    */
  inline def RANGE: `3` = 3.asInstanceOf[`3`]
  
  /** The selection can only contain one or zero objects. */
  inline def SINGLE: `1` = 1.asInstanceOf[`1`]
}
