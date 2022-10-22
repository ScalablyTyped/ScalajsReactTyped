package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.mongodbInts.`1`
import typingsJapgolly.mongodb.mongodbInts.`2`
import typingsJapgolly.mongodb.mongodbInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbInts.`1`
  - typingsJapgolly.mongodb.mongodbInts.`2`
  - typingsJapgolly.mongodb.mongodbInts.`3`
*/
trait BatchType extends StObject
/* Inlined std.Readonly<{ readonly INSERT :1,  readonly UPDATE :2,  readonly DELETE :3}> */
object BatchType {
  
  @JSImport("mongodb", "BatchType.DELETE")
  @js.native
  val DELETE: `3` = js.native
  
  @JSImport("mongodb", "BatchType.INSERT")
  @js.native
  val INSERT: `1` = js.native
  
  @JSImport("mongodb", "BatchType.UPDATE")
  @js.native
  val UPDATE: `2` = js.native
}
