package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.chrome.audio.AudioDeviceInfo
import typingsJapgolly.chromeApps.chrome.audio.DeviceIdLists
import typingsJapgolly.chromeApps.chrome.audio.Filter
import typingsJapgolly.chromeApps.chrome.audio.SetDeviceProperties
import typingsJapgolly.chromeApps.chrome.audio.StreamType
import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.app.*
// #region chrome.audio
///////////
// Audio //
///////////
/**
  * @since Chrome 59.
  * @requires Permissions: 'audio'
  * @description
  * The chrome.audio API is provided to allow users to get information
  * about and control the audio devices attached to the system.
  * This API is currently only available in kiosk mode for ChromeOS.
  */
object audio {
  
  @JSGlobal("chrome.audio")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDevices(callback: js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Gets a list of audio devices filtered based on |filter|.
    */
  inline def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the system-wide mute state for the specified stream type.
    * @param streamType Stream type for which mute state should be fetched.
    * @param callback Callback reporting whether mute is set or not for specified stream type.
    */
  inline def getMute(streamType: StreamType, callback: js.Function1[/* value */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMute")(streamType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when audio devices change, either new devices being added,
    * or existing devices being removed.
    * callback `devices` contains a list of all present audio devices after the change.
    */
  @JSGlobal("chrome.audio.onDeviceListChanged")
  @js.native
  val onDeviceListChanged: typingsJapgolly.chromeApps.chrome.events.Event[js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]] = js.native
  
  /** Fired when sound level changes for an active audio device. */
  @JSGlobal("chrome.audio.onLevelChanged")
  @js.native
  val onLevelChanged: typingsJapgolly.chromeApps.chrome.events.Event[js.Function2[/* deviceId */ String, /* level */ integer, Unit]] = js.native
  
  /**
    * Fired when the mute state of the audio input or output changes.
    * Note that mute state is system-wide and the new value applies to
    * every audio device with specified stream type.
    */
  @JSGlobal("chrome.audio.onMuteChanged")
  @js.native
  val onMuteChanged: typingsJapgolly.chromeApps.chrome.events.Event[js.Function2[/* streamType */ js.Array[StreamType], /* isMuted */ Boolean, Unit]] = js.native
  
  /** Sets lists of active input and/or output devices. */
  inline def setDevices(ids: js.Array[DeviceIdLists | String], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDevices")(ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets mute state for a stream type. The mute state will apply to all audio devices with the specified audio stream type.
    * @param streamType Stream type for which mute state should be set.
    * @param isMuted New mute value.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this: function() {...};
    */
  inline def setMute(streamType: StreamType, isMuted: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMute")(streamType.asInstanceOf[js.Any], isMuted.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMute(streamType: StreamType, isMuted: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMute")(streamType.asInstanceOf[js.Any], isMuted.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Sets the properties for the input or output device. */
  inline def setProperties(id: String, properties: SetDeviceProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperties")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
