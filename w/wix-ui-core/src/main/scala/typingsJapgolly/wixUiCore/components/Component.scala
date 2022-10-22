package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoMod.IVideoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  inline def apply(id: String, src: String | js.Array[String]): SharedBuilder_IVideoProps_1550523449[
    typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoDotstoryMod.default.component
  ] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    new SharedBuilder_IVideoProps_1550523449[
    typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoDotstoryMod.default.component
  ](js.Array(this.component, __props.asInstanceOf[IVideoProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.component")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IVideoProps): SharedBuilder_IVideoProps_1550523449[
    typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoDotstoryMod.default.component
  ] = new SharedBuilder_IVideoProps_1550523449[
    typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoDotstoryMod.default.component
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
}
