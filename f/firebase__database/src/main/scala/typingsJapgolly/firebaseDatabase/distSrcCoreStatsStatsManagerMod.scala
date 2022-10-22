package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
import typingsJapgolly.firebaseDatabase.distSrcCoreStatsStatsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreStatsStatsManagerMod {
  
  @JSImport("@firebase/database/dist/src/core/stats/StatsManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def statsManagerGetCollection(repoInfo: RepoInfo): StatsCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("statsManagerGetCollection")(repoInfo.asInstanceOf[js.Any]).asInstanceOf[StatsCollection]
  
  inline def statsManagerGetOrCreateReporter[T](repoInfo: RepoInfo, creatorFunction: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("statsManagerGetOrCreateReporter")(repoInfo.asInstanceOf[js.Any], creatorFunction.asInstanceOf[js.Any])).asInstanceOf[T]
}
