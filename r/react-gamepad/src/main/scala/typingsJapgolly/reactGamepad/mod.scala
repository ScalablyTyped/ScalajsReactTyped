package typingsJapgolly.reactGamepad

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  object default {
    
    /* static member */
    /* was `typeof layouts` */
    object layouts {
      
      @JSImport("react-gamepad", "default.layouts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-gamepad", "default.layouts.XBOX")
      @js.native
      def XBOX: Layout = js.native
      inline def XBOX_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
    }
  }
  
  object layouts {
    
    @JSImport("react-gamepad", "layouts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-gamepad", "layouts.XBOX")
    @js.native
    def XBOX: Layout = js.native
    inline def XBOX_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickX
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickY
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickX
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickY
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LeftTrigger
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RightTrigger
  */
  trait Axis extends StObject
  object Axis {
    
    inline def LeftStickX: typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickX = "LeftStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickX]
    
    inline def LeftStickY: typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickY = "LeftStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickY]
    
    inline def LeftTrigger: typingsJapgolly.reactGamepad.reactGamepadStrings.LeftTrigger = "LeftTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LeftTrigger]
    
    inline def RightStickX: typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickX = "RightStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickX]
    
    inline def RightStickY: typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickY = "RightStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickY]
    
    inline def RightTrigger: typingsJapgolly.reactGamepad.reactGamepadStrings.RightTrigger = "RightTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RightTrigger]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGamepad.reactGamepadStrings.A
    - typingsJapgolly.reactGamepad.reactGamepadStrings.B
    - typingsJapgolly.reactGamepad.reactGamepadStrings.X
    - typingsJapgolly.reactGamepad.reactGamepadStrings.Y
    - typingsJapgolly.reactGamepad.reactGamepadStrings.Start
    - typingsJapgolly.reactGamepad.reactGamepadStrings.Back
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LT
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RT
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LB
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RB
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LS
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RS
    - typingsJapgolly.reactGamepad.reactGamepadStrings.DPadUp
    - typingsJapgolly.reactGamepad.reactGamepadStrings.DPadDown
    - typingsJapgolly.reactGamepad.reactGamepadStrings.DPadLeft
    - typingsJapgolly.reactGamepad.reactGamepadStrings.DPadRight
  */
  trait Button extends StObject
  object Button {
    
    inline def A: typingsJapgolly.reactGamepad.reactGamepadStrings.A = "A".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.A]
    
    inline def B: typingsJapgolly.reactGamepad.reactGamepadStrings.B = "B".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.B]
    
    inline def Back: typingsJapgolly.reactGamepad.reactGamepadStrings.Back = "Back".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.Back]
    
    inline def DPadDown: typingsJapgolly.reactGamepad.reactGamepadStrings.DPadDown = "DPadDown".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.DPadDown]
    
    inline def DPadLeft: typingsJapgolly.reactGamepad.reactGamepadStrings.DPadLeft = "DPadLeft".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.DPadLeft]
    
    inline def DPadRight: typingsJapgolly.reactGamepad.reactGamepadStrings.DPadRight = "DPadRight".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.DPadRight]
    
    inline def DPadUp: typingsJapgolly.reactGamepad.reactGamepadStrings.DPadUp = "DPadUp".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.DPadUp]
    
    inline def LB: typingsJapgolly.reactGamepad.reactGamepadStrings.LB = "LB".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LB]
    
    inline def LS: typingsJapgolly.reactGamepad.reactGamepadStrings.LS = "LS".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LS]
    
    inline def LT: typingsJapgolly.reactGamepad.reactGamepadStrings.LT = "LT".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LT]
    
    inline def RB: typingsJapgolly.reactGamepad.reactGamepadStrings.RB = "RB".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RB]
    
    inline def RS: typingsJapgolly.reactGamepad.reactGamepadStrings.RS = "RS".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RS]
    
    inline def RT: typingsJapgolly.reactGamepad.reactGamepadStrings.RT = "RT".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RT]
    
    inline def Start: typingsJapgolly.reactGamepad.reactGamepadStrings.Start = "Start".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.Start]
    
    inline def X: typingsJapgolly.reactGamepad.reactGamepadStrings.X = "X".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.X]
    
    inline def Y: typingsJapgolly.reactGamepad.reactGamepadStrings.Y = "Y".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.Y]
  }
  
  type Gamepad = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickX`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickY`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickX`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickY`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftTrigger`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightTrigger`
  */
  trait InvertedAxis extends StObject
  object InvertedAxis {
    
    inline def `-LeftStickX`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickX` = "-LeftStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickX`]
    
    inline def `-LeftStickY`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickY` = "-LeftStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickY`]
    
    inline def `-LeftTrigger`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftTrigger` = "-LeftTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftTrigger`]
    
    inline def `-RightStickX`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickX` = "-RightStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickX`]
    
    inline def `-RightStickY`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickY` = "-RightStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickY`]
    
    inline def `-RightTrigger`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightTrigger` = "-RightTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightTrigger`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickX
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickY
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickX
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickY
    - typingsJapgolly.reactGamepad.reactGamepadStrings.LeftTrigger
    - typingsJapgolly.reactGamepad.reactGamepadStrings.RightTrigger
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickX`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickY`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickX`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickY`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftTrigger`
    - typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightTrigger`
  */
  trait InvertibleAxis extends StObject
  object InvertibleAxis {
    
    inline def `-LeftStickX`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickX` = "-LeftStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickX`]
    
    inline def `-LeftStickY`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickY` = "-LeftStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftStickY`]
    
    inline def `-LeftTrigger`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftTrigger` = "-LeftTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-LeftTrigger`]
    
    inline def `-RightStickX`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickX` = "-RightStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickX`]
    
    inline def `-RightStickY`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickY` = "-RightStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightStickY`]
    
    inline def `-RightTrigger`: typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightTrigger` = "-RightTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.`-RightTrigger`]
    
    inline def LeftStickX: typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickX = "LeftStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickX]
    
    inline def LeftStickY: typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickY = "LeftStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LeftStickY]
    
    inline def LeftTrigger: typingsJapgolly.reactGamepad.reactGamepadStrings.LeftTrigger = "LeftTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.LeftTrigger]
    
    inline def RightStickX: typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickX = "RightStickX".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickX]
    
    inline def RightStickY: typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickY = "RightStickY".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RightStickY]
    
    inline def RightTrigger: typingsJapgolly.reactGamepad.reactGamepadStrings.RightTrigger = "RightTrigger".asInstanceOf[typingsJapgolly.reactGamepad.reactGamepadStrings.RightTrigger]
  }
  
  trait Layout extends StObject {
    
    var axis: js.Array[InvertibleAxis | Null]
    
    var buttonAxis: js.Array[InvertibleAxis | Null]
    
    var buttons: js.Array[Button | Null]
  }
  object Layout {
    
    inline def apply(
      axis: js.Array[InvertibleAxis | Null],
      buttonAxis: js.Array[InvertibleAxis | Null],
      buttons: js.Array[Button | Null]
    ): Layout = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], buttonAxis = buttonAxis.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    extension [Self <: Layout](x: Self) {
      
      inline def setAxis(value: js.Array[InvertibleAxis | Null]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisVarargs(value: (InvertibleAxis | Null)*): Self = StObject.set(x, "axis", js.Array(value*))
      
      inline def setButtonAxis(value: js.Array[InvertibleAxis | Null]): Self = StObject.set(x, "buttonAxis", value.asInstanceOf[js.Any])
      
      inline def setButtonAxisVarargs(value: (InvertibleAxis | Null)*): Self = StObject.set(x, "buttonAxis", js.Array(value*))
      
      inline def setButtons(value: js.Array[Button | Null]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsVarargs(value: (Button | Null)*): Self = StObject.set(x, "buttons", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    var children: Element
    
    /**
      * Threshold below which the axis values will be rounded to 0.0 Default: 0.08
      */
    var deadZone: js.UndefOr[Double] = js.undefined
    
    /**
      * The index of the gamepad to use, from 0 to 4 Default: 0
      */
    var gamepadIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Layout to use, from Gamepad.layouts. For now, only Gamepad.layouts.XBOX exists Default: Gamepad.layouts.XBOX
      */
    var layout: js.UndefOr[Layout] = js.undefined
    
    /**
      * triggered when the A button is pressed.
      */
    var onA: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * triggered when an axis is changed.
      */
    var onAxisChange: js.UndefOr[
        js.Function3[/* axisName */ Axis, /* value */ Double, /* previousValue */ Double, Unit]
      ] = js.undefined
    
    /**
      * triggered when the B button is pressed.
      */
    var onB: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the Back button is pressed.
      */
    var onBack: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * triggered when a button is pushed or released.
      */
    var onButtonChange: js.UndefOr[js.Function2[/* buttonName */ Button, /* pressed */ Boolean, Unit]] = js.undefined
    
    /**
      * triggered when a button is pushed.
      */
    var onButtonDown: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.undefined
    
    /**
      * triggered when a button is released.
      */
    var onButtonUp: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.undefined
    
    /**
      * triggered when the gamepad connects. Will be Triggered at least once after the Gamepad component is mounted.
      */
    var onConnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.undefined
    
    /**
      * triggered when the gamepad disconnects.
      */
    var onDisconnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.undefined
    
    /**
      * Triggered when the D Pad Down button is pressed or the Left Stick is pushed down (above stickThreshold).
      */
    var onDown: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the LB button is pressed.
      */
    var onLB: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the LS button is pressed.
      */
    var onLS: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the LT button is pressed.
      */
    var onLT: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the D Pad Left button is pressed or the Left Stick is pushed left (above stickThreshold).
      */
    var onLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the RB button is pressed.
      */
    var onRB: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the RS button is pressed.
      */
    var onRS: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the RT button is pressed.
      */
    var onRT: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the D Pad Right button is pressed or the Left Stick is pushed right (above stickThreshold).
      */
    var onRight: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the Start button is pressed.
      */
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the D Pad Up button is pressed or the Left Stick is pushed up (above stickThreshold).
      */
    var onUp: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * triggered when the X button is pressed.
      */
    var onX: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the Y button is pressed.
      */
    var onY: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Threshold above which onUp, onDown,onLeft,onRight are Triggered for the left stick Default: 0.75
      */
    var stickThreshold: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(children: VdomElement): Props = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDeadZone(value: Double): Self = StObject.set(x, "deadZone", value.asInstanceOf[js.Any])
      
      inline def setDeadZoneUndefined: Self = StObject.set(x, "deadZone", js.undefined)
      
      inline def setGamepadIndex(value: Double): Self = StObject.set(x, "gamepadIndex", value.asInstanceOf[js.Any])
      
      inline def setGamepadIndexUndefined: Self = StObject.set(x, "gamepadIndex", js.undefined)
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setOnA(value: Callback): Self = StObject.set(x, "onA", value.toJsFn)
      
      inline def setOnAUndefined: Self = StObject.set(x, "onA", js.undefined)
      
      inline def setOnAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Callback): Self = StObject.set(x, "onAxisChange", js.Any.fromFunction3((t0: /* axisName */ Axis, t1: /* value */ Double, t2: /* previousValue */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnAxisChangeUndefined: Self = StObject.set(x, "onAxisChange", js.undefined)
      
      inline def setOnB(value: Callback): Self = StObject.set(x, "onB", value.toJsFn)
      
      inline def setOnBUndefined: Self = StObject.set(x, "onB", js.undefined)
      
      inline def setOnBack(value: Callback): Self = StObject.set(x, "onBack", value.toJsFn)
      
      inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      inline def setOnButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Callback): Self = StObject.set(x, "onButtonChange", js.Any.fromFunction2((t0: /* buttonName */ Button, t1: /* pressed */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnButtonChangeUndefined: Self = StObject.set(x, "onButtonChange", js.undefined)
      
      inline def setOnButtonDown(value: /* buttonName */ Button => Callback): Self = StObject.set(x, "onButtonDown", js.Any.fromFunction1((t0: /* buttonName */ Button) => value(t0).runNow()))
      
      inline def setOnButtonDownUndefined: Self = StObject.set(x, "onButtonDown", js.undefined)
      
      inline def setOnButtonUp(value: /* buttonName */ Button => Callback): Self = StObject.set(x, "onButtonUp", js.Any.fromFunction1((t0: /* buttonName */ Button) => value(t0).runNow()))
      
      inline def setOnButtonUpUndefined: Self = StObject.set(x, "onButtonUp", js.undefined)
      
      inline def setOnConnect(value: /* gamepadIndex */ Double => Callback): Self = StObject.set(x, "onConnect", js.Any.fromFunction1((t0: /* gamepadIndex */ Double) => value(t0).runNow()))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(value: /* gamepadIndex */ Double => Callback): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1((t0: /* gamepadIndex */ Double) => value(t0).runNow()))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      inline def setOnDown(value: Callback): Self = StObject.set(x, "onDown", value.toJsFn)
      
      inline def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      inline def setOnLB(value: Callback): Self = StObject.set(x, "onLB", value.toJsFn)
      
      inline def setOnLBUndefined: Self = StObject.set(x, "onLB", js.undefined)
      
      inline def setOnLS(value: Callback): Self = StObject.set(x, "onLS", value.toJsFn)
      
      inline def setOnLSUndefined: Self = StObject.set(x, "onLS", js.undefined)
      
      inline def setOnLT(value: Callback): Self = StObject.set(x, "onLT", value.toJsFn)
      
      inline def setOnLTUndefined: Self = StObject.set(x, "onLT", js.undefined)
      
      inline def setOnLeft(value: Callback): Self = StObject.set(x, "onLeft", value.toJsFn)
      
      inline def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      inline def setOnRB(value: Callback): Self = StObject.set(x, "onRB", value.toJsFn)
      
      inline def setOnRBUndefined: Self = StObject.set(x, "onRB", js.undefined)
      
      inline def setOnRS(value: Callback): Self = StObject.set(x, "onRS", value.toJsFn)
      
      inline def setOnRSUndefined: Self = StObject.set(x, "onRS", js.undefined)
      
      inline def setOnRT(value: Callback): Self = StObject.set(x, "onRT", value.toJsFn)
      
      inline def setOnRTUndefined: Self = StObject.set(x, "onRT", js.undefined)
      
      inline def setOnRight(value: Callback): Self = StObject.set(x, "onRight", value.toJsFn)
      
      inline def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUp(value: Callback): Self = StObject.set(x, "onUp", value.toJsFn)
      
      inline def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      inline def setOnX(value: Callback): Self = StObject.set(x, "onX", value.toJsFn)
      
      inline def setOnXUndefined: Self = StObject.set(x, "onX", js.undefined)
      
      inline def setOnY(value: Callback): Self = StObject.set(x, "onY", value.toJsFn)
      
      inline def setOnYUndefined: Self = StObject.set(x, "onY", js.undefined)
      
      inline def setStickThreshold(value: Double): Self = StObject.set(x, "stickThreshold", value.asInstanceOf[js.Any])
      
      inline def setStickThresholdUndefined: Self = StObject.set(x, "stickThreshold", js.undefined)
    }
  }
}
