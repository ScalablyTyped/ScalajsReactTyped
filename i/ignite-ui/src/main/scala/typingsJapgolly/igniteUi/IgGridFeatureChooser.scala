package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridFeatureChooser
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var dropDownWidth: js.UndefOr[Any] = js.undefined
  
  var featureChooserDropDownOpened: js.UndefOr[FeatureChooserDropDownOpenedEvent] = js.undefined
  
  var featureChooserDropDownOpening: js.UndefOr[FeatureChooserDropDownOpeningEvent] = js.undefined
  
  var featureChooserRendered: js.UndefOr[FeatureChooserRenderedEvent] = js.undefined
  
  var featureChooserRendering: js.UndefOr[FeatureChooserRenderingEvent] = js.undefined
  
  var featureToggled: js.UndefOr[FeatureToggledEvent] = js.undefined
  
  var featureToggling: js.UndefOr[FeatureTogglingEvent] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  var menuToggling: js.UndefOr[MenuTogglingEvent] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
}
object IgGridFeatureChooser {
  
  inline def apply(): IgGridFeatureChooser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFeatureChooser]
  }
  
  extension [Self <: IgGridFeatureChooser](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setDropDownWidth(value: Any): Self = StObject.set(x, "dropDownWidth", value.asInstanceOf[js.Any])
    
    inline def setDropDownWidthUndefined: Self = StObject.set(x, "dropDownWidth", js.undefined)
    
    inline def setFeatureChooserDropDownOpened(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpenedEventUIParam) => Callback): Self = StObject.set(x, "featureChooserDropDownOpened", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FeatureChooserDropDownOpenedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFeatureChooserDropDownOpenedUndefined: Self = StObject.set(x, "featureChooserDropDownOpened", js.undefined)
    
    inline def setFeatureChooserDropDownOpening(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpeningEventUIParam) => Callback): Self = StObject.set(x, "featureChooserDropDownOpening", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FeatureChooserDropDownOpeningEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFeatureChooserDropDownOpeningUndefined: Self = StObject.set(x, "featureChooserDropDownOpening", js.undefined)
    
    inline def setFeatureChooserRendered(value: (/* event */ Event, /* ui */ FeatureChooserRenderedEventUIParam) => Callback): Self = StObject.set(x, "featureChooserRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FeatureChooserRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFeatureChooserRenderedUndefined: Self = StObject.set(x, "featureChooserRendered", js.undefined)
    
    inline def setFeatureChooserRendering(value: (/* event */ Event, /* ui */ FeatureChooserRenderingEventUIParam) => Callback): Self = StObject.set(x, "featureChooserRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FeatureChooserRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFeatureChooserRenderingUndefined: Self = StObject.set(x, "featureChooserRendering", js.undefined)
    
    inline def setFeatureToggled(value: (/* event */ Event, /* ui */ FeatureToggledEventUIParam) => Callback): Self = StObject.set(x, "featureToggled", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FeatureToggledEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFeatureToggledUndefined: Self = StObject.set(x, "featureToggled", js.undefined)
    
    inline def setFeatureToggling(value: (/* event */ Event, /* ui */ FeatureTogglingEventUIParam) => Callback): Self = StObject.set(x, "featureToggling", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FeatureTogglingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFeatureTogglingUndefined: Self = StObject.set(x, "featureToggling", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMenuToggling(value: (/* event */ Event, /* ui */ MenuTogglingEventUIParam) => Callback): Self = StObject.set(x, "menuToggling", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ MenuTogglingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setMenuTogglingUndefined: Self = StObject.set(x, "menuToggling", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
  }
}
