package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.materialUiCore.materialUiCoreStrings.circle
import typingsJapgolly.materialUiCore.materialUiCoreStrings.circular
import typingsJapgolly.materialUiCore.materialUiCoreStrings.rounded
import typingsJapgolly.materialUiCore.materialUiCoreStrings.square
import typingsJapgolly.react.mod.ImgHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alt extends StObject {
  
  /**
    * Used in combination with `src` or `srcSet` to
    * provide an alt attribute for the rendered `img` element.
    */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Used to render icon or text elements inside the Avatar if `src` is not set.
    * This can be an element, or just a string.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Attributes applied to the `img` element if the component is used to display an image.
    * It can be used to listen for the loading error event.
    */
  var imgProps: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.undefined
  
  /**
    * The `sizes` attribute for the `img` element.
    */
  var sizes: js.UndefOr[String] = js.undefined
  
  /**
    * The `src` attribute for the `img` element.
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * The `srcSet` attribute for the `img` element.
    * Use this attribute for responsive image display.
    */
  var srcSet: js.UndefOr[String] = js.undefined
  
  /**
    * The shape of the avatar.
    */
  var variant: js.UndefOr[circle | circular | rounded | square] = js.undefined
}
object Alt {
  
  inline def apply(): Alt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alt]
  }
  
  extension [Self <: Alt](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setImgProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
    
    inline def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setVariant(value: circle | circular | rounded | square): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
