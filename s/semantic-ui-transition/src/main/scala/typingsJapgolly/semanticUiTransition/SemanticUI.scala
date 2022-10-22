package typingsJapgolly.semanticUiTransition

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ClassNameSettings.Param
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typingsJapgolly.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`clear queue`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`force repaint`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`get animation event`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`get animation name`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is animating`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is looping`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is supported`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is visible`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`remove looping`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`restore conditions`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`save conditions`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`set duration`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`stop all`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.auto
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.destroy
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.disable
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.enable
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.hide
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.looping
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.repaint
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.reset
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.setting
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.show
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.stop
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Transition extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears all queued animations
      */
    def apply(behavior: `clear queue`): JQuery = js.native
    /**
      * Forces reflow using a more expensive but stable method
      */
    def apply(behavior: `force repaint`): JQuery = js.native
    /**
      * Returns vendor prefixed animation property for animationend
      */
    def apply(behavior: `get animation event`): String = js.native
    /**
      * Returns vendor prefixed animation property for animationname
      */
    def apply(behavior: `get animation name`): String = js.native
    /**
      * Returns whether transition is currently occurring
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Returns whether animation looping is set
      */
    def apply(behavior: `is looping`): Boolean = js.native
    /**
      * Returns whether animations are supported
      */
    def apply(behavior: `is supported`): Boolean = js.native
    /**
      * Returns whether element is currently visible
      */
    def apply(behavior: `is visible`): Boolean = js.native
    /**
      * Removes looping state from element
      */
    def apply(behavior: `remove looping`): JQuery = js.native
    /**
      * Adds back cached names and styles to element
      */
    def apply(behavior: `restore conditions`): JQuery = js.native
    /**
      * Saves all class names and styles to cache to be retrieved after animation
      */
    def apply(behavior: `save conditions`): JQuery = js.native
    /**
      * Modifies element animation duration
      */
    def apply(behavior: `set duration`, duration: Double): JQuery = js.native
    /**
      * Stop current animation and queued animations
      */
    def apply(behavior: `stop all`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Adds disabled state (stops ability to animate)
      */
    def apply(behavior: disable): JQuery = js.native
    /**
      * Removes disabled state
      */
    def apply(behavior: enable): JQuery = js.native
    /**
      * Stop current animation and hide element
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Enables animation looping
      */
    def apply(behavior: looping): JQuery = js.native
    /**
      * Triggers reflow on element
      */
    def apply(behavior: repaint): JQuery = js.native
    /**
      * Resets all conditions changes during transition
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, value: TransitionSettings): JQuery = js.native
    /**
      * Stop current animation and show element
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Stop current animation and preserve queue
      */
    def apply(behavior: stop): JQuery = js.native
    /**
      * Toggles between hide and show
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: TransitionSettings): JQuery = js.native
    def apply(transition: String): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-transition.SemanticUI.TransitionSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-transition.SemanticUI.TransitionSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any = js.native
    
    var settings: TransitionSettings = js.native
  }
  object Transition {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'animating'
          */
        var animating: String
        
        /**
          * @default 'disabled'
          */
        var disabled: String
        
        /**
          * @default 'hidden'
          */
        var hidden: String
        
        /**
          * @default 'in'
          */
        var inward: String
        
        /**
          * @default 'loading'
          */
        var loading: String
        
        /**
          * @default 'looping'
          */
        var looping: String
        
        /**
          * @default 'out'
          */
        var outward: String
        
        /**
          * @default 'transition'
          */
        var transition: String
        
        /**
          * @default 'visible'
          */
        var visible: String
      }
      object Impl {
        
        inline def apply(
          animating: String,
          disabled: String,
          hidden: String,
          inward: String,
          loading: String,
          looping: String,
          outward: String,
          transition: String,
          visible: String
        ): Impl = {
          val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inward = inward.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], outward = outward.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          inline def setInward(value: String): Self = StObject.set(x, "inward", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
          
          inline def setLooping(value: String): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
          
          inline def setOutward(value: String): Self = StObject.set(x, "outward", value.asInstanceOf[js.Any])
          
          inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
          
          inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiTransition.anon.PickImplanimatingPartialP
        - typingsJapgolly.semanticUiTransition.anon.PickImpldisabledPartialPi
        - typingsJapgolly.semanticUiTransition.anon.PickImplhiddenPartialPick
        - typingsJapgolly.semanticUiTransition.anon.PickImplinwardPartialPick
        - typingsJapgolly.semanticUiTransition.anon.PickImplloadingPartialPic
        - typingsJapgolly.semanticUiTransition.anon.PickImplloopingPartialPic
        - typingsJapgolly.semanticUiTransition.anon.PickImploutwardPartialPic
        - typingsJapgolly.semanticUiTransition.anon.PickImpltransitionPartial
        - typingsJapgolly.semanticUiTransition.anon.PickImplvisiblePartialPic
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplanimatingPartialP(animating: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplanimatingPartialP = {
          val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplanimatingPartialP]
        }
        
        inline def PickImpldisabledPartialPi(disabled: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImpldisabledPartialPi = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImpldisabledPartialPi]
        }
        
        inline def PickImplhiddenPartialPick(hidden: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplhiddenPartialPick = {
          val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplhiddenPartialPick]
        }
        
        inline def PickImplinwardPartialPick(inward: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplinwardPartialPick = {
          val __obj = js.Dynamic.literal(inward = inward.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplinwardPartialPick]
        }
        
        inline def PickImplloadingPartialPic(loading: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplloadingPartialPic = {
          val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplloadingPartialPic]
        }
        
        inline def PickImplloopingPartialPic(looping: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplloopingPartialPic = {
          val __obj = js.Dynamic.literal(looping = looping.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplloopingPartialPic]
        }
        
        inline def PickImploutwardPartialPic(outward: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImploutwardPartialPic = {
          val __obj = js.Dynamic.literal(outward = outward.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImploutwardPartialPic]
        }
        
        inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImpltransitionPartial = {
          val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImpltransitionPartial]
        }
        
        inline def PickImplvisiblePartialPic(visible: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplvisiblePartialPic = {
          val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplvisiblePartialPic]
        }
      }
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String
        
        /**
          * @default 'There is no CSS animation matching the one you specified.'
          */
        var noAnimation: String
      }
      object Impl {
        
        inline def apply(method: String, noAnimation: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noAnimation = noAnimation.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiTransition.anon.PickImplnoAnimationPartia
        - typingsJapgolly.semanticUiTransition.anon.PickImplmethodPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplmethodPartialPick = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplmethodPartialPick]
        }
        
        inline def PickImplnoAnimationPartia(noAnimation: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplnoAnimationPartia = {
          val __obj = js.Dynamic.literal(noAnimation = noAnimation.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplnoAnimationPartia]
        }
      }
    }
    type ErrorSettings = typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ErrorSettings.Param
  }
  
  object TransitionSettings {
    
    trait Impl extends StObject {
      
      /**
        * If enabled will allow same animation to be queued while it is already occurring
        */
      var allowRepeats: Boolean
      
      // region Transition Settings
      /**
        * Named animation event to used. Must be defined in CSS.
        *
        * @default 'fade'
        */
      var animation: String
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
        *
        * @default false
        */
      var displayType: `false` | String
      
      /**
        * Duration of the CSS transition animation
        *
        * @default 500
        */
      var duration: Double
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Interval in MS between each elements transition
        *
        * @default 0
        */
      var interval: Double
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      /**
        * Callback on each transition complete
        */
      def onComplete(): Unit
      
      /**
        * Callback on each transition that changes visibility to hidden
        */
      def onHide(): Unit
      
      // endregion
      // region Callbacks
      /**
        * Callback on each transition that changes visibility to shown
        */
      def onShow(): Unit
      
      /**
        * Callback on animation start, useful for queued animations
        */
      def onStart(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      /**
        * Whether to automatically queue animation if another is occurring
        */
      var queue: Boolean
      
      /**
        * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
        *
        * @default 'auto'
        */
      var reverse: auto | Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
        */
      var useFailSafe: Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        allowRepeats: Boolean,
        animation: String,
        className: ClassNameSettings,
        debug: Boolean,
        displayType: `false` | String,
        duration: Double,
        error: ErrorSettings,
        interval: Double,
        name: String,
        namespace: String,
        onComplete: Callback,
        onHide: Callback,
        onShow: Callback,
        onStart: Callback,
        performance: Boolean,
        queue: Boolean,
        reverse: auto | Boolean,
        silent: Boolean,
        useFailSafe: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onComplete = onComplete.toJsFn, onHide = onHide.toJsFn, onShow = onShow.toJsFn, onStart = onStart.toJsFn, performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], useFailSafe = useFailSafe.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAllowRepeats(value: Boolean): Self = StObject.set(x, "allowRepeats", value.asInstanceOf[js.Any])
        
        inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDisplayType(value: `false` | String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
        
        inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
        
        inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
        
        inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
        
        inline def setReverse(value: auto | Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setUseFailSafe(value: Boolean): Self = StObject.set(x, "useFailSafe", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiTransition.anon.PickImplanimationPartialP
      - typingsJapgolly.semanticUiTransition.anon.PickImplintervalPartialPi
      - typingsJapgolly.semanticUiTransition.anon.PickImplreversePartialPic
      - typingsJapgolly.semanticUiTransition.anon.PickImpldisplayTypePartia
      - typingsJapgolly.semanticUiTransition.anon.PickImpldurationPartialPi
      - typingsJapgolly.semanticUiTransition.anon.PickImpluseFailSafePartia
      - typingsJapgolly.semanticUiTransition.anon.PickImplallowRepeatsParti
      - typingsJapgolly.semanticUiTransition.anon.PickImplqueuePartialPickI
      - typingsJapgolly.semanticUiTransition.anon.PickImplonShowPartialPick
      - typingsJapgolly.semanticUiTransition.anon.PickImplonHidePartialPick
      - typingsJapgolly.semanticUiTransition.anon.PickImplonStartPartialPic
      - typingsJapgolly.semanticUiTransition.anon.PickImplonCompletePartial
      - typingsJapgolly.semanticUiTransition.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiTransition.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiTransition.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiTransition.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiTransition.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiTransition.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiTransition.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiTransition.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplallowRepeatsParti(allowRepeats: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImplallowRepeatsParti = {
        val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplallowRepeatsParti]
      }
      
      inline def PickImplanimationPartialP(animation: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplanimationPartialP = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplanimationPartialP]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiTransition.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldisplayTypePartia(displayType: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiTransition.anon.PickImpldisplayTypePartia = {
        val __obj = js.Dynamic.literal(displayType = displayType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImpldisplayTypePartia]
      }
      
      inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiTransition.anon.PickImpldurationPartialPi = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImpldurationPartialPi]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiTransition.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplintervalPartialPi(interval: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiTransition.anon.PickImplintervalPartialPi = {
        val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplintervalPartialPi]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiTransition.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonCompletePartial(
        onComplete: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiTransition.anon.PickImplonCompletePartial = {
        val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplonCompletePartial]
      }
      
      inline def PickImplonHidePartialPick(
        onHide: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiTransition.anon.PickImplonHidePartialPick = {
        val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplonHidePartialPick]
      }
      
      inline def PickImplonShowPartialPick(
        onShow: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiTransition.anon.PickImplonShowPartialPick = {
        val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplonShowPartialPick]
      }
      
      inline def PickImplonStartPartialPic(
        onStart: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiTransition.anon.PickImplonStartPartialPic = {
        val __obj = js.Dynamic.literal(onStart = onStart.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplonStartPartialPic]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplperformancePartia]
      }
      
      inline def PickImplqueuePartialPickI(queue: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImplqueuePartialPickI = {
        val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplqueuePartialPickI]
      }
      
      inline def PickImplreversePartialPic(reverse: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiTransition.anon.PickImplreversePartialPic = {
        val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplreversePartialPic]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImpluseFailSafePartia(useFailSafe: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImpluseFailSafePartia = {
        val __obj = js.Dynamic.literal(useFailSafe = useFailSafe.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImpluseFailSafePartia]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTransition.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiTransition.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/transition.html#/settings}
    */
  type TransitionSettings = typingsJapgolly.semanticUiTransition.SemanticUI.TransitionSettings.Param
}
