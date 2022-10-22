package typingsJapgolly.nodeHtmlParser

import typingsJapgolly.nodeHtmlParser.anon.PartialOptions
import typingsJapgolly.nodeHtmlParser.distNodesCommentMod.default
import typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.KeyAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(data: String): typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default]
    inline def apply(data: String, options: PartialOptions): typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default]
    
    @JSImport("node-html-parser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_comment.default` */
    @JSImport("node-html-parser", "default.CommentNode")
    @js.native
    open class CommentNode protected ()
      extends typingsJapgolly.nodeHtmlParser.distNodesCommentMod.default {
      def this(rawText: String, parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
      def this(
        rawText: String,
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof imported_html.default` */
    @JSImport("node-html-parser", "default.HTMLElement")
    @js.native
    open class HTMLElement protected ()
      extends typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default {
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double]
      ) = this()
      /**
        * Creates an instance of HTMLElement.
        * @param keyAttrs	id and class attribute
        * @param [rawAttrs]	attributes in string
        *
        * @memberof HTMLElement
        */
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
        range: js.Tuple2[Double, Double]
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double],
        voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
        range: js.Tuple2[Double, Double],
        voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double],
        voidTag: Unit,
        _parseOptions: PartialOptions
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double],
        voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default,
        _parseOptions: PartialOptions
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
        range: js.Tuple2[Double, Double],
        voidTag: Unit,
        _parseOptions: PartialOptions
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
        range: js.Tuple2[Double, Double],
        voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default,
        _parseOptions: PartialOptions
      ) = this()
    }
    
    /* was `typeof imported_node.default` */
    /* note: abstract class */ @JSImport("node-html-parser", "default.Node")
    @js.native
    open class Node ()
      extends typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default {
      def this(parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
      def this(parentNode: Unit, range: js.Tuple2[Double, Double]) = this()
      def this(
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof imported_type.default` */
    @JSImport("node-html-parser", "default.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType & Double] = js.native
      
      /* 8 */ val COMMENT_NODE: typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType.COMMENT_NODE & Double = js.native
      
      /* 1 */ val ELEMENT_NODE: typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType.ELEMENT_NODE & Double = js.native
      
      /* 3 */ val TEXT_NODE: typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType.TEXT_NODE & Double = js.native
    }
    
    /* was `typeof imported_text.default` */
    @JSImport("node-html-parser", "default.TextNode")
    @js.native
    open class TextNode protected ()
      extends typingsJapgolly.nodeHtmlParser.distNodesTextMod.default {
      def this(rawText: String, parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
      def this(
        rawText: String,
        parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof baseParse` */
    inline def parse(data: String): typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement]
    inline def parse(data: String, options: PartialOptions): typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement]
    
    /* was `typeof imported_valid.default` */
    inline def valid(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def valid(data: String, options: PartialOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("node-html-parser", "CommentNode")
  @js.native
  open class CommentNode protected () extends default {
    def this(rawText: String, parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
    def this(
      rawText: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  @JSImport("node-html-parser", "HTMLElement")
  @js.native
  open class HTMLElement protected ()
    extends typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default {
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double]
    ) = this()
    /**
      * Creates an instance of HTMLElement.
      * @param keyAttrs	id and class attribute
      * @param [rawAttrs]	attributes in string
      *
      * @memberof HTMLElement
      */
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
      range: js.Tuple2[Double, Double]
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: Unit,
      _parseOptions: PartialOptions
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default,
      _parseOptions: PartialOptions
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: Unit,
      _parseOptions: PartialOptions
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: typingsJapgolly.nodeHtmlParser.distVoidTagMod.default,
      _parseOptions: PartialOptions
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("node-html-parser", "Node")
  @js.native
  open class Node ()
    extends typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default {
    def this(parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
    def this(parentNode: Unit, range: js.Tuple2[Double, Double]) = this()
    def this(
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  @JSImport("node-html-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType & Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType.COMMENT_NODE & Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType.ELEMENT_NODE & Double = js.native
    
    /* 3 */ val TEXT_NODE: typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType.TEXT_NODE & Double = js.native
  }
  
  @JSImport("node-html-parser", "TextNode")
  @js.native
  open class TextNode protected ()
    extends typingsJapgolly.nodeHtmlParser.distNodesTextMod.default {
    def this(rawText: String, parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
    def this(
      rawText: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  inline def valid(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def valid(data: String, options: PartialOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object parse {
    
    /* was `typeof imported_comment.default` */
    type CommentNode = default
    
    /* was `typeof imported_html.default` */
    type HTMLElement = typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default
    
    /* was `typeof imported_node.default` */
    type Node = typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default
    
    /* was `typeof imported_text.default` */
    type TextNode = typingsJapgolly.nodeHtmlParser.distNodesTextMod.default
  }
}
