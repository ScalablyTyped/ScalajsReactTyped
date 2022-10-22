package typingsJapgolly.winrtUwp.global.Windows.Devices

import typingsJapgolly.winrtUwp.Windows.Devices.Input.MouseDelta
import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceUsage
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for identifying the input devices available (pointer, touch, mouse, and keyboard) and retrieving information about those devices. */
object Input {
  
  /** Supports the ability to determine the capabilities of any connected hardware keyboards. */
  @JSGlobal("Windows.Devices.Input.KeyboardCapabilities")
  @js.native
  /** Initializes a new instance of the KeyboardCapabilities class. */
  open class KeyboardCapabilities ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Input.KeyboardCapabilities {
    
    /** Gets a value that indicates whether a hardware keyboard is detected. */
    /* CompleteClass */
    var keyboardPresent: Double = js.native
  }
  
  /** Supports the ability to determine the capabilities of any connected mouse devices. */
  @JSGlobal("Windows.Devices.Input.MouseCapabilities")
  @js.native
  /** Initializes a new instance of the MouseCapabilities class. */
  open class MouseCapabilities ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Input.MouseCapabilities {
    
    /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that tilts left and right (usually for horizontal scrolling). */
    /* CompleteClass */
    var horizontalWheelPresent: Double = js.native
    
    /** Gets a value that indicates whether a mouse device is detected. */
    /* CompleteClass */
    var mousePresent: Double = js.native
    
    /** Gets a value representing the number of buttons on the mouse. If multiple mice are present, it returns the number of buttons of the mouse which has maximum number of buttons. */
    /* CompleteClass */
    var numberOfButtons: Double = js.native
    
    /** Gets a value indicating whether any of the mice connected to the computer has swapped left and right buttons. */
    /* CompleteClass */
    var swapButtons: Double = js.native
    
    /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that rolls up and down (usually for vertical scrolling). */
    /* CompleteClass */
    var verticalWheelPresent: Double = js.native
  }
  
  /** Supports the ability to identify and track connected mouse devices. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Input.MouseDevice")
  @js.native
  open class MouseDevice ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Input.MouseDevice
  object MouseDevice {
    
    @JSGlobal("Windows.Devices.Input.MouseDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves the mouse device that is associated with the current view.
      * @return The mouse device.
      */
    /* static member */
    inline def getForCurrentView(): typingsJapgolly.winrtUwp.Windows.Devices.Input.MouseDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Input.MouseDevice]
  }
  
  /** Contains event data for the MouseMoved event. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Input.MouseEventArgs")
  @js.native
  open class MouseEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Input.MouseEventArgs {
    
    /** Gets a value that indicates the change in the screen location of the mouse pointer since the last mouse event. */
    /* CompleteClass */
    var mouseDelta: MouseDelta = js.native
  }
  
  /** Supports the ability to identify the connected pointer devices and determine their capabilities. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Input.PointerDevice")
  @js.native
  open class PointerDevice ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDevice {
    
    /** Gets a value indicating whether the pointer device is an integrated device. For example, a video display with an integrated touch digitizer compared to an external pen/stylus digitizer. */
    /* CompleteClass */
    var isIntegrated: Boolean = js.native
    
    /** Gets a value indicating the maximum number of contacts supported by the input device. */
    /* CompleteClass */
    var maxContacts: Double = js.native
    
    /* CompleteClass */
    var maxPointersWithZDistance: Any = js.native
    
    /* unmapped type */
    /** Gets the coordinates of the bounding rectangle supported by the input device. */
    /* CompleteClass */
    var physicalDeviceRect: Rect = js.native
    
    /** Gets the pointer device type. */
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /** Gets the screen coordinates that are mapped to the bounding rectangle supported by the input device. */
    /* CompleteClass */
    var screenRect: Rect = js.native
    
    /** Gets a collection containing the supported pointer device usages . */
    /* CompleteClass */
    var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
  }
  object PointerDevice {
    
    @JSGlobal("Windows.Devices.Input.PointerDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets information about the pointer device associated with the specified input pointer ID.
      * @param pointerId The ID of the pointer input.
      * @return The PointerDevice object that represents the associated pointer device.
      */
    /* static member */
    inline def getPointerDevice(pointerId: Double): typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerDevice")(pointerId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDevice]
    
    /**
      * Gets information about the pointer devices attached to the system.
      * @return The collection of PointerDevice objects that represent the pointer devices attached to the system.
      */
    /* static member */
    inline def getPointerDevices(): IVectorView[typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerDevices")().asInstanceOf[IVectorView[typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDevice]]
  }
  
  /** Enumerates pointer device types. */
  @JSGlobal("Windows.Devices.Input.PointerDeviceType")
  @js.native
  object PointerDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType & Double] = js.native
    
    /* 2 */ val mouse: typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType.mouse & Double = js.native
    
    /* 1 */ val pen: typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType.pen & Double = js.native
    
    /* 0 */ val touch: typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType.touch & Double = js.native
  }
  
  /** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
  @JSGlobal("Windows.Devices.Input.TouchCapabilities")
  @js.native
  /** Initializes a new instance of the TouchCapabilities class. */
  open class TouchCapabilities ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Input.TouchCapabilities {
    
    /** Gets the minimum number of contacts supported by all the digitizers. */
    /* CompleteClass */
    var contacts: Double = js.native
    
    /** Gets a value that indicates whether a touch digitizer is detected. */
    /* CompleteClass */
    var touchPresent: Double = js.native
  }
}
