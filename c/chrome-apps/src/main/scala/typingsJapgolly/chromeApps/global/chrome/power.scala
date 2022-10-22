package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.anon.DISPLAY
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.SYSTEM
import typingsJapgolly.chromeApps.chromeAppsStrings.display_
import typingsJapgolly.chromeApps.chromeAppsStrings.system_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.power
///////////
// Power //
///////////
/**
  * Use the chrome.power API to override the system's power management features.
  * @requires Permissions: 'power'
  * @since Chrome 27.
  */
object power {
  
  @JSGlobal("chrome.power")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  object Level {
    
    @JSGlobal("chrome.power.Level")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.power.Level.DISPLAY")
    @js.native
    def DISPLAY: display_ = js.native
    inline def DISPLAY_=(x: display_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.power.Level.SYSTEM")
    @js.native
    def SYSTEM: system_ = js.native
    inline def SYSTEM_=(x: system_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(x.asInstanceOf[js.Any])
  }
  
  /** Releases a request previously made via requestKeepAwake(). */
  inline def releaseKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseKeepAwake")().asInstanceOf[Unit]
  
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  inline def requestKeepAwake(
    level: ToStringLiteral[
      DISPLAY, 
      /* keyof chrome-apps.anon.DISPLAY */ SYSTEM | typingsJapgolly.chromeApps.chromeAppsStrings.DISPLAY, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SYSTEM :'system',   DISPLAY :'display'} extends keyof {  SYSTEM :'system',   DISPLAY :'display'} ? std.Exclude<keyof {  SYSTEM :'system',   DISPLAY :'display'}, 'system' | 'display'> : never */ js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestKeepAwake")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
