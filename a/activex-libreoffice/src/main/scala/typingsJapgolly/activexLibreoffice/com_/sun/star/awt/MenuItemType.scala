package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the type of a menu item, as returned by {@link com.sun.star.awt.XMenu.getItemType()} . */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait MenuItemType extends StObject
object MenuItemType {
  
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  inline def DONTKNOW: `0` = 0.asInstanceOf[`0`]
  
  /** specifies that the menu item has an image. */
  inline def IMAGE: `2` = 2.asInstanceOf[`2`]
  
  /** specifies that the menu item is a separator. */
  inline def SEPARATOR: `4` = 4.asInstanceOf[`4`]
  
  /** specifies that the menu item has a text. */
  inline def STRING: `1` = 1.asInstanceOf[`1`]
  
  /** specifies that the menu item has a text **and** an image. */
  inline def STRINGIMAGE: `3` = 3.asInstanceOf[`3`]
}
