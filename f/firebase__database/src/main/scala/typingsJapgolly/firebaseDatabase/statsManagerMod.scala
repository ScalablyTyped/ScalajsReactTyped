package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.repoInfoMod.RepoInfo
import typingsJapgolly.firebaseDatabase.statsCollectionMod.StatsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/stats/StatsManager", JSImport.Namespace)
@js.native
object statsManagerMod extends js.Object {
  @js.native
  class StatsManager () extends js.Object
  
  /* static members */
  @js.native
  object StatsManager extends js.Object {
    var collections_ : js.Any = js.native
    var reporters_ : js.Any = js.native
    def getCollection(repoInfo: RepoInfo): StatsCollection = js.native
    def getOrCreateReporter[T](repoInfo: RepoInfo, creatorFunction: js.Function0[T]): T = js.native
  }
  
}

