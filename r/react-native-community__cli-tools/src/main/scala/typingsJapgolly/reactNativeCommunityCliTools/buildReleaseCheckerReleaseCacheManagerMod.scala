package typingsJapgolly.reactNativeCommunityCliTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReleaseCheckerReleaseCacheManagerMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-tools/build/releaseChecker/releaseCacheManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-tools/build/releaseChecker/releaseCacheManager", "default.get")
    @js.native
    def get: js.Function2[/* name */ String, /* key */ ReleaseCacheKey, js.UndefOr[String]] = js.native
    inline def get(name: String, key: ReleaseCacheKey): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def get_=(x: js.Function2[/* name */ String, /* key */ ReleaseCacheKey, js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-tools/build/releaseChecker/releaseCacheManager", "default.set")
    @js.native
    def set: js.Function3[/* name */ String, /* key */ ReleaseCacheKey, /* value */ String, Unit] = js.native
    inline def set(name: String, key: ReleaseCacheKey, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set_=(x: js.Function3[/* name */ String, /* key */ ReleaseCacheKey, /* value */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.eTag
    - typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.lastChecked
    - typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.latestVersion
  */
  trait ReleaseCacheKey extends StObject
  object ReleaseCacheKey {
    
    inline def eTag: typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.eTag = "eTag".asInstanceOf[typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.eTag]
    
    inline def lastChecked: typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.lastChecked = "lastChecked".asInstanceOf[typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.lastChecked]
    
    inline def latestVersion: typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.latestVersion = "latestVersion".asInstanceOf[typingsJapgolly.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.latestVersion]
  }
}
