package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the Tooltip control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the Tooltip control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Hide the Tooltip popup.
    * @param {string}  optional Determines the type of effect that takes place when hiding the tooltip.
    * @param {() => void}  optional custom effect takes place when hiding the tooltip.
    * @returns {void}
    */
  def hide(): Unit = js.native
  def hide(effect: String): Unit = js.native
  def hide(effect: String, func: js.Function0[Unit]): Unit = js.native
  def hide(effect: Unit, func: js.Function0[Unit]): Unit = js.native
  
  @JSName("model")
  var model_Tooltip: Model = js.native
  
  /** Shows the Tooltip popup for the given target element with the specified effect.
    * @param {string} optional Determines the type of effect that takes place when showing the tooltip.
    * @param {() => void} optional custom effect takes place when showing the tooltip.
    * @param {JQuery} optional Tooltip will be shown for the given element
    * @returns {void}
    */
  def show(): Unit = js.native
  def show(effect: String): Unit = js.native
  def show(effect: String, func: js.Function0[Unit]): Unit = js.native
  def show(effect: String, func: js.Function0[Unit], target: JQuery): Unit = js.native
  def show(effect: String, func: Unit, target: JQuery): Unit = js.native
  def show(effect: Unit, func: js.Function0[Unit]): Unit = js.native
  def show(effect: Unit, func: js.Function0[Unit], target: JQuery): Unit = js.native
  def show(effect: Unit, func: Unit, target: JQuery): Unit = js.native
}
object Tooltip {
  
  @js.native
  sealed trait Associate extends StObject
  @JSGlobal("ej.Tooltip.Associate")
  @js.native
  object Associate extends StObject {
    
    ///Sets the position related to (x,y) co-ordinates.
    @js.native
    sealed trait Axis
      extends StObject
         with Associate
    
    ///Sets the position related to mouse, first entry to the target element.
    @js.native
    sealed trait MouseEnter
      extends StObject
         with Associate
    
    ///Sets the position related to mouse.
    @js.native
    sealed trait MouseFollow
      extends StObject
         with Associate
    
    ///Sets the position related to target element.
    @js.native
    sealed trait Target
      extends StObject
         with Associate
    
    ///Sets the position related to browser window.
    @js.native
    sealed trait Window
      extends StObject
         with Associate
  }
  
  @js.native
  sealed trait CloseMode extends StObject
  @JSGlobal("ej.Tooltip.CloseMode")
  @js.native
  object CloseMode extends StObject {
    
    ///Sets the delay for Tooltip close
    @js.native
    sealed trait Auto
      extends StObject
         with CloseMode
    
    ///The Tooltip will be display normally.
    @js.native
    sealed trait None
      extends StObject
         with CloseMode
    
    ///Enables close button in Tooltip.
    @js.native
    sealed trait Sticky
      extends StObject
         with CloseMode
  }
  
  @js.native
  sealed trait Collision extends StObject
  @JSGlobal("ej.Tooltip.Collision")
  @js.native
  object Collision extends StObject {
    
    ///Shift the Tooltip popup away from the edge of the window(collision side) that means adjacent position.
    @js.native
    sealed trait Fit
      extends StObject
         with Collision
    
    ///Flips the Tooltip to the opposite side of the target, if collision is occurs.
    @js.native
    sealed trait Flip
      extends StObject
         with Collision
    
    ///Ensure as much of the element is visible as possible to showcase.
    @js.native
    sealed trait FlipFit
      extends StObject
         with Collision
    
    ///No collision detection is take place
    @js.native
    sealed trait None
      extends StObject
         with Collision
  }
  
  @js.native
  sealed trait Trigger extends StObject
  @JSGlobal("ej.Tooltip.Trigger")
  @js.native
  object Trigger extends StObject {
    
    ///The Tooltip to be shown when the target element is clicked.
    @js.native
    sealed trait Click
      extends StObject
         with Trigger
    
    ///Enables the Tooltip when focus is set to target element.
    @js.native
    sealed trait Focus
      extends StObject
         with Trigger
    
    ///Enables the Tooltip when hover on the target element.
    @js.native
    sealed trait Hover
      extends StObject
         with Trigger
  }
  
  @js.native
  sealed trait effect extends StObject
  @JSGlobal("ej.Tooltip.effect")
  @js.native
  object effect extends StObject {
    
    ///Fade the Tooltip in and out of visibility.
    @js.native
    sealed trait Fade
      extends StObject
         with effect
    
    ///No animation takes place when showing/hiding the Tooltip
    @js.native
    sealed trait None
      extends StObject
         with effect
    
    ///Sliding effect takes place when showing/hiding the Tooltip
    @js.native
    sealed trait Slide
      extends StObject
         with effect
  }
  
