package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal interface to update the used css::frame::XModel
  * @since LibreOffice 5.1
  */
trait XUpdateModel
  extends StObject
     with XInterface {
  
  def updateModel(xModel: XModel): Unit
}
object XUpdateModel {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateModel: XModel => Callback
  ): XUpdateModel = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateModel = js.Any.fromFunction1((t0: XModel) => updateModel(t0).runNow()))
    __obj.asInstanceOf[XUpdateModel]
  }
  
  extension [Self <: XUpdateModel](x: Self) {
    
    inline def setUpdateModel(value: XModel => Callback): Self = StObject.set(x, "updateModel", js.Any.fromFunction1((t0: XModel) => value(t0).runNow()))
  }
}
