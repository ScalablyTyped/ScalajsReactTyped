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
  * provides an easy way to dispatch functions useful at UI level.
  * @see XDispatch
  * @since OOo 1.1.2
  */
trait XDispatchHelper
  extends StObject
     with XInterface {
  
  /**
    * executes the dispatch.
    *
    * Listeners are not supported here!
    * @param DispatchProvider points to the provider, which should be asked for valid dispatch objects
    * @param URL describes the feature which should be supported by internally used dispatch object
    * @param TargetFrameName specifies the frame which should be the target for this request
    * @param SearchFlags optional search parameter for finding the frame if no special **TargetFrameName** was used
    * @param Arguments optional arguments for this request They depend on the real implementation of the dispatch object.
    * @returns A possible result of the executed internal dispatch. The information behind this `any` depends on the dispatch!
    * @see XDispatch.dispatch()
    */
  def executeDispatch(
    DispatchProvider: XDispatchProvider,
    URL: String,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): Any
}
object XDispatchHelper {
  
  inline def apply(
    acquire: Callback,
    executeDispatch: (XDispatchProvider, String, String, Double, SeqEquiv[PropertyValue]) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XDispatchHelper = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, executeDispatch = js.Any.fromFunction5(executeDispatch), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDispatchHelper]
  }
  
  extension [Self <: XDispatchHelper](x: Self) {
    
    inline def setExecuteDispatch(value: (XDispatchProvider, String, String, Double, SeqEquiv[PropertyValue]) => Any): Self = StObject.set(x, "executeDispatch", js.Any.fromFunction5(value))
  }
}
