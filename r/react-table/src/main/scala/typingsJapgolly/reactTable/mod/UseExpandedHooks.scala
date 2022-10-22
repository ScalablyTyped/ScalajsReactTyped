package typingsJapgolly.reactTable.mod

import typingsJapgolly.reactTable.anon.PartialTableCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseExpandedHooks[D /* <: js.Object */] extends StObject {
  
  var getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  
  var getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
}
object UseExpandedHooks {
  
  inline def apply[D /* <: js.Object */](
    getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]],
    getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseExpandedHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsExpandedProps = getToggleAllRowsExpandedProps.asInstanceOf[js.Any], getToggleRowsExpandedProps = getToggleRowsExpandedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedHooks[D]]
  }
  
  extension [Self <: UseExpandedHooks[?], D /* <: js.Object */](x: Self & UseExpandedHooks[D]) {
    
    inline def setGetToggleAllRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = StObject.set(x, "getToggleAllRowsExpandedProps", value.asInstanceOf[js.Any])
    
    inline def setGetToggleAllRowsExpandedPropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = StObject.set(x, "getToggleAllRowsExpandedProps", js.Array(value*))
    
    inline def setGetToggleRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = StObject.set(x, "getToggleRowsExpandedProps", value.asInstanceOf[js.Any])
    
    inline def setGetToggleRowsExpandedPropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = StObject.set(x, "getToggleRowsExpandedProps", js.Array(value*))
  }
}
