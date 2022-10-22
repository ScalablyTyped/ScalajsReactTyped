package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesSettingsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/settings", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait Settings extends StObject {
    
    var lastTrackedStoryId: String
  }
  object Settings {
    
    inline def apply(lastTrackedStoryId: String): Settings = {
      val __obj = js.Dynamic.literal(lastTrackedStoryId = lastTrackedStoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setLastTrackedStoryId(value: String): Self = StObject.set(x, "lastTrackedStoryId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubAPI extends StObject {
    
    def changeSettingsTab(tab: String): Unit
    
    def closeSettings(): Unit
    
    def isSettingsScreenActive(): Boolean
    
    def navigateToSettingsPage(path: String): js.Promise[Unit]
  }
  object SubAPI {
    
    inline def apply(
      changeSettingsTab: String => Callback,
      closeSettings: Callback,
      isSettingsScreenActive: CallbackTo[Boolean],
      navigateToSettingsPage: String => js.Promise[Unit]
    ): SubAPI = {
      val __obj = js.Dynamic.literal(changeSettingsTab = js.Any.fromFunction1((t0: String) => changeSettingsTab(t0).runNow()), closeSettings = closeSettings.toJsFn, isSettingsScreenActive = isSettingsScreenActive.toJsFn, navigateToSettingsPage = js.Any.fromFunction1(navigateToSettingsPage))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setChangeSettingsTab(value: String => Callback): Self = StObject.set(x, "changeSettingsTab", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCloseSettings(value: Callback): Self = StObject.set(x, "closeSettings", value.toJsFn)
      
      inline def setIsSettingsScreenActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSettingsScreenActive", value.toJsFn)
      
      inline def setNavigateToSettingsPage(value: String => js.Promise[Unit]): Self = StObject.set(x, "navigateToSettingsPage", js.Any.fromFunction1(value))
    }
  }
  
  trait SubState extends StObject {
    
    var settings: Settings
  }
  object SubState {
    
    inline def apply(settings: Settings): SubState = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
}
