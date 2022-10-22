package typingsJapgolly.semanticUiShape

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ClassNameSettings.Param
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.Translation
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip back`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip down`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip left`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip over`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip right`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip up`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`is animating`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`set default side`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`set next side`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.destroy
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.initial
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.next
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.queue
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.refresh
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.repaint
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.reset
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Shape extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Flips the shape over counter-clockwise
      */
    def apply(behavior: `flip back`): JQuery = js.native
    /**
      * Flips the shape downward
      */
    def apply(behavior: `flip down`): JQuery = js.native
    /**
      * Flips the shape left
      */
    def apply(behavior: `flip left`): JQuery = js.native
    /**
      * Flips the shape over clock-wise
      */
    def apply(behavior: `flip over`): JQuery = js.native
    /**
      * Flips the shape right
      */
    def apply(behavior: `flip right`): JQuery = js.native
    /**
      * Flips the shape upward
      */
    def apply(behavior: `flip up`): JQuery = js.native
    /**
      * Returns translation for next side staged below
      */
    def apply(behavior: `get transform down`): Translation = js.native
    /**
      * Returns translation for next side staged left
      */
    def apply(behavior: `get transform left`): Translation = js.native
    /**
      * Returns translation for next side staged right
      */
    def apply(behavior: `get transform right`): Translation = js.native
    /**
      * Returns translation for next side staged up
      */
    def apply(behavior: `get transform up`): Translation = js.native
    /**
      * Returns whether shape is currently animating
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Set the next side to next sibling to active element
      */
    def apply(behavior: `set default side`): JQuery = js.native
    /**
      * Set the next side to a specific selector
      */
    def apply(behavior: `set next side`, selector: String): JQuery = js.native
    def apply(behavior: `set next side`, selector: JQuery): JQuery = js.native
    /**
      * Sets shape to the content size of the next side
      */
    def apply(behavior: `set stage size`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Queues an animation until after current animation
      */
    def apply(behavior: queue, animation: String): JQuery = js.native
    /**
      * Refreshes the selector cache for element sides
      */
    def apply(behavior: refresh): JQuery = js.native
    /**
      * Forces a reflow on element
      */
    def apply(behavior: repaint): JQuery = js.native
    /**
      * Removes all inline styles
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
    def apply(settings: ShapeSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-shape.SemanticUI.ShapeSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-shape.SemanticUI.ShapeSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any = js.native
    
    var settings: ShapeSettings = js.native
  }
  object Shape {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'animating'
          */
        var animating: String
        
        /**
          * @default 'hidden'
          */
        var hidden: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(active: String, animating: String, hidden: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiShape.anon.PickImplanimatingPartialP
        - typingsJapgolly.semanticUiShape.anon.PickImplhiddenPartialPick
        - typingsJapgolly.semanticUiShape.anon.PickImplloadingPartialPic
        - typingsJapgolly.semanticUiShape.anon.PickImplactivePartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplactivePartialPick = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplactivePartialPick]
        }
        
        inline def PickImplanimatingPartialP(animating: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplanimatingPartialP = {
          val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplanimatingPartialP]
        }
        
        inline def PickImplhiddenPartialPick(hidden: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplhiddenPartialPick = {
          val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplhiddenPartialPick]
        }
        
        inline def PickImplloadingPartialPic(loading: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplloadingPartialPic = {
          val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplloadingPartialPic]
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
          * @default 'You tried to switch to a side that does not exist.'
          */
        var side: String
      }
      object Impl {
        
        inline def apply(method: String, side: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiShape.anon.PickImplsidePartialPickImMethod
        - typingsJapgolly.semanticUiShape.anon.PickImplmethodPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplmethodPartialPick = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplmethodPartialPick]
        }
        
        inline def PickImplsidePartialPickImMethod(side: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplsidePartialPickImMethod = {
          val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplsidePartialPickImMethod]
        }
      }
    }
    type ErrorSettings = typingsJapgolly.semanticUiShape.SemanticUI.Shape.ErrorSettings.Param
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.side'
          */
        var side: String
        
        /**
          * @default '.sides'
          */
        var sides: String
      }
      object Impl {
        
        inline def apply(side: String, sides: String): Impl = {
          val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
          
          inline def setSides(value: String): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiShape.anon.PickImplsidesPartialPickI
        - typingsJapgolly.semanticUiShape.anon.PickImplsidePartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplsidePartialPickIm(side: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplsidePartialPickIm = {
          val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplsidePartialPickIm]
        }
        
        inline def PickImplsidesPartialPickI(sides: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplsidesPartialPickI = {
          val __obj = js.Dynamic.literal(sides = sides.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplsidesPartialPickI]
        }
      }
    }
    type SelectorSettings = typingsJapgolly.semanticUiShape.SemanticUI.Shape.SelectorSettings.Param
    
    trait Translation extends StObject {
      
      var transform: String
    }
    object Translation {
      
      inline def apply(transform: String): Translation = {
        val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
        __obj.asInstanceOf[Translation]
      }
      
      extension [Self <: Translation](x: Self) {
        
        inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object ShapeSettings {
    
    trait Impl extends StObject {
      
      // endregion
      // region Callbacks
      /**
        * Is called before side change
        */
      def beforeChange(): Unit
      
      var className: ClassNameSettings
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // region Shape Settings
      /**
        * Duration of side change animation
        *
        * @default 700
        */
      var duration: Double
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * When set to next will use the height of the next side during the shape's animation.
        * When set to initial it will use the height of the shape at initialization.
        * When set to a specific pixel height, will force the height to that height.
        *
        * @default 'initial'
        * @since 2.2
        */
      var height: next | initial | Double
      
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
        * Is called after visible side change
        */
      def onChange(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
      
      /**
        * When set to next will use the width of the next side during the shape's animation.
        * When set to initial it will use the width of the shape at initialization.
        * When set to a specific pixel height, will force the width to that height.
        *
        * @default 'initial'
        * @since 2.2
        */
      var width: next | initial | Double
    }
    object Impl {
      
      inline def apply(
        beforeChange: Callback,
        className: ClassNameSettings,
        debug: Boolean,
        duration: Double,
        error: ErrorSettings,
        height: next | initial | Double,
        name: String,
        namespace: String,
        onChange: Callback,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean,
        width: next | initial | Double
      ): Impl = {
        val __obj = js.Dynamic.literal(beforeChange = beforeChange.toJsFn, className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = onChange.toJsFn, performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setBeforeChange(value: Callback): Self = StObject.set(x, "beforeChange", value.toJsFn)
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: next | initial | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: next | initial | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiShape.anon.PickImpldurationPartialPi
      - typingsJapgolly.semanticUiShape.anon.PickImplwidthPartialPickI
      - typingsJapgolly.semanticUiShape.anon.PickImplheightPartialPick
      - typingsJapgolly.semanticUiShape.anon.PickImplbeforeChangeParti
      - typingsJapgolly.semanticUiShape.anon.PickImplonChangePartialPi
      - typingsJapgolly.semanticUiShape.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiShape.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiShape.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiShape.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiShape.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiShape.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiShape.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiShape.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiShape.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbeforeChangeParti(
        beforeChange: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiShape.anon.PickImplbeforeChangeParti = {
        val __obj = js.Dynamic.literal(beforeChange = beforeChange.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplbeforeChangeParti]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiShape.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiShape.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiShape.anon.PickImpldurationPartialPi = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImpldurationPartialPi]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiShape.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplheightPartialPick(height: (next | initial | Double) & (js.UndefOr[next | initial | Double])): typingsJapgolly.semanticUiShape.anon.PickImplheightPartialPick = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplheightPartialPick]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiShape.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonChangePartialPi(
        onChange: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiShape.anon.PickImplonChangePartialPi = {
        val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplonChangePartialPi]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiShape.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiShape.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiShape.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiShape.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplverbosePartialPic]
      }
      
      inline def PickImplwidthPartialPickI(width: (next | initial | Double) & (js.UndefOr[next | initial | Double])): typingsJapgolly.semanticUiShape.anon.PickImplwidthPartialPickI = {
        val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiShape.anon.PickImplwidthPartialPickI]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/shape.html#/settings}
    */
  type ShapeSettings = typingsJapgolly.semanticUiShape.SemanticUI.ShapeSettings.Param
}
