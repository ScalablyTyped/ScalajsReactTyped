package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libImagePickerIndexDotnativeMod.ImagePickerNativeProps
import typingsJapgolly.antdMobileRn.libImagePickerStyleIndexDotnativeMod.IImagePickerStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagePicker {
  
  @JSImport("antd-mobile-rn", "ImagePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.ImagePicker] {
    
    inline def files(value: js.Array[js.Object]): this.type = set("files", value.asInstanceOf[js.Any])
    
    inline def filesVarargs(value: js.Object*): this.type = set("files", js.Array(value*))
    
    inline def onAddImageClick(value: Callback): this.type = set("onAddImageClick", value.toJsFn)
    
    inline def onChange(
      value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ String, t2: /* index */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def onFail(value: /* msg */ String => Callback): this.type = set("onFail", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
    
    inline def onImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback): this.type = set("onImageClick", js.Any.fromFunction2((t0: /* index */ js.UndefOr[Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => (value(t0, t1)).runNow()))
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def styles(value: IImagePickerStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImagePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImagePickerNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
