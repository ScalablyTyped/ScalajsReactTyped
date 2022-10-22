package typingsJapgolly.wordpressBlocks.mod

import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.array
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.html
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.li
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.meta
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.p
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.query
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.string
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttributeSource {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressBlocks.anon.typebooleandefaultboolean
    - typingsJapgolly.wordpressBlocks.anon.typenumberdefaultnumberun
    - typingsJapgolly.wordpressBlocks.anon.typestringdefaultstringun
  */
  trait Attribute
    extends StObject
       with BlockAttribute[Any]
  object Attribute {
    
    inline def typebooleandefaultboolean(attribute: String): typingsJapgolly.wordpressBlocks.anon.typebooleandefaultboolean = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.anon.typebooleandefaultboolean]
    }
    
    inline def typenumberdefaultnumberun(attribute: String): typingsJapgolly.wordpressBlocks.anon.typenumberdefaultnumberun = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.updateDynamic("type")("number")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.anon.typenumberdefaultnumberun]
    }
    
    inline def typestringdefaultstringun(attribute: String): typingsJapgolly.wordpressBlocks.anon.typestringdefaultstringun = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typingsJapgolly.wordpressBlocks.anon.typestringdefaultstringun]
    }
  }
  
  trait Children
    extends StObject
       with BlockAttribute[Any] {
    
    var selector: js.UndefOr[String] = js.undefined
    
    var source: typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.children
    
    var `type`: array
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal(source = "children")
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTML
    extends StObject
       with BlockAttribute[Any] {
    
    var default: js.UndefOr[String] = js.undefined
    
    var multiline: js.UndefOr[li | p] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var source: html
    
    var `type`: string
  }
  object HTML {
    
    inline def apply(): HTML = {
      val __obj = js.Dynamic.literal(source = "html")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[HTML]
    }
    
    extension [Self <: HTML](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMultiline(value: li | p): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: html): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta
    extends StObject
       with BlockAttribute[Any] {
    
    var default: js.UndefOr[String] = js.undefined
    
    var meta: String
    
    var source: meta
    
    var `type`: string
  }
  object Meta {
    
    inline def apply(meta: String): Meta = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = "meta")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSource(value: meta): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressBlocks.anon.typearraydefaultArrayanyu
    - typingsJapgolly.wordpressBlocks.anon.typeobjectdefaultobjectun
    - typingsJapgolly.wordpressBlocks.anon.typebooleandefaultbooleanDefault
    - typingsJapgolly.wordpressBlocks.anon.typenumberdefaultnumberunDefault
    - typingsJapgolly.wordpressBlocks.anon.typestringdefaultstringunDefault
    - typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.array
    - typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.`object`
    - typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.boolean
    - typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.number
    - typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.string
  */
  trait None
    extends StObject
       with BlockAttribute[Any]
  
  trait Query[T]
    extends StObject
       with BlockAttribute[T] {
    
    var default: js.UndefOr[js.Array[Any]] = js.undefined
    
    var query: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
    
    var selector: String
    
    var source: query
    
    var `type`: array
  }
  object Query {
    
    inline def apply[T](
      query: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any,
      selector: String
    ): Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = "query")
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[Query[T]]
    }
    
    extension [Self <: Query[?], T](x: Self & Query[T]) {
      
      inline def setDefault(value: js.Array[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setQuery(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSource(value: query): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with BlockAttribute[Any] {
    
    var default: js.UndefOr[String] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var source: text
    
    var `type`: string
  }
  object Text {
    
    inline def apply(): Text = {
      val __obj = js.Dynamic.literal(source = "text")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
