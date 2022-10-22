package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`lock-screen`
import typingsJapgolly.electron.electronStrings.`on-ac`
import typingsJapgolly.electron.electronStrings.`on-battery`
import typingsJapgolly.electron.electronStrings.`unlock-screen`
import typingsJapgolly.electron.electronStrings.`user-did-become-active`
import typingsJapgolly.electron.electronStrings.`user-did-resign-active`
import typingsJapgolly.electron.electronStrings.active
import typingsJapgolly.electron.electronStrings.idle
import typingsJapgolly.electron.electronStrings.locked
import typingsJapgolly.electron.electronStrings.resume
import typingsJapgolly.electron.electronStrings.shutdown
import typingsJapgolly.electron.electronStrings.suspend
import typingsJapgolly.electron.electronStrings.unknown_
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerMonitor
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  def addListener_lockscreen(event: `lock-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_onac(event: `on-ac`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_onbattery(event: `on-battery`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: resume, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_shutdown(event: shutdown, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_suspend(event: suspend, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_unlockscreen(event: `unlock-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_userdidbecomeactive(event: `user-did-become-active`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_userdidresignactive(event: `user-did-resign-active`, listener: js.Function): this.type = js.native
  
  /**
    * The system's current state. Can be `active`, `idle`, `locked` or `unknown`.
    *
    * Calculate the system idle state. `idleThreshold` is the amount of time (in
    * seconds) before considered idle.  `locked` is available on supported systems
    * only.
    */
  def getSystemIdleState(idleThreshold: Double): active | idle | locked | unknown_ = js.native
  
  /**
    * Idle time in seconds
    *
    * Calculate system idle time in seconds.
    */
  def getSystemIdleTime(): Double = js.native
  
  /**
    * Whether the system is on battery power.
    *
    * To monitor for changes in this property, use the `on-battery` and `on-ac`
    * events.
    */
  def isOnBatteryPower(): Boolean = js.native
  
  /**
    * A `boolean` property. True if the system is on battery power.
    *
    * See `powerMonitor.isOnBatteryPower()`.
    */
  var onBatteryPower: Boolean = js.native
  
  // Docs: https://electronjs.org/docs/api/power-monitor
  /**
    * Emitted when the system is about to lock the screen.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_lockscreen(event: `lock-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the system changes to AC power.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_onac(event: `on-ac`, listener: js.Function): this.type = js.native
  /**
    * Emitted when system changes to battery power.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_onbattery(event: `on-battery`, listener: js.Function): this.type = js.native
  /**
    * Emitted when system is resuming.
    */
  @JSName("on")
  def on_resume(event: resume, listener: js.Function): this.type = js.native
  /**
    * Emitted when the system is about to reboot or shut down. If the event handler
    * invokes `e.preventDefault()`, Electron will attempt to delay system shutdown in
    * order for the app to exit cleanly. If `e.preventDefault()` is called, the app
    * should exit as soon as possible by calling something like `app.quit()`.
    *
    * @platform linux,darwin
    */
  @JSName("on")
  def on_shutdown(event: shutdown, listener: js.Function): this.type = js.native
  /**
    * Emitted when the system is suspending.
    */
  @JSName("on")
  def on_suspend(event: suspend, listener: js.Function): this.type = js.native
  /**
    * Emitted as soon as the systems screen is unlocked.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_unlockscreen(event: `unlock-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a login session is activated. See documentation for more
    * information.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_userdidbecomeactive(event: `user-did-become-active`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a login session is deactivated. See documentation for more
    * information.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_userdidresignactive(event: `user-did-resign-active`, listener: js.Function): this.type = js.native
  
  @JSName("once")
  def once_lockscreen(event: `lock-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_onac(event: `on-ac`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_onbattery(event: `on-battery`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_shutdown(event: shutdown, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_suspend(event: suspend, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_unlockscreen(event: `unlock-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_userdidbecomeactive(event: `user-did-become-active`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_userdidresignactive(event: `user-did-resign-active`, listener: js.Function): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_lockscreen(event: `lock-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_onac(event: `on-ac`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_onbattery(event: `on-battery`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: resume, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_shutdown(event: shutdown, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_suspend(event: suspend, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_unlockscreen(event: `unlock-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_userdidbecomeactive(event: `user-did-become-active`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_userdidresignactive(event: `user-did-resign-active`, listener: js.Function): this.type = js.native
}
