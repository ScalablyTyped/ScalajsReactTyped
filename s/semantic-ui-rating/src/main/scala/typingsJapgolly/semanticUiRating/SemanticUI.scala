package typingsJapgolly.semanticUiRating

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings.Param
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`get rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`set rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.auto
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.destroy
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.disable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.enable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Rating extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears current rating
      */
    def apply(behavior: `clear rating`): JQuery = js.native
    /**
      * Gets current rating
      */
    def apply(behavior: `get rating`): Double = js.native
    /**
      * Sets rating programmatically
      */
    def apply(behavior: `set rating`, rating: Double): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Disables interactive rating mode
      */
    def apply(behavior: disable): JQuery = js.native
    /**
      * Enables interactive rating mode
      */
    def apply(behavior: enable): JQuery = js.native
    def apply(behavior: setting, value: RatingSettings): JQuery = js.native
    def apply(settings: RatingSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-rating.SemanticUI.RatingSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-rating.SemanticUI.RatingSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any = js.native
    
    var settings: RatingSettings = js.native
  }
  object Rating {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'hover'
          */
        var hover: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(active: String, hover: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiRating.anon.PickImplactivePartialPick
        - typingsJapgolly.semanticUiRating.anon.PickImplhoverPartialPickI
        - typingsJapgolly.semanticUiRating.anon.PickImplloadingPartialPic
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.anon.PickImplactivePartialPick = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplactivePartialPick]
        }
        
        inline def PickImplhoverPartialPickI(hover: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.anon.PickImplhoverPartialPickI = {
          val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplhoverPartialPickI]
        }
        
        inline def PickImplloadingPartialPic(loading: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.anon.PickImplloadingPartialPic = {
          val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplloadingPartialPic]
        }
      }
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-rating.SemanticUI.Rating.ErrorSettings.Param */
    trait ErrorSettings extends StObject {
      
      var action: String & js.UndefOr[String]
    }
    object ErrorSettings {
      
      inline def apply(action: String & js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      extension [Self <: ErrorSettings](x: Self) {
        
        inline def setAction(value: String & js.UndefOr[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      }
      
      trait Impl extends StObject {
        
        /**
          * @default 'You called a rating action that was not defined'
          */
        var action: String
      }
      object Impl {
        
        inline def apply(action: String): Impl = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl, 'action'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var action: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(action: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings.Param]
        }
        
        extension [Self <: typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings.Param](x: Self) {
          
          inline def setAction(value: String & js.UndefOr[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /* Inlined semantic-ui-rating.SemanticUI.Rating.SelectorSettings.Param */
    trait SelectorSettings extends StObject {
      
      var icon: String & js.UndefOr[String]
    }
    object SelectorSettings {
      
      inline def apply(icon: String & js.UndefOr[String]): SelectorSettings = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectorSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * @default '.icon'
          */
        var icon: String
      }
      object Impl {
        
        inline def apply(icon: String): Impl = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, 'icon'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl>> */
      trait Param extends StObject {
        
        var icon: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(icon: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings.Param = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings.Param]
        }
        
        extension [Self <: typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings.Param](x: Self) {
          
          inline def setIcon(value: String & js.UndefOr[String]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: SelectorSettings](x: Self) {
        
        inline def setIcon(value: String & js.UndefOr[String]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object RatingSettings {
    
    trait Impl extends StObject {
      
      var className: ClassNameSettings
      
      /**
        * By default a rating will be only clearable if there is 1 icon. Setting to true/false will allow or disallow a user to clear their rating
        *
        * @default 'auto'
        */
      var clearable: auto | Boolean
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether callbacks like onRate should fire immediately after initializing with the current value.
        *
        * @default false
        */
      var fireOnInit: Boolean
      
      // region Rating Settings
      /**
        * A number representing the default rating to apply
        *
        * @default 0
        */
      var initialRating: Double
      
      /**
        * Whether to enable user's ability to rate
        *
        * @default true
        */
      var interactive: Boolean
      
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
      
      // endregion
      // region Callbacks
      /**
        * Is called after user selects a new rating
        */
      def onRate(value: Double): Unit
      
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
    }
    object Impl {
      
      inline def apply(
        className: ClassNameSettings,
        clearable: auto | Boolean,
        debug: Boolean,
        error: ErrorSettings,
        fireOnInit: Boolean,
        initialRating: Double,
        interactive: Boolean,
        name: String,
        namespace: String,
        onRate: Double => Callback,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], initialRating = initialRating.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onRate = js.Any.fromFunction1((t0: Double) => onRate(t0).runNow()), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClearable(value: auto | Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
        
        inline def setInitialRating(value: Double): Self = StObject.set(x, "initialRating", value.asInstanceOf[js.Any])
        
        inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnRate(value: Double => Callback): Self = StObject.set(x, "onRate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiRating.anon.PickImplinitialRatingPart
      - typingsJapgolly.semanticUiRating.anon.PickImplfireOnInitPartial
      - typingsJapgolly.semanticUiRating.anon.PickImplclearablePartialP
      - typingsJapgolly.semanticUiRating.anon.PickImplinteractivePartia
      - typingsJapgolly.semanticUiRating.anon.PickImplonRatePartialPick
      - typingsJapgolly.semanticUiRating.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiRating.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiRating.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiRating.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiRating.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiRating.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiRating.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiRating.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiRating.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiRating.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplclearablePartialP(clearable: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiRating.anon.PickImplclearablePartialP = {
        val __obj = js.Dynamic.literal(clearable = clearable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplclearablePartialP]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiRating.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiRating.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplfireOnInitPartial(fireOnInit: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiRating.anon.PickImplfireOnInitPartial = {
        val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplfireOnInitPartial]
      }
      
      inline def PickImplinitialRatingPart(initialRating: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiRating.anon.PickImplinitialRatingPart = {
        val __obj = js.Dynamic.literal(initialRating = initialRating.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplinitialRatingPart]
      }
      
      inline def PickImplinteractivePartia(interactive: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiRating.anon.PickImplinteractivePartia = {
        val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplinteractivePartia]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiRating.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonRatePartialPick(
        onRate: (js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]])
      ): typingsJapgolly.semanticUiRating.anon.PickImplonRatePartialPick = {
        val __obj = js.Dynamic.literal(onRate = onRate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplonRatePartialPick]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiRating.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiRating.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiRating.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiRating.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiRating.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/rating.html#/settings}
    */
  type RatingSettings = typingsJapgolly.semanticUiRating.SemanticUI.RatingSettings.Param
}
