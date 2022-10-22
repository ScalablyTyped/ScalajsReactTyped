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
  * loaded are at least {@link Controller} . Instead of service {@link FrameLoader} this one use synchronous processes to load the component.
  * @see FrameLoader
  */
trait SynchronousFrameLoader
  extends StObject
     with XSynchronousFrameLoader
     with XInitialization
     with XNamed
object SynchronousFrameLoader {
  
  inline def apply(
    Name: String,
    acquire: Callback,
    cancel: Callback,
    getName: CallbackTo[String],
    initialize: SeqEquiv[Any] => Callback,
    load: (SeqEquiv[PropertyValue], XFrame) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback
  ): SynchronousFrameLoader = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), load = js.Any.fromFunction2(load), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[SynchronousFrameLoader]
  }
}
