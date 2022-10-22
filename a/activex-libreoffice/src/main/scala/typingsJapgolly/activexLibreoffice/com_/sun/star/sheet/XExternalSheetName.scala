package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a method to set an external name at the sheet.
  *
  * An external reference in a cell formula is implemented using a hidden sheet which is linked to the sheet in the external document. The name of the
  * hidden sheet is composed of the URL of the external document and the external sheet name.
  * @since OOo 3.0
  */
trait XExternalSheetName
  extends StObject
     with XInterface {
  
  /**
    * sets an external name at the sheet.
    *
    * This method allows to compose the sheet name from the URL of the external document and the name of the external sheet.
    * @param aUrl the URL of the external document.
    * @param aSheetName the name of the sheet in the external document.
    * @throws com::sun::star::container::ElementExistException a sheet with that external name already exists in this document
    */
  def setExternalName(aUrl: String, aSheetName: String): Unit
}
object XExternalSheetName {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setExternalName: (String, String) => Callback
  ): XExternalSheetName = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setExternalName = js.Any.fromFunction2((t0: String, t1: String) => (setExternalName(t0, t1)).runNow()))
    __obj.asInstanceOf[XExternalSheetName]
  }
  
  extension [Self <: XExternalSheetName](x: Self) {
    
    inline def setSetExternalName(value: (String, String) => Callback): Self = StObject.set(x, "setExternalName", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
