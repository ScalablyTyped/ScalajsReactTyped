package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enhances the {@link XPresentation} interface to give access to a {@link XSlideShowController} and to start a presentation with arguments.
  * @since OOo 3.0
  */
trait XPresentation2
  extends StObject
     with XPresentation
     with XPropertySet {
  
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  val Controller: XSlideShowController
  
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  def getController(): XSlideShowController
  
  /** returns true if the slide show is currently running */
  def isRunning(): Boolean
  
  /** start the slide show with the given arguments. All arguments override the values from {@link Presentation} . */
  def startWithArguments(Arguments: SeqEquiv[PropertyValue]): Unit
}
object XPresentation2 {
  
  inline def apply(
    Controller: XSlideShowController,
    PropertySetInfo: XPropertySetInfo,
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
  ): XPresentation2 = {
    val __obj = js.Dynamic.literal(Controller = Controller.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), end = end.toJsFn, getController = getController.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), isRunning = isRunning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = rehearseTimings.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), start = start.toJsFn, startWithArguments = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => startWithArguments(t0).runNow()))
    __obj.asInstanceOf[XPresentation2]
  }
  
  extension [Self <: XPresentation2](x: Self) {
    
    inline def setController(value: XSlideShowController): Self = StObject.set(x, "Controller", value.asInstanceOf[js.Any])
    
    inline def setGetController(value: CallbackTo[XSlideShowController]): Self = StObject.set(x, "getController", value.toJsFn)
    
    inline def setIsRunning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRunning", value.toJsFn)
    
    inline def setStartWithArguments(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "startWithArguments", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
