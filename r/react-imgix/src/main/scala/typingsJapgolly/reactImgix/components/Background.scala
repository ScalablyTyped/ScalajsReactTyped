package typingsJapgolly.reactImgix.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactImgix.mod.BackgroundProps
import typingsJapgolly.reactImgix.mod.ImgixHTMLAttributes
import typingsJapgolly.reactImgix.mod.ImgixParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[BackgroundProps]]))
  }
  
  @JSImport("react-imgix", "Background")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableLibraryParam(value: Boolean): this.type = set("disableLibraryParam", value.asInstanceOf[js.Any])
    
    inline def htmlAttributes(value: ImgixHTMLAttributes): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def imgixParams(value: ImgixParams): this.type = set("imgixParams", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[BackgroundProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
