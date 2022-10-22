package typingsJapgolly.muiImage.components

import typingsJapgolly.muiImage.mod.MuiImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  inline def apply(src: String): SharedBuilder_MuiImageProps1015013396 = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_MuiImageProps1015013396(js.Array(this.component, __props.asInstanceOf[MuiImageProps]))
  }
  
  @JSImport("mui-image", "Image")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MuiImageProps): SharedBuilder_MuiImageProps1015013396 = new SharedBuilder_MuiImageProps1015013396(js.Array(this.component, p.asInstanceOf[js.Any]))
}
