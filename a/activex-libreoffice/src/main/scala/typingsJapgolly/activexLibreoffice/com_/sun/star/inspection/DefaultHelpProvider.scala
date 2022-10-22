package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements a component which can default-fill the help section of an {@link ObjectInspector} .
  *
  * The component registers a {@link XPropertyControlObserver} at an XObjectInspectoryUI interface. Whenever it then is notified of a {@link
  * XPropertyControl} getting the focus, it will try to deduce the extended help text of this control's window, and set this help text at the object
  * inspector's help section.
  */
trait DefaultHelpProvider
  extends StObject
     with XInterface {
  
  /**
    * creates a help provider instance
    * @param InspectorUI provides access to the UI of the {@link ObjectInspector} which should be observed. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if the given inspector UI is `NULL` .
    */
  def create(InspectorUI: XObjectInspectorUI): Unit
}
object DefaultHelpProvider {
  
  inline def apply(
    acquire: Callback,
    create: XObjectInspectorUI => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): DefaultHelpProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = js.Any.fromFunction1((t0: XObjectInspectorUI) => create(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[DefaultHelpProvider]
  }
  
  extension [Self <: DefaultHelpProvider](x: Self) {
    
    inline def setCreate(value: XObjectInspectorUI => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: XObjectInspectorUI) => value(t0).runNow()))
  }
}
