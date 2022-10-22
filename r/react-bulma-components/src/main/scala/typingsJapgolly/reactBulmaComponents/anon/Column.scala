package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsColumnsMod.ColumnProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var Column: BulmaComponent[ColumnProps, div]
}
object Column {
  
  inline def apply(Column: /* props */ ColumnProps & (ElementProps[ColumnProps, div]) => Element): Column = {
    val __obj = js.Dynamic.literal(Column = js.Any.fromFunction1(Column))
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: /* props */ ColumnProps & (ElementProps[ColumnProps, div]) => Element): Self = StObject.set(x, "Column", js.Any.fromFunction1(value))
  }
}
