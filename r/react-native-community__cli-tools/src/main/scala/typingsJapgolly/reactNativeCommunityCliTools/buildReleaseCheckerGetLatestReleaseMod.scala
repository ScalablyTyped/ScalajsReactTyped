package typingsJapgolly.reactNativeCommunityCliTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReleaseCheckerGetLatestReleaseMod {
  
  @JSImport("@react-native-community/cli-tools/build/releaseChecker/getLatestRelease", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String, currentVersion: String): js.Promise[Release | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], currentVersion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Release | Unit]]
  
  trait Release extends StObject {
    
    var changelogUrl: String
    
    var diffUrl: String
    
    var version: String
  }
  object Release {
    
    inline def apply(changelogUrl: String, diffUrl: String, version: String): Release = {
      val __obj = js.Dynamic.literal(changelogUrl = changelogUrl.asInstanceOf[js.Any], diffUrl = diffUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Release]
    }
    
    extension [Self <: Release](x: Self) {
      
      inline def setChangelogUrl(value: String): Self = StObject.set(x, "changelogUrl", value.asInstanceOf[js.Any])
      
      inline def setDiffUrl(value: String): Self = StObject.set(x, "diffUrl", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
