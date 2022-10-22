package typingsJapgolly.reactWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: js.UndefOr[typingsJapgolly.reactWindow.mod.Align] = js.undefined
    
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    var rowIndex: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    inline def apply(): Align = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Align]
    }
    
    extension [Self <: Align](x: Self) {
      
      inline def setAlign(value: typingsJapgolly.reactWindow.mod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  trait ColumnIndex[T] extends StObject {
    
    var columnIndex: Double
    
    var data: T
    
    var rowIndex: Double
  }
  object ColumnIndex {
    
    inline def apply[T](columnIndex: Double, data: T, rowIndex: Double): ColumnIndex[T] = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnIndex[T]]
    }
    
    extension [Self <: ColumnIndex[?], T](x: Self & ColumnIndex[T]) {
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props[P, S] extends StObject {
    
    var props: P
    
    var state: S
  }
  object Props {
    
    inline def apply[P, S](props: P, state: S): Props[P, S] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[P, S]]
    }
    
    extension [Self <: Props[?, ?], P, S](x: Self & (Props[P, S])) {
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowIndex extends StObject {
    
    var columnIndex: Double
    
    var rowIndex: Double
    
    var shouldForceUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object RowIndex {
    
    inline def apply(columnIndex: Double, rowIndex: Double): RowIndex = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowIndex]
    }
    
    extension [Self <: RowIndex](x: Self) {
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setShouldForceUpdate(value: Boolean): Self = StObject.set(x, "shouldForceUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldForceUpdateUndefined: Self = StObject.set(x, "shouldForceUpdate", js.undefined)
    }
  }
  
  trait ScrollLeft extends StObject {
    
    var scrollLeft: js.UndefOr[Double] = js.undefined
    
    var scrollTop: js.UndefOr[Double] = js.undefined
  }
  object ScrollLeft {
    
    inline def apply(): ScrollLeft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollLeft]
    }
    
    extension [Self <: ScrollLeft](x: Self) {
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    }
  }
}
