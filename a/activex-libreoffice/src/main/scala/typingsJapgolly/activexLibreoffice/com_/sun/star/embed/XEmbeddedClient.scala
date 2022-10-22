package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for embedded clients. */
trait XEmbeddedClient
  extends StObject
     with XComponentSupplier {
  
  /**
    * asks client to let the object store itself.
    * @throws com::sun::star::uno::ObjectSaveVetoException in case container chants to avoid saving of object
    * @throws com::sun::star::uno::Exception in case of problems during saving
    */
  def saveObject(): Unit
  
  /**
    * An object can use this method to notify the client when the object outplace window becomes visible or invisible.
    * @param bVisible visibility state of the window
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def visibilityChanged(bVisible: Boolean): Unit
}
object XEmbeddedClient {
  
  inline def apply(
    Component: XCloseable,
    acquire: Callback,
    getComponent: CallbackTo[XCloseable],
    queryInterface: `type` => Any,
    release: Callback,
    saveObject: Callback,
    visibilityChanged: Boolean => Callback
  ): XEmbeddedClient = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], acquire = acquire.toJsFn, getComponent = getComponent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, saveObject = saveObject.toJsFn, visibilityChanged = js.Any.fromFunction1((t0: Boolean) => visibilityChanged(t0).runNow()))
    __obj.asInstanceOf[XEmbeddedClient]
  }
  
  extension [Self <: XEmbeddedClient](x: Self) {
    
    inline def setSaveObject(value: Callback): Self = StObject.set(x, "saveObject", value.toJsFn)
    
    inline def setVisibilityChanged(value: Boolean => Callback): Self = StObject.set(x, "visibilityChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
