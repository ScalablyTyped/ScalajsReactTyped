package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a collection of cell annotations. */
trait XSheetAnnotationsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  val Annotations: XSheetAnnotations
  
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  def getAnnotations(): XSheetAnnotations
}
object XSheetAnnotationsSupplier {
  
  inline def apply(
    Annotations: XSheetAnnotations,
    acquire: Callback,
    getAnnotations: CallbackTo[XSheetAnnotations],
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetAnnotationsSupplier = {
    val __obj = js.Dynamic.literal(Annotations = Annotations.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAnnotations = getAnnotations.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetAnnotationsSupplier]
  }
  
  extension [Self <: XSheetAnnotationsSupplier](x: Self) {
    
    inline def setAnnotations(value: XSheetAnnotations): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
    
    inline def setGetAnnotations(value: CallbackTo[XSheetAnnotations]): Self = StObject.set(x, "getAnnotations", value.toJsFn)
  }
}
