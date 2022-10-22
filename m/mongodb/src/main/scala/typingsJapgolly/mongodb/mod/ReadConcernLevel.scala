package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.available
  - typingsJapgolly.mongodb.mongodbStrings.local
  - typingsJapgolly.mongodb.mongodbStrings.snapshot
  - typingsJapgolly.mongodb.mongodbStrings.linearizable
  - typingsJapgolly.mongodb.mongodbStrings.majority
*/
trait ReadConcernLevel
  extends StObject
     with ReadConcernLike
/* Inlined std.Readonly<{ readonly local :'local',  readonly majority :'majority',  readonly linearizable :'linearizable',  readonly available :'available',  readonly snapshot :'snapshot'}> */
object ReadConcernLevel {
  
  @JSImport("mongodb", "ReadConcernLevel.available")
  @js.native
  val available: typingsJapgolly.mongodb.mongodbStrings.available = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.linearizable")
  @js.native
  val linearizable: typingsJapgolly.mongodb.mongodbStrings.linearizable = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.local")
  @js.native
  val local: typingsJapgolly.mongodb.mongodbStrings.local = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.majority")
  @js.native
  val majority: typingsJapgolly.mongodb.mongodbStrings.majority = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.snapshot")
  @js.native
  val snapshot: typingsJapgolly.mongodb.mongodbStrings.snapshot = js.native
}
