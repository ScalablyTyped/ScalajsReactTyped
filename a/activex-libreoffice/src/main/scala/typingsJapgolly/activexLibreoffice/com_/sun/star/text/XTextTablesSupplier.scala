package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to handle text tables. */
trait XTextTablesSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  val TextTables: XNameAccess
  
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  def getTextTables(): XNameAccess
}
object XTextTablesSupplier {
  
  inline def apply(
    TextTables: XNameAccess,
    acquire: Callback,
    getTextTables: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextTablesSupplier = {
    val __obj = js.Dynamic.literal(TextTables = TextTables.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTextTables = getTextTables.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextTablesSupplier]
  }
  
  extension [Self <: XTextTablesSupplier](x: Self) {
    
    inline def setGetTextTables(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getTextTables", value.toJsFn)
    
    inline def setTextTables(value: XNameAccess): Self = StObject.set(x, "TextTables", value.asInstanceOf[js.Any])
  }
}
