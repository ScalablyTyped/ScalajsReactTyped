package typingsJapgolly.activexWia.WIA

import typingsJapgolly.activexWia.activexWiaInts.`0`
import typingsJapgolly.activexWia.activexWiaInts.`1`
import typingsJapgolly.activexWia.activexWiaInts.`2`
import typingsJapgolly.activexWia.activexWiaInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WiaImageIntent enumeration helps specify what type of data the image is intended to represent. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWia.activexWiaInts.`1`
  - typingsJapgolly.activexWia.activexWiaInts.`2`
  - typingsJapgolly.activexWia.activexWiaInts.`4`
  - typingsJapgolly.activexWia.activexWiaInts.`0`
*/
trait WiaImageIntent extends StObject
object WiaImageIntent {
  
  inline def ColorIntent: `1` = 1.asInstanceOf[`1`]
  
  inline def GrayscaleIntent: `2` = 2.asInstanceOf[`2`]
  
  inline def TextIntent: `4` = 4.asInstanceOf[`4`]
  
  inline def UnspecifiedIntent: `0` = 0.asInstanceOf[`0`]
}
