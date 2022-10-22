package typingsJapgolly.hastUtilToParse5

import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.DocumentType
import org.scalajs.dom.ParentNode
import typingsJapgolly.hast.mod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-to-parse5/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toParse5(tree: Node): org.scalajs.dom.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Node]
  inline def toParse5(tree: Node, space: Space): org.scalajs.dom.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Node]
  
  type Child = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.Content>[number] */ js.Any
  
  type Comment = typingsJapgolly.hast.mod.Comment
  
  type Doctype = DocType
  
  type Element = typingsJapgolly.hast.mod.Element
  
  type Handle = js.Function2[/* node */ Node, /* schema */ Schema, org.scalajs.dom.Node]
  
  type Info = typingsJapgolly.propertyInformation.mod.Info
  
  type Node = Child | Root
  
  type P5Attribute = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.Attribute */ Any
  
  /* Inlined std.Exclude<hast-util-to-parse5.hast-util-to-parse5/lib.P5Node, hast-util-to-parse5.hast-util-to-parse5/lib.P5Document | hast-util-to-parse5.hast-util-to-parse5/lib.P5Fragment> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ATTRIBUTE_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isEqualNode
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.baseURI
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.NOTATION_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.replaceChild
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_TYPE_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.getRootNode
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.CDATA_SECTION_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.firstChild
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.normalize
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.PROCESSING_INSTRUCTION_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.contains
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isConnected
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.appendChild
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINED_BY
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.TEXT_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.childNodes
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lastChild
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.insertBefore
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nextSibling
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.textContent
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_PRECEDING
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.cloneNode
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_REFERENCE_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.compareDocumentPosition
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.removeChild
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.previousSibling
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_DISCONNECTED
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lookupNamespaceURI
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isSameNode
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.parentNode
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeValue
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeType
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINS
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.COMMENT_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lookupPrefix
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isDefaultNamespace
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_FRAGMENT_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.parentElement
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_NODE
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.hasChildNodes
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeName
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_FOLLOWING
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ELEMENT_NODE
  */
  trait P5Child extends StObject
  object P5Child {
    
    inline def ATTRIBUTE_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ATTRIBUTE_NODE = "ATTRIBUTE_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ATTRIBUTE_NODE]
    
    inline def CDATA_SECTION_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.CDATA_SECTION_NODE = "CDATA_SECTION_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.CDATA_SECTION_NODE]
    
    inline def COMMENT_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.COMMENT_NODE = "COMMENT_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.COMMENT_NODE]
    
    inline def DOCUMENT_FRAGMENT_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_FRAGMENT_NODE = "DOCUMENT_FRAGMENT_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_FRAGMENT_NODE]
    
    inline def DOCUMENT_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_NODE = "DOCUMENT_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_NODE]
    
    inline def DOCUMENT_POSITION_CONTAINED_BY: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINED_BY = "DOCUMENT_POSITION_CONTAINED_BY".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINED_BY]
    
    inline def DOCUMENT_POSITION_CONTAINS: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINS = "DOCUMENT_POSITION_CONTAINS".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_CONTAINS]
    
    inline def DOCUMENT_POSITION_DISCONNECTED: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_DISCONNECTED = "DOCUMENT_POSITION_DISCONNECTED".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_DISCONNECTED]
    
    inline def DOCUMENT_POSITION_FOLLOWING: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_FOLLOWING = "DOCUMENT_POSITION_FOLLOWING".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_FOLLOWING]
    
    inline def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC]
    
    inline def DOCUMENT_POSITION_PRECEDING: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_PRECEDING = "DOCUMENT_POSITION_PRECEDING".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_POSITION_PRECEDING]
    
    inline def DOCUMENT_TYPE_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_TYPE_NODE = "DOCUMENT_TYPE_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.DOCUMENT_TYPE_NODE]
    
    inline def ELEMENT_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ELEMENT_NODE = "ELEMENT_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ELEMENT_NODE]
    
    inline def ENTITY_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_NODE = "ENTITY_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_NODE]
    
    inline def ENTITY_REFERENCE_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_REFERENCE_NODE = "ENTITY_REFERENCE_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.ENTITY_REFERENCE_NODE]
    
    inline def NOTATION_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.NOTATION_NODE = "NOTATION_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.NOTATION_NODE]
    
    inline def PROCESSING_INSTRUCTION_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.PROCESSING_INSTRUCTION_NODE = "PROCESSING_INSTRUCTION_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.PROCESSING_INSTRUCTION_NODE]
    
    inline def TEXT_NODE: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.TEXT_NODE = "TEXT_NODE".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.TEXT_NODE]
    
    inline def appendChild: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.appendChild = "appendChild".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.appendChild]
    
    inline def baseURI: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.baseURI = "baseURI".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.baseURI]
    
    inline def childNodes: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.childNodes = "childNodes".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.childNodes]
    
    inline def cloneNode: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.cloneNode = "cloneNode".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.cloneNode]
    
    inline def compareDocumentPosition: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.compareDocumentPosition = "compareDocumentPosition".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.compareDocumentPosition]
    
    inline def contains: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.contains = "contains".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.contains]
    
    inline def firstChild: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.firstChild = "firstChild".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.firstChild]
    
    inline def getRootNode: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.getRootNode = "getRootNode".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.getRootNode]
    
    inline def hasChildNodes: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.hasChildNodes = "hasChildNodes".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.hasChildNodes]
    
    inline def insertBefore: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.insertBefore = "insertBefore".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.insertBefore]
    
    inline def isConnected: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isConnected = "isConnected".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isConnected]
    
    inline def isDefaultNamespace: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isDefaultNamespace = "isDefaultNamespace".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isDefaultNamespace]
    
    inline def isEqualNode: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isEqualNode = "isEqualNode".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isEqualNode]
    
    inline def isSameNode: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isSameNode = "isSameNode".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.isSameNode]
    
    inline def lastChild: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lastChild = "lastChild".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lastChild]
    
    inline def lookupNamespaceURI: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lookupNamespaceURI = "lookupNamespaceURI".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lookupNamespaceURI]
    
    inline def lookupPrefix: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lookupPrefix = "lookupPrefix".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.lookupPrefix]
    
    inline def nextSibling: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nextSibling = "nextSibling".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nextSibling]
    
    inline def nodeName: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeName = "nodeName".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeName]
    
    inline def nodeType: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeType = "nodeType".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeType]
    
    inline def nodeValue: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeValue = "nodeValue".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.nodeValue]
    
    inline def normalize: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.normalize = "normalize".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.normalize]
    
    inline def parentElement: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.parentElement = "parentElement".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.parentElement]
    
    inline def parentNode: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.parentNode = "parentNode".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.parentNode]
    
    inline def previousSibling: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.previousSibling = "previousSibling".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.previousSibling]
    
    inline def removeChild: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.removeChild = "removeChild".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.removeChild]
    
    inline def replaceChild: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.replaceChild = "replaceChild".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.replaceChild]
    
    inline def textContent: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.textContent = "textContent".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.textContent]
  }
  
  type P5Comment = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.CommentNode */ Any
  
  type P5Doctype = DocumentType
  
  type P5Document = Document
  
  type P5Element = org.scalajs.dom.Element
  
  type P5Fragment = DocumentFragment
  
  type P5Node = org.scalajs.dom.Node
  
  type P5Parent = ParentNode
  
  type P5Text = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.TextNode */ Any
  
  type Parent = typingsJapgolly.hast.mod.Parent
  
  type Root = typingsJapgolly.hast.mod.Root
  
  type Schema = typingsJapgolly.propertyInformation.mod.Schema
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.html
    - typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.svg
  */
  trait Space extends StObject
  object Space {
    
    inline def html: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.html = "html".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.html]
    
    inline def svg: typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.svg = "svg".asInstanceOf[typingsJapgolly.hastUtilToParse5.hastUtilToParse5Strings.svg]
  }
  
  type Text = typingsJapgolly.hast.mod.Text
}
