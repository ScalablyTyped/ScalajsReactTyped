package typingsJapgolly.domhandler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.domelementtype.mod.ElementType.Script
import typingsJapgolly.domelementtype.mod.ElementType.Style
import typingsJapgolly.domelementtype.mod.ElementType.Tag
import typingsJapgolly.domhandler.libEsmNodeMod.ChildNode
import typingsJapgolly.domhandler.libEsmNodeMod.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmMod {
  
  @JSImport("domhandler/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domhandler/lib/esm", JSImport.Default)
  @js.native
  /**
    * @param callback Called once parsing has completed.
    * @param options Settings for the handler.
    * @param elementCB Callback whenever a tag is closed.
    */
  open class default () extends DomHandler {
    def this(callback: Callback) = this()
    def this(callback: Null, options: DomHandlerOptions) = this()
    def this(callback: Unit, options: DomHandlerOptions) = this()
    def this(callback: Callback, options: DomHandlerOptions) = this()
    def this(callback: Null, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Null, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Null, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: DomHandlerOptions, elementCB: ElementCallback) = this()
  }
  
  @JSImport("domhandler/lib/esm", "CDATA")
  @js.native
  open class CDATA protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.CDATA {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("domhandler/lib/esm", "Comment")
  @js.native
  open class Comment protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.Comment {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
  }
  
  /* note: abstract class */ @JSImport("domhandler/lib/esm", "DataNode")
  @js.native
  open class DataNode protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.DataNode {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
  }
  
  @JSImport("domhandler/lib/esm", "Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.Document {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("domhandler/lib/esm", "DomHandler")
  @js.native
  /**
    * @param callback Called once parsing has completed.
    * @param options Settings for the handler.
    * @param elementCB Callback whenever a tag is closed.
    */
  open class DomHandler () extends StObject {
    def this(callback: Callback) = this()
    def this(callback: Null, options: DomHandlerOptions) = this()
    def this(callback: Unit, options: DomHandlerOptions) = this()
    def this(callback: Callback, options: DomHandlerOptions) = this()
    def this(callback: Null, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Null, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Null, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    
    /* protected */ def addNode(node: ChildNode): Unit = js.native
    
    /** Called once parsing has completed. */
    /* private */ val callback: Any = js.native
    
    /** The elements of the DOM */
    var dom: js.Array[ChildNode] = js.native
    
    /** Indicated whether parsing has been completed. */
    /* private */ var done: Any = js.native
    
    /** Callback whenever a tag is closed. */
    /* private */ val elementCB: Any = js.native
    
    /* protected */ def handleCallback(): Unit = js.native
    /* protected */ def handleCallback(error: js.Error): Unit = js.native
    
    /** A data node that is still being written to. */
    /* protected */ var lastNode: typingsJapgolly.domhandler.libEsmNodeMod.DataNode | Null = js.native
    
    def oncdataend(): Unit = js.native
    
    def oncdatastart(): Unit = js.native
    
    def onclosetag(): Unit = js.native
    
    def oncomment(data: String): Unit = js.native
    
    def oncommentend(): Unit = js.native
    
    def onend(): Unit = js.native
    
    def onerror(error: js.Error): Unit = js.native
    
    def onopentag(name: String, attribs: StringDictionary[String]): Unit = js.native
    
    def onparserinit(parser: ParserInterface): Unit = js.native
    
    def onprocessinginstruction(name: String, data: String): Unit = js.native
    
    def onreset(): Unit = js.native
    
    def ontext(data: String): Unit = js.native
    
    /** Settings for the handler. */
    /* private */ val options: Any = js.native
    
    /** Reference to the parser instance. Used for location information. */
    /* private */ var parser: Any = js.native
    
    /** The root element for the DOM */
    var root: typingsJapgolly.domhandler.libEsmNodeMod.Document = js.native
    
    /** Stack of open tags. */
    /* protected */ var tagStack: js.Array[ParentNode] = js.native
  }
  
  @JSImport("domhandler/lib/esm", "Element")
  @js.native
  open class Element protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.Element {
    /**
      * @param name Name of the tag, eg. `div`, `span`.
      * @param attribs Object mapping attribute names to attribute values.
      * @param children Children of the node.
      */
    def this(name: String, attribs: StringDictionary[String]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Tag) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Tag) = this()
  }
  
  /* note: abstract class */ @JSImport("domhandler/lib/esm", "Node")
  @js.native
  open class Node ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.Node
  
  /* note: abstract class */ @JSImport("domhandler/lib/esm", "NodeWithChildren")
  @js.native
  open class NodeWithChildren protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.NodeWithChildren {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("domhandler/lib/esm", "ProcessingInstruction")
  @js.native
  open class ProcessingInstruction protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.ProcessingInstruction {
    def this(name: String, data: String) = this()
  }
  
  @JSImport("domhandler/lib/esm", "Text")
  @js.native
  open class Text protected ()
    extends typingsJapgolly.domhandler.libEsmNodeMod.Text {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
  }
  
  inline def cloneNode[T /* <: typingsJapgolly.domhandler.libEsmNodeMod.Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cloneNode[T /* <: typingsJapgolly.domhandler.libEsmNodeMod.Node */](node: T, recursive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(node.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def hasChildren(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.ParentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildren")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.ParentNode */ Boolean]
  
  inline def isCDATA(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.CDATA */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCDATA")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.CDATA */ Boolean]
  
  inline def isComment(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.Comment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.Comment */ Boolean]
  
  inline def isDirective(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.ProcessingInstruction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.ProcessingInstruction */ Boolean]
  
  inline def isDocument(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.Document */ Boolean]
  
  inline def isTag(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.Element */ Boolean]
  
  inline def isText(node: typingsJapgolly.domhandler.libEsmNodeMod.Node): /* is domhandler.domhandler/lib/esm/node.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/esm/node.Text */ Boolean]
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* dom */ js.Array[ChildNode], Unit]
  
  trait DomHandlerOptions extends StObject {
    
    /**
      * Add an `endIndex` property to nodes.
      * When the parser is used in a non-streaming fashion, `endIndex` is an integer
      * indicating the position of the end of the node in the document.
      *
      * @default false
      */
    var withEndIndices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a `startIndex` property to nodes.
      * When the parser is used in a non-streaming fashion, `startIndex` is an integer
      * indicating the position of the start of the node in the document.
      *
      * @default false
      */
    var withStartIndices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Treat the markup as XML.
      *
      * @default false
      */
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object DomHandlerOptions {
    
    inline def apply(): DomHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomHandlerOptions]
    }
    
    extension [Self <: DomHandlerOptions](x: Self) {
      
      inline def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      inline def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      inline def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      inline def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
  
  type ElementCallback = js.Function1[/* element */ typingsJapgolly.domhandler.libEsmNodeMod.Element, Unit]
  
  trait ParserInterface extends StObject {
    
    var endIndex: Double | Null
    
    var startIndex: Double | Null
  }
  object ParserInterface {
    
    inline def apply(): ParserInterface = {
      val __obj = js.Dynamic.literal(endIndex = null, startIndex = null)
      __obj.asInstanceOf[ParserInterface]
    }
    
    extension [Self <: ParserInterface](x: Self) {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexNull: Self = StObject.set(x, "endIndex", null)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    }
  }
}
