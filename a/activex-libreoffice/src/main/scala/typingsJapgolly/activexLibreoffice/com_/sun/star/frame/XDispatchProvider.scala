package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides {@link XDispatch} interfaces for certain functions which are useful at the UI.
  * @see XDispatch
  */
trait XDispatchProvider
  extends StObject
     with XInterface {
  
  /**
    * searches for an {@link XDispatch} for the specified URL within the specified target frame.
    * @param URL describe the feature which should be supported by returned dispatch object
    * @param TargetFrameName specify the frame which should be the target for this request
    * @param SearchFlags optional search parameter for finding the frame if no special **TargetFrameName** was used
    * @returns the dispatch object which provides queried functionality ;  or `NULL` if no dispatch object is available
    * @see XFrame.findFrame()
    * @see XDispatchProvider.queryDispatches()
    */
  def queryDispatch(URL: URL, TargetFrameName: String, SearchFlags: Double): XDispatch
  
  /**
    * actually this method is redundant to {@link XDispatchProvider.queryDispatch()} to avoid multiple remote calls.
    * @param Requests list of dispatch requests
    * @returns multiple dispatch interfaces for the specified descriptors at once  It's not allowed to pack it - because every request must match to its real re
    */
  def queryDispatches(Requests: SeqEquiv[DispatchDescriptor]): SafeArray[XDispatch]
}
object XDispatchProvider {
  
  inline def apply(
    acquire: Callback,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    release: Callback
  ): XDispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDispatchProvider]
  }
  
  extension [Self <: XDispatchProvider](x: Self) {
    
    inline def setQueryDispatch(value: (URL, String, Double) => XDispatch): Self = StObject.set(x, "queryDispatch", js.Any.fromFunction3(value))
    
    inline def setQueryDispatches(value: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch]): Self = StObject.set(x, "queryDispatches", js.Any.fromFunction1(value))
  }
}
