package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control a data pilot field which has already been created.
  * @see com.sun.star.sheet.DataPilotField
  */
trait XDataPilotField
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  val Items: XIndexAccess
  
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  def getItems(): XIndexAccess
}
object XDataPilotField {
  
  inline def apply(
    Items: XIndexAccess,
    acquire: Callback,
    getItems: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataPilotField = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], acquire = acquire.toJsFn, getItems = getItems.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotField]
  }
  
  extension [Self <: XDataPilotField](x: Self) {
    
    inline def setGetItems(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setItems(value: XIndexAccess): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
  }
}
