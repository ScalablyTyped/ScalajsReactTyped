package typingsJapgolly.markdownIt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserBlockMod {
  
  @JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ParserBlock {
    
    /* CompleteClass */
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        /* tokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
        typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^
      ] = js.native
    
    /**
      * Process input string and push block tokens into `outTokens`
      */
    /* CompleteClass */
    override def parse(
      str: String,
      md: MarkdownIt,
      env: Any,
      outTokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]
    ): Unit = js.native
    
    /**
      * [[Ruler]] instance. Keep configuration of block rules.
      */
    /* CompleteClass */
    var ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleBlock] = js.native
    
    /**
      * Generate tokens for input range
      */
    /* CompleteClass */
    override def tokenize(state: typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, startLine: Double, endLine: Double): Unit = js.native
  }
  
  trait ParserBlock extends StObject {
    
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        /* tokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
        typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^
      ]
    
    /**
      * Process input string and push block tokens into `outTokens`
      */
    def parse(
      str: String,
      md: MarkdownIt,
      env: Any,
      outTokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]
    ): Unit
    
    /**
      * [[Ruler]] instance. Keep configuration of block rules.
      */
    var ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleBlock]
    
    /**
      * Generate tokens for input range
      */
    def tokenize(state: typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, startLine: Double, endLine: Double): Unit
  }
  object ParserBlock {
    
    inline def apply(
      State: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ Any, 
          /* tokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
          typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^
        ],
      parse: (String, MarkdownIt, Any, js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => Callback,
      ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleBlock],
      tokenize: (typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, Double, Double) => Callback
    ): ParserBlock = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4((t0: String, t1: MarkdownIt, t2: Any, t3: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => (parse(t0, t1, t2, t3)).runNow()), ruler = ruler.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3((t0: typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, t1: Double, t2: Double) => (tokenize(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ParserBlock]
    }
    
    extension [Self <: ParserBlock](x: Self) {
      
      inline def setParse(value: (String, MarkdownIt, Any, js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction4((t0: String, t1: MarkdownIt, t2: Any, t3: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRuler(value: typingsJapgolly.markdownIt.libRulerMod.^[RuleBlock]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: Instantiable4[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ Any, 
              /* tokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
              typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setTokenize(value: (typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, Double, Double) => Callback): Self = StObject.set(x, "tokenize", js.Any.fromFunction3((t0: typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  type RuleBlock = js.Function4[
    /* state */ typingsJapgolly.markdownIt.libRulesBlockStateBlockMod.^, 
    /* startLine */ Double, 
    /* endLine */ Double, 
    /* silent */ Boolean, 
    Boolean
  ]
}
