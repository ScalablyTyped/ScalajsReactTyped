package typingsJapgolly.winrtUwp.global.Windows

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.System.User
import typingsJapgolly.winrtUwp.winrtUwpStrings.gamepadadded
import typingsJapgolly.winrtUwp.winrtUwpStrings.gamepadremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gaming {
  
  /** Provides access to game controller input. */
  object Input {
    
    /** Represents a game controller. */
    /* note: abstract class */ @JSGlobal("Windows.Gaming.Input.Gamepad")
    @js.native
    open class Gamepad ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.Gaming.Input.Gamepad
    object Gamepad {
      
      @JSGlobal("Windows.Gaming.Input.Gamepad")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def addEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def addEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /** The list of all connected gamepads. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.gamepads")
      @js.native
      def gamepads: IVectorView[typingsJapgolly.winrtUwp.Windows.Gaming.Input.Gamepad] = js.native
      inline def gamepads_=(x: IVectorView[typingsJapgolly.winrtUwp.Windows.Gaming.Input.Gamepad]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(x.asInstanceOf[js.Any])
      
      /** Signals when a new gamepad is connected. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.ongamepadadded")
      @js.native
      def ongamepadadded: EventHandler[Any] = js.native
      inline def ongamepadadded_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongamepadadded")(x.asInstanceOf[js.Any])
      
      /** Signals when a gamepad is disconnected. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.ongamepadremoved")
      @js.native
      def ongamepadremoved: EventHandler[Any] = js.native
      inline def ongamepadremoved_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongamepadremoved")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def removeEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def removeEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /** Specifies the button type. */
    @JSGlobal("Windows.Gaming.Input.GamepadButtons")
    @js.native
    object GamepadButtons extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons & Double] = js.native
      
      /* 3 */ val a: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.a & Double = js.native
      
      /* 4 */ val b: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.b & Double = js.native
      
      /* 8 */ val dpadDown: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadDown & Double = js.native
      
      /* 9 */ val dpadLeft: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadLeft & Double = js.native
      
      /* 10 */ val dpadRight: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadRight & Double = js.native
      
      /* 7 */ val dpadUp: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadUp & Double = js.native
      
      /* 11 */ val leftShoulder: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftShoulder & Double = js.native
      
      /* 13 */ val leftThumbstick: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftThumbstick & Double = js.native
      
      /* 1 */ val menu: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.menu & Double = js.native
      
      /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.none & Double = js.native
      
      /* 12 */ val rightShoulder: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightShoulder & Double = js.native
      
      /* 14 */ val rightThumbstick: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightThumbstick & Double = js.native
      
      /* 2 */ val view: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.view & Double = js.native
      
      /* 5 */ val x: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.x & Double = js.native
      
      /* 6 */ val y: typingsJapgolly.winrtUwp.Windows.Gaming.Input.GamepadButtons.y & Double = js.native
    }
    
    /** Contains information about an audio headset attached to a gamepad. */
    /* note: abstract class */ @JSGlobal("Windows.Gaming.Input.Headset")
    @js.native
    open class Headset ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.Gaming.Input.Headset {
      
      /** The XAudio endpoint ID for the headset's audio capture device. */
      /* CompleteClass */
      var captureDeviceId: String = js.native
      
      /** The XAudio enpoint ID for the headset's audio render device. */
      /* CompleteClass */
      var renderDeviceId: String = js.native
    }
  }
  
  object Preview {
    
    object GamesEnumeration {
      
      /* note: abstract class */ @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList")
      @js.native
      open class GameList ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameList
      object GameList {
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.addEventListener")
        @js.native
        def addEventListener: Any = js.native
        inline def addEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.findAllAsync")
        @js.native
        def findAllAsync: Any = js.native
        inline def findAllAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllAsync")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameadded")
        @js.native
        def ongameadded: Any = js.native
        inline def ongameadded_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameadded")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameremoved")
        @js.native
        def ongameremoved: Any = js.native
        inline def ongameremoved_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameremoved")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameupdated")
        @js.native
        def ongameupdated: Any = js.native
        inline def ongameupdated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameupdated")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.removeEventListener")
        @js.native
        def removeEventListener: Any = js.native
        inline def removeEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      }
      
      object GameListCategory {
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.candidate")
        @js.native
        def candidate: Any = js.native
        inline def candidate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("candidate")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.confirmedBySystem")
        @js.native
        def confirmedBySystem: Any = js.native
        inline def confirmedBySystem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirmedBySystem")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.confirmedByUser")
        @js.native
        def confirmedByUser: Any = js.native
        inline def confirmedByUser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirmedByUser")(x.asInstanceOf[js.Any])
      }
      
      /* note: abstract class */ @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListEntry")
      @js.native
      open class GameListEntry ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameListEntry {
        
        /* CompleteClass */
        var category: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var displayInfo: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var launchAsync: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var properties: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var setCategoryAsync: Any = js.native
      }
    }
  }
  
  object UI {
    
    /* note: abstract class */ @JSGlobal("Windows.Gaming.UI.GameBar")
    @js.native
    open class GameBar ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.Gaming.UI.GameBar
    object GameBar {
      
      @JSGlobal("Windows.Gaming.UI.GameBar")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.addEventListener")
      @js.native
      def addEventListener: Any = js.native
      inline def addEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.isInputRedirected")
      @js.native
      def isInputRedirected: Any = js.native
      inline def isInputRedirected_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInputRedirected")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.onisinputredirectedchanged")
      @js.native
      def onisinputredirectedchanged: Any = js.native
      inline def onisinputredirectedchanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onisinputredirectedchanged")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.onvisibilitychanged")
      @js.native
      def onvisibilitychanged: Any = js.native
      inline def onvisibilitychanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onvisibilitychanged")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.removeEventListener")
      @js.native
      def removeEventListener: Any = js.native
      inline def removeEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.visible")
      @js.native
      def visible: Any = js.native
      inline def visible_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  object XboxLive {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    object Storage {
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult")
      @js.native
      open class GameSaveBlobGetResult ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: IMapView[String, IBuffer] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo")
      @js.native
      open class GameSaveBlobInfo ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var name: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var size: Double = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult")
      @js.native
      open class GameSaveBlobInfoGetResult ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: IVectorView[typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery")
      @js.native
      open class GameSaveBlobInfoQuery ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainer")
      @js.native
      open class GameSaveContainer ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainer {
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobNamePrefix This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def createBlobInfoQuery(blobNamePrefix: String): typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def getAsync(blobsToRead: IIterable[String]): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult] = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var name: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var provider: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def readAsync(blobsToRead: IMapView[String, IBuffer]): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def submitPropertySetUpdatesAsync(blobsToWrite: IPropertySet, blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def submitUpdatesAsync(blobsToWrite: IMapView[String, IBuffer], blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo")
      @js.native
      open class GameSaveContainerInfo ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var displayName: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var lastModifiedTime: js.Date = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var name: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var needsSync: Boolean = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var totalSize: Double = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult")
      @js.native
      open class GameSaveContainerInfoGetResult ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: IVectorView[typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery")
      @js.native
      open class GameSaveContainerInfoQuery ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus")
      @js.native
      object GameSaveErrorStatus extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus & Double
              ] = js.native
        
        /* 1 */ val abort: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.abort & Double = js.native
        
        /* 9 */ val blobNotFound: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.blobNotFound & Double = js.native
        
        /* 11 */ val containerNotInSync: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerNotInSync & Double = js.native
        
        /* 12 */ val containerSyncFailed: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerSyncFailed & Double = js.native
        
        /* 2 */ val invalidContainerName: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.invalidContainerName & Double = js.native
        
        /* 3 */ val noAccess: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noAccess & Double = js.native
        
        /* 10 */ val noXboxLiveInfo: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noXboxLiveInfo & Double = js.native
        
        /* 14 */ val objectExpired: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.objectExpired & Double = js.native
        
        /* 0 */ val ok: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.ok & Double = js.native
        
        /* 4 */ val outOfLocalStorage: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.outOfLocalStorage & Double = js.native
        
        /* 8 */ val providedBufferTooSmall: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.providedBufferTooSmall & Double = js.native
        
        /* 7 */ val quotaExceeded: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.quotaExceeded & Double = js.native
        
        /* 6 */ val updateTooBig: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.updateTooBig & Double = js.native
        
        /* 5 */ val userCanceled: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userCanceled & Double = js.native
        
        /* 13 */ val userHasNoXboxLiveInfo: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userHasNoXboxLiveInfo & Double = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveOperationResult")
      @js.native
      open class GameSaveOperationResult ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
      @js.native
      open class GameSaveProvider ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider
      object GameSaveProvider {
        
        @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* static member */
        inline def getForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[
                typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getForUserAsync")(user.asInstanceOf[js.Any], serviceConfigId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[
                typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult
              ]]
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* static member */
        inline def getSyncOnDemandForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[
                typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSyncOnDemandForUserAsync")(user.asInstanceOf[js.Any], serviceConfigId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[
                typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult
              ]]
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* note: abstract class */ @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult")
      @js.native
      open class GameSaveProviderGetResult ()
        extends StObject
           with typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider = js.native
      }
    }
  }
}
