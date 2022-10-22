package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to receive callbacks from an asynchronous frame loader.
  * @see XFrameLoader
  */
trait XLoadEventListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when a frame load is canceled or failed.
    * @param Loader the source of this event
    */
  def loadCancelled(Loader: XFrameLoader): Unit
  
  /**
    * is called when a new component is loaded into a frame successfully.
    * @param Loader the source of this event
    */
  def loadFinished(Loader: XFrameLoader): Unit
}
object XLoadEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    loadCancelled: XFrameLoader => Callback,
    loadFinished: XFrameLoader => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLoadEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), loadCancelled = js.Any.fromFunction1((t0: XFrameLoader) => loadCancelled(t0).runNow()), loadFinished = js.Any.fromFunction1((t0: XFrameLoader) => loadFinished(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLoadEventListener]
  }
  
  extension [Self <: XLoadEventListener](x: Self) {
    
    inline def setLoadCancelled(value: XFrameLoader => Callback): Self = StObject.set(x, "loadCancelled", js.Any.fromFunction1((t0: XFrameLoader) => value(t0).runNow()))
    
    inline def setLoadFinished(value: XFrameLoader => Callback): Self = StObject.set(x, "loadFinished", js.Any.fromFunction1((t0: XFrameLoader) => value(t0).runNow()))
  }
}
