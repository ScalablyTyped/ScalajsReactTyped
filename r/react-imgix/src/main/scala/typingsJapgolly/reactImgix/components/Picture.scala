package typingsJapgolly.reactImgix.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLSourceElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactImgix.mod.CommonProps
import typingsJapgolly.reactImgix.mod.ImgixHTMLAttributes
import typingsJapgolly.std.HTMLPictureElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picture {
  
  @JSImport("react-imgix", "Picture")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactImgix.mod.Picture] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def domain(value: String): this.type = set("domain", value.asInstanceOf[js.Any])
    
    inline def htmlAttributes(value: ImgixHTMLAttributes): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def onMounted(
      value: /* ref */ js.UndefOr[RefHandle[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Callback
    ): this.type = set("onMounted", js.Any.fromFunction1((t0: /* ref */ js.UndefOr[RefHandle[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]]) => value(t0).runNow()))
  }
  
  implicit def make(companion: Picture.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[CommonProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
