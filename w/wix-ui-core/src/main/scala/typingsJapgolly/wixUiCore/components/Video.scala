package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoMod.IVideoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  inline def apply(id: String, src: String | js.Array[String]): SharedBuilder_IVideoProps_1550523449[typingsJapgolly.wixUiCore.distEsSrcMod.Video] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    new SharedBuilder_IVideoProps_1550523449[typingsJapgolly.wixUiCore.distEsSrcMod.Video](js.Array(this.component, __props.asInstanceOf[IVideoProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "Video")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IVideoProps): SharedBuilder_IVideoProps_1550523449[typingsJapgolly.wixUiCore.distEsSrcMod.Video] = new SharedBuilder_IVideoProps_1550523449[typingsJapgolly.wixUiCore.distEsSrcMod.Video](js.Array(this.component, p.asInstanceOf[js.Any]))
}
