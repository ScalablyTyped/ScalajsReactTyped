package typingsJapgolly.firebaseFirestore.distInternalMod

import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`0`
import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`1`
import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration of the different purposes we have for targets. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`0`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`1`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`2`
*/
trait TargetPurpose extends StObject
object TargetPurpose {
  
  /**
    * The query target was used to refill a query after an existence filter mismatch.
    */
  inline def ExistenceFilterMismatch: `1` = 1.asInstanceOf[`1`]
  
  /** The query target was used to resolve a limbo document. */
  inline def LimboResolution: `2` = 2.asInstanceOf[`2`]
  
  /** A regular, normal query target. */
  inline def Listen: `0` = 0.asInstanceOf[`0`]
}
