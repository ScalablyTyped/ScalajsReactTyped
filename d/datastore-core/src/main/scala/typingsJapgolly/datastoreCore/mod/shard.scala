package typingsJapgolly.datastoreCore.mod

import typingsJapgolly.datastoreCore.datastoreCoreStrings.SHARDING
import typingsJapgolly.datastoreCore.datastoreCoreStrings.SlashrepoSlashflatfsSlashshardSlash
import typingsJapgolly.datastoreCore.datastoreCoreStrings._README
import typingsJapgolly.interfaceDatastore.mod.Datastore
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "shard")
@js.native
object shard extends js.Object {
  @js.native
  class NextToLast () extends Shard
  
  @js.native
  class Prefix () extends Shard
  
  @js.native
  class Shard protected () extends js.Object {
    def this(length: Double) = this()
    var _padding: String = js.native
    var name: String = js.native
    var param: Double = js.native
    def fun(str: String): String = js.native
  }
  
  @js.native
  class Suffix () extends Shard
  
  @JSName("PREFIX")
  val PREFIX_ : SlashrepoSlashflatfsSlashshardSlash = js.native
  val README_FN: _README = js.native
  val SHARDING_FN: SHARDING = js.native
  val readme: String = js.native
  def parseShardFun(str: String): Shard = js.native
  def readShardFun(path: String, store: Datastore[Buffer]): js.Promise[Shard] = js.native
}

