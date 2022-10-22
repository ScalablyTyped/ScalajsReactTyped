package typingsJapgolly.markdownIt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserInlineMod {
  
  @JSImport("markdown-it/lib/parser_inline", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ParserInline {
    
    /* CompleteClass */
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        /* outTokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
        typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^
      ] = js.native
    
    /**
      * Process input string and push inline tokens into `outTokens`
      */
    /* CompleteClass */
    override def parse(
      str: String,
      md: MarkdownIt,
      env: Any,
      outTokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]
    ): Unit = js.native
    
    /**
      * [[Ruler]] instance. Keep configuration of inline rules.
      */
    /* CompleteClass */
    var ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline] = js.native
    
    /**
      * [[Ruler]] instance. Second ruler used for post-processing
      * (e.g. in emphasis-like rules).
      */
    /* CompleteClass */
    var ruler2: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline2] = js.native
    
    /**
      * Skip single token by running all rules in validation mode;
      * returns `true` if any rule reported success
      */
    /* CompleteClass */
    override def skipToken(state: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^): Unit = js.native
    
    /**
      * Generate tokens for input range
      */
    /* CompleteClass */
    override def tokenize(state: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^): Unit = js.native
  }
  
  trait ParserInline extends StObject {
    
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        /* outTokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
        typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^
      ]
    
    /**
      * Process input string and push inline tokens into `outTokens`
      */
    def parse(
      str: String,
      md: MarkdownIt,
      env: Any,
      outTokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]
    ): Unit
    
    /**
      * [[Ruler]] instance. Keep configuration of inline rules.
      */
    var ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline]
    
    /**
      * [[Ruler]] instance. Second ruler used for post-processing
      * (e.g. in emphasis-like rules).
      */
    var ruler2: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline2]
    
    /**
      * Skip single token by running all rules in validation mode;
      * returns `true` if any rule reported success
      */
    def skipToken(state: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^): Unit
    
    /**
      * Generate tokens for input range
      */
    def tokenize(state: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^): Unit
  }
  object ParserInline {
    
    inline def apply(
      State: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ Any, 
          /* outTokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
          typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^
        ],
      parse: (String, MarkdownIt, Any, js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => Callback,
      ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline],
      ruler2: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline2],
      skipToken: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^ => Callback,
      tokenize: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^ => Callback
    ): ParserInline = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4((t0: String, t1: MarkdownIt, t2: Any, t3: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => (parse(t0, t1, t2, t3)).runNow()), ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^) => skipToken(t0).runNow()), tokenize = js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^) => tokenize(t0).runNow()))
      __obj.asInstanceOf[ParserInline]
    }
    
    extension [Self <: ParserInline](x: Self) {
      
      inline def setParse(value: (String, MarkdownIt, Any, js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction4((t0: String, t1: MarkdownIt, t2: Any, t3: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRuler(value: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      inline def setRuler2(value: typingsJapgolly.markdownIt.libRulerMod.^[RuleInline2]): Self = StObject.set(x, "ruler2", value.asInstanceOf[js.Any])
      
      inline def setSkipToken(value: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^ => Callback): Self = StObject.set(x, "skipToken", js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^) => value(t0).runNow()))
      
      inline def setState(
        value: Instantiable4[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ Any, 
              /* outTokens */ js.Array[typingsJapgolly.markdownIt.libTokenMod.^], 
              typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setTokenize(value: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^ => Callback): Self = StObject.set(x, "tokenize", js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^) => value(t0).runNow()))
    }
  }
  
  type RuleInline = js.Function2[
    /* state */ typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^, 
    /* silent */ Boolean, 
    Boolean
  ]
  
  type RuleInline2 = js.Function1[/* state */ typingsJapgolly.markdownIt.libRulesInlineStateInlineMod.^, Boolean]
}
