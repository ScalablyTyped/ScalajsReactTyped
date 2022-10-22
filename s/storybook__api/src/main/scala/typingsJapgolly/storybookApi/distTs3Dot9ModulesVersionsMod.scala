package typingsJapgolly.storybookApi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookApi.anon.Plain
import typingsJapgolly.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesVersionsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/versions", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def getCurrentVersion(): Version
    
    def getLatestVersion(): Version
    
    def versionUpdateAvailable(): Boolean
  }
  object SubAPI {
    
    inline def apply(
      getCurrentVersion: CallbackTo[Version],
      getLatestVersion: CallbackTo[Version],
      versionUpdateAvailable: CallbackTo[Boolean]
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getCurrentVersion = getCurrentVersion.toJsFn, getLatestVersion = getLatestVersion.toJsFn, versionUpdateAvailable = versionUpdateAvailable.toJsFn)
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setGetCurrentVersion(value: CallbackTo[Version]): Self = StObject.set(x, "getCurrentVersion", value.toJsFn)
      
      inline def setGetLatestVersion(value: CallbackTo[Version]): Self = StObject.set(x, "getLatestVersion", value.toJsFn)
      
      inline def setVersionUpdateAvailable(value: CallbackTo[Boolean]): Self = StObject.set(x, "versionUpdateAvailable", value.toJsFn)
    }
  }
  
  trait SubState extends StObject {
    
    var dismissedVersionNotification: js.UndefOr[String] = js.undefined
    
    var lastVersionCheck: Double
    
    var versions: Versions & UnknownEntries
  }
  object SubState {
    
    inline def apply(lastVersionCheck: Double, versions: Versions & UnknownEntries): SubState = {
      val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setDismissedVersionNotification(value: String): Self = StObject.set(x, "dismissedVersionNotification", value.asInstanceOf[js.Any])
      
      inline def setDismissedVersionNotificationUndefined: Self = StObject.set(x, "dismissedVersionNotification", js.undefined)
      
      inline def setLastVersionCheck(value: Double): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: Versions & UnknownEntries): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  type UnknownEntries = StringDictionary[StringDictionary[Any]]
  
  trait Version
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var info: js.UndefOr[Plain] = js.undefined
    
    var version: String
  }
  object Version {
    
    inline def apply(version: String): Version = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setInfo(value: Plain): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Versions extends StObject {
    
    var current: js.UndefOr[Version] = js.undefined
    
    var latest: js.UndefOr[Version] = js.undefined
    
    var next: js.UndefOr[Version] = js.undefined
  }
  object Versions {
    
    inline def apply(): Versions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Versions]
    }
    
    extension [Self <: Versions](x: Self) {
      
      inline def setCurrent(value: Version): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setLatest(value: Version): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      inline def setNext(value: Version): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
