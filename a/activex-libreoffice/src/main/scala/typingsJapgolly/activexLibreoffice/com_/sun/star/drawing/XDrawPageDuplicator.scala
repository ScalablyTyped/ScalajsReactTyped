package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to duplicate pages within the same document. */
trait XDrawPageDuplicator
  extends StObject
     with XInterface {
  
  /**
    * creates a duplicate of a {@link DrawPage} or {@link MasterPage} , including the {@link Shapes} on that page and inserts it into the same model.
    * @param xPage that is the source {@link DrawPage} or {@link MasterPage} that will be duplicated
    * @returns a newly created {@link DrawPage} or {@link MasterPage} that as all properties and copies of all {@link Shapes} from the source page.
    */
  def duplicate(xPage: XDrawPage): XDrawPage
}
object XDrawPageDuplicator {
  
  inline def apply(
    acquire: Callback,
    duplicate: XDrawPage => XDrawPage,
    queryInterface: `type` => Any,
    release: Callback
  ): XDrawPageDuplicator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, duplicate = js.Any.fromFunction1(duplicate), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDrawPageDuplicator]
  }
  
  extension [Self <: XDrawPageDuplicator](x: Self) {
    
    inline def setDuplicate(value: XDrawPage => XDrawPage): Self = StObject.set(x, "duplicate", js.Any.fromFunction1(value))
  }
}
