package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This enum specifies how a resource is bound to an anchor. This can be direct or indirect.
  *
  * Example: Let r:a1:a2 denote a resource r which is bound to anchor a1:a2 which itself is a resource a1 bound to anchor a2. Then r:a1:a2 is bound
  * directly to a1:a2 and indirectly to a2.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait AnchorBindingMode extends StObject
object AnchorBindingMode {
  
  inline def DIRECT: `0` = 0.asInstanceOf[`0`]
  
  inline def INDIRECT: `1` = 1.asInstanceOf[`1`]
}
