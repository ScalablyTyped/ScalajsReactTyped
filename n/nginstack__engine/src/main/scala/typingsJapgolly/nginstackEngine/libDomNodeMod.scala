package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackEngine.nginstackEngineStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomNodeMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Node", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Node {
    
    /* CompleteClass */
    override def appendChild(): Node = js.native
    
    /* CompleteClass */
    override val childNodes: NodeList = js.native
    
    /* CompleteClass */
    override def cloneNode(): Node = js.native
    
    /* CompleteClass */
    override val firstChild: Node = js.native
    
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    
    /* CompleteClass */
    override def insertBefore(newChild: Node, refChild: Node): Node = js.native
    
    /* CompleteClass */
    override val lastChild: Node = js.native
    
    /* CompleteClass */
    override val namespaceURI: String = js.native
    
    /* CompleteClass */
    override val nextSibling: Node = js.native
    
    /* CompleteClass */
    override val nodeName: String = js.native
    
    /* CompleteClass */
    override val nodeType: NodeType | _empty = js.native
    
    /* CompleteClass */
    override val nodeValue: String = js.native
    
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
    /* CompleteClass */
    override val ownerDocument: Document = js.native
    
    /* CompleteClass */
    override val parentNode: Node = js.native
    
    /* CompleteClass */
    override val prefix: String = js.native
    
    /* CompleteClass */
    override val previousSibling: Node = js.native
    
    /* CompleteClass */
    override def removeChild(): Node = js.native
    
    /* CompleteClass */
    override def replaceChild(): Node = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dom/Node", "ATTRIBUTE_NODE")
  @js.native
  def ATTRIBUTE_NODE: Double = js.native
  inline def ATTRIBUTE_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "CDATA_SECTION_NODE")
  @js.native
  def CDATA_SECTION_NODE: Double = js.native
  inline def CDATA_SECTION_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "COMMENT_NODE")
  @js.native
  def COMMENT_NODE: Double = js.native
  inline def COMMENT_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "DOCUMENT_FRAGMENT_NODE")
  @js.native
  def DOCUMENT_FRAGMENT_NODE: Double = js.native
  inline def DOCUMENT_FRAGMENT_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "DOCUMENT_NODE")
  @js.native
  def DOCUMENT_NODE: Double = js.native
  inline def DOCUMENT_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "DOCUMENT_TYPE_NODE")
  @js.native
  def DOCUMENT_TYPE_NODE: Double = js.native
  inline def DOCUMENT_TYPE_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "ELEMENT_NODE")
  @js.native
  def ELEMENT_NODE: Double = js.native
  inline def ELEMENT_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "ENTITY_NODE")
  @js.native
  def ENTITY_NODE: Double = js.native
  inline def ENTITY_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "ENTITY_REFERENCE_NODE")
  @js.native
  def ENTITY_REFERENCE_NODE: Double = js.native
  inline def ENTITY_REFERENCE_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "NOTATION_NODE")
  @js.native
  def NOTATION_NODE: Double = js.native
  inline def NOTATION_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "PROCESSING_INSTRUCTION_NODE")
  @js.native
  def PROCESSING_INSTRUCTION_NODE: Double = js.native
  inline def PROCESSING_INSTRUCTION_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dom/Node", "TEXT_NODE")
  @js.native
  def TEXT_NODE: Double = js.native
  inline def TEXT_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(x.asInstanceOf[js.Any])
  
  type Document = typingsJapgolly.nginstackEngine.libDomDocumentMod.^
  
  trait Node extends StObject {
    
    def appendChild(): Node
    
    val childNodes: NodeList
    
    def cloneNode(): Node
    
    val firstChild: Node
    
    def hasChildNodes(): Boolean
    
    def insertBefore(newChild: Node, refChild: Node): Node
    
    val lastChild: Node
    
    val namespaceURI: String
    
    val nextSibling: Node
    
    val nodeName: String
    
    val nodeType: NodeType | _empty
    
    val nodeValue: String
    
    def normalize(): Unit
    
    val ownerDocument: Document
    
    val parentNode: Node
    
    val prefix: String
    
    val previousSibling: Node
    
    def removeChild(): Node
    
    def replaceChild(): Node
  }
  object Node {
    
    inline def apply(
      appendChild: CallbackTo[Node],
      childNodes: NodeList,
      cloneNode: CallbackTo[Node],
      firstChild: Node,
      hasChildNodes: CallbackTo[Boolean],
      insertBefore: (Node, Node) => Node,
      lastChild: Node,
      namespaceURI: String,
      nextSibling: Node,
      nodeName: String,
      nodeType: NodeType | _empty,
      nodeValue: String,
      normalize: Callback,
      ownerDocument: Document,
      parentNode: Node,
      prefix: String,
      previousSibling: Node,
      removeChild: CallbackTo[Node],
      replaceChild: CallbackTo[Node]
    ): Node = {
      val __obj = js.Dynamic.literal(appendChild = appendChild.toJsFn, childNodes = childNodes.asInstanceOf[js.Any], cloneNode = cloneNode.toJsFn, firstChild = firstChild.asInstanceOf[js.Any], hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = normalize.toJsFn, ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = removeChild.toJsFn, replaceChild = replaceChild.toJsFn)
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAppendChild(value: CallbackTo[Node]): Self = StObject.set(x, "appendChild", value.toJsFn)
      
      inline def setChildNodes(value: NodeList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setCloneNode(value: CallbackTo[Node]): Self = StObject.set(x, "cloneNode", value.toJsFn)
      
      inline def setFirstChild(value: Node): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
      
      inline def setInsertBefore(value: (Node, Node) => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
      
      inline def setLastChild(value: Node): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNextSibling(value: Node): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: NodeType | _empty): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
      
      inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: Node): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPreviousSibling(value: Node): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
      
      inline def setRemoveChild(value: CallbackTo[Node]): Self = StObject.set(x, "removeChild", value.toJsFn)
      
      inline def setReplaceChild(value: CallbackTo[Node]): Self = StObject.set(x, "replaceChild", value.toJsFn)
    }
  }
  
  type NodeList = typingsJapgolly.nginstackEngine.libDomNodeListMod.^
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`1`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`2`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`3`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`4`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`5`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`6`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`7`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`8`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`9`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`10`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`11`
    - typingsJapgolly.nginstackEngine.nginstackEngineStrings.`12`
  */
  trait NodeType extends StObject
  object NodeType {
    
    inline def `1`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`1` = "1".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`1`]
    
    inline def `10`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`10` = "10".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`10`]
    
    inline def `11`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`11` = "11".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`11`]
    
    inline def `12`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`12` = "12".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`12`]
    
    inline def `2`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`2` = "2".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`2`]
    
    inline def `3`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`3` = "3".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`3`]
    
    inline def `4`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`4` = "4".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`4`]
    
    inline def `5`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`5` = "5".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`5`]
    
    inline def `6`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`6` = "6".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`6`]
    
    inline def `7`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`7` = "7".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`7`]
    
    inline def `8`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`8` = "8".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`8`]
    
    inline def `9`: typingsJapgolly.nginstackEngine.nginstackEngineStrings.`9` = "9".asInstanceOf[typingsJapgolly.nginstackEngine.nginstackEngineStrings.`9`]
  }
}
