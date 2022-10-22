package typingsJapgolly.semanticUiRating.anon

import typingsJapgolly.semanticUiRating.JQuery
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typingsJapgolly.semanticUiRating.SemanticUI.RatingSettings.Param
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'onRate'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, keyof semantic-ui-rating.SemanticUI.RatingSettings._Impl>> */
trait PickImplonRatePartialPick
  extends StObject
     with Param {
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var clearable: js.UndefOr[auto | Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var fireOnInit: js.UndefOr[Boolean] = js.undefined
  
  var initialRating: js.UndefOr[Double] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  def onRate(value: Double): Unit
  @JSName("onRate")
  var onRate_Original: (js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]])
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplonRatePartialPick {
  
  inline def apply(
    onRate: (js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]])
  ): PickImplonRatePartialPick = {
    val __obj = js.Dynamic.literal(onRate = onRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRatePartialPick]
  }
  
  extension [Self <: PickImplonRatePartialPick](x: Self) {
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClearable(value: auto | Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
    
    inline def setFireOnInitUndefined: Self = StObject.set(x, "fireOnInit", js.undefined)
    
    inline def setInitialRating(value: Double): Self = StObject.set(x, "initialRating", value.asInstanceOf[js.Any])
    
    inline def setInitialRatingUndefined: Self = StObject.set(x, "initialRating", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnRate(
      value: (js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]])
    ): Self = StObject.set(x, "onRate", value.asInstanceOf[js.Any])
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
