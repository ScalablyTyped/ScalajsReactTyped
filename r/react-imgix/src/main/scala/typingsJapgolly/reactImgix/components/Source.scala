package typingsJapgolly.reactImgix.components

import typingsJapgolly.reactImgix.mod.SharedImgixAndSourceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Source {
  
  inline def apply(src: String): SharedBuilder_SharedImgixAndSourceProps573778990[typingsJapgolly.reactImgix.mod.Source] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_SharedImgixAndSourceProps573778990[typingsJapgolly.reactImgix.mod.Source](js.Array(this.component, __props.asInstanceOf[SharedImgixAndSourceProps]))
  }
  
  @JSImport("react-imgix", "Source")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SharedImgixAndSourceProps): SharedBuilder_SharedImgixAndSourceProps573778990[typingsJapgolly.reactImgix.mod.Source] = new SharedBuilder_SharedImgixAndSourceProps573778990[typingsJapgolly.reactImgix.mod.Source](js.Array(this.component, p.asInstanceOf[js.Any]))
}
