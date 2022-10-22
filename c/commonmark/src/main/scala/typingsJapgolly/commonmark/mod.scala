package typingsJapgolly.commonmark

import typingsJapgolly.commonmark.commonmarkStrings.Dot
import typingsJapgolly.commonmark.commonmarkStrings.bullet
import typingsJapgolly.commonmark.commonmarkStrings.ordered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("commonmark", "HtmlRenderer")
  @js.native
  open class HtmlRenderer () extends StObject {
    def this(options: HtmlRenderingOptions) = this()
    
    /**
      * Override the function that will be used to escape (sanitize) the html output. Return value is used to add to the html output
      * @param input the input to escape
      * @param isAttributeValue indicates wheter or not the input value will be used as value of an html attribute.
      */
    def escape(input: String, isAttributeValue: Boolean): String = js.native
    
    def render(root: Node): String = js.native
    
    /**
      * Let's you override the softbreak properties of a renderer. So, to make soft breaks render as hard breaks in HTML:
      * writer.softbreak = "<br />";
      */
    var softbreak: String = js.native
  }
  
  @JSImport("commonmark", "Node")
  @js.native
  open class Node protected () extends StObject {
    def this(nodeType: NodeType) = this()
    def this(nodeType: NodeType, sourcepos: Position) = this()
    
    /**
      * Setting the backing object of listType, listTight, listStat and listDelimiter directly.
      * Not needed unless creating list nodes directly. Should be fixed from v>0.22.1
      * https://github.com/jgm/commonmark.js/issues/74
      */
    var _listData: ListData = js.native
    
    /**
      * Append a Node child to the end of the Node's children.
      */
    def appendChild(child: Node): Unit = js.native
    
    /**
      * link or image destination (String) or null.
      */
    var destination: String | Null = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val firstChild: Node | Null = js.native
    
    /**
      * fenced code block info string (String) or null.
      */
    var info: String | Null = js.native
    
    /**
      * Insert a Node sibling after the Node.
      */
    def insertAfter(sibling: Node): Unit = js.native
    
    /**
      * Insert a Node sibling before the Node.
      */
    def insertBefore(sibling: Node): Unit = js.native
    
    /**
      * (read-only): true if the Node can contain other Nodes as children.
      */
    val isContainer: Boolean = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val lastChild: Node | Null = js.native
    
    /**
      * heading level (Number).
      */
    var level: Double = js.native
    
    /**
      * a String, either ) or . for an ordered list.
      */
    var listDelimiter: (/* ) */ String) | Dot = js.native
    
    /**
      * a Number, the starting number of an ordered list.
      */
    var listStart: Double = js.native
    
    /**
      * true if list is tight
      */
    var listTight: Boolean = js.native
    
    /**
      * either Bullet or Ordered (or undefined).
      */
    var listType: bullet | ordered = js.native
    
    /**
      *  the literal String content of the node or null.
      */
    var literal: String | Null = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val next: Node | Null = js.native
    
    /**
      * used only for CustomBlock or CustomInline.
      */
    var onEnter: String = js.native
    
    /**
      * used only for CustomBlock or CustomInline.
      */
    var onExit: String = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val parent: Node | Null = js.native
    
    /**
      *  Prepend a Node child to the beginning of the Node's children.
      */
    def prependChild(child: Node): Unit = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val prev: Node | Null = js.native
    
    /**
      * (read-only): an Array with the following form: [[startline, startcolumn], [endline, endcolumn]]
      */
    val sourcepos: Position = js.native
    
    /**
      *  link or image title (String) or null.
      */
    var title: String | Null = js.native
    
    /**
      * (read-only): a String, one of text, softbreak, linebreak, emph, strong, html_inline, link, image, code, document, paragraph,
      * block_quote, item, list, heading, code_block, html_block, thematic_break.
      */
    val `type`: NodeType = js.native
    
    /**
      *  Remove the Node from the tree, severing its links with siblings and parents, and closing up gaps as needed.
      */
    def unlink(): Unit = js.native
    
    /**
      * Returns a NodeWalker that can be used to iterate through the Node tree rooted in the Node
      */
    def walker(): NodeWalker = js.native
  }
  
  @JSImport("commonmark", "Parser")
  @js.native
  /**
    * Constructs a new Parser
    */
  open class Parser () extends StObject {
    def this(options: ParserOptions) = this()
    
    def parse(input: String): Node = js.native
  }
  
  @JSImport("commonmark", "XmlRenderer")
  @js.native
  open class XmlRenderer () extends StObject {
    def this(options: XmlRenderingOptions) = this()
    
    def render(root: Node): String = js.native
  }
  
  trait HtmlRenderingOptions
    extends StObject
       with XmlRenderingOptions {
    
    /**
      *  if true, raw HTML will not be passed through to HTML output (it will be replaced by comments), and potentially unsafe URLs in links and images
      *  (those beginning with javascript:, vbscript:, file:, and with a few exceptions data:) will be replaced with empty strings.
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
      */
    var smart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A raw string to be used for a softbreak.
      * For example, `{ softbreak: "<br/>" }` treats a softbreak as `<br/>`.
      */
    var softbreak: js.UndefOr[String] = js.undefined
  }
  object HtmlRenderingOptions {
    
    inline def apply(): HtmlRenderingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlRenderingOptions]
    }
    
    extension [Self <: HtmlRenderingOptions](x: Self) {
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
      
      inline def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
      
      inline def setSoftbreak(value: String): Self = StObject.set(x, "softbreak", value.asInstanceOf[js.Any])
      
      inline def setSoftbreakUndefined: Self = StObject.set(x, "softbreak", js.undefined)
    }
  }
  
  trait ListData extends StObject {
    
    var bulletChar: js.UndefOr[String] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var tight: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ListData {
    
    inline def apply(): ListData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListData]
    }
    
    extension [Self <: ListData](x: Self) {
      
      inline def setBulletChar(value: String): Self = StObject.set(x, "bulletChar", value.asInstanceOf[js.Any])
      
      inline def setBulletCharUndefined: Self = StObject.set(x, "bulletChar", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
      
      inline def setTightUndefined: Self = StObject.set(x, "tight", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.commonmark.commonmarkStrings.text
    - typingsJapgolly.commonmark.commonmarkStrings.softbreak
    - typingsJapgolly.commonmark.commonmarkStrings.linebreak
    - typingsJapgolly.commonmark.commonmarkStrings.emph
    - typingsJapgolly.commonmark.commonmarkStrings.strong
    - typingsJapgolly.commonmark.commonmarkStrings.html_inline
    - typingsJapgolly.commonmark.commonmarkStrings.link
    - typingsJapgolly.commonmark.commonmarkStrings.image
    - typingsJapgolly.commonmark.commonmarkStrings.code
    - typingsJapgolly.commonmark.commonmarkStrings.document
    - typingsJapgolly.commonmark.commonmarkStrings.paragraph
    - typingsJapgolly.commonmark.commonmarkStrings.block_quote
    - typingsJapgolly.commonmark.commonmarkStrings.item
    - typingsJapgolly.commonmark.commonmarkStrings.list
    - typingsJapgolly.commonmark.commonmarkStrings.heading
    - typingsJapgolly.commonmark.commonmarkStrings.code_block
    - typingsJapgolly.commonmark.commonmarkStrings.html_block
    - typingsJapgolly.commonmark.commonmarkStrings.thematic_break
    - typingsJapgolly.commonmark.commonmarkStrings.custom_inline
    - typingsJapgolly.commonmark.commonmarkStrings.custom_block
  */
  trait NodeType extends StObject
  object NodeType {
    
    inline def block_quote: typingsJapgolly.commonmark.commonmarkStrings.block_quote = "block_quote".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.block_quote]
    
    inline def code: typingsJapgolly.commonmark.commonmarkStrings.code = "code".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.code]
    
    inline def code_block: typingsJapgolly.commonmark.commonmarkStrings.code_block = "code_block".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.code_block]
    
    inline def custom_block: typingsJapgolly.commonmark.commonmarkStrings.custom_block = "custom_block".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.custom_block]
    
    inline def custom_inline: typingsJapgolly.commonmark.commonmarkStrings.custom_inline = "custom_inline".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.custom_inline]
    
    inline def document: typingsJapgolly.commonmark.commonmarkStrings.document = "document".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.document]
    
    inline def emph: typingsJapgolly.commonmark.commonmarkStrings.emph = "emph".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.emph]
    
    inline def heading: typingsJapgolly.commonmark.commonmarkStrings.heading = "heading".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.heading]
    
    inline def html_block: typingsJapgolly.commonmark.commonmarkStrings.html_block = "html_block".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.html_block]
    
    inline def html_inline: typingsJapgolly.commonmark.commonmarkStrings.html_inline = "html_inline".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.html_inline]
    
    inline def image: typingsJapgolly.commonmark.commonmarkStrings.image = "image".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.image]
    
    inline def item: typingsJapgolly.commonmark.commonmarkStrings.item = "item".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.item]
    
    inline def linebreak: typingsJapgolly.commonmark.commonmarkStrings.linebreak = "linebreak".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.linebreak]
    
    inline def link: typingsJapgolly.commonmark.commonmarkStrings.link = "link".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.link]
    
    inline def list: typingsJapgolly.commonmark.commonmarkStrings.list = "list".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.list]
    
    inline def paragraph: typingsJapgolly.commonmark.commonmarkStrings.paragraph = "paragraph".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.paragraph]
    
    inline def softbreak: typingsJapgolly.commonmark.commonmarkStrings.softbreak = "softbreak".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.softbreak]
    
    inline def strong: typingsJapgolly.commonmark.commonmarkStrings.strong = "strong".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.strong]
    
    inline def text: typingsJapgolly.commonmark.commonmarkStrings.text = "text".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.text]
    
    inline def thematic_break: typingsJapgolly.commonmark.commonmarkStrings.thematic_break = "thematic_break".asInstanceOf[typingsJapgolly.commonmark.commonmarkStrings.thematic_break]
  }
  
  @js.native
  trait NodeWalker extends StObject {
    
    /**
      * Returns an object with properties entering and node. Returns null when we have finished walking the tree.
      */
    def next(): NodeWalkingStep = js.native
    
    /**
      * Resets the iterator to resume at the specified node and setting for entering. (Normally this isn't needed unless you do destructive updates to the Node tree.)
      */
    def resumeAt(node: Node): Unit = js.native
    def resumeAt(node: Node, entering: Boolean): Unit = js.native
  }
  
  trait NodeWalkingStep extends StObject {
    
    /**
      * a boolean, which is true when we enter a Node from a parent or sibling, and false when we reenter it from a child
      */
    var entering: Boolean
    
    /**
      * The node belonging to this step
      */
    var node: Node
  }
  object NodeWalkingStep {
    
    inline def apply(entering: Boolean, node: Node): NodeWalkingStep = {
      val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWalkingStep]
    }
    
    extension [Self <: NodeWalkingStep](x: Self) {
      
      inline def setEntering(value: Boolean): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParserOptions extends StObject {
    
    /**
      *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
      */
    var smart: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
      
      inline def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
      
      inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  type Position = js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  
  trait XmlRenderingOptions extends StObject {
    
    var sourcepos: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Boolean] = js.undefined
  }
  object XmlRenderingOptions {
    
    inline def apply(): XmlRenderingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlRenderingOptions]
    }
    
    extension [Self <: XmlRenderingOptions](x: Self) {
      
      inline def setSourcepos(value: Boolean): Self = StObject.set(x, "sourcepos", value.asInstanceOf[js.Any])
      
      inline def setSourceposUndefined: Self = StObject.set(x, "sourcepos", js.undefined)
      
      inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
