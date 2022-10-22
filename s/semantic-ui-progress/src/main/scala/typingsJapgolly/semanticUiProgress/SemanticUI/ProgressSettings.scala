package typingsJapgolly.semanticUiProgress.SemanticUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiProgress.JQuery
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.TextSettings
import typingsJapgolly.semanticUiProgress.semanticUiProgressBooleans.`false`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.percent
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressSettings {
  
  trait Impl extends StObject {
    
    // region Progress Settings
    /**
      * Whether success state should automatically trigger when progress completes
      *
      * @default true
      */
    var autoSuccess: Boolean
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    /**
      * Can be set to either to display progress as percent or ratio. Matches up to corresponding text template with the same name.
      *
      * @default 'percent'
      */
    var label: percent | ratio
    
    /**
      * When set to true, values that calculate to above 100% or below 0% will be adjusted.
      * When set to false, inappropriate values will produce an error.
      *
      * @default true
      */
    var limitValues: Boolean
    
    /**
      * DOM metadata used by module
      */
    var metadata: MetadataSettings
    
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
      * Callback on active state
      */
    def onActive(value: Double, total: Double): Unit
    
    // endregion
    // region Callbacks
    /**
      * Callback on percentage change
      */
    def onChange(percent: Double, value: Double, total: Double): Unit
    
    /**
      * Callback on error state
      */
    def onError(value: Double, total: Double): Unit
    
    /**
      * Callback on success state
      */
    def onSuccess(total: Double): Unit
    
    /**
      * Callback on warning state
      */
    def onWarning(value: Double, total: Double): Unit
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    /**
      * Decimal point precision for calculated progress
      *
      * @default 1
      */
    var precision: Double
    
    /**
      * When incrementing without value, sets range for random increment value
      */
    var random: RandomSettings
    
    /**
      * Regular expressions used by module
      */
    var regExp: RegExpSettings
    
    /**
      * Selectors used by module
      */
    var selector: SelectorSettings
    
    /**
      * Whether progress should automatically show activity when incremented
      *
      * @default true
      */
    var showActivity: Boolean
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    // endregion
    // region DOM Settings
    /**
      * Text content for each state, uses simple templating with {percent}, {value}, {total}
      */
    var text: TextSettings
    
    /**
      * Setting a total value will make each call to increment get closer to this total (i.e. 1/20, 2/20 etc)
      *
      * @default false
      */
    var total: `false` | Double
    
    /**
      * Sets current value, when total is specified, this is used to calculate a ratio of the total, with percent this should be the overall percent
      *
      * @default false
      */
    var value: `false` | Double
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      autoSuccess: Boolean,
      className: ClassNameSettings,
      debug: Boolean,
      error: ErrorSettings,
      label: percent | ratio,
      limitValues: Boolean,
      metadata: MetadataSettings,
      name: String,
      namespace: String,
      onActive: (Double, Double) => Callback,
      onChange: (Double, Double, Double) => Callback,
      onError: (Double, Double) => Callback,
      onSuccess: Double => Callback,
      onWarning: (Double, Double) => Callback,
      performance: Boolean,
      precision: Double,
      random: RandomSettings,
      regExp: RegExpSettings,
      selector: SelectorSettings,
      showActivity: Boolean,
      silent: Boolean,
      text: TextSettings,
      total: `false` | Double,
      value: `false` | Double,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], limitValues = limitValues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onActive = js.Any.fromFunction2((t0: Double, t1: Double) => (onActive(t0, t1)).runNow()), onChange = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onChange(t0, t1, t2)).runNow()), onError = js.Any.fromFunction2((t0: Double, t1: Double) => (onError(t0, t1)).runNow()), onSuccess = js.Any.fromFunction1((t0: Double) => onSuccess(t0).runNow()), onWarning = js.Any.fromFunction2((t0: Double, t1: Double) => (onWarning(t0, t1)).runNow()), performance = performance.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showActivity = showActivity.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: percent | ratio): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLimitValues(value: Boolean): Self = StObject.set(x, "limitValues", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOnActive(value: (Double, Double) => Callback): Self = StObject.set(x, "onActive", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOnChange(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnError(value: (Double, Double) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOnSuccess(value: Double => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnWarning(value: (Double, Double) => Callback): Self = StObject.set(x, "onWarning", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setRandom(value: RandomSettings): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setShowActivity(value: Boolean): Self = StObject.set(x, "showActivity", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: `false` | Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setValue(value: `false` | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiProgress.anon.PickImplautoSuccessPartia
    - typingsJapgolly.semanticUiProgress.anon.PickImplshowActivityParti
    - typingsJapgolly.semanticUiProgress.anon.PickImpllimitValuesPartia
    - typingsJapgolly.semanticUiProgress.anon.PickImpllabelPartialPickI
    - typingsJapgolly.semanticUiProgress.anon.PickImplrandomPartialPick
    - typingsJapgolly.semanticUiProgress.anon.PickImplprecisionPartialP
    - typingsJapgolly.semanticUiProgress.anon.PickImpltotalPartialPickI
    - typingsJapgolly.semanticUiProgress.anon.PickImplvaluePartialPickI
    - typingsJapgolly.semanticUiProgress.anon.PickImplonChangePartialPi
    - typingsJapgolly.semanticUiProgress.anon.PickImplonSuccessPartialP
    - typingsJapgolly.semanticUiProgress.anon.PickImplonActivePartialPi
    - typingsJapgolly.semanticUiProgress.anon.PickImplonErrorPartialPic
    - typingsJapgolly.semanticUiProgress.anon.PickImplonWarningPartialP
    - typingsJapgolly.semanticUiProgress.anon.PickImpltextPartialPickIm
    - typingsJapgolly.semanticUiProgress.anon.PickImplregExpPartialPick
    - typingsJapgolly.semanticUiProgress.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiProgress.anon.PickImplmetadataPartialPi
    - typingsJapgolly.semanticUiProgress.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiProgress.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiProgress.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiProgress.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiProgress.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiProgress.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiProgress.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiProgress.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplautoSuccessPartia(autoSuccess: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImplautoSuccessPartia = {
      val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplautoSuccessPartia]
    }
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiProgress.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiProgress.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImpllabelPartialPickI(label: (percent | ratio) & (js.UndefOr[percent | ratio])): typingsJapgolly.semanticUiProgress.anon.PickImpllabelPartialPickI = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImpllabelPartialPickI]
    }
    
    inline def PickImpllimitValuesPartia(limitValues: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImpllimitValuesPartia = {
      val __obj = js.Dynamic.literal(limitValues = limitValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImpllimitValuesPartia]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiProgress.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiProgress.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiProgress.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonActivePartialPi(
      onActive: (js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]) & (js.UndefOr[
          js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
        ])
    ): typingsJapgolly.semanticUiProgress.anon.PickImplonActivePartialPi = {
      val __obj = js.Dynamic.literal(onActive = onActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplonActivePartialPi]
    }
    
    inline def PickImplonChangePartialPi(
      onChange: (js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]) & (js.UndefOr[
          js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
        ])
    ): typingsJapgolly.semanticUiProgress.anon.PickImplonChangePartialPi = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplonChangePartialPi]
    }
    
    inline def PickImplonErrorPartialPic(
      onError: (js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]) & (js.UndefOr[
          js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
        ])
    ): typingsJapgolly.semanticUiProgress.anon.PickImplonErrorPartialPic = {
      val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplonErrorPartialPic]
    }
    
    inline def PickImplonSuccessPartialP(
      onSuccess: (js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]])
    ): typingsJapgolly.semanticUiProgress.anon.PickImplonSuccessPartialP = {
      val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplonSuccessPartialP]
    }
    
    inline def PickImplonWarningPartialP(
      onWarning: (js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]) & (js.UndefOr[
          js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
        ])
    ): typingsJapgolly.semanticUiProgress.anon.PickImplonWarningPartialP = {
      val __obj = js.Dynamic.literal(onWarning = onWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplonWarningPartialP]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplperformancePartia]
    }
    
    inline def PickImplprecisionPartialP(precision: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiProgress.anon.PickImplprecisionPartialP = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplprecisionPartialP]
    }
    
    inline def PickImplrandomPartialPick(random: RandomSettings & js.UndefOr[RandomSettings]): typingsJapgolly.semanticUiProgress.anon.PickImplrandomPartialPick = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplrandomPartialPick]
    }
    
    inline def PickImplregExpPartialPick(regExp: RegExpSettings & js.UndefOr[RegExpSettings]): typingsJapgolly.semanticUiProgress.anon.PickImplregExpPartialPick = {
      val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplregExpPartialPick]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiProgress.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplshowActivityParti(showActivity: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImplshowActivityParti = {
      val __obj = js.Dynamic.literal(showActivity = showActivity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplshowActivityParti]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltextPartialPickIm(text: TextSettings & js.UndefOr[TextSettings]): typingsJapgolly.semanticUiProgress.anon.PickImpltextPartialPickIm = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImpltextPartialPickIm]
    }
    
    inline def PickImpltotalPartialPickI(total: (`false` | Double) & (js.UndefOr[`false` | Double])): typingsJapgolly.semanticUiProgress.anon.PickImpltotalPartialPickI = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImpltotalPartialPickI]
    }
    
    inline def PickImplvaluePartialPickI(value: (`false` | Double) & (js.UndefOr[`false` | Double])): typingsJapgolly.semanticUiProgress.anon.PickImplvaluePartialPickI = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplvaluePartialPickI]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiProgress.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiProgress.anon.PickImplverbosePartialPic]
    }
  }
}
