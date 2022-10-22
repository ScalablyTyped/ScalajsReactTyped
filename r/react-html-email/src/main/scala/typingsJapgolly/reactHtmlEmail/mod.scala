package typingsJapgolly.reactHtmlEmail

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactHtmlEmail.anon.Strict
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.bottom
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.center
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.left
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.middle
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.right
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-html-email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-html-email", "A")
  @js.native
  val A: FunctionComponent[AProps] = js.native
  
  @JSImport("react-html-email", "Box")
  @js.native
  val Box: FunctionComponent[BoxProps] = js.native
  
  @JSImport("react-html-email", "Email")
  @js.native
  val Email: FunctionComponent[EmailProps] = js.native
  
  @JSImport("react-html-email", "Image")
  @js.native
  val Image: FunctionComponent[ImageProps] = js.native
  
  @JSImport("react-html-email", "Item")
  @js.native
  val Item: FunctionComponent[ItemProps] = js.native
  
  @JSImport("react-html-email", "Span")
  @js.native
  val Span: FunctionComponent[SpanProps] = js.native
  
  inline def configStyleValidator(config: Strict): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configStyleValidator")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderEmail(emailElement: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderEmail")(emailElement.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait AProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var download: js.UndefOr[String] = js.undefined
    
    var href: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
  }
  object AProps {
    
    inline def apply(href: String): AProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[AProps]
    }
    
    extension [Self <: AProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    }
  }
  
  trait BoxProps extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var bgcolor: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[String] = js.undefined
    
    var cellPadding: js.UndefOr[Double] = js.undefined
    
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var valign: js.UndefOr[top | middle | bottom] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object BoxProps {
    
    inline def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    extension [Self <: BoxProps](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCellPadding(value: Double): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait EmailProps extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var bgcolor: js.UndefOr[String] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var cellPadding: js.UndefOr[Double] = js.undefined
    
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var headCSS: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: String
    
    var valign: js.UndefOr[top | middle | bottom] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object EmailProps {
    
    inline def apply(title: String): EmailProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailProps]
    }
    
    extension [Self <: EmailProps](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setCellPadding(value: Double): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeadCSS(value: String): Self = StObject.set(x, "headCSS", value.asInstanceOf[js.Any])
      
      inline def setHeadCSSUndefined: Self = StObject.set(x, "headCSS", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ImageProps extends StObject {
    
    var alt: String
    
    var height: Double
    
    var src: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var width: Double
  }
  object ImageProps {
    
    inline def apply(alt: String, height: Double, src: String, width: Double): ImageProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemProps extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var bgcolor: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var valign: js.UndefOr[top | middle | bottom] = js.undefined
  }
  object ItemProps {
    
    inline def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    }
  }
  
  trait SpanProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SpanProps {
    
    inline def apply(): SpanProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpanProps]
    }
    
    extension [Self <: SpanProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
