package typingsJapgolly.reactImgix.components

import typingsJapgolly.reactImgix.mod.SharedImgixAndSourceProps
import typingsJapgolly.reactImgix.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImgix {
  
  inline def apply(src: String): SharedBuilder_SharedImgixAndSourceProps573778990[default] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_SharedImgixAndSourceProps573778990[default](js.Array(this.component, __props.asInstanceOf[SharedImgixAndSourceProps]))
  }
  
  @JSImport("react-imgix", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SharedImgixAndSourceProps): SharedBuilder_SharedImgixAndSourceProps573778990[default] = new SharedBuilder_SharedImgixAndSourceProps573778990[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
