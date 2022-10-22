package typingsJapgolly.contentstackUtils

import typingsJapgolly.contentstackUtils.anon.Entry
import typingsJapgolly.contentstackUtils.anon.Paths
import typingsJapgolly.contentstackUtils.anon.RenderOption
import typingsJapgolly.contentstackUtils.distTypesModelsEmbeddedObjectMod.EmbeddedItem
import typingsJapgolly.contentstackUtils.distTypesModelsMetadataModelMod.Attributes
import typingsJapgolly.contentstackUtils.distTypesNodesDocumentMod.default
import typingsJapgolly.contentstackUtils.distTypesOptionsMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@contentstack/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@contentstack/utils", "Document")
  @js.native
  open class Document () extends default
  
  object GQL {
    
    @JSImport("@contentstack/utils", "GQL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@contentstack/utils", "GQL.jsonToHTML")
    @js.native
    def jsonToHTML: js.Function1[/* option */ Entry, Unit] = js.native
    inline def jsonToHTML(option: Entry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def jsonToHTML_=(x: js.Function1[/* option */ Entry, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsonToHTML")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@contentstack/utils", "MarkType")
  @js.native
  object MarkType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType & String] = js.native
    
    /* "bold" */ val BOLD: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.BOLD & String = js.native
    
    /* "inlineCode" */ val INLINE_CODE: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.INLINE_CODE & String = js.native
    
    /* "italic" */ val ITALIC: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.ITALIC & String = js.native
    
    /* "strikethrough" */ val STRIKE_THROUGH: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.STRIKE_THROUGH & String = js.native
    
    /* "subscript" */ val SUBSCRIPT: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.SUBSCRIPT & String = js.native
    
    /* "superscript" */ val SUPERSCRIPT: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.SUPERSCRIPT & String = js.native
    
    /* "underline" */ val UNDERLINE: typingsJapgolly.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.UNDERLINE & String = js.native
  }
  
  @JSImport("@contentstack/utils", "Node")
  @js.native
  open class Node ()
    extends typingsJapgolly.contentstackUtils.distTypesNodesNodeMod.default
  
  @JSImport("@contentstack/utils", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType & String] = js.native
    
    /* "blockquote" */ val BLOCK_QUOTE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.BLOCK_QUOTE & String = js.native
    
    /* "code" */ val CODE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.CODE & String = js.native
    
    /* "doc" */ val DOCUMENT: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.DOCUMENT & String = js.native
    
    /* "embed" */ val EMBED: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.EMBED & String = js.native
    
    /* "h1" */ val HEADING_1: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_1 & String = js.native
    
    /* "h2" */ val HEADING_2: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_2 & String = js.native
    
    /* "h3" */ val HEADING_3: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_3 & String = js.native
    
    /* "h4" */ val HEADING_4: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_4 & String = js.native
    
    /* "h5" */ val HEADING_5: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_5 & String = js.native
    
    /* "h6" */ val HEADING_6: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_6 & String = js.native
    
    /* "hr" */ val HR: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HR & String = js.native
    
    /* "img" */ val IMAGE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.IMAGE & String = js.native
    
    /* "a" */ val LINK: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.LINK & String = js.native
    
    /* "li" */ val LIST_ITEM: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.LIST_ITEM & String = js.native
    
    /* "ol" */ val ORDER_LIST: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.ORDER_LIST & String = js.native
    
    /* "p" */ val PARAGRAPH: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.PARAGRAPH & String = js.native
    
    /* "reference" */ val REFERENCE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.REFERENCE & String = js.native
    
    /* "table" */ val TABLE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE & String = js.native
    
    /* "tbody" */ val TABLE_BODY: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_BODY & String = js.native
    
    /* "td" */ val TABLE_DATA: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_DATA & String = js.native
    
    /* "tfoot" */ val TABLE_FOOTER: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_FOOTER & String = js.native
    
    /* "th" */ val TABLE_HEAD: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_HEAD & String = js.native
    
    /* "thead" */ val TABLE_HEADER: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_HEADER & String = js.native
    
    /* "tr" */ val TABLE_ROW: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_ROW & String = js.native
    
    /* "text" */ val TEXT: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TEXT & String = js.native
    
    /* "ul" */ val UNORDER_LIST: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.UNORDER_LIST & String = js.native
  }
  
  @JSImport("@contentstack/utils", "StyleType")
  @js.native
  object StyleType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType & String
      ] = js.native
    
    /* "block" */ val BLOCK: typingsJapgolly.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.BLOCK & String = js.native
    
    /* "display" */ val DISPLAY: typingsJapgolly.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.DISPLAY & String = js.native
    
    /* "download" */ val DOWNLOAD: typingsJapgolly.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.DOWNLOAD & String = js.native
    
    /* "inline" */ val INLINE: typingsJapgolly.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.INLINE & String = js.native
    
    /* "link" */ val LINK: typingsJapgolly.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.LINK & String = js.native
  }
  
  @JSImport("@contentstack/utils", "TextNode")
  @js.native
  open class TextNode protected ()
    extends typingsJapgolly.contentstackUtils.distTypesNodesTextNodeMod.default {
    def this(text: String) = this()
  }
  
  inline def addEditableTags(entry: EmbeddedItem, contentTypeUid: String, tagsAsObject: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditableTags")(entry.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], tagsAsObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEditableTags(entry: EmbeddedItem, contentTypeUid: String, tagsAsObject: Boolean, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditableTags")(entry.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], tagsAsObject.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def attributeToString(attributes: Attributes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("attributeToString")(attributes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def jsonToHTML(option: Paths): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def render(option: RenderOption): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderContent(content: String, option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def renderContent(content: js.Array[String], option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
}
