package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when a new volatile function result is available.
  * @see com.sun.star.sheet.XVolatileResult
  */
trait XResultListener
  extends StObject
     with XEventListener {
  
  /** is called when a new value is available. */
  def modified(aEvent: ResultEvent): Unit
}
object XResultListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    modified: ResultEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), modified = js.Any.fromFunction1((t0: ResultEvent) => modified(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XResultListener]
  }
  
  extension [Self <: XResultListener](x: Self) {
    
    inline def setModified(value: ResultEvent => Callback): Self = StObject.set(x, "modified", js.Any.fromFunction1((t0: ResultEvent) => value(t0).runNow()))
  }
}