  trait Animation extends StObject {
    
    /** Determines the type of effect.
      * @Default {ej.Tooltip.Effect.None}
      */
    var effect: js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.effect | String] = js.undefined
    
    /** Sets the animation speed in milliseconds.
      * @Default {4000}
      */
    var speed: js.UndefOr[Double] = js.undefined
  }
  object Animation {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.Tooltip.Animation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.Tooltip.Animation]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.Tooltip.Animation](x: Self) {
      
      inline def setEffect(value: effect | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  trait BeforeCloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** returns the tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCloseEventArgs {
    
    inline def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    extension [Self <: BeforeCloseEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeOpenEventArgs {
    
    inline def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    extension [Self <: BeforeOpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    extension [Self <: ClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    extension [Self <: CloseEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait HoverEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object HoverEventArgs {
    
    inline def apply(): HoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverEventArgs]
    }
    
    extension [Self <: HoverEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Tooltip control can be accessed through the keyboard shortcut keys.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the animation behavior in  Tooltip. It contains the following sub properties.
      */
    var animation: js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.Animation] = js.undefined
    
    /** Sets the position related to target element, window, mouse or (x,y) co-ordinates.
      * @Default {ej.Tooltip.Associate.Target}
      */
    var associate: js.UndefOr[Associate | String] = js.undefined
    
    /** Specified the delay to hide Tooltip when closeMode is auto.
      * @Default {4000}
      */
    var autoCloseTimeout: js.UndefOr[Double] = js.undefined
    
    /** This event is triggered before the Tooltip widget get closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
    
    /** This event is triggered before the Tooltip widget gets open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Fires on clicking to the target element.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** This event is triggered after the Tooltip widget is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Specifies the closing behavior of Tooltip popup.
      * @Default {ej.Tooltip.CloseMode.None}
      */
    var closeMode: js.UndefOr[CloseMode | String] = js.undefined
    
    /** Sets the Tooltip in alternate position when collision occurs.
      * @Default {ej.Tooltip.Collision.FlipFit}
      */
    var collision: js.UndefOr[Collision | String] = js.undefined
    
    /** Specified the selector for the container element.
      * @Default {body}
      */
    var containment: js.UndefOr[String] = js.undefined
    
    /** Specifies the text for Tooltip.
      * @Default {null}
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** This event is triggered after the Tooltip is created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for Tooltip for the customization.
      * @Default {null}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** This event is triggered after the Tooltip widget is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Sets the Tooltip direction from right to left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the Tooltip.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the height of the Tooltip popup.
      * @Default {auto}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** This event is triggered while hovering the target element, when tooltip positioning relates to target element.
      */
    var hover: js.UndefOr[js.Function1[/* e */ HoverEventArgs, Unit]] = js.undefined
    
    /** Enables the arrow in Tooltip.
      * @Default {true}
      */
    var isBalloon: js.UndefOr[Boolean] = js.undefined
    
    /** This event is triggered after the Tooltip is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** defines various attributes of the Tooltip position
      */
    var position: js.UndefOr[Position] = js.undefined
    
    /** Enables or disables rounded corner.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables shadow effect.
      * @Default {false}
      */
    var showShadow: js.UndefOr[Boolean] = js.undefined
    
    /** Specified a selector for elements, within the container.
      * @Default {null}
      */
    var target: js.UndefOr[String] = js.undefined
    
    /** defines Tooltip size and gap between tooltip against the target element.
      */
    var tip: js.UndefOr[Tip] = js.undefined
    
    /** The title text to be displayed in the Tooltip header.
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** This event is triggered while hover the target element, when the tooltip positioning is relates to the mouse.
      */
    var tracking: js.UndefOr[js.Function1[/* e */ TrackingEventArgs, Unit]] = js.undefined
    
    /** Specified the event action to show case the Tooltip.
      * @Default {ej.Tooltip.Trigger.Hover}
      */
    var trigger: js.UndefOr[Trigger | String] = js.undefined
    
    /** Defines the width of the Tooltip popup.
      * @Default {auto}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.Tooltip.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.Tooltip.Model]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.Tooltip.Model](x: Self) {
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAnimation(value: typingsJapgolly.ejWebAll.ej.Tooltip.Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAssociate(value: Associate | String): Self = StObject.set(x, "associate", value.asInstanceOf[js.Any])
      
      inline def setAssociateUndefined: Self = StObject.set(x, "associate", js.undefined)
      
      inline def setAutoCloseTimeout(value: Double): Self = StObject.set(x, "autoCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseTimeoutUndefined: Self = StObject.set(x, "autoCloseTimeout", js.undefined)
      
      inline def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Callback): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1((t0: /* e */ BeforeCloseEventArgs) => value(t0).runNow()))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Callback): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1((t0: /* e */ BeforeOpenEventArgs) => value(t0).runNow()))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* e */ ClickEventArgs) => value(t0).runNow()))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* e */ CloseEventArgs) => value(t0).runNow()))
      
      inline def setCloseMode(value: CloseMode | String): Self = StObject.set(x, "closeMode", value.asInstanceOf[js.Any])
      
      inline def setCloseModeUndefined: Self = StObject.set(x, "closeMode", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCollision(value: Collision | String): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
      
      inline def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: /* e */ CreateEventArgs) => value(t0).runNow()))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* e */ DestroyEventArgs) => value(t0).runNow()))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHover(value: /* e */ HoverEventArgs => Callback): Self = StObject.set(x, "hover", js.Any.fromFunction1((t0: /* e */ HoverEventArgs) => value(t0).runNow()))
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setIsBalloon(value: Boolean): Self = StObject.set(x, "isBalloon", value.asInstanceOf[js.Any])
      
      inline def setIsBalloonUndefined: Self = StObject.set(x, "isBalloon", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: /* e */ OpenEventArgs) => value(t0).runNow()))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTip(value: Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTracking(value: /* e */ TrackingEventArgs => Callback): Self = StObject.set(x, "tracking", js.Any.fromFunction1((t0: /* e */ TrackingEventArgs) => value(t0).runNow()))
      
      inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
      
      inline def setTrigger(value: Trigger | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    extension [Self <: OpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    /** Sets the arrow position again popup.
      */
    var stem: js.UndefOr[PositionStem] = js.undefined
    
    /** Sets the Tooltip position against target.
      */
    var target: js.UndefOr[PositionTarget] = js.undefined
  }
  object Position {
    
    inline def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setStem(value: PositionStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      inline def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
      
      inline def setTarget(value: PositionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait PositionStem extends StObject {
    
    /** Sets the arrow position again popup based on horizontal(x) value
      * @Default {center}
      */
    var horizontal: js.UndefOr[String] = js.undefined
    
    /** Sets the arrow position again popup based on vertical(y) value
      * @Default {bottom}
      */
    var vertical: js.UndefOr[String] = js.undefined
  }
  object PositionStem {
    
    inline def apply(): PositionStem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionStem]
    }
    
    extension [Self <: PositionStem](x: Self) {
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait PositionTarget extends StObject {
    
    /** Sets the Tooltip position against target based on horizontal(x) value.
      * @Default {center}
      */
    var horizontal: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the Tooltip position against target based on vertical(y) value.
      * @Default {top}
      */
    var vertical: js.UndefOr[String | Double] = js.undefined
  }
  object PositionTarget {
    
    inline def apply(): PositionTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionTarget]
    }
    
    extension [Self <: PositionTarget](x: Self) {
      
      inline def setHorizontal(value: String | Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: String | Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait Tip extends StObject {
    
    /** Sets gap between tooltip against the target element.
      */
    var adjust: js.UndefOr[TipAdjust] = js.undefined
    
    /** Sets the Tooltip size.
      */
    var size: js.UndefOr[TipSize] = js.undefined
  }
  object Tip {
    
    inline def apply(): Tip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tip]
    }
    
    extension [Self <: Tip](x: Self) {
      
      inline def setAdjust(value: TipAdjust): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setSize(value: TipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TipAdjust extends StObject {
    
    /** Sets horizontal gap between Tooltip and target element.
      * @Default {0}
      */
    var xValue: js.UndefOr[Double] = js.undefined
    
    /** Sets vertical gap between Tooltip and target element.
      * @Default {0}
      */
    var yValue: js.UndefOr[Double] = js.undefined
  }
  object TipAdjust {
    
    inline def apply(): TipAdjust = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TipAdjust]
    }
    
    extension [Self <: TipAdjust](x: Self) {
      
      inline def setXValue(value: Double): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
      
      inline def setXValueUndefined: Self = StObject.set(x, "xValue", js.undefined)
      
      inline def setYValue(value: Double): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
      
      inline def setYValueUndefined: Self = StObject.set(x, "yValue", js.undefined)
    }
  }
  
  trait TipSize extends StObject {
    
    /** Sets the Tooltip height.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Sets the Tooltip width.
      * @Default {20}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TipSize {
    
    inline def apply(): TipSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TipSize]
    }
    
    extension [Self <: TipSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TrackingEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TrackingEventArgs {
    
    inline def apply(): TrackingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackingEventArgs]
    }
    
    extension [Self <: TrackingEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
