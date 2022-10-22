package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enhances the {@link Presentation} service to give access to a {@link XPresentation2} interface.
  * @since OOo 3.0
  */
trait Presentation2
  extends StObject
     with Presentation
     with XPresentation2
object Presentation2 {
  
  inline def apply(
    AllowAnimations: Boolean,
    Controller: XSlideShowController,
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
    getController: CallbackTo[XSlideShowController],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    isRunning: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    rehearseTimings: Callback,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    start: Callback,
    startWithArguments: SeqEquiv[PropertyValue] => Callback
  ): Presentation2 = {
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], CustomShow = CustomShow.asInstanceOf[js.Any], FirstPage = FirstPage.asInstanceOf[js.Any], IsAlwaysOnTop = IsAlwaysOnTop.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsEndless = IsEndless.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], IsLivePresentation = IsLivePresentation.asInstanceOf[js.Any], IsMouseVisible = IsMouseVisible.asInstanceOf[js.Any], Pause = Pause.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StartWithNavigator = StartWithNavigator.asInstanceOf[js.Any], UsePen = UsePen.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), end = end.toJsFn, getController = getController.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), isRunning = isRunning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = rehearseTimings.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), start = start.toJsFn, startWithArguments = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => startWithArguments(t0).runNow()))
    __obj.asInstanceOf[Presentation2]
  }
}
