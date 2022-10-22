package typingsJapgolly.prosemirrorModel

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orderedmap.mod.default
import typingsJapgolly.prosemirrorModel.mod.DOMNode
import typingsJapgolly.prosemirrorModel.mod.MarkSpec
import typingsJapgolly.prosemirrorModel.mod.NodeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var a: Double
    
    var b: Double
  }
  object A {
    
    inline def apply(a: Double, b: Double): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentDOM extends StObject {
    
    var contentDOM: js.UndefOr[HTMLElement] = js.undefined
    
    var dom: DOMNode
  }
  object ContentDOM {
    
    inline def apply(dom: DOMNode): ContentDOM = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentDOM]
    }
    
    extension [Self <: ContentDOM](x: Self) {
      
      inline def setContentDOM(value: HTMLElement): Self = StObject.set(x, "contentDOM", value.asInstanceOf[js.Any])
      
      inline def setContentDOMUndefined: Self = StObject.set(x, "contentDOM", js.undefined)
      
      inline def setDom(value: DOMNode): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document extends StObject {
    
    var document: js.UndefOr[org.scalajs.dom.Document] = js.undefined
  }
  object Document {
    
    inline def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setDocument(value: org.scalajs.dom.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var offset: Double
  }
  object Index {
    
    inline def apply(index: Double, offset: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Marks extends StObject {
    
    var marks: default[MarkSpec]
    
    var nodes: default[NodeSpec]
    
    var topNode: js.UndefOr[String] = js.undefined
  }
  object Marks {
    
    inline def apply(marks: default[MarkSpec], nodes: default[NodeSpec]): Marks = {
      val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marks]
    }
    
    extension [Self <: Marks](x: Self) {
      
      inline def setMarks(value: default[MarkSpec]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: default[NodeSpec]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setTopNode(value: String): Self = StObject.set(x, "topNode", value.asInstanceOf[js.Any])
      
      inline def setTopNodeUndefined: Self = StObject.set(x, "topNode", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    var index: Double
    
    var node: typingsJapgolly.prosemirrorModel.mod.Node | Null
    
    var offset: Double
  }
  object Node {
    
    inline def apply(index: Double, offset: Double): Node = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], node = null)
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typingsJapgolly.prosemirrorModel.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var node: DOMNode
    
    var offset: Double
    
    var pos: js.UndefOr[Double] = js.undefined
  }
  object Offset {
    
    inline def apply(node: DOMNode, offset: Double): Offset = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setNode(value: DOMNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    }
  }
}
