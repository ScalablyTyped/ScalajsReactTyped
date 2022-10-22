package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.Sharded
  - typingsJapgolly.mongodb.mongodbStrings.Unknown
  - typingsJapgolly.mongodb.mongodbStrings.Single
  - typingsJapgolly.mongodb.mongodbStrings.ReplicaSetNoPrimary
  - typingsJapgolly.mongodb.mongodbStrings.ReplicaSetWithPrimary
  - typingsJapgolly.mongodb.mongodbStrings.LoadBalanced
*/
trait TopologyType extends StObject
/* Inlined std.Readonly<{ readonly Single :'Single',  readonly ReplicaSetNoPrimary :'ReplicaSetNoPrimary',  readonly ReplicaSetWithPrimary :'ReplicaSetWithPrimary',  readonly Sharded :'Sharded',  readonly Unknown :'Unknown',  readonly LoadBalanced :'LoadBalanced'}> */
object TopologyType {
  
  @JSImport("mongodb", "TopologyType.LoadBalanced")
  @js.native
  val LoadBalanced: typingsJapgolly.mongodb.mongodbStrings.LoadBalanced = js.native
  
  @JSImport("mongodb", "TopologyType.ReplicaSetNoPrimary")
  @js.native
  val ReplicaSetNoPrimary: typingsJapgolly.mongodb.mongodbStrings.ReplicaSetNoPrimary = js.native
  
  @JSImport("mongodb", "TopologyType.ReplicaSetWithPrimary")
  @js.native
  val ReplicaSetWithPrimary: typingsJapgolly.mongodb.mongodbStrings.ReplicaSetWithPrimary = js.native
  
  @JSImport("mongodb", "TopologyType.Sharded")
  @js.native
  val Sharded: typingsJapgolly.mongodb.mongodbStrings.Sharded = js.native
  
  @JSImport("mongodb", "TopologyType.Single")
  @js.native
  val Single: typingsJapgolly.mongodb.mongodbStrings.Single = js.native
  
  @JSImport("mongodb", "TopologyType.Unknown")
  @js.native
  val Unknown: typingsJapgolly.mongodb.mongodbStrings.Unknown = js.native
}
