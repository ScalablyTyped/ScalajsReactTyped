package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * continuation used by interaction mechanism at filter detection during loading documents
  *
  * If during loading time the filter can't be detected and wasn't given at calling time, a possible {@link com.sun.star.task.InteractionHandler} will be
  * used. (it's a part of used {@link MediaDescriptor} ) A {@link NoSuchFilterRequest} will be used then to start right interaction on that to get a
  * decision which filter should be used for given URL. A possible continuation of that can be this {@link XInteractionFilterSelect} . It will transport
  * the decision back to generic filter detection and force using of it. Of course it's possible to abort the loading process by use another continuation
  * {@link com.sun.star.task.XInteractionAbort} .
  * @see MediaDescriptor
  * @see com.sun.star.task.InteractionHandler
  * @see NoSuchFilterRequest
  * @see com.sun.star.task.XInteractionAbort
  */
trait XInteractionFilterSelect
  extends StObject
     with XInteractionContinuation {
  
  /** used by detection to get selected filter */
  var Filter: String
  
  /** used by detection to get selected filter */
  def getFilter(): String
  
  /**
    * used by interaction to set selected filter
    *
    * This value must be saved till another one will be set and must be provided on {@link getFilter()} for interest users.
    */
  def setFilter(Name: String): Unit
}
object XInteractionFilterSelect {
  
  inline def apply(
    Filter: String,
    acquire: Callback,
    getFilter: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setFilter: String => Callback
  ): XInteractionFilterSelect = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilter = getFilter.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setFilter = js.Any.fromFunction1((t0: String) => setFilter(t0).runNow()))
    __obj.asInstanceOf[XInteractionFilterSelect]
  }
  
  extension [Self <: XInteractionFilterSelect](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetFilter(value: CallbackTo[String]): Self = StObject.set(x, "getFilter", value.toJsFn)
    
    inline def setSetFilter(value: String => Callback): Self = StObject.set(x, "setFilter", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
