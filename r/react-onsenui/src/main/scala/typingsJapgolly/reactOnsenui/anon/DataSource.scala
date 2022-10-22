package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource[T] extends StObject {
  
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  
  var renderRow: js.UndefOr[js.Function2[/* row */ T, /* index */ js.UndefOr[Double], js.UndefOr[Element]]] = js.undefined
}
object DataSource {
  
  inline def apply[T](): DataSource[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource[T]]
  }
  
  extension [Self <: DataSource[?], T](x: Self & DataSource[T]) {
    
    inline def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setRenderFooter(value: CallbackTo[js.UndefOr[Element]]): Self = StObject.set(x, "renderFooter", value.toJsFn)
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setRenderHeader(value: CallbackTo[js.UndefOr[Element]]): Self = StObject.set(x, "renderHeader", value.toJsFn)
    
    inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    inline def setRenderRow(value: (/* row */ T, /* index */ js.UndefOr[Double]) => js.UndefOr[Element]): Self = StObject.set(x, "renderRow", js.Any.fromFunction2(value))
    
    inline def setRenderRowUndefined: Self = StObject.set(x, "renderRow", js.undefined)
  }
}
