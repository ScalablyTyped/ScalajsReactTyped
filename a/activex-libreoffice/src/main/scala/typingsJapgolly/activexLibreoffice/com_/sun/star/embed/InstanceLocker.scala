package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main task of this service is to prevent closing, terminating and/or etc. of controlled object.
  *
  * After creation the service adds a listener of requested type ( close, terminate and/or etc. ) to the controlled object and let the listener throw
  * related veto exception until the service is disposed.
  */
trait InstanceLocker
  extends StObject
     with XComponent {
  
  /**
    * is used to initialize the object on it's creation.
    * @param xInstance the controlled object. Must implement the related to the requested actions broadcaster interface.
    * @param nActions specifies the actions that should be done ( prevent closing, prevent termination and/or etc. ). It must not be empty and can currently c
    */
  def InstanceLockerCtor1(xInstance: XInterface, nActions: Double): Unit
  
  /**
    * is used to initialize the object on it's creation.
    * @param xInstance the controlled object. Must implement the related to the requested actions broadcaster interface.
    * @param nActions specifies the actions that should be done ( prevent closing, prevent termination and/or etc. ). It must not be empty and can currently c
    * @param xApprove The object implementing {@link XActionsApproval} interface. If this parameter is an empty reference the object will proceed with the spe
    */
  def InstanceLockerCtor2(xInstance: XInterface, nActions: Double, xApprove: XActionsApproval): Unit
}
object InstanceLocker {
  
  inline def apply(
    InstanceLockerCtor1: (XInterface, Double) => Callback,
    InstanceLockerCtor2: (XInterface, Double, XActionsApproval) => Callback,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): InstanceLocker = {
    val __obj = js.Dynamic.literal(InstanceLockerCtor1 = js.Any.fromFunction2((t0: XInterface, t1: Double) => (InstanceLockerCtor1(t0, t1)).runNow()), InstanceLockerCtor2 = js.Any.fromFunction3((t0: XInterface, t1: Double, t2: XActionsApproval) => (InstanceLockerCtor2(t0, t1, t2)).runNow()), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[InstanceLocker]
  }
  
  extension [Self <: InstanceLocker](x: Self) {
    
    inline def setInstanceLockerCtor1(value: (XInterface, Double) => Callback): Self = StObject.set(x, "InstanceLockerCtor1", js.Any.fromFunction2((t0: XInterface, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setInstanceLockerCtor2(value: (XInterface, Double, XActionsApproval) => Callback): Self = StObject.set(x, "InstanceLockerCtor2", js.Any.fromFunction3((t0: XInterface, t1: Double, t2: XActionsApproval) => (value(t0, t1, t2)).runNow()))
  }
}
