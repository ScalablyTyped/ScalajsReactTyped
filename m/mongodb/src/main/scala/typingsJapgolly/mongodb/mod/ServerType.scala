package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.RSGhost
  - typingsJapgolly.mongodb.mongodbStrings.RSArbiter
  - typingsJapgolly.mongodb.mongodbStrings.Unknown
  - typingsJapgolly.mongodb.mongodbStrings.Standalone
  - typingsJapgolly.mongodb.mongodbStrings.PossiblePrimary
  - typingsJapgolly.mongodb.mongodbStrings.RSSecondary
  - typingsJapgolly.mongodb.mongodbStrings.LoadBalancer
  - typingsJapgolly.mongodb.mongodbStrings.RSPrimary
  - typingsJapgolly.mongodb.mongodbStrings.RSOther
  - typingsJapgolly.mongodb.mongodbStrings.Mongos
*/
trait ServerType extends StObject
/* Inlined std.Readonly<{ readonly Standalone :'Standalone',  readonly Mongos :'Mongos',  readonly PossiblePrimary :'PossiblePrimary',  readonly RSPrimary :'RSPrimary',  readonly RSSecondary :'RSSecondary',  readonly RSArbiter :'RSArbiter',  readonly RSOther :'RSOther',  readonly RSGhost :'RSGhost',  readonly Unknown :'Unknown',  readonly LoadBalancer :'LoadBalancer'}> */
object ServerType {
  
  @JSImport("mongodb", "ServerType.LoadBalancer")
  @js.native
  val LoadBalancer: typingsJapgolly.mongodb.mongodbStrings.LoadBalancer = js.native
  
  @JSImport("mongodb", "ServerType.Mongos")
  @js.native
  val Mongos: typingsJapgolly.mongodb.mongodbStrings.Mongos = js.native
  
  @JSImport("mongodb", "ServerType.PossiblePrimary")
  @js.native
  val PossiblePrimary: typingsJapgolly.mongodb.mongodbStrings.PossiblePrimary = js.native
  
  @JSImport("mongodb", "ServerType.RSArbiter")
  @js.native
  val RSArbiter: typingsJapgolly.mongodb.mongodbStrings.RSArbiter = js.native
  
  @JSImport("mongodb", "ServerType.RSGhost")
  @js.native
  val RSGhost: typingsJapgolly.mongodb.mongodbStrings.RSGhost = js.native
  
  @JSImport("mongodb", "ServerType.RSOther")
  @js.native
  val RSOther: typingsJapgolly.mongodb.mongodbStrings.RSOther = js.native
  
  @JSImport("mongodb", "ServerType.RSPrimary")
  @js.native
  val RSPrimary: typingsJapgolly.mongodb.mongodbStrings.RSPrimary = js.native
  
  @JSImport("mongodb", "ServerType.RSSecondary")
  @js.native
  val RSSecondary: typingsJapgolly.mongodb.mongodbStrings.RSSecondary = js.native
  
  @JSImport("mongodb", "ServerType.Standalone")
  @js.native
  val Standalone: typingsJapgolly.mongodb.mongodbStrings.Standalone = js.native
  
  @JSImport("mongodb", "ServerType.Unknown")
  @js.native
  val Unknown: typingsJapgolly.mongodb.mongodbStrings.Unknown = js.native
}
