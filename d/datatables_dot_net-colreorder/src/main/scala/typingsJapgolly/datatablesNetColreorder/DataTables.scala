package typingsJapgolly.datatablesNetColreorder

import japgolly.scalajs.react.Callback
import typingsJapgolly.datatablesNetColreorder.anon.Move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var colReorder: Move
  }
  object Api {
    
    inline def apply(colReorder: Move): Api = {
      val __obj = js.Dynamic.literal(colReorder = colReorder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setColReorder(value: Move): Self = StObject.set(x, "colReorder", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColReorderSettings extends StObject {
    
    /*
      * Number of columns (counting from the left) to disallow reordering of, '0' in default
      */
    var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
    
    /*
      * Number of columns (counting from the right) to disallow reordering of, '0' in default
      */
    var fixedColumnsRight: js.UndefOr[Double] = js.undefined
    
    /*
      * Set a default order for the columns in the table
      */
    var order: js.UndefOr[js.Array[Double]] = js.undefined
    
    /*
      * Enable / disable live reordering of columns during a drag, 'true' in default
      */
    var realtime: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Callback after reorder
      */
    def reorderCallback(): Unit
  }
  object ColReorderSettings {
    
    inline def apply(reorderCallback: Callback): ColReorderSettings = {
      val __obj = js.Dynamic.literal(reorderCallback = reorderCallback.toJsFn)
      __obj.asInstanceOf[ColReorderSettings]
    }
    
    extension [Self <: ColReorderSettings](x: Self) {
      
      inline def setFixedColumnsLeft(value: Double): Self = StObject.set(x, "fixedColumnsLeft", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsLeftUndefined: Self = StObject.set(x, "fixedColumnsLeft", js.undefined)
      
      inline def setFixedColumnsRight(value: Double): Self = StObject.set(x, "fixedColumnsRight", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsRightUndefined: Self = StObject.set(x, "fixedColumnsRight", js.undefined)
      
      inline def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
      
      inline def setReorderCallback(value: Callback): Self = StObject.set(x, "reorderCallback", value.toJsFn)
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * colReorder extension options
      */
    var colReorder: js.UndefOr[Boolean | ColReorderSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setColReorder(value: Boolean | ColReorderSettings): Self = StObject.set(x, "colReorder", value.asInstanceOf[js.Any])
      
      inline def setColReorderUndefined: Self = StObject.set(x, "colReorder", js.undefined)
    }
  }
}
