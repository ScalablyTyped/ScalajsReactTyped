package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides auditing functions of a document. */
trait XDocumentAuditing
  extends StObject
     with XInterface {
  
  /**
    * refreshes all existing auditing arrows on all sheets of the document.
    *
    * Dependencies are marked for all the cells that were marked before, but using current formulas.
    */
  def refreshArrows(): Unit
}
object XDocumentAuditing {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, refreshArrows: Callback, release: Callback): XDocumentAuditing = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refreshArrows = refreshArrows.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XDocumentAuditing]
  }
  
  extension [Self <: XDocumentAuditing](x: Self) {
    
    inline def setRefreshArrows(value: Callback): Self = StObject.set(x, "refreshArrows", value.toJsFn)
  }
}
