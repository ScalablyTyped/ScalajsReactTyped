package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the reference marks within this context (i.e. document).
  *
  * A reference mark is used to refer to text positions in a text document.
  */
trait XReferenceMarksSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of reference marks. */
  val ReferenceMarks: XNameAccess
  
  /** @returns the collection of reference marks. */
  def getReferenceMarks(): XNameAccess
}
object XReferenceMarksSupplier {
  
  inline def apply(
    ReferenceMarks: XNameAccess,
    acquire: Callback,
    getReferenceMarks: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XReferenceMarksSupplier = {
    val __obj = js.Dynamic.literal(ReferenceMarks = ReferenceMarks.asInstanceOf[js.Any], acquire = acquire.toJsFn, getReferenceMarks = getReferenceMarks.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XReferenceMarksSupplier]
  }
  
  extension [Self <: XReferenceMarksSupplier](x: Self) {
    
    inline def setGetReferenceMarks(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getReferenceMarks", value.toJsFn)
    
    inline def setReferenceMarks(value: XNameAccess): Self = StObject.set(x, "ReferenceMarks", value.asInstanceOf[js.Any])
  }
}
