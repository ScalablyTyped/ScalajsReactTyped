package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers a simple way to initialize a component or load it from an URL.
  *
  * In case an object supports the interface the object must be initialized with either {@link initNew()} or {@link load()} call before any usage. In case
  * the object is already initialized the mentioned methods should throw {@link DoubleInitializationException} .
  * @since OOo 1.1.2
  */
trait XLoadable
  extends StObject
     with XInterface {
  
  /** creates a component from scratch */
  def initNew(): Unit
  
  /**
    * loads a component from an URL
    * @param lArguments parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details) the FileName parameter must be specified
    */
  def load(lArguments: SeqEquiv[PropertyValue]): Unit
}
object XLoadable {
  
  inline def apply(
    acquire: Callback,
    initNew: Callback,
    load: SeqEquiv[PropertyValue] => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, initNew = initNew.toJsFn, load = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => load(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLoadable]
  }
  
  extension [Self <: XLoadable](x: Self) {
    
    inline def setInitNew(value: Callback): Self = StObject.set(x, "initNew", value.toJsFn)
    
    inline def setLoad(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
