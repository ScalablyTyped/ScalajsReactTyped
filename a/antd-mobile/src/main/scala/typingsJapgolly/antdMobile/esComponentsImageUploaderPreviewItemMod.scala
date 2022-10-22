package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.File
import typingsJapgolly.antdMobile.antdMobileStrings.`scale-down`
import typingsJapgolly.antdMobile.antdMobileStrings.contain
import typingsJapgolly.antdMobile.antdMobileStrings.cover
import typingsJapgolly.antdMobile.antdMobileStrings.fill
import typingsJapgolly.antdMobile.antdMobileStrings.none
import typingsJapgolly.antdMobile.esComponentsImageUploaderImageUploaderMod.TaskStatus
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageUploaderPreviewItemMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/image-uploader/preview-item", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var deletable: Boolean
    
    var file: js.UndefOr[File] = js.undefined
    
    var imageFit: js.UndefOr[contain | cover | fill | none | `scale-down`] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDelete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var status: js.UndefOr[TaskStatus] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(deletable: Boolean): Props = {
      val __obj = js.Dynamic.literal(deletable = deletable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setImageFit(value: contain | cover | fill | none | `scale-down`): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      inline def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDelete(value: Callback): Self = StObject.set(x, "onDelete", value.toJsFn)
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsImageUploaderPreviewItemMod.foo` */
  override def _to: FC[Props] = default
}
