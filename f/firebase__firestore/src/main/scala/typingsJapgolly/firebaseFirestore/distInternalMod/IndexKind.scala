package typingsJapgolly.firebaseFirestore.distInternalMod

import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`0`
import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`1`
import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type of the index, e.g. for which type of query it can be used. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`0`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`1`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`2`
*/
trait IndexKind extends StObject
object IndexKind {
  
  /**
    * Ordered index. Can be used for <, <=, ==, >=, >, !=, IN and NOT IN queries.
    */
  inline def ASCENDING: `0` = 0.asInstanceOf[`0`]
  
  /** Contains index. Can be used for ArrayContains and ArrayContainsAny. */
  inline def CONTAINS: `2` = 2.asInstanceOf[`2`]
  
  /**
    * Ordered index. Can be used for <, <=, ==, >=, >, !=, IN and NOT IN queries.
    */
  inline def DESCENDING: `1` = 1.asInstanceOf[`1`]
}
