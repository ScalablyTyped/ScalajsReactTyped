package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typingsJapgolly.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputIndexMod {
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceSource")
  @js.native
  open class DeviceSource[T /* <: DeviceType */] protected ()
    extends typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceSourceMod.DeviceSource[T] {
    /**
      * Default Constructor
      * @param deviceInputSystem - Reference to DeviceInputSystem
      * @param deviceType - Type of device
      * @param deviceSlot - "Slot" or index that device is referenced in
      */
    def this(deviceInputSystem: IDeviceInputSystem, /** Type of device */
    deviceType: T) = this()
    def this(
      deviceInputSystem: IDeviceInputSystem,
      /** Type of device */
    deviceType: T,
      /** "Slot" or index that device is referenced in */
    deviceSlot: Double
    ) = this()
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceSourceManager")
  @js.native
  open class DeviceSourceManager protected ()
    extends typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceSourceManagerMod.DeviceSourceManager {
    /**
      * Default constructor
      * @param engine - Used to get canvas (if applicable)
      */
    def this(engine: Engine) = this()
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceType")
  @js.native
  object DeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType & Double
      ] = js.native
    
    /* 7 */ val DualSense: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.DualSense & Double = js.native
    
    /* 4 */ val DualShock: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.DualShock & Double = js.native
    
    /* 0 */ val Generic: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Generic & Double = js.native
    
    /* 1 */ val Keyboard: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Keyboard & Double = js.native
    
    /* 2 */ val Mouse: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Mouse & Double = js.native
    
    /* 6 */ val Switch: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Switch & Double = js.native
    
    /* 3 */ val Touch: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Touch & Double = js.native
    
    /* 5 */ val Xbox: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Xbox & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DualSenseInput")
  @js.native
  object DualSenseInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput & Double
      ] = js.native
    
    /* 1 */ val Circle: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Circle & Double = js.native
    
    /* 8 */ val Create: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Create & Double = js.native
    
    /* 0 */ val Cross: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Cross & Double = js.native
    
    /* 13 */ val DPadDown: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Home & Double = js.native
    
    /* 4 */ val L1: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.L1 & Double = js.native
    
    /* 6 */ val L2: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.L2 & Double = js.native
    
    /* 10 */ val L3: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.L3 & Double = js.native
    
    /* 18 */ val LStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.LStickYAxis & Double = js.native
    
    /* 9 */ val Options: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Options & Double = js.native
    
    /* 5 */ val R1: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.R1 & Double = js.native
    
    /* 7 */ val R2: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.R2 & Double = js.native
    
    /* 11 */ val R3: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.R3 & Double = js.native
    
    /* 20 */ val RStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.RStickYAxis & Double = js.native
    
    /* 2 */ val Square: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Square & Double = js.native
    
    /* 17 */ val TouchPad: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.TouchPad & Double = js.native
    
    /* 3 */ val Triangle: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Triangle & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DualShockInput")
  @js.native
  object DualShockInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput & Double
      ] = js.native
    
    /* 1 */ val Circle: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Circle & Double = js.native
    
    /* 0 */ val Cross: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Cross & Double = js.native
    
    /* 13 */ val DPadDown: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Home & Double = js.native
    
    /* 4 */ val L1: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.L1 & Double = js.native
    
    /* 6 */ val L2: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.L2 & Double = js.native
    
    /* 10 */ val L3: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.L3 & Double = js.native
    
    /* 18 */ val LStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.LStickYAxis & Double = js.native
    
    /* 9 */ val Options: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Options & Double = js.native
    
    /* 5 */ val R1: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.R1 & Double = js.native
    
    /* 7 */ val R2: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.R2 & Double = js.native
    
    /* 11 */ val R3: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.R3 & Double = js.native
    
    /* 20 */ val RStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.RStickYAxis & Double = js.native
    
    /* 8 */ val Share: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Share & Double = js.native
    
    /* 2 */ val Square: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Square & Double = js.native
    
    /* 17 */ val TouchPad: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.TouchPad & Double = js.native
    
    /* 3 */ val Triangle: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Triangle & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "NativePointerInput")
  @js.native
  object NativePointerInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput & Double
      ] = js.native
    
    /* 5 */ val BrowserBack: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.BrowserBack & Double = js.native
    
    /* 6 */ val BrowserForward: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.BrowserForward & Double = js.native
    
    /* 10 */ val DeltaHorizontal: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.DeltaHorizontal & Double = js.native
    
    /* 11 */ val DeltaVertical: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.DeltaVertical & Double = js.native
    
    /* 0 */ val Horizontal: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.Horizontal & Double = js.native
    
    /* 2 */ val LeftClick: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.LeftClick & Double = js.native
    
    /* 3 */ val MiddleClick: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MiddleClick & Double = js.native
    
    /* 7 */ val MouseWheelX: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelX & Double = js.native
    
    /* 8 */ val MouseWheelY: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelY & Double = js.native
    
    /* 9 */ val MouseWheelZ: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelZ & Double = js.native
    
    /* 4 */ val RightClick: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.RightClick & Double = js.native
    
    /* 1 */ val Vertical: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.Vertical & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "PointerInput")
  @js.native
  object PointerInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput & Double
      ] = js.native
    
    /* 5 */ val BrowserBack: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.BrowserBack & Double = js.native
    
    /* 6 */ val BrowserForward: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.BrowserForward & Double = js.native
    
    /* 0 */ val Horizontal: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Horizontal & Double = js.native
    
    /* 2 */ val LeftClick: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.LeftClick & Double = js.native
    
    /* 3 */ val MiddleClick: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MiddleClick & Double = js.native
    
    /* 7 */ val MouseWheelX: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelX & Double = js.native
    
    /* 8 */ val MouseWheelY: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelY & Double = js.native
    
    /* 9 */ val MouseWheelZ: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelZ & Double = js.native
    
    /* 12 */ val Move: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Move & Double = js.native
    
    /* 4 */ val RightClick: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.RightClick & Double = js.native
    
    /* 1 */ val Vertical: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Vertical & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "SwitchInput")
  @js.native
  object SwitchInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput & Double
      ] = js.native
    
    /* 1 */ val A: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.A & Double = js.native
    
    /* 0 */ val B: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.B & Double = js.native
    
    /* 17 */ val Capture: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Capture & Double = js.native
    
    /* 13 */ val DPadDown: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Home & Double = js.native
    
    /* 4 */ val L: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.L & Double = js.native
    
    /* 10 */ val LS: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.LS & Double = js.native
    
    /* 18 */ val LStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.LStickYAxis & Double = js.native
    
    /* 8 */ val Minus: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Minus & Double = js.native
    
    /* 9 */ val Plus: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Plus & Double = js.native
    
    /* 5 */ val R: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.R & Double = js.native
    
    /* 11 */ val RS: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.RS & Double = js.native
    
    /* 20 */ val RStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.RStickYAxis & Double = js.native
    
    /* 3 */ val X: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.X & Double = js.native
    
    /* 2 */ val Y: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Y & Double = js.native
    
    /* 6 */ val ZL: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.ZL & Double = js.native
    
    /* 7 */ val ZR: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.ZR & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "XboxInput")
  @js.native
  object XboxInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput & Double
      ] = js.native
    
    /* 0 */ val A: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.A & Double = js.native
    
    /* 1 */ val B: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.B & Double = js.native
    
    /* 8 */ val Back: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Back & Double = js.native
    
    /* 13 */ val DPadDown: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Home & Double = js.native
    
    /* 4 */ val LB: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LB & Double = js.native
    
    /* 10 */ val LS: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LS & Double = js.native
    
    /* 17 */ val LStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LStickXAxis & Double = js.native
    
    /* 18 */ val LStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LStickYAxis & Double = js.native
    
    /* 6 */ val LT: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LT & Double = js.native
    
    /* 5 */ val RB: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RB & Double = js.native
    
    /* 11 */ val RS: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RS & Double = js.native
    
    /* 19 */ val RStickXAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RStickXAxis & Double = js.native
    
    /* 20 */ val RStickYAxis: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RStickYAxis & Double = js.native
    
    /* 7 */ val RT: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RT & Double = js.native
    
    /* 9 */ val Start: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Start & Double = js.native
    
    /* 2 */ val X: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.X & Double = js.native
    
    /* 3 */ val Y: typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Y & Double = js.native
  }
}
