package typingsJapgolly.semanticUiDimmer.SemanticUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiDimmer.JQuery
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.auto
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DimmerSettings {
  
  trait Impl extends StObject {
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Whether clicking on the dimmer should hide the dimmer (Defaults to auto, closable only when settings.on is not hover
      *
      * @default 'auto'
      */
    var closable: auto | Boolean
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    /**
      * If initializing a dimmer on a dimmable context, you can use dimmerName to distinguish between multiple dimmers in that context.
      *
      * @default false
      */
    var dimmerName: `false` | String
    
    /**
      * Animation duration of dimming. If an integer is used, that value will apply to both show and hide animations.
      */
    var duration: Double | DurationSettings
    
    // endregion
    // region Debug Settings
    /**
      * Error messages displayed to console
      */
    var error: ErrorSettings
    
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
      * Can be set to hover or click to show/hide dimmer on dimmable event
      *
      * @default false
      */
    var on: `false` | hover | click
    
    /**
      * Callback on element show or hide
      */
    def onChange(): Unit
    
    /**
      * Callback on element hide
      */
    def onHide(): Unit
    
    // endregion
    // region Callbacks
    /**
      * Callback on element show
      */
    def onShow(): Unit
    
    // region Behavior
    /**
      * Dimmers opacity from 0-1. Defaults to auto which uses the CSS specified opacity.
      *
      * @default 'auto'
      */
    var opacity: auto | Double
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    // endregion
    // region DOM Settings
    /**
      * Object containing selectors used by module.
      */
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    /**
      * Templates used to generate dimmer content
      */
    var template: TemplateSettings
    
    /**
      * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
      *
      * @default 'fade'
      * @see {@link http://semantic-ui.com/modules/transition.html}
      */
    var transition: String
    
    /**
      * Whether to dim dimmers using CSS transitions.
      *
      * @default true
      */
    var useCSS: Boolean
    
    /**
      * Specify a variation to add when generating dimmer, like inverted
      *
      * @default false
      */
    var variation: `false` | String
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      className: ClassNameSettings,
      closable: auto | Boolean,
      debug: Boolean,
      dimmerName: `false` | String,
      duration: Double | DurationSettings,
      error: ErrorSettings,
      name: String,
      namespace: String,
      on: `false` | hover | click,
      onChange: Callback,
      onHide: Callback,
      onShow: Callback,
      opacity: auto | Double,
      performance: Boolean,
      selector: SelectorSettings,
      silent: Boolean,
      template: TemplateSettings,
      transition: String,
      useCSS: Boolean,
      variation: `false` | String,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], dimmerName = dimmerName.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = onChange.toJsFn, onHide = onHide.toJsFn, onShow = onShow.toJsFn, opacity = opacity.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: auto | Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDimmerName(value: `false` | String): Self = StObject.set(x, "dimmerName", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double | DurationSettings): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOn(value: `false` | hover | click): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOpacity(value: auto | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: TemplateSettings): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      inline def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiDimmer.anon.PickImplopacityPartialPic
    - typingsJapgolly.semanticUiDimmer.anon.PickImplvariationPartialP
    - typingsJapgolly.semanticUiDimmer.anon.PickImpldimmerNamePartial
    - typingsJapgolly.semanticUiDimmer.anon.PickImplclosablePartialPi
    - typingsJapgolly.semanticUiDimmer.anon.PickImplonPartialPickImpl
    - typingsJapgolly.semanticUiDimmer.anon.PickImpluseCSSPartialPick
    - typingsJapgolly.semanticUiDimmer.anon.PickImpldurationPartialPi
    - typingsJapgolly.semanticUiDimmer.anon.PickImpltransitionPartial
    - typingsJapgolly.semanticUiDimmer.anon.PickImplonShowPartialPick
    - typingsJapgolly.semanticUiDimmer.anon.PickImplonHidePartialPick
    - typingsJapgolly.semanticUiDimmer.anon.PickImplonChangePartialPi
    - typingsJapgolly.semanticUiDimmer.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiDimmer.anon.PickImpltemplatePartialPi
    - typingsJapgolly.semanticUiDimmer.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiDimmer.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiDimmer.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiDimmer.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiDimmer.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiDimmer.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiDimmer.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiDimmer.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiDimmer.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplclosablePartialPi(closable: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiDimmer.anon.PickImplclosablePartialPi = {
      val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplclosablePartialPi]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiDimmer.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldimmerNamePartial(dimmerName: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiDimmer.anon.PickImpldimmerNamePartial = {
      val __obj = js.Dynamic.literal(dimmerName = dimmerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImpldimmerNamePartial]
    }
    
    inline def PickImpldurationPartialPi(duration: (Double | DurationSettings) & (js.UndefOr[Double | DurationSettings])): typingsJapgolly.semanticUiDimmer.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiDimmer.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiDimmer.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiDimmer.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonChangePartialPi(
      onChange: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiDimmer.anon.PickImplonChangePartialPi = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplonChangePartialPi]
    }
    
    inline def PickImplonHidePartialPick(
      onHide: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiDimmer.anon.PickImplonHidePartialPick = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplonHidePartialPick]
    }
    
    inline def PickImplonPartialPickImpl(on: (`false` | hover | click) & (js.UndefOr[`false` | hover | click])): typingsJapgolly.semanticUiDimmer.anon.PickImplonPartialPickImpl = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplonPartialPickImpl]
    }
    
    inline def PickImplonShowPartialPick(
      onShow: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiDimmer.anon.PickImplonShowPartialPick = {
      val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplonShowPartialPick]
    }
    
    inline def PickImplopacityPartialPic(opacity: (auto | Double) & (js.UndefOr[auto | Double])): typingsJapgolly.semanticUiDimmer.anon.PickImplopacityPartialPic = {
      val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplopacityPartialPic]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiDimmer.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplperformancePartia]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiDimmer.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiDimmer.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltemplatePartialPi(template: TemplateSettings & js.UndefOr[TemplateSettings]): typingsJapgolly.semanticUiDimmer.anon.PickImpltemplatePartialPi = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImpltemplatePartialPi]
    }
    
    inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiDimmer.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImpltransitionPartial]
    }
    
    inline def PickImpluseCSSPartialPick(useCSS: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiDimmer.anon.PickImpluseCSSPartialPick = {
      val __obj = js.Dynamic.literal(useCSS = useCSS.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImpluseCSSPartialPick]
    }
    
    inline def PickImplvariationPartialP(variation: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiDimmer.anon.PickImplvariationPartialP = {
      val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplvariationPartialP]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiDimmer.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiDimmer.anon.PickImplverbosePartialPic]
    }
  }
}
