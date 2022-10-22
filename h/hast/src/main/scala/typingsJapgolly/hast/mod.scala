package typingsJapgolly.hast

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hast.hastStrings.comment
import typingsJapgolly.hast.hastStrings.doctype
import typingsJapgolly.hast.hastStrings.element
import typingsJapgolly.hast.hastStrings.root
import typingsJapgolly.hast.hastStrings.text
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import typingsJapgolly.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Comment
    extends StObject
       with Literal {
    
    /**
      * Represents this variant of a Literal.
      */
    @JSName("type")
    var type_Comment: comment
  }
  object Comment {
    
    inline def apply(value: Any): Comment = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hast.hast.RootContent | hast.hast.ElementContent */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hast.hastStrings.children
    - typingsJapgolly.hast.hastStrings.properties
    - typingsJapgolly.hast.hastStrings.content
    - typingsJapgolly.hast.hastStrings.`type`
    - typingsJapgolly.hast.hastStrings.name
    - typingsJapgolly.hast.hastStrings.tagName
  */
  trait Content extends StObject
  object Content {
    
    inline def children: typingsJapgolly.hast.hastStrings.children = "children".asInstanceOf[typingsJapgolly.hast.hastStrings.children]
    
    inline def content: typingsJapgolly.hast.hastStrings.content = "content".asInstanceOf[typingsJapgolly.hast.hastStrings.content]
    
    inline def name: typingsJapgolly.hast.hastStrings.name = "name".asInstanceOf[typingsJapgolly.hast.hastStrings.name]
    
    inline def properties: typingsJapgolly.hast.hastStrings.properties = "properties".asInstanceOf[typingsJapgolly.hast.hastStrings.properties]
    
    inline def tagName: typingsJapgolly.hast.hastStrings.tagName = "tagName".asInstanceOf[typingsJapgolly.hast.hastStrings.tagName]
    
    inline def `type`: typingsJapgolly.hast.hastStrings.`type` = "type".asInstanceOf[typingsJapgolly.hast.hastStrings.`type`]
  }
  
  trait DocType
    extends StObject
       with Node[Data] {
    
    var name: String
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_DocType: doctype
  }
  object DocType {
    
    inline def apply(name: String): DocType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("doctype")
      __obj.asInstanceOf[DocType]
    }
    
    extension [Self <: DocType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: doctype): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with Parent {
    
    /**
      * List representing the children of a node.
      */
    @JSName("children")
    var children_Element: js.Array[ElementContent]
    
    /**
      * If the tagName field is 'template', a content field can be present.
      */
    var content: js.UndefOr[Root] = js.undefined
    
    /**
      * Represents information associated with the element.
      */
    var properties: js.UndefOr[Properties] = js.undefined
    
    /**
      * Represents the element’s local name.
      */
    var tagName: String
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_Element: element
  }
  object Element {
    
    inline def apply(children: js.Array[ElementContent], tagName: String): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setChildren(value: js.Array[ElementContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ElementContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: Root): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hast.hast.ElementContentMap[keyof hast.hast.ElementContentMap] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hast.hastStrings.children
    - typingsJapgolly.hast.hastStrings.properties
    - typingsJapgolly.hast.hastStrings.content
    - typingsJapgolly.hast.hastStrings.`type`
    - typingsJapgolly.hast.hastStrings.tagName
  */
  trait ElementContent extends StObject
  object ElementContent {
    
    inline def children: typingsJapgolly.hast.hastStrings.children = "children".asInstanceOf[typingsJapgolly.hast.hastStrings.children]
    
    inline def content: typingsJapgolly.hast.hastStrings.content = "content".asInstanceOf[typingsJapgolly.hast.hastStrings.content]
    
    inline def properties: typingsJapgolly.hast.hastStrings.properties = "properties".asInstanceOf[typingsJapgolly.hast.hastStrings.properties]
    
    inline def tagName: typingsJapgolly.hast.hastStrings.tagName = "tagName".asInstanceOf[typingsJapgolly.hast.hastStrings.tagName]
    
    inline def `type`: typingsJapgolly.hast.hastStrings.`type` = "type".asInstanceOf[typingsJapgolly.hast.hastStrings.`type`]
  }
  
  trait ElementContentMap extends StObject {
    
    var comment: Comment
    
    var element: Element
    
    var text: Text
  }
  object ElementContentMap {
    
    inline def apply(comment: Comment, element: Element, text: Text): ElementContentMap = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementContentMap]
    }
    
    extension [Self <: ElementContentMap](x: Self) {
      
      inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with typingsJapgolly.unist.mod.Literal[Any, Data]
  object Literal {
    
    inline def apply(`type`: String, value: Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
  }
  
  trait Parent
    extends StObject
       with typingsJapgolly.unist.mod.Parent[Node[Data], NodeData[Node[Data]]]
  object Parent {
    
    inline def apply(children: js.Array[Node[Data]], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
  }
  
  type Properties = StringDictionary[js.UndefOr[Boolean | Double | String | Null | (js.Array[String | Double])]]
  
  trait Root
    extends StObject
       with Parent {
    
    /**
      * List representing the children of a node.
      */
    @JSName("children")
    var children_Root: js.Array[RootContent]
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_Root: root
  }
  object Root {
    
    inline def apply(children: js.Array[RootContent]): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setChildren(value: js.Array[RootContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: RootContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hast.hast.RootContentMap[keyof hast.hast.RootContentMap] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hast.hastStrings.children
    - typingsJapgolly.hast.hastStrings.properties
    - typingsJapgolly.hast.hastStrings.content
    - typingsJapgolly.hast.hastStrings.`type`
    - typingsJapgolly.hast.hastStrings.name
    - typingsJapgolly.hast.hastStrings.tagName
  */
  trait RootContent extends StObject
  object RootContent {
    
    inline def children: typingsJapgolly.hast.hastStrings.children = "children".asInstanceOf[typingsJapgolly.hast.hastStrings.children]
    
    inline def content: typingsJapgolly.hast.hastStrings.content = "content".asInstanceOf[typingsJapgolly.hast.hastStrings.content]
    
    inline def name: typingsJapgolly.hast.hastStrings.name = "name".asInstanceOf[typingsJapgolly.hast.hastStrings.name]
    
    inline def properties: typingsJapgolly.hast.hastStrings.properties = "properties".asInstanceOf[typingsJapgolly.hast.hastStrings.properties]
    
    inline def tagName: typingsJapgolly.hast.hastStrings.tagName = "tagName".asInstanceOf[typingsJapgolly.hast.hastStrings.tagName]
    
    inline def `type`: typingsJapgolly.hast.hastStrings.`type` = "type".asInstanceOf[typingsJapgolly.hast.hastStrings.`type`]
  }
  
  trait RootContentMap extends StObject {
    
    var comment: Comment
    
    var doctype: DocType
    
    var element: Element
    
    var text: Text
  }
  object RootContentMap {
    
    inline def apply(comment: Comment, doctype: DocType, element: Element, text: Text): RootContentMap = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], doctype = doctype.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootContentMap]
    }
    
    extension [Self <: RootContentMap](x: Self) {
      
      inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setDoctype(value: DocType): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with Literal {
    
    /**
      * Represents this variant of a Literal.
      */
    @JSName("type")
    var type_Text: text
  }
  object Text {
    
    inline def apply(value: Any): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
