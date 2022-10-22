package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines whether the 3D objects are to be drawn in perspective or parallel projection. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait ProjectionMode extends StObject
object ProjectionMode {
  
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  inline def PARALLEL: `0` = 0.asInstanceOf[`0`]
  
  /** the 3D objects are drawn in the perspective projection. */
  inline def PERSPECTIVE: `1` = 1.asInstanceOf[`1`]
}
