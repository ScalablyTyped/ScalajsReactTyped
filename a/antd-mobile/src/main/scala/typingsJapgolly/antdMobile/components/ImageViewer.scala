package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.anon.OmitImageViewerPropsimage
import typingsJapgolly.antdMobile.esComponentsImageViewerImageViewerMod.ImageViewerProps
import typingsJapgolly.antdMobile.esComponentsImageViewerSlidesMod.SlidesRef
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageViewer {
  
  object Multi {
    
    @JSImport("antd-mobile", "ImageViewer.Multi")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Multi.type): SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef] = new SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitImageViewerPropsimage): SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef] = new SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd-mobile", "ImageViewer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
    
    inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def getContainerCallbackTo(value: CallbackTo[HTMLElement]): this.type = set("getContainer", value.toJsFn)
    
    inline def getContainerNull: this.type = set("getContainer", null)
    
    inline def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def renderFooter(value: /* image */ String => Node): this.type = set("renderFooter", js.Any.fromFunction1(value))
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImageViewer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageViewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
