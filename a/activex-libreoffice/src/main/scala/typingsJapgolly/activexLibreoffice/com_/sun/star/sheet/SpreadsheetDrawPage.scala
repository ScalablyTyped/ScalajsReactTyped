package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShapeGroup
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShapeGrouper
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShapes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service is implemented by every page of a {@link SpreadsheetDocument} .
  *
  * Example: create and insert a couple of com::sun::star::drawing::LineShapes:
  *
  * {{program example here, see documentation}}
  * @since OOo 1.1.2
  */
trait SpreadsheetDrawPage
  extends StObject
     with XShapes
     with XShapeGrouper
object SpreadsheetDrawPage {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    add: XShape => Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    group: XShapes => XShapeGroup,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: XShape => Callback,
    ungroup: XShapeGroup => Callback
  ): SpreadsheetDrawPage = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction1((t0: XShape) => add(t0).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, group = js.Any.fromFunction1(group), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XShape) => remove(t0).runNow()), ungroup = js.Any.fromFunction1((t0: XShapeGroup) => ungroup(t0).runNow()))
    __obj.asInstanceOf[SpreadsheetDrawPage]
  }
}
