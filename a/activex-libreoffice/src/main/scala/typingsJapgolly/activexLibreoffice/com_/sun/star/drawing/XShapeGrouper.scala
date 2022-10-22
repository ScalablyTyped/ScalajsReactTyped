package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the group/ungroup functionality. */
trait XShapeGrouper
  extends StObject
     with XInterface {
  
  /**
    * groups the {@link Shapes} inside a collection.
    *
    * Grouping of objects in text documents works only if none of the objects has an anchor of type
    * com::sun::star::text::TextContentAnchorType::AS_CHARACTER
    *
    * .
    * @param xShapes the {@link Shapes} that will be grouped. They must all be inserted into the same {@link GenericDrawPage} .
    * @returns a newly created {@link GroupShape} that contains all {@link Shapes} from xShapes and is also added to the {@link GenericDrawPage} of the {@link S
    */
  def group(xShapes: XShapes): XShapeGroup
  
  /**
    * ungroups a given {@link GroupShape} .
    * @param aGroup moves all {@link Shapes} from this {@link GroupShape} to the parent {@link XShapes} of the {@link GroupShape} . The {@link GroupShape} is
    */
  def ungroup(aGroup: XShapeGroup): Unit
}
object XShapeGrouper {
  
  inline def apply(
    acquire: Callback,
    group: XShapes => XShapeGroup,
    queryInterface: `type` => Any,
    release: Callback,
    ungroup: XShapeGroup => Callback
  ): XShapeGrouper = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, group = js.Any.fromFunction1(group), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, ungroup = js.Any.fromFunction1((t0: XShapeGroup) => ungroup(t0).runNow()))
    __obj.asInstanceOf[XShapeGrouper]
  }
  
  extension [Self <: XShapeGrouper](x: Self) {
    
    inline def setGroup(value: XShapes => XShapeGroup): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setUngroup(value: XShapeGroup => Callback): Self = StObject.set(x, "ungroup", js.Any.fromFunction1((t0: XShapeGroup) => value(t0).runNow()))
  }
}
