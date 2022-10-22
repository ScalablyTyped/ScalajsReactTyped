package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsElementsImageImageGroupMod.ImageGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Image.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_ImageGroupProps1461017803 = new SharedBuilder_ImageGroupProps1461017803(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ImageGroupProps): SharedBuilder_ImageGroupProps1461017803 = new SharedBuilder_ImageGroupProps1461017803(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Image")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Image.type): SharedBuilder_ItemImageProps_1837087541 = new SharedBuilder_ItemImageProps_1837087541(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageProps): SharedBuilder_ItemImageProps_1837087541 = new SharedBuilder_ItemImageProps_1837087541(js.Array(this.component, p.asInstanceOf[js.Any]))
}
