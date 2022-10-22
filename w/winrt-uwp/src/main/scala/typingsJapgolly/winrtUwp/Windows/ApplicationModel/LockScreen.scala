package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.alarmiconchanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.badgeschanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.detailtextchanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.lockscreenimagechanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.unlocking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** You can create an app that acts as the lock screen, allowing greater user personalization. You can develop novel unlock gestures and animations, and also display custom information or appearances for people. */
object LockScreen {
  
  /** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
  @js.native
  trait LockApplicationHost extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
    
    /** Indicates the device is unlocking. */
    def onunlocking(ev: LockScreenUnlockingEventArgs & WinRTEvent[LockApplicationHost]): Unit = js.native
    /** Indicates the device is unlocking. */
    @JSName("onunlocking")
    var onunlocking_Original: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
    
    /** Requests that the device unlocks. */
    def requestUnlock(): Unit = js.native
  }
  
  /** Represents a lock screen badge for an app. */
  trait LockScreenBadge extends StObject {
    
    /** Gets the name. */
    var automationName: String
    
    /** Gets the glyph to display. */
    var glyph: IRandomAccessStream
    
    /** Launches the app corresponding to the badge. */
    def launchApp(): Unit
    
    /** Gets the logo to display with the badge. */
    var logo: IRandomAccessStream
    
    /** Gets the number to display with the badge. */
    var number: Double
  }
  object LockScreenBadge {
    
    inline def apply(
      automationName: String,
      glyph: IRandomAccessStream,
      launchApp: Callback,
      logo: IRandomAccessStream,
      number: Double
    ): LockScreenBadge = {
      val __obj = js.Dynamic.literal(automationName = automationName.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], launchApp = launchApp.toJsFn, logo = logo.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[LockScreenBadge]
    }
    
    extension [Self <: LockScreenBadge](x: Self) {
      
      inline def setAutomationName(value: String): Self = StObject.set(x, "automationName", value.asInstanceOf[js.Any])
      
      inline def setGlyph(value: IRandomAccessStream): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setLaunchApp(value: Callback): Self = StObject.set(x, "launchApp", value.toJsFn)
      
      inline def setLogo(value: IRandomAccessStream): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @js.native
  trait LockScreenInfo extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    
    /** Gets the alarm icon to display. */
    var alarmIcon: IRandomAccessStream = js.native
    
    /** Gets the badges to display. */
    var badges: IVectorView[LockScreenBadge] = js.native
    
    /** Gets the detail text to display. */
    var detailText: IVectorView[String] = js.native
    
    /** Gets the image to display on the lock screen. */
    var lockScreenImage: IRandomAccessStream = js.native
    
    /** Indicates the alarm icon has changed. */
    def onalarmiconchanged(ev: Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the alarm icon has changed. */
    @JSName("onalarmiconchanged")
    var onalarmiconchanged_Original: TypedEventHandler[LockScreenInfo, Any] = js.native
    
    /** Indicates the badges have changed. */
    def onbadgeschanged(ev: Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the badges have changed. */
    @JSName("onbadgeschanged")
    var onbadgeschanged_Original: TypedEventHandler[LockScreenInfo, Any] = js.native
    
    /** Indicates the detail text has changed. */
    def ondetailtextchanged(ev: Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the detail text has changed. */
    @JSName("ondetailtextchanged")
    var ondetailtextchanged_Original: TypedEventHandler[LockScreenInfo, Any] = js.native
    
    /** Indicates the lock screen image has changed. */
    def onlockscreenimagechanged(ev: Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the lock screen image has changed. */
    @JSName("onlockscreenimagechanged")
    var onlockscreenimagechanged_Original: TypedEventHandler[LockScreenInfo, Any] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, Any]): Unit = js.native
  }
  
  /** Represents an unlock deferral. */
  trait LockScreenUnlockingDeferral extends StObject {
    
    /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    def complete(): Unit
  }
  object LockScreenUnlockingDeferral {
    
    inline def apply(complete: Callback): LockScreenUnlockingDeferral = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn)
      __obj.asInstanceOf[LockScreenUnlockingDeferral]
    }
    
    extension [Self <: LockScreenUnlockingDeferral](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    }
  }
  
  /** Represents the lock screen unlocking events. */
  trait LockScreenUnlockingEventArgs extends StObject {
    
    /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    var deadline: js.Date
    
    /**
      * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
      * @return An unlock deferral.
      */
    def getDeferral(): LockScreenUnlockingDeferral
  }
  object LockScreenUnlockingEventArgs {
    
    inline def apply(deadline: js.Date, getDeferral: CallbackTo[LockScreenUnlockingDeferral]): LockScreenUnlockingEventArgs = {
      val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
      __obj.asInstanceOf[LockScreenUnlockingEventArgs]
    }
    
    extension [Self <: LockScreenUnlockingEventArgs](x: Self) {
      
      inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setGetDeferral(value: CallbackTo[LockScreenUnlockingDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    }
  }
}
