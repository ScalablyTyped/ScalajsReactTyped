package typingsJapgolly.reactImgpro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactImgpro.anon.Blue
import typingsJapgolly.reactImgpro.anon.Degree
import typingsJapgolly.reactImgpro.anon.Height
import typingsJapgolly.reactImgpro.anon.Horizontal
import typingsJapgolly.reactImgpro.mod.ReactImgpro.ProcessImageProps
import typingsJapgolly.reactImgpro.mod.ReactImgpro.Shape
import typingsJapgolly.reactImgpro.mod.ReactImgpro.Size
import typingsJapgolly.reactImgpro.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImgpro {
  
  inline def apply(image: String, onProcessFinish: Callback): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = onProcessFinish.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ProcessImageProps]))
  }
  
  @JSImport("react-imgpro", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def blur(value: Double): this.type = set("blur", value.asInstanceOf[js.Any])
    
    inline def brightness(value: Double): this.type = set("brightness", value.asInstanceOf[js.Any])
    
    inline def colors(value: Blue): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def contain(value: Size): this.type = set("contain", value.asInstanceOf[js.Any])
    
    inline def contrast(value: Double): this.type = set("contrast", value.asInstanceOf[js.Any])
    
    inline def cover(value: Size): this.type = set("cover", value.asInstanceOf[js.Any])
    
    inline def customCdn(value: String): this.type = set("customCdn", value.asInstanceOf[js.Any])
    
    inline def disableRerender(value: Boolean): this.type = set("disableRerender", value.asInstanceOf[js.Any])
    
    inline def disableWebWorker(value: Boolean): this.type = set("disableWebWorker", value.asInstanceOf[js.Any])
    
    inline def dither565(value: Boolean): this.type = set("dither565", value.asInstanceOf[js.Any])
    
    inline def fade(value: Double): this.type = set("fade", value.asInstanceOf[js.Any])
    
    inline def flip(value: Horizontal): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def greyscale(value: Boolean): this.type = set("greyscale", value.asInstanceOf[js.Any])
    
    inline def invert(value: Boolean): this.type = set("invert", value.asInstanceOf[js.Any])
    
    inline def normalize(value: Boolean): this.type = set("normalize", value.asInstanceOf[js.Any])
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def opaque(value: Boolean): this.type = set("opaque", value.asInstanceOf[js.Any])
    
    inline def posterize(value: Double): this.type = set("posterize", value.asInstanceOf[js.Any])
    
    inline def quality(value: Double): this.type = set("quality", value.asInstanceOf[js.Any])
    
    inline def resize(value: Shape): this.type = set("resize", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Degree): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def scale(value: Boolean): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleToFitImage(value: Height): this.type = set("scaleToFitImage", value.asInstanceOf[js.Any])
    
    inline def sepia(value: Boolean): this.type = set("sepia", value.asInstanceOf[js.Any])
    
    inline def storage(value: Boolean): this.type = set("storage", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProcessImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
