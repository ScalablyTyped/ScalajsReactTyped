package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service is a presentation that is available from a {@link PresentationDocument} via the {@link XPresentationSupplier} interface. */
trait Presentation
  extends StObject
     with XPresentation
     with XPropertySet {
  
  /** enables/disables the shape animations. */
  var AllowAnimations: Boolean
  
  /** If this string is not empty, it contains the name of a customized show that is used for the presentation. */
  var CustomShow: String
  
  /** If this string is not empty, it contains the name of the page where the presentation is started. */
  var FirstPage: String
  
  /** If this property is set to `TRUE` , the window of the presentation is always on top of all other windows. */
  var IsAlwaysOnTop: Boolean
  
  /**
    * If this property is `TRUE` , all pages are changed automatically.
    *
    * This overrides the properties of the pages.
    */
  var IsAutomatic: Boolean
  
  /** If this property is set to `TRUE` , the presentation is repeated endlessly. */
  var IsEndless: Boolean
  
  /** If this property is set to `TRUE` , the presentation runs in full-screen mode. */
  var IsFullScreen: Boolean
  
  /**
    * With this property, you can set the presentation to live mode.
    *
    * Implementations that have no live mode capability may ignore this property and always return false.
    */
  var IsLivePresentation: Boolean
  
  /** If this property is `TRUE` , the mouse is visible during the presentation. */
  var IsMouseVisible: Boolean
  
  /**
    * is the duration of the black screen after the presentation has finished.
    *
    * If this is set to `0` , no black screen is shown.
    */
  var Pause: Double
  
  /** If this is set to `TRUE` , the Navigator is opened at the start of the presentation. */
  var StartWithNavigator: Boolean
  
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: Boolean
}
object Presentation {
  
  inline def apply(
    AllowAnimations: Boolean,
    CustomShow: String,
    FirstPage: String,
    IsAlwaysOnTop: Boolean,
    IsAutomatic: Boolean,
    IsEndless: Boolean,
    IsFullScreen: Boolean,
    IsLivePresentation: Boolean,
    IsMouseVisible: Boolean,
    Pause: Double,
    PropertySetInfo: XPropertySetInfo,
    StartWithNavigator: Boolean,
    UsePen: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    end: Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    rehearseTimings: Callback,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    start: Callback
  ): Presentation = {
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations.asInstanceOf[js.Any], CustomShow = CustomShow.asInstanceOf[js.Any], FirstPage = FirstPage.asInstanceOf[js.Any], IsAlwaysOnTop = IsAlwaysOnTop.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsEndless = IsEndless.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], IsLivePresentation = IsLivePresentation.asInstanceOf[js.Any], IsMouseVisible = IsMouseVisible.asInstanceOf[js.Any], Pause = Pause.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StartWithNavigator = StartWithNavigator.asInstanceOf[js.Any], UsePen = UsePen.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), end = end.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = rehearseTimings.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), start = start.toJsFn)
    __obj.asInstanceOf[Presentation]
  }
  
  extension [Self <: Presentation](x: Self) {
    
    inline def setAllowAnimations(value: Boolean): Self = StObject.set(x, "AllowAnimations", value.asInstanceOf[js.Any])
    
    inline def setCustomShow(value: String): Self = StObject.set(x, "CustomShow", value.asInstanceOf[js.Any])
    
    inline def setFirstPage(value: String): Self = StObject.set(x, "FirstPage", value.asInstanceOf[js.Any])
    
    inline def setIsAlwaysOnTop(value: Boolean): Self = StObject.set(x, "IsAlwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setIsAutomatic(value: Boolean): Self = StObject.set(x, "IsAutomatic", value.asInstanceOf[js.Any])
    
    inline def setIsEndless(value: Boolean): Self = StObject.set(x, "IsEndless", value.asInstanceOf[js.Any])
    
    inline def setIsFullScreen(value: Boolean): Self = StObject.set(x, "IsFullScreen", value.asInstanceOf[js.Any])
    
    inline def setIsLivePresentation(value: Boolean): Self = StObject.set(x, "IsLivePresentation", value.asInstanceOf[js.Any])
    
    inline def setIsMouseVisible(value: Boolean): Self = StObject.set(x, "IsMouseVisible", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Double): Self = StObject.set(x, "Pause", value.asInstanceOf[js.Any])
    
    inline def setStartWithNavigator(value: Boolean): Self = StObject.set(x, "StartWithNavigator", value.asInstanceOf[js.Any])
    
    inline def setUsePen(value: Boolean): Self = StObject.set(x, "UsePen", value.asInstanceOf[js.Any])
  }
}
