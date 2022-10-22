package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ColorMode defines the output style of colors for a graphic. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait ColorMode extends StObject
object ColorMode {
  
  /** the graphic is rendered in grayscale on the output device, */
  inline def GREYS: `1` = 1.asInstanceOf[`1`]
  
  /** the graphic is rendered in black and white only, */
  inline def MONO: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  inline def STANDARD: `0` = 0.asInstanceOf[`0`]
  
  /** the graphic is rendered in a watermark like style, */
  inline def WATERMARK: `3` = 3.asInstanceOf[`3`]
}
