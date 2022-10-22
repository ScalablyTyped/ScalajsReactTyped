package typingsJapgolly.winrtUwp.global.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus
import typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace lets an app to cast or send particular media content to a second device and is meant to be device-protocol agnostic. Today, the APIs work with Miracast, DLNA, and Bluetooth, and support images, audio, and video from HTML Tags, ImageElement and MediaElement. */
object Casting {
  
  /** Represents the actual connection with a casting device. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Casting.CastingConnection")
  @js.native
  open class CastingConnection ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnection
  
  /** Represents arguments for the ErrorOccurred event from the CastingConnection */
  /* note: abstract class */ @JSGlobal("Windows.Media.Casting.CastingConnectionErrorOccurredEventArgs")
  @js.native
  open class CastingConnectionErrorOccurredEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorOccurredEventArgs {
    
    /** Gets the particular error that triggered the casting error event, ErrorOccurred . */
    /* CompleteClass */
    var errorStatus: CastingConnectionErrorStatus = js.native
    
    /** Gets human-readable message to accompany the error status code, ErrorStatus . */
    /* CompleteClass */
    var message: String = js.native
  }
  
  /** Indicates the error status when starting or ending a casting connection. */
  @JSGlobal("Windows.Media.Casting.CastingConnectionErrorStatus")
  @js.native
  object CastingConnectionErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus & Double
      ] = js.native
    
    /* 1 */ val deviceDidNotRespond: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.deviceDidNotRespond & Double = js.native
    
    /* 2 */ val deviceError: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.deviceError & Double = js.native
    
    /* 3 */ val deviceLocked: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.deviceLocked & Double = js.native
    
    /* 5 */ val invalidCastingSource: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.invalidCastingSource & Double = js.native
    
    /* 4 */ val protectedPlaybackFailed: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.protectedPlaybackFailed & Double = js.native
    
    /* 0 */ val succeeded: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.succeeded & Double = js.native
    
    /* 6 */ val unknown: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.unknown & Double = js.native
  }
  
  /** Indicates the current state of a casting connection. Rendering is used when actively playing content. */
  @JSGlobal("Windows.Media.Casting.CastingConnectionState")
  @js.native
  object CastingConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionState & Double] = js.native
    
    /* 1 */ val connected: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionState.connected & Double = js.native
    
    /* 4 */ val connecting: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionState.connecting & Double = js.native
    
    /* 0 */ val disconnected: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionState.disconnected & Double = js.native
    
    /* 3 */ val disconnecting: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionState.disconnecting & Double = js.native
    
    /* 2 */ val rendering: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnectionState.rendering & Double = js.native
  }
  
  /** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Casting.CastingDevice")
  @js.native
  open class CastingDevice ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDevice {
    
    /**
      * Creates a new CastingConnection object. This method does not establish a connection to the casting device.
      * @return The object that represents the casting connection.
      */
    /* CompleteClass */
    override def createCastingConnection(): typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingConnection = js.native
    
    /** A human-readable name for the device, retrieved from the device itself. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /**
      * Gets the media types supported by the device. containing
      * @return The media types, CastingPlaybackTypes , supported by the device.
      */
    /* CompleteClass */
    override def getSupportedCastingPlaybackTypesAsync(): IPromiseWithIAsyncOperation[CastingPlaybackTypes] = js.native
    
    /** An icon representing the device. */
    /* CompleteClass */
    var icon: IRandomAccessStreamWithContentType = js.native
    
    /** The device ID. This is the same ID used with Windows.Devices.Enumeration APIs. */
    /* CompleteClass */
    var id: String = js.native
  }
  object CastingDevice {
    
    @JSGlobal("Windows.Media.Casting.CastingDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates whether the given device (a DeviceInformation object) supports casting.
      * @param device The device you want to know about.
      * @return True if the device supports casting; false otherwise.
      */
    /* static member */
    inline def deviceInfoSupportsCastingAsync(device: DeviceInformation): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deviceInfoSupportsCastingAsync")(device.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    
    /**
      * Gets a CastingDevice object for a given a device ID (acquired from a query using the Windows.Devices.Enumeration APIs).
      * @param value The device ID.
      * @return The object representing the casting device.
      */
    /* static member */
    inline def fromIdAsync(value: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(value.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDevice]]
    
    /**
      * Gets an AQS filter string to be used with the Windows.Devices.Enumeration APIs for a given CastingPlaybackTypes .
      * @param type The casting playback type.
      * @return The AQS filter string.
      */
    /* static member */
    inline def getDeviceSelector(`type`: CastingPlaybackTypes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets an AQS filter string to be used with the Windows.Devices.Enumeration APIs for a given CastingSource .
      * @param castingSource The casting source.
      * @return The AQS filter string.
      */
    /* static member */
    inline def getDeviceSelectorFromCastingSourceAsync(castingSource: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingSource): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromCastingSourceAsync")(castingSource.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  }
  
  /** Represents a device picker that contains a list of casting devices for the user to choose from. */
  @JSGlobal("Windows.Media.Casting.CastingDevicePicker")
  @js.native
  /** Creates a CastingDevicePicker object. */
  open class CastingDevicePicker ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDevicePicker
  
  /** Represents the filter used to determine which devices to show in a casting device picker UI. The filter parameters are OR-ed together to build the resulting filter. In other words, if SupportsAudio and SupportsVideo are both true, the picker will display Audio-only devices, video-only devices, and audio/video devices. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Casting.CastingDevicePickerFilter")
  @js.native
  open class CastingDevicePickerFilter ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDevicePickerFilter {
    
    /** Gets the casting sources supported. */
    /* CompleteClass */
    var supportedCastingSources: IVector[typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingSource] = js.native
    
    /** Gets and sets whether the devices in the device picker should support audio playback. */
    /* CompleteClass */
    var supportsAudio: Boolean = js.native
    
    /** Gets and sets whether the devices in the device picker should support rending still images. */
    /* CompleteClass */
    var supportsPictures: Boolean = js.native
    
    /** Gets and sets whether the devices in the device picker should support video playback. */
    /* CompleteClass */
    var supportsVideo: Boolean = js.native
  }
  
  /** Represents the event arguments for the CastingDeviceSelected event on the CastingDevicePicker object. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Casting.CastingDeviceSelectedEventArgs")
  @js.native
  open class CastingDeviceSelectedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDeviceSelectedEventArgs {
    
    /** Represents the CastingDevice that has been selected by the user in a casting device picker. */
    /* CompleteClass */
    var selectedCastingDevice: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingDevice = js.native
  }
  
  /** Indicates the capabilities of a particular casting device. */
  @JSGlobal("Windows.Media.Casting.CastingPlaybackTypes")
  @js.native
  object CastingPlaybackTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes & Double] = js.native
    
    /* 1 */ val audio: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.audio & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.none & Double = js.native
    
    /* 3 */ val picture: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.picture & Double = js.native
    
    /* 2 */ val video: typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.video & Double = js.native
  }
  
  /** Represents the media content that can be sent to another device. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Casting.CastingSource")
  @js.native
  open class CastingSource ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Casting.CastingSource {
    
    /** Gets or sets an alternative URI for the content for use with DLNA ByRef. */
    /* CompleteClass */
    var preferredSourceUri: Uri = js.native
  }
}
