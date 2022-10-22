package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * derivations of this abstract service are used to load components into Frames of the environment
  *
  * Concrete implementations of this service register, for example, for file name extensions or MIME types to load appropriate components. The components
  * loaded are at least {@link Controller} . Instead of {@link SynchronousFrameLoader} this one use asynchronous processes to load the component.
  * @see SynchronousFrameLoader
  */
trait FrameLoader
  extends StObject
     with XFrameLoader
     with XInitialization
     with XNamed
object FrameLoader {
  
  inline def apply(
    Name: String,
    acquire: Callback,
    cancel: Callback,
    getName: CallbackTo[String],
    initialize: SeqEquiv[Any] => Callback,
    load: (XFrame, String, SeqEquiv[PropertyValue], XLoadEventListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback
  ): FrameLoader = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), load = js.Any.fromFunction4((t0: XFrame, t1: String, t2: SeqEquiv[PropertyValue], t3: XLoadEventListener) => (load(t0, t1, t2, t3)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[FrameLoader]
  }
}
