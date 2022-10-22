package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.anon.OmitImageViewerPropsimage
import typingsJapgolly.antdMobile.esComponentsImageViewerSlidesMod.SlidesRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiImageViewer {
  
  @JSImport("antd-mobile/es/components/image-viewer/image-viewer", "MultiImageViewer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MultiImageViewer.type): SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef] = new SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OmitImageViewerPropsimage): SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef] = new SharedBuilder_OmitImageViewerPropsimage200670962[SlidesRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
