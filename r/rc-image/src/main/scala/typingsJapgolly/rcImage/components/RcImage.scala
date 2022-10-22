package typingsJapgolly.rcImage.components

import typingsJapgolly.rcImage.libImageMod.ImageProps
import typingsJapgolly.rcImage.libPreviewGroupMod.GroupConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcImage {
  
  object PreviewGroup {
    
    @JSImport("rc-image", "default.PreviewGroup")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: PreviewGroup.type): SharedBuilder_GroupConsumerProps_44527066 = new SharedBuilder_GroupConsumerProps_44527066(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GroupConsumerProps): SharedBuilder_GroupConsumerProps_44527066 = new SharedBuilder_GroupConsumerProps_44527066(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-image", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcImage.type): SharedBuilder_ImageProps361338012 = new SharedBuilder_ImageProps361338012(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageProps): SharedBuilder_ImageProps361338012 = new SharedBuilder_ImageProps361338012(js.Array(this.component, p.asInstanceOf[js.Any]))
}
