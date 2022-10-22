package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A listener interested in changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called whenever changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} occur.
    * @param Event describes the change that has occurred.
    */
  def remoteContentProviderChange(Event: RemoteContentProviderChangeEvent): Unit
}
object XRemoteContentProviderChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    remoteContentProviderChange: RemoteContentProviderChangeEvent => Callback
  ): XRemoteContentProviderChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remoteContentProviderChange = js.Any.fromFunction1((t0: RemoteContentProviderChangeEvent) => remoteContentProviderChange(t0).runNow()))
    __obj.asInstanceOf[XRemoteContentProviderChangeListener]
  }
  
  extension [Self <: XRemoteContentProviderChangeListener](x: Self) {
    
    inline def setRemoteContentProviderChange(value: RemoteContentProviderChangeEvent => Callback): Self = StObject.set(x, "remoteContentProviderChange", js.Any.fromFunction1((t0: RemoteContentProviderChangeEvent) => value(t0).runNow()))
  }
}
