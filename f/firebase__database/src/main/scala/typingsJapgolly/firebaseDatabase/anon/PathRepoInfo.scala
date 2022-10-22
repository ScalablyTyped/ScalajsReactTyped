package typingsJapgolly.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoInfo extends StObject {
  
  var path: typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path
  
  var repoInfo: typingsJapgolly.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
}
object PathRepoInfo {
  
  inline def apply(
    path: typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path,
    repoInfo: typingsJapgolly.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
  ): PathRepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoInfo]
  }
  
  extension [Self <: PathRepoInfo](x: Self) {
    
    inline def setPath(value: typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepoInfo(value: typingsJapgolly.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
