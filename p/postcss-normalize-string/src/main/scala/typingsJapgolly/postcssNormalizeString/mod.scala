package typingsJapgolly.postcssNormalizeString

import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcssNormalizeString.anon.DoubleQuote
import typingsJapgolly.postcssNormalizeString.postcssNormalizeStringBooleans.`true`
import typingsJapgolly.postcssNormalizeString.postcssNormalizeStringStrings.double
import typingsJapgolly.postcssNormalizeString.postcssNormalizeStringStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {{preferredQuote?: 'double' | 'single'}} Options */
  /**
    * @type {import('postcss').PluginCreator<Options>}
    * @param {Options} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(opts: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-normalize-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-normalize-string", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var preferredQuote: js.UndefOr[double | single] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPreferredQuote(value: double | single): Self = StObject.set(x, "preferredQuote", value.asInstanceOf[js.Any])
      
      inline def setPreferredQuoteUndefined: Self = StObject.set(x, "preferredQuote", js.undefined)
    }
  }
  
  trait StringAst extends StObject {
    
    var nodes: js.Array[StringAstNode]
    
    var quotes: Boolean
    
    var types: DoubleQuote
  }
  object StringAst {
    
    inline def apply(nodes: js.Array[StringAstNode], quotes: Boolean, types: DoubleQuote): StringAst = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringAst]
    }
    
    extension [Self <: StringAst](x: Self) {
      
      inline def setNodes(value: js.Array[StringAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: StringAstNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setQuotes(value: Boolean): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: DoubleQuote): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringAstNode extends StObject {
    
    var `type`: String
    
    var value: String
  }
  object StringAstNode {
    
    inline def apply(`type`: String, value: String): StringAstNode = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringAstNode]
    }
    
    extension [Self <: StringAstNode](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
