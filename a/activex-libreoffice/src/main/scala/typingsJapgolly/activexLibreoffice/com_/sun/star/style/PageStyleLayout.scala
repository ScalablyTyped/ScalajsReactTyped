package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the pages for which a page layout is valid. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait PageStyleLayout extends StObject
object PageStyleLayout {
  
  /** The page style is identically used for left and right pages. */
  inline def ALL: `0` = 0.asInstanceOf[`0`]
  
  /**
    * set the horizontal alignment to the left margin from the container object
    *
    * The page style is only used for left pages.
    *
    * adjusted to the left border
    *
    * The text range is left-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  inline def LEFT: `1` = 1.asInstanceOf[`1`]
  
  /** The page style is used unchanged for left pages and mirrored for right pages. */
  inline def MIRRORED: `3` = 3.asInstanceOf[`3`]
  
  /**
    * set the horizontal alignment to the right margin from the container object
    *
    * The page style is only used for right pages.
    *
    * adjusted to the right border
    *
    * The text range is right-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  inline def RIGHT: `2` = 2.asInstanceOf[`2`]
}
