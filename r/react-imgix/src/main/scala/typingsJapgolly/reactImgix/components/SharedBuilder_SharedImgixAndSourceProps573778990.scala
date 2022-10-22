package typingsJapgolly.reactImgix.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLSourceElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactImgix.mod.AttributeConfig
import typingsJapgolly.reactImgix.mod.ImgixHTMLAttributes
import typingsJapgolly.reactImgix.mod.ImgixParams
import typingsJapgolly.reactImgix.mod.SrcSetParams
import typingsJapgolly.std.HTMLPictureElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SharedImgixAndSourceProps573778990[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def attributeConfig(value: AttributeConfig): this.type = set("attributeConfig", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def disableLibraryParam(value: Boolean): this.type = set("disableLibraryParam", value.asInstanceOf[js.Any])
  
  inline def disablePathEncoding(value: Boolean): this.type = set("disablePathEncoding", value.asInstanceOf[js.Any])
  
  inline def disableQualityByDPR(value: Boolean): this.type = set("disableQualityByDPR", value.asInstanceOf[js.Any])
  
  inline def disableSrcSet(value: Boolean): this.type = set("disableSrcSet", value.asInstanceOf[js.Any])
  
  inline def domain(value: String): this.type = set("domain", value.asInstanceOf[js.Any])
  
  inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def htmlAttributes(value: ImgixHTMLAttributes): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
  
  inline def imgixParams(value: ImgixParams): this.type = set("imgixParams", value.asInstanceOf[js.Any])
  
  inline def onMounted(
    value: /* ref */ js.UndefOr[RefHandle[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Callback
  ): this.type = set("onMounted", js.Any.fromFunction1((t0: /* ref */ js.UndefOr[RefHandle[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]]) => value(t0).runNow()))
  
  inline def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
  
  inline def srcSetOptions(value: SrcSetParams): this.type = set("srcSetOptions", value.asInstanceOf[js.Any])
  
  inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
}
