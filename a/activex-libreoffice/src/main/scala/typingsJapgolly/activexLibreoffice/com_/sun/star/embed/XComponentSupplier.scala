package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a component. */
trait XComponentSupplier
  extends StObject
     with XInterface {
  
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  val Component: XCloseable
  
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  def getComponent(): XCloseable
}
object XComponentSupplier {
  
  inline def apply(
    Component: XCloseable,
    acquire: Callback,
    getComponent: CallbackTo[XCloseable],
    queryInterface: `type` => Any,
    release: Callback
  ): XComponentSupplier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], acquire = acquire.toJsFn, getComponent = getComponent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XComponentSupplier]
  }
  
  extension [Self <: XComponentSupplier](x: Self) {
    
    inline def setComponent(value: XCloseable): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setGetComponent(value: CallbackTo[XCloseable]): Self = StObject.set(x, "getComponent", value.toJsFn)
  }
}
