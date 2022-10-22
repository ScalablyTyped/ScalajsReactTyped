package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  trait ColumnPicker[T /* <: SlickData */] extends StObject {
    
    def destroy(): Unit
    
    def getAllColumns(): js.Array[Column[T]]
  }
  object ColumnPicker {
    
    inline def apply[T /* <: SlickData */](destroy: Callback, getAllColumns: CallbackTo[js.Array[Column[T]]]): ColumnPicker[T] = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getAllColumns = getAllColumns.toJsFn)
      __obj.asInstanceOf[ColumnPicker[T]]
    }
    
    extension [Self <: ColumnPicker[?], T /* <: SlickData */](x: Self & ColumnPicker[T]) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetAllColumns(value: CallbackTo[js.Array[Column[T]]]): Self = StObject.set(x, "getAllColumns", value.toJsFn)
    }
  }
  
  trait SlickColumnPickerOptions extends StObject {
    
    var fadeSpeed: js.UndefOr[Double] = js.undefined
  }
  object SlickColumnPickerOptions {
    
    inline def apply(): SlickColumnPickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlickColumnPickerOptions]
    }
    
    extension [Self <: SlickColumnPickerOptions](x: Self) {
      
      inline def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      inline def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
    }
  }
}
