package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.antdMobileStrings.`scale-down`
import typingsJapgolly.antdMobile.antdMobileStrings.contain
import typingsJapgolly.antdMobile.antdMobileStrings.cover
import typingsJapgolly.antdMobile.antdMobileStrings.fill
import typingsJapgolly.antdMobile.antdMobileStrings.none
import typingsJapgolly.antdMobile.esComponentsImageUploaderImageUploaderMod.TaskStatus
import typingsJapgolly.antdMobile.esComponentsImageUploaderPreviewItemMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreviewItem {
  
  inline def apply(deletable: Boolean): Builder = {
    val __props = js.Dynamic.literal(deletable = deletable.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("antd-mobile/es/components/image-uploader/preview-item", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def file(value: File): this.type = set("file", value.asInstanceOf[js.Any])
    
    inline def imageFit(value: contain | cover | fill | none | `scale-down`): this.type = set("imageFit", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def onDelete(value: Callback): this.type = set("onDelete", value.toJsFn)
    
    inline def status(value: TaskStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
