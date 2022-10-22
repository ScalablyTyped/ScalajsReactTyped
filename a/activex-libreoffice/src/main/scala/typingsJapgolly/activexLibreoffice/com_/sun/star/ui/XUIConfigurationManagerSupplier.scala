package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to retrieve the user interface configuration manager related to an object.
  * @since OOo 2.0
  */
trait XUIConfigurationManagerSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  val UIConfigurationManager: XUIConfigurationManager
  
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  def getUIConfigurationManager(): XUIConfigurationManager
}
object XUIConfigurationManagerSupplier {
  
  inline def apply(
    UIConfigurationManager: XUIConfigurationManager,
    acquire: Callback,
    getUIConfigurationManager: CallbackTo[XUIConfigurationManager],
    queryInterface: `type` => Any,
    release: Callback
  ): XUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal(UIConfigurationManager = UIConfigurationManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, getUIConfigurationManager = getUIConfigurationManager.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUIConfigurationManagerSupplier]
  }
  
  extension [Self <: XUIConfigurationManagerSupplier](x: Self) {
    
    inline def setGetUIConfigurationManager(value: CallbackTo[XUIConfigurationManager]): Self = StObject.set(x, "getUIConfigurationManager", value.toJsFn)
    
    inline def setUIConfigurationManager(value: XUIConfigurationManager): Self = StObject.set(x, "UIConfigurationManager", value.asInstanceOf[js.Any])
  }
}
