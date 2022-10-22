package typingsJapgolly.commonmarkReactRenderer

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.commonmarkReactRenderer.mod.CodeBlockProps
import typingsJapgolly.commonmarkReactRenderer.mod.CodeProps
import typingsJapgolly.commonmarkReactRenderer.mod.CommonProps
import typingsJapgolly.commonmarkReactRenderer.mod.HeadingProps
import typingsJapgolly.commonmarkReactRenderer.mod.HtmlInlineBlockProps
import typingsJapgolly.commonmarkReactRenderer.mod.ImageProps
import typingsJapgolly.commonmarkReactRenderer.mod.LinkProps
import typingsJapgolly.commonmarkReactRenderer.mod.ListProps
import typingsJapgolly.commonmarkReactRenderer.mod.SoftBreakProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.Array[Any]
    
    var props: Any
    
    var renderer: String
    
    var `type`: String
  }
  object Children {
    
    inline def apply(children: js.Array[Any], props: Any, renderer: String, `type`: String): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<commonmark-react-renderer.commonmark-react-renderer.Renderers> */
  trait PartialRenderers extends StObject {
    
    var Blockquote: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var Code: js.UndefOr[String | ComponentType[CodeProps] | Null] = js.undefined
    
    var CodeBlock: js.UndefOr[String | ComponentType[CodeBlockProps] | Null] = js.undefined
    
    var Emph: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var Heading: js.UndefOr[String | ComponentType[HeadingProps] | Null] = js.undefined
    
    var HtmlBlock: js.UndefOr[String | ComponentType[HtmlInlineBlockProps] | Null] = js.undefined
    
    var HtmlInline: js.UndefOr[String | ComponentType[HtmlInlineBlockProps] | Null] = js.undefined
    
    var Image: js.UndefOr[String | ComponentType[ImageProps] | Null] = js.undefined
    
    var Item: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var Linebreak: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var Link: js.UndefOr[String | ComponentType[LinkProps] | Null] = js.undefined
    
    var List: js.UndefOr[String | ComponentType[ListProps] | Null] = js.undefined
    
    var Paragraph: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var Softbreak: js.UndefOr[String | ComponentType[SoftBreakProps] | Null] = js.undefined
    
    var Strong: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var Text: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
    
    var ThematicBreak: js.UndefOr[String | ComponentType[CommonProps] | Null] = js.undefined
  }
  object PartialRenderers {
    
    inline def apply(): PartialRenderers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRenderers]
    }
    
    extension [Self <: PartialRenderers](x: Self) {
      
      inline def setBlockquote(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteNull: Self = StObject.set(x, "Blockquote", null)
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "Blockquote", js.undefined)
      
      inline def setCode(value: String | ComponentType[CodeProps]): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setCodeBlock(value: String | ComponentType[CodeBlockProps]): Self = StObject.set(x, "CodeBlock", value.asInstanceOf[js.Any])
      
      inline def setCodeBlockNull: Self = StObject.set(x, "CodeBlock", null)
      
      inline def setCodeBlockUndefined: Self = StObject.set(x, "CodeBlock", js.undefined)
      
      inline def setCodeNull: Self = StObject.set(x, "Code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
      
      inline def setEmph(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Emph", value.asInstanceOf[js.Any])
      
      inline def setEmphNull: Self = StObject.set(x, "Emph", null)
      
      inline def setEmphUndefined: Self = StObject.set(x, "Emph", js.undefined)
      
      inline def setHeading(value: String | ComponentType[HeadingProps]): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingNull: Self = StObject.set(x, "Heading", null)
      
      inline def setHeadingUndefined: Self = StObject.set(x, "Heading", js.undefined)
      
      inline def setHtmlBlock(value: String | ComponentType[HtmlInlineBlockProps]): Self = StObject.set(x, "HtmlBlock", value.asInstanceOf[js.Any])
      
      inline def setHtmlBlockNull: Self = StObject.set(x, "HtmlBlock", null)
      
      inline def setHtmlBlockUndefined: Self = StObject.set(x, "HtmlBlock", js.undefined)
      
      inline def setHtmlInline(value: String | ComponentType[HtmlInlineBlockProps]): Self = StObject.set(x, "HtmlInline", value.asInstanceOf[js.Any])
      
      inline def setHtmlInlineNull: Self = StObject.set(x, "HtmlInline", null)
      
      inline def setHtmlInlineUndefined: Self = StObject.set(x, "HtmlInline", js.undefined)
      
      inline def setImage(value: String | ComponentType[ImageProps]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "Image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      inline def setItem(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "Item", null)
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setLinebreak(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Linebreak", value.asInstanceOf[js.Any])
      
      inline def setLinebreakNull: Self = StObject.set(x, "Linebreak", null)
      
      inline def setLinebreakUndefined: Self = StObject.set(x, "Linebreak", js.undefined)
      
      inline def setLink(value: String | ComponentType[LinkProps]): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
      
      inline def setLinkNull: Self = StObject.set(x, "Link", null)
      
      inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
      
      inline def setList(value: String | ComponentType[ListProps]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setListNull: Self = StObject.set(x, "List", null)
      
      inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      inline def setParagraph(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphNull: Self = StObject.set(x, "Paragraph", null)
      
      inline def setParagraphUndefined: Self = StObject.set(x, "Paragraph", js.undefined)
      
      inline def setSoftbreak(value: String | ComponentType[SoftBreakProps]): Self = StObject.set(x, "Softbreak", value.asInstanceOf[js.Any])
      
      inline def setSoftbreakNull: Self = StObject.set(x, "Softbreak", null)
      
      inline def setSoftbreakUndefined: Self = StObject.set(x, "Softbreak", js.undefined)
      
      inline def setStrong(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Strong", value.asInstanceOf[js.Any])
      
      inline def setStrongNull: Self = StObject.set(x, "Strong", null)
      
      inline def setStrongUndefined: Self = StObject.set(x, "Strong", js.undefined)
      
      inline def setText(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "Text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      inline def setThematicBreak(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "ThematicBreak", value.asInstanceOf[js.Any])
      
      inline def setThematicBreakNull: Self = StObject.set(x, "ThematicBreak", null)
      
      inline def setThematicBreakUndefined: Self = StObject.set(x, "ThematicBreak", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    var children: js.Array[Node]
    
    var props: Any
    
    var renderer: String
    
    var `type`: String
  }
  object Props {
    
    inline def apply(children: js.Array[Node], props: Any, renderer: String, `type`: String): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
