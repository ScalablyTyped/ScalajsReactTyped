package typingsJapgolly.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoInfo extends StObject {
  
  var path: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
  
  var repoInfo: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo
}
object RepoInfo {
  
  inline def apply(
    path: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path,
    repoInfo: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo
  ): RepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoInfo]
  }
  
  extension [Self <: RepoInfo](x: Self) {
    
    inline def setPath(value: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepoInfo(value: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
