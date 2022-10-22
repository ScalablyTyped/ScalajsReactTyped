package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerPropsTypeMod {
  
  trait ImagePickerPropTypes extends StObject {
    
    var files: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* files */ js.Array[js.Object], 
          /* operationType */ String, 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var onImageClick: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
      ] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var styles: js.UndefOr[js.Object] = js.undefined
  }
  object ImagePickerPropTypes {
    
    inline def apply(): ImagePickerPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerPropTypes]
    }
    
    extension [Self <: ImagePickerPropTypes](x: Self) {
      
      inline def setFiles(value: js.Array[js.Object]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: js.Object*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setOnAddImageClick(value: Callback): Self = StObject.set(x, "onAddImageClick", value.toJsFn)
      
      inline def setOnAddImageClickUndefined: Self = StObject.set(x, "onAddImageClick", js.undefined)
      
      inline def setOnChange(
        value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ String, t2: /* index */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFail(value: /* msg */ String => Callback): Self = StObject.set(x, "onFail", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
      
      inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      inline def setOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback): Self = StObject.set(x, "onImageClick", js.Any.fromFunction2((t0: /* index */ js.UndefOr[Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => (value(t0, t1)).runNow()))
      
      inline def setOnImageClickUndefined: Self = StObject.set(x, "onImageClick", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
