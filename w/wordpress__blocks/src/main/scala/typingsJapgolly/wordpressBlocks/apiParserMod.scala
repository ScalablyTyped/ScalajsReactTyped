package typingsJapgolly.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.anon.Attributetypeboolean
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Attribute
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Children
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.HTML
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Node
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Query
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Tag
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Text
import typingsJapgolly.wordpressBlocks.mod.Block
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.attribute
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.boolean
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.children
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.html
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.node
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.query
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.string
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.tag
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiParserMod {
  
  @JSImport("@wordpress/blocks/api/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getBlockAttributes[T /* <: Block[Any] */](blockTypeOrName: T, innerHTML: String): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any]
  inline def getBlockAttributes[T /* <: Block[Any] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, Any]): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any]
  
  inline def parse(content: String): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  inline def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactChild]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Node): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.a, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.abbr, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.address */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.a, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.abbr, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.address */ Any
  ]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def parseWithAttributeSchema[T /* <: Record[String, Source[Any]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>} */ js.Any]
  
  object Schema {
    
    trait Attribute
      extends StObject
         with Source[Any] {
      
      var attribute: String
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: attribute
      
      var `type`: js.UndefOr[string | boolean] = js.undefined
    }
    object Attribute {
      
      inline def apply(attribute: String): Attribute = {
        val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
        __obj.asInstanceOf[Attribute]
      }
      
      extension [Self <: Attribute](x: Self) {
        
        inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setType(value: string | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Children
      extends StObject
         with Source[Any] {
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: children
    }
    object Children {
      
      inline def apply(): Children = {
        val __obj = js.Dynamic.literal(source = "children")
        __obj.asInstanceOf[Children]
      }
      
      extension [Self <: Children](x: Self) {
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    trait HTML
      extends StObject
         with Source[Any] {
      
      var multiline: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.a, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.abbr, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.address */ Any
          ] = js.undefined
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: html
    }
    object HTML {
      
      inline def apply(): HTML = {
        val __obj = js.Dynamic.literal(source = "html")
        __obj.asInstanceOf[HTML]
      }
      
      extension [Self <: HTML](x: Self) {
        
        inline def setMultiline(
          value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.a, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.abbr, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.address */ Any
        ): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
        
        inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: html): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    trait Node
      extends StObject
         with Source[Any] {
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: node
    }
    object Node {
      
      inline def apply(): Node = {
        val __obj = js.Dynamic.literal(source = "node")
        __obj.asInstanceOf[Node]
      }
      
      extension [Self <: Node](x: Self) {
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: node): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    trait Query[T]
      extends StObject
         with Source[T] {
      
      var query: T
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: query
    }
    object Query {
      
      inline def apply[T](query: T): Query[T] = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = "query")
        __obj.asInstanceOf[Query[T]]
      }
      
      extension [Self <: Query[?], T](x: Self & Query[T]) {
        
        inline def setQuery(value: T): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: query): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    trait Tag
      extends StObject
         with Source[Any] {
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: tag
    }
    object Tag {
      
      inline def apply(): Tag = {
        val __obj = js.Dynamic.literal(source = "tag")
        __obj.asInstanceOf[Tag]
      }
      
      extension [Self <: Tag](x: Self) {
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: tag): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    trait Text
      extends StObject
         with Source[Any] {
      
      var selector: js.UndefOr[String] = js.undefined
      
      var source: text
    }
    object Text {
      
      inline def apply(): Text = {
        val __obj = js.Dynamic.literal(source = "text")
        __obj.asInstanceOf[Text]
      }
      
      extension [Self <: Text](x: Self) {
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Attribute
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Children
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.HTML
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Node
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Query[T]
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Tag
    - typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Text
  */
  trait Source[T] extends StObject
  object Source {
    
    inline def Attribute(attribute: String): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Attribute = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Attribute]
    }
    
    inline def Children(): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Children = {
      val __obj = js.Dynamic.literal(source = "children")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Children]
    }
    
    inline def HTML(): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.HTML = {
      val __obj = js.Dynamic.literal(source = "html")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.HTML]
    }
    
    inline def Node(): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Node = {
      val __obj = js.Dynamic.literal(source = "node")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Node]
    }
    
    inline def Query[T](query: T): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = "query")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Query[T]]
    }
    
    inline def Tag(): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Tag = {
      val __obj = js.Dynamic.literal(source = "tag")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Tag]
    }
    
    inline def Text(): typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Text = {
      val __obj = js.Dynamic.literal(source = "text")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Text]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends / * Inlined @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Attribute & {  type :'boolean'} * /
  {  source :'attribute',   selector :string | undefined,   attribute :string,   type :'string' | 'boolean' | undefined,   type :'boolean'} ? boolean | undefined : T extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Children ? std.Array<react.react.ReactChild> : T extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Node ? react.react.<global>.JSX.Element | null : T extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Tag ? keyof std.HTMLElementTagNameMap & std.SVGElementTagNameMap | undefined : T extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<infer U> ? {[ k in keyof U ]: U[k] extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<infer V>? @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<@wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<V>> : @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<U[k]>} : string | undefined
    }}}
    */
  @js.native
  trait SourceReturnValue[T] extends StObject
}
