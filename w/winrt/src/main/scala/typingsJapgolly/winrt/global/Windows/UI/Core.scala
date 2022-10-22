package typingsJapgolly.winrt.global.Windows.UI

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.System.VirtualKey
import typingsJapgolly.winrt.Windows.System.VirtualKeyModifiers
import typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.IPropertyAnimation
import typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType
import typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType
import typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType
import typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.wait
import typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcherPriority
import typingsJapgolly.winrt.Windows.UI.Core.CorePhysicalKeyStatus
import typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption
import typingsJapgolly.winrt.Windows.UI.Core.CoreVirtualKeyStates
import typingsJapgolly.winrt.Windows.UI.Core.CoreWindowActivationState
import typingsJapgolly.winrt.Windows.UI.Core.CoreWindowFlowDirection
import typingsJapgolly.winrt.Windows.UI.Core.DispatchedHandler
import typingsJapgolly.winrt.Windows.UI.Core.IdleDispatchedHandler
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import typingsJapgolly.winrt.Windows.UI.Popups.IUICommand
import typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.UI.Core.AcceleratorKeyEventArgs")
  @js.native
  open class AcceleratorKeyEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.AcceleratorKeyEventArgs {
    
    /* CompleteClass */
    var eventType: CoreAcceleratorKeyEventType = js.native
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyStatus: CorePhysicalKeyStatus = js.native
    
    /* CompleteClass */
    var virtualKey: VirtualKey = js.native
  }
  
  object AnimationMetrics {
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
    @js.native
    open class AnimationDescription protected ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
      
      /* CompleteClass */
      var animations: IVectorView[IPropertyAnimation] = js.native
      
      /* CompleteClass */
      var delayLimit: Double = js.native
      
      /* CompleteClass */
      var staggerDelay: Double = js.native
      
      /* CompleteClass */
      var staggerDelayFactor: Double = js.native
      
      /* CompleteClass */
      var zOrder: Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
    @js.native
    object AnimationEffect extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect & Double] = js.native
      
      /* 7 */ val addToGrid: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid & Double = js.native
      
      /* 5 */ val addToList: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList & Double = js.native
      
      /* 9 */ val addToSearchGrid: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid & Double = js.native
      
      /* 11 */ val addToSearchList: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList & Double = js.native
      
      /* 1 */ val collapse: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse & Double = js.native
      
      /* 33 */ val crossFade: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade & Double = js.native
      
      /* 8 */ val deleteFromGrid: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid & Double = js.native
      
      /* 6 */ val deleteFromList: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList & Double = js.native
      
      /* 10 */ val deleteFromSearchGrid: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid & Double = js.native
      
      /* 12 */ val deleteFromSearchList: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList & Double = js.native
      
      /* 26 */ val dragBetweenEnter: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter & Double = js.native
      
      /* 27 */ val dragBetweenLeave: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave & Double = js.native
      
      /* 22 */ val dragSourceEnd: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd & Double = js.native
      
      /* 21 */ val dragSourceStart: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart & Double = js.native
      
      /* 31 */ val enterPage: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage & Double = js.native
      
      /* 0 */ val expand: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand & Double = js.native
      
      /* 3 */ val fadeIn: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn & Double = js.native
      
      /* 4 */ val fadeOut: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut & Double = js.native
      
      /* 25 */ val hide: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide & Double = js.native
      
      /* 15 */ val hideEdgeUI: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI & Double = js.native
      
      /* 16 */ val hidePanel: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel & Double = js.native
      
      /* 18 */ val hidePopup: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup & Double = js.native
      
      /* 34 */ val peek: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek & Double = js.native
      
      /* 19 */ val pointerDown: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown & Double = js.native
      
      /* 20 */ val pointerUp: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp & Double = js.native
      
      /* 2 */ val reposition: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition & Double = js.native
      
      /* 24 */ val reveal: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal & Double = js.native
      
      /* 13 */ val showEdgeUI: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI & Double = js.native
      
      /* 14 */ val showPanel: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel & Double = js.native
      
      /* 17 */ val showPopup: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup & Double = js.native
      
      /* 29 */ val swipeDeselect: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect & Double = js.native
      
      /* 30 */ val swipeReveal: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal & Double = js.native
      
      /* 28 */ val swipeSelect: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect & Double = js.native
      
      /* 23 */ val transitionContent: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent & Double = js.native
      
      /* 32 */ val transitionPage: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage & Double = js.native
      
      /* 35 */ val updateBadge: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
    @js.native
    object AnimationEffectTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget & Double
          ] = js.native
      
      /* 1 */ val added: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added & Double = js.native
      
      /* 2 */ val affected: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected & Double = js.native
      
      /* 3 */ val background: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background & Double = js.native
      
      /* 4 */ val content: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content & Double = js.native
      
      /* 5 */ val deleted: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted & Double = js.native
      
      /* 6 */ val deselected: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected & Double = js.native
      
      /* 7 */ val dragSource: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource & Double = js.native
      
      /* 8 */ val hidden: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden & Double = js.native
      
      /* 9 */ val incoming: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming & Double = js.native
      
      /* 10 */ val outgoing: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing & Double = js.native
      
      /* 11 */ val outline: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline & Double = js.native
      
      /* 0 */ val primary: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary & Double = js.native
      
      /* 12 */ val remaining: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining & Double = js.native
      
      /* 13 */ val revealed: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed & Double = js.native
      
      /* 14 */ val rowIn: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn & Double = js.native
      
      /* 15 */ val rowOut: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut & Double = js.native
      
      /* 16 */ val selected: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected & Double = js.native
      
      /* 17 */ val selection: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection & Double = js.native
      
      /* 18 */ val shown: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown & Double = js.native
      
      /* 19 */ val tapped: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.OpacityAnimation")
    @js.native
    open class OpacityAnimation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.OpacityAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var finalOpacity: Double = js.native
      
      /* CompleteClass */
      var initialOpacity: Double = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimation")
    @js.native
    open class PropertyAnimation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
    @js.native
    object PropertyAnimationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType & Double
          ] = js.native
      
      /* 2 */ val opacity: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity & Double = js.native
      
      /* 0 */ val scale: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale & Double = js.native
      
      /* 1 */ val translation: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.ScaleAnimation")
    @js.native
    open class ScaleAnimation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.ScaleAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var finalScaleX: Double = js.native
      
      /* CompleteClass */
      var finalScaleY: Double = js.native
      
      /* CompleteClass */
      var initialScaleX: Double = js.native
      
      /* CompleteClass */
      var initialScaleY: Double = js.native
      
      /* CompleteClass */
      var normalizedOrigin: Point = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.TranslationAnimation")
    @js.native
    open class TranslationAnimation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.TranslationAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
  }
  
  @JSGlobal("Windows.UI.Core.AutomationProviderRequestedEventArgs")
  @js.native
  open class AutomationProviderRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.AutomationProviderRequestedEventArgs {
    
    /* CompleteClass */
    var automationProvider: Any = js.native
    
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CharacterReceivedEventArgs")
  @js.native
  open class CharacterReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CharacterReceivedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyCode: Double = js.native
    
    /* CompleteClass */
    var keyStatus: CorePhysicalKeyStatus = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreAcceleratorKeyEventType")
  @js.native
  object CoreAcceleratorKeyEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType & Double] = js.native
    
    /* 0 */ val character: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.character & Double = js.native
    
    /* 1 */ val deadCharacter: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.deadCharacter & Double = js.native
    
    /* 2 */ val keyDown: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.keyDown & Double = js.native
    
    /* 3 */ val keyUp: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.keyUp & Double = js.native
    
    /* 4 */ val systemCharacter: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemCharacter & Double = js.native
    
    /* 5 */ val systemDeadCharacter: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemDeadCharacter & Double = js.native
    
    /* 6 */ val systemKeyDown: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemKeyDown & Double = js.native
    
    /* 7 */ val systemKeyUp: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemKeyUp & Double = js.native
    
    /* 8 */ val unicodeCharacter: typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.unicodeCharacter & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreAcceleratorKeys")
  @js.native
  open class CoreAcceleratorKeys ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreAcceleratorKeys {
    
    /* CompleteClass */
    var onacceleratorkeyactivated: Any = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreCursor")
  @js.native
  open class CoreCursor protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreCursor {
    def this(`type`: CoreCursorType, id: Double) = this()
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var `type`: CoreCursorType = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreCursorType")
  @js.native
  object CoreCursorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType & Double] = js.native
    
    /* 0 */ val arrow: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.arrow & Double = js.native
    
    /* 1 */ val cross: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.cross & Double = js.native
    
    /* 2 */ val custom: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.custom & Double = js.native
    
    /* 3 */ val hand: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.hand & Double = js.native
    
    /* 4 */ val help: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.help & Double = js.native
    
    /* 5 */ val iBeam: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.iBeam & Double = js.native
    
    /* 6 */ val sizeAll: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.sizeAll & Double = js.native
    
    /* 8 */ val sizeNorthSouth: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.sizeNorthSouth & Double = js.native
    
    /* 7 */ val sizeNortheastSouthwest: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.sizeNortheastSouthwest & Double = js.native
    
    /* 9 */ val sizeNorthwestSoutheast: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.sizeNorthwestSoutheast & Double = js.native
    
    /* 10 */ val sizeWestEast: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.sizeWestEast & Double = js.native
    
    /* 11 */ val universalNo: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.universalNo & Double = js.native
    
    /* 12 */ val upArrow: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType.upArrow & Double = js.native
    
    /* 13 */ @JSName("wait")
    val wait_ : wait & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreDispatcher")
  @js.native
  open class CoreDispatcher ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcher {
    
    /* CompleteClass */
    var hasThreadAccess: Boolean = js.native
    
    /* CompleteClass */
    var onacceleratorkeyactivated: Any = js.native
    
    /* CompleteClass */
    override def processEvents(options: CoreProcessEventsOption): Unit = js.native
    
    /* CompleteClass */
    override def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction = js.native
    
    /* CompleteClass */
    override def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
  @js.native
  object CoreDispatcherPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcherPriority & Double] = js.native
    
    /* 2 */ val high: typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcherPriority.high & Double = js.native
    
    /* 0 */ val low: typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcherPriority.low & Double = js.native
    
    /* 1 */ val normal: typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcherPriority.normal & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreProcessEventsOption")
  @js.native
  object CoreProcessEventsOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption & Double] = js.native
    
    /* 3 */ val processAllIfPresent: typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption.processAllIfPresent & Double = js.native
    
    /* 0 */ val processOneAndAllPending: typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneAndAllPending & Double = js.native
    
    /* 1 */ val processOneIfPresent: typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneIfPresent & Double = js.native
    
    /* 2 */ val processUntilQuit: typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption.processUntilQuit & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreProximityEvaluationScore")
  @js.native
  object CoreProximityEvaluationScore extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreProximityEvaluationScore & Double] = js.native
    
    /* 0 */ val closest: typingsJapgolly.winrt.Windows.UI.Core.CoreProximityEvaluationScore.closest & Double = js.native
    
    /* 1 */ val farthest: typingsJapgolly.winrt.Windows.UI.Core.CoreProximityEvaluationScore.farthest & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
  @js.native
  object CoreVirtualKeyStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreVirtualKeyStates & Double] = js.native
    
    /* 1 */ val down: typingsJapgolly.winrt.Windows.UI.Core.CoreVirtualKeyStates.down & Double = js.native
    
    /* 2 */ val locked: typingsJapgolly.winrt.Windows.UI.Core.CoreVirtualKeyStates.locked & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Core.CoreVirtualKeyStates.none & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindow")
  @js.native
  open class CoreWindow ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreWindow {
    
    /* CompleteClass */
    override def activate(): Unit = js.native
    
    /* CompleteClass */
    var automationHostProvider: Any = js.native
    
    /* CompleteClass */
    var bounds: Rect = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var customProperties: IPropertySet = js.native
    
    /* CompleteClass */
    var dispatcher: typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcher = js.native
    
    /* CompleteClass */
    var flowDirection: CoreWindowFlowDirection = js.native
    
    /* CompleteClass */
    override def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
    
    /* CompleteClass */
    override def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
    
    /* CompleteClass */
    var isInputEnabled: Boolean = js.native
    
    /* CompleteClass */
    var onactivated: Any = js.native
    
    /* CompleteClass */
    var onautomationproviderrequested: Any = js.native
    
    /* CompleteClass */
    var oncharacterreceived: Any = js.native
    
    /* CompleteClass */
    var onclosed: Any = js.native
    
    /* CompleteClass */
    var oninputenabled: Any = js.native
    
    /* CompleteClass */
    var onkeydown: Any = js.native
    
    /* CompleteClass */
    var onkeyup: Any = js.native
    
    /* CompleteClass */
    var onpointercapturelost: Any = js.native
    
    /* CompleteClass */
    var onpointerentered: Any = js.native
    
    /* CompleteClass */
    var onpointerexited: Any = js.native
    
    /* CompleteClass */
    var onpointermoved: Any = js.native
    
    /* CompleteClass */
    var onpointerpressed: Any = js.native
    
    /* CompleteClass */
    var onpointerreleased: Any = js.native
    
    /* CompleteClass */
    var onpointerwheelchanged: Any = js.native
    
    /* CompleteClass */
    var onsizechanged: Any = js.native
    
    /* CompleteClass */
    var ontouchhittesting: Any = js.native
    
    /* CompleteClass */
    var onvisibilitychanged: Any = js.native
    
    /* CompleteClass */
    var pointerCursor: typingsJapgolly.winrt.Windows.UI.Core.CoreCursor = js.native
    
    /* CompleteClass */
    var pointerPosition: Point = js.native
    
    /* CompleteClass */
    override def releasePointerCapture(): Unit = js.native
    
    /* CompleteClass */
    override def setPointerCapture(): Unit = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  /* static members */
  object CoreWindow {
    
    @JSGlobal("Windows.UI.Core.CoreWindow")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentThread(): typingsJapgolly.winrt.Windows.UI.Core.CoreWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentThread")().asInstanceOf[typingsJapgolly.winrt.Windows.UI.Core.CoreWindow]
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowActivationState")
  @js.native
  object CoreWindowActivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreWindowActivationState & Double] = js.native
    
    /* 0 */ val codeActivated: typingsJapgolly.winrt.Windows.UI.Core.CoreWindowActivationState.codeActivated & Double = js.native
    
    /* 1 */ val deactivated: typingsJapgolly.winrt.Windows.UI.Core.CoreWindowActivationState.deactivated & Double = js.native
    
    /* 2 */ val pointerActivated: typingsJapgolly.winrt.Windows.UI.Core.CoreWindowActivationState.pointerActivated & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowDialog")
  @js.native
  open class CoreWindowDialog ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreWindowDialog {
    def this(title: String) = this()
    
    /* CompleteClass */
    override def backButtonCommand(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("backButtonCommand")
    var backButtonCommand_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var cancelCommandIndex: Double = js.native
    
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /* CompleteClass */
    var isInteractionDelayed: Double = js.native
    
    /* CompleteClass */
    var maxSize: Size = js.native
    
    /* CompleteClass */
    var minSize: Size = js.native
    
    /* CompleteClass */
    var onshowing: Any = js.native
    
    /* CompleteClass */
    override def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowEventArgs")
  @js.native
  open class CoreWindowEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreWindowEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
  @js.native
  object CoreWindowFlowDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Core.CoreWindowFlowDirection & Double] = js.native
    
    /* 0 */ val leftToRight: typingsJapgolly.winrt.Windows.UI.Core.CoreWindowFlowDirection.leftToRight & Double = js.native
    
    /* 1 */ val rightToLeft: typingsJapgolly.winrt.Windows.UI.Core.CoreWindowFlowDirection.rightToLeft & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowFlyout")
  @js.native
  open class CoreWindowFlyout protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreWindowFlyout {
    def this(position: Point) = this()
    def this(position: Point, title: String) = this()
    
    /* CompleteClass */
    override def backButtonCommand(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("backButtonCommand")
    var backButtonCommand_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /* CompleteClass */
    var isInteractionDelayed: Double = js.native
    
    /* CompleteClass */
    var maxSize: Size = js.native
    
    /* CompleteClass */
    var minSize: Size = js.native
    
    /* CompleteClass */
    var onshowing: Any = js.native
    
    /* CompleteClass */
    override def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowPopupShowingEventArgs")
  @js.native
  open class CoreWindowPopupShowingEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreWindowPopupShowingEventArgs {
    
    /* CompleteClass */
    override def setDesiredSize(value: Size): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowResizeManager")
  @js.native
  open class CoreWindowResizeManager ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.CoreWindowResizeManager {
    
    /* CompleteClass */
    override def notifyLayoutCompleted(): Unit = js.native
  }
  /* static members */
  object CoreWindowResizeManager {
    
    @JSGlobal("Windows.UI.Core.CoreWindowResizeManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typingsJapgolly.winrt.Windows.UI.Core.CoreWindowResizeManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.UI.Core.CoreWindowResizeManager]
  }
  
  @JSGlobal("Windows.UI.Core.IdleDispatchedHandlerArgs")
  @js.native
  open class IdleDispatchedHandlerArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.IdleDispatchedHandlerArgs {
    
    /* CompleteClass */
    var isDispatcherIdle: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.InputEnabledEventArgs")
  @js.native
  open class InputEnabledEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.InputEnabledEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var inputEnabled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.KeyEventArgs")
  @js.native
  open class KeyEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.KeyEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyStatus: CorePhysicalKeyStatus = js.native
    
    /* CompleteClass */
    var virtualKey: VirtualKey = js.native
  }
  
  @JSGlobal("Windows.UI.Core.PointerEventArgs")
  @js.native
  open class PointerEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.PointerEventArgs {
    
    /* CompleteClass */
    var currentPoint: PointerPoint = js.native
    
    /* CompleteClass */
    override def getIntermediatePoints(): IVector[PointerPoint] = js.native
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyModifiers: VirtualKeyModifiers = js.native
  }
  
  @JSGlobal("Windows.UI.Core.TouchHitTestingEventArgs")
  @js.native
  open class TouchHitTestingEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.TouchHitTestingEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.VisibilityChangedEventArgs")
  @js.native
  open class VisibilityChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.VisibilityChangedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.WindowActivatedEventArgs")
  @js.native
  open class WindowActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.WindowActivatedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var windowActivationState: CoreWindowActivationState = js.native
  }
  
  @JSGlobal("Windows.UI.Core.WindowSizeChangedEventArgs")
  @js.native
  open class WindowSizeChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Core.WindowSizeChangedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var size: Size = js.native
  }
}
