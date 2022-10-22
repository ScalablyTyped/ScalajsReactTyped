package typingsJapgolly.reactInnerImageZoom.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.reactInnerImageZoom.anon.Media
import typingsJapgolly.reactInnerImageZoom.reactInnerImageZoomStrings.click
import typingsJapgolly.reactInnerImageZoom.reactInnerImageZoomStrings.drag
import typingsJapgolly.reactInnerImageZoom.reactInnerImageZoomStrings.hover
import typingsJapgolly.reactInnerImageZoom.reactInnerImageZoomStrings.pan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_InnerImageZoomProps99278397[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def afterZoomIn(value: Callback): this.type = set("afterZoomIn", value.toJsFn)
  
  inline def afterZoomOut(value: Callback): this.type = set("afterZoomOut", value.toJsFn)
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def fadeDuration(value: Double): this.type = set("fadeDuration", value.asInstanceOf[js.Any])
  
  inline def fullscreenOnMobile(value: Boolean): this.type = set("fullscreenOnMobile", value.asInstanceOf[js.Any])
  
  inline def hasSpacer(value: Boolean): this.type = set("hasSpacer", value.asInstanceOf[js.Any])
  
  inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def hideCloseButton(value: Boolean): this.type = set("hideCloseButton", value.asInstanceOf[js.Any])
  
  inline def hideHint(value: Boolean): this.type = set("hideHint", value.asInstanceOf[js.Any])
  
  inline def imgAttributes(value: ImgHTMLAttributes[HTMLImageElement]): this.type = set("imgAttributes", value.asInstanceOf[js.Any])
  
  inline def mobileBreakpoint(value: Double): this.type = set("mobileBreakpoint", value.asInstanceOf[js.Any])
  
  inline def moveType(value: pan | drag): this.type = set("moveType", value.asInstanceOf[js.Any])
  
  inline def sources(value: js.Array[Media]): this.type = set("sources", value.asInstanceOf[js.Any])
  
  inline def sourcesVarargs(value: Media*): this.type = set("sources", js.Array(value*))
  
  inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def zoomPreload(value: Boolean): this.type = set("zoomPreload", value.asInstanceOf[js.Any])
  
  inline def zoomScale(value: Double): this.type = set("zoomScale", value.asInstanceOf[js.Any])
  
  inline def zoomSrc(value: String): this.type = set("zoomSrc", value.asInstanceOf[js.Any])
  
  inline def zoomType(value: click | hover): this.type = set("zoomType", value.asInstanceOf[js.Any])
}
