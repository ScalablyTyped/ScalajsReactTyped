package typingsJapgolly.winrtUwp.global.Windows.UI

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.IPropertyAnimation
import typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /** The classes and their properties that are exposed through this namespace retrieve the raw scaling, translation, and opacity parameters used in Windows animations. These parameters include such metrics as the animation type, stagger delay, z-order, duration, initial and final opacity, initial and final scale factors, and cubic Bezier control points, among others. This information enables developers of apps and application frameworks to create custom animations that are consistent with both Windows itself and with other apps that use Windows animations. */
  object AnimationMetrics {
    
    /** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
    @js.native
    open class AnimationDescription protected ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      /**
        * Creates an AnimationDescription object with a specific animation and target.
        * @param effect The animation effect to apply to the target.
        * @param target The target of the animation effect.
        */
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
      
      /** Gets the collection of animations that are associated with the AnimationDescription object. */
      /* CompleteClass */
      var animations: IVectorView[IPropertyAnimation] = js.native
      
      /** Gets the maximum cumulative delay time for the animation to be applied to the collection of objects in a target. */
      /* CompleteClass */
      var delayLimit: Double = js.native
      
      /** Gets the amount of time between the application of the animation effect to each object in a target that contains multiple objects. The StaggerDelay, together with the StaggerDelayFactor and DelayLimit, is one of the three elements used to control the relative timing of the animation effects. */
      /* CompleteClass */
      var staggerDelay: Double = js.native
      
      /** Gets a multiplier that is applied to each occurrence of the stagger delay, increasing or decreasing the previous delay instance by that amount. */
      /* CompleteClass */
      var staggerDelayFactor: Double = js.native
      
      /** Gets the z-order position of an AnimationDescription object relative to other AnimationDescription objects in the same animation effect. AnimationDescription objects with a higher z-order cover transitions with a lower z-order. */
      /* CompleteClass */
      var zorder: Double = js.native
    }
    
    /** Specifies an animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
    @js.native
    object AnimationEffect extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect & Double
          ] = js.native
      
      /* 7 */ val addToGrid: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid & Double = js.native
      
      /* 5 */ val addToList: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList & Double = js.native
      
      /* 9 */ val addToSearchGrid: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid & Double = js.native
      
      /* 11 */ val addToSearchList: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList & Double = js.native
      
      /* 1 */ val collapse: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse & Double = js.native
      
      /* 33 */ val crossFade: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade & Double = js.native
      
      /* 8 */ val deleteFromGrid: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid & Double = js.native
      
      /* 6 */ val deleteFromList: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList & Double = js.native
      
      /* 10 */ val deleteFromSearchGrid: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid & Double = js.native
      
      /* 12 */ val deleteFromSearchList: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList & Double = js.native
      
      /* 26 */ val dragBetweenEnter: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter & Double = js.native
      
      /* 27 */ val dragBetweenLeave: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave & Double = js.native
      
      /* 22 */ val dragSourceEnd: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd & Double = js.native
      
      /* 21 */ val dragSourceStart: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart & Double = js.native
      
      /* 31 */ val enterPage: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage & Double = js.native
      
      /* 0 */ val expand: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand & Double = js.native
      
      /* 3 */ val fadeIn: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn & Double = js.native
      
      /* 4 */ val fadeOut: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut & Double = js.native
      
      /* 25 */ val hide: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide & Double = js.native
      
      /* 15 */ val hideEdgeUI: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI & Double = js.native
      
      /* 16 */ val hidePanel: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel & Double = js.native
      
      /* 18 */ val hidePopup: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup & Double = js.native
      
      /* 34 */ val peek: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek & Double = js.native
      
      /* 19 */ val pointerDown: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown & Double = js.native
      
      /* 20 */ val pointerUp: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp & Double = js.native
      
      /* 2 */ val reposition: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition & Double = js.native
      
      /* 24 */ val reveal: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal & Double = js.native
      
      /* 13 */ val showEdgeUI: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI & Double = js.native
      
      /* 14 */ val showPanel: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel & Double = js.native
      
      /* 17 */ val showPopup: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup & Double = js.native
      
      /* 29 */ val swipeDeselect: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect & Double = js.native
      
      /* 30 */ val swipeReveal: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal & Double = js.native
      
      /* 28 */ val swipeSelect: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect & Double = js.native
      
      /* 23 */ val transitionContent: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent & Double = js.native
      
      /* 32 */ val transitionPage: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage & Double = js.native
      
      /* 35 */ val updateBadge: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge & Double = js.native
    }
    
    /** Specifies a participant in an animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
    @js.native
    object AnimationEffectTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget & Double
          ] = js.native
      
      /* 1 */ val added: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added & Double = js.native
      
      /* 2 */ val affected: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected & Double = js.native
      
      /* 3 */ val background: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background & Double = js.native
      
      /* 4 */ val content: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content & Double = js.native
      
      /* 5 */ val deleted: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted & Double = js.native
      
      /* 6 */ val deselected: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected & Double = js.native
      
      /* 7 */ val dragSource: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource & Double = js.native
      
      /* 8 */ val hidden: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden & Double = js.native
      
      /* 9 */ val incoming: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming & Double = js.native
      
      /* 10 */ val outgoing: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing & Double = js.native
      
      /* 11 */ val outline: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline & Double = js.native
      
      /* 0 */ val primary: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary & Double = js.native
      
      /* 12 */ val remaining: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining & Double = js.native
      
      /* 13 */ val revealed: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed & Double = js.native
      
      /* 14 */ val rowIn: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn & Double = js.native
      
      /* 15 */ val rowOut: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut & Double = js.native
      
      /* 16 */ val selected: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected & Double = js.native
      
      /* 17 */ val selection: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection & Double = js.native
      
      /* 18 */ val shown: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown & Double = js.native
      
      /* 19 */ val tapped: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped & Double = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
    /* note: abstract class */ @JSGlobal("Windows.UI.Core.AnimationMetrics.OpacityAnimation")
    @js.native
    open class OpacityAnimation ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.OpacityAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the object's final opacity. */
      /* CompleteClass */
      var finalOpacity: Double = js.native
      
      /** Gets the object's initial opacity. */
      /* CompleteClass */
      var initialOpacity: Double = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    /** Provides methods that enable you to retrieve animation property values that are common to all property animation types . */
    /* note: abstract class */ @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimation")
    @js.native
    open class PropertyAnimation ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    /** Specifies the animation type represented by a PropertyAnimation object. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
    @js.native
    object PropertyAnimationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType & Double
          ] = js.native
      
      /* 2 */ val opacity: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity & Double = js.native
      
      /* 0 */ val scale: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale & Double = js.native
      
      /* 1 */ val translation: typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation & Double = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters for a scaling (growing or shrinking) animation. */
    /* note: abstract class */ @JSGlobal("Windows.UI.Core.AnimationMetrics.ScaleAnimation")
    @js.native
    open class ScaleAnimation ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.ScaleAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how the scale should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how the scale should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the scale animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the scale animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the final horizontal scale factor for the object. */
      /* CompleteClass */
      var finalScaleX: Double = js.native
      
      /** Gets the final vertical scale factor for the object. */
      /* CompleteClass */
      var finalScaleY: Double = js.native
      
      /** Gets the initial horizontal scale factor for the object. */
      /* CompleteClass */
      var initialScaleX: Double = js.native
      
      /** Gets the initial vertical scale factor for the object. */
      /* CompleteClass */
      var initialScaleY: Double = js.native
      
      /** Gets the center point for the scaling animation, expressed as a point relative to the object's normal size. */
      /* CompleteClass */
      var normalizedOrigin: Point = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters for a translation (move to a new location) animation. */
    /* note: abstract class */ @JSGlobal("Windows.UI.Core.AnimationMetrics.TranslationAnimation")
    @js.native
    open class TranslationAnimation ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics.TranslationAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how the translation should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how the translation should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the translation animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the translation animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
  }
  
  /** Defines constants that specify whether the back button is shown in the system UI. */
  @JSGlobal("Windows.UI.Core.AppViewBackButtonVisibility")
  @js.native
  object AppViewBackButtonVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility & Double] = js.native
    
    /* 1 */ val collapsed: typingsJapgolly.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.collapsed & Double = js.native
    
    /* 0 */ val visible: typingsJapgolly.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.visible & Double = js.native
  }
  
  /** Provides event data for the SystemNavigationManager.BackRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Core.BackRequestedEventArgs")
  @js.native
  open class BackRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Core.BackRequestedEventArgs {
    
    /** Gets or sets a value that indicates whether the app performed the requested back-navigation. */
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  /** Provides a way for an app to respond to system provided back-navigation events. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Core.SystemNavigationManager")
  @js.native
  open class SystemNavigationManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Core.SystemNavigationManager
  object SystemNavigationManager {
    
    @JSGlobal("Windows.UI.Core.SystemNavigationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the SystemNavigationManager object associated with the current window.
      * @return The SystemNavigationManager object associated with the current window.
      */
    /* static member */
    inline def getForCurrentView(): typingsJapgolly.winrtUwp.Windows.UI.Core.SystemNavigationManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.UI.Core.SystemNavigationManager]
  }
}
