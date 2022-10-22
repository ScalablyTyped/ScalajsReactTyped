package typingsJapgolly.reactTable.mod

import typingsJapgolly.reactTable.anon.PartialTableToggleAllRows
import typingsJapgolly.reactTable.anon.PartialTableToggleRowsSel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowSelectHooks[D /* <: js.Object */] extends StObject {
  
  var getToggleAllPageRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ]
  
  var getToggleAllRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ]
  
  var getToggleRowSelectedProps: js.Array[
    PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
  ]
}
object UseRowSelectHooks {
  
  inline def apply[D /* <: js.Object */](
    getToggleAllPageRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleAllRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleRowSelectedProps: js.Array[
      PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
    ]
  ): UseRowSelectHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllPageRowsSelectedProps = getToggleAllPageRowsSelectedProps.asInstanceOf[js.Any], getToggleAllRowsSelectedProps = getToggleAllRowsSelectedProps.asInstanceOf[js.Any], getToggleRowSelectedProps = getToggleRowSelectedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectHooks[D]]
  }
  
  extension [Self <: UseRowSelectHooks[?], D /* <: js.Object */](x: Self & UseRowSelectHooks[D]) {
    
    inline def setGetToggleAllPageRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self = StObject.set(x, "getToggleAllPageRowsSelectedProps", value.asInstanceOf[js.Any])
    
    inline def setGetToggleAllPageRowsSelectedPropsVarargs(value: (PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows])*): Self = StObject.set(x, "getToggleAllPageRowsSelectedProps", js.Array(value*))
    
    inline def setGetToggleAllRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self = StObject.set(x, "getToggleAllRowsSelectedProps", value.asInstanceOf[js.Any])
    
    inline def setGetToggleAllRowsSelectedPropsVarargs(value: (PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows])*): Self = StObject.set(x, "getToggleAllRowsSelectedProps", js.Array(value*))
    
    inline def setGetToggleRowSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
        ]
    ): Self = StObject.set(x, "getToggleRowSelectedProps", value.asInstanceOf[js.Any])
    
    inline def setGetToggleRowSelectedPropsVarargs(value: (PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel])*): Self = StObject.set(x, "getToggleRowSelectedProps", js.Array(value*))
  }
}
