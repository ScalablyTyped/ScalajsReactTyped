package typingsJapgolly.markdownIt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserCoreMod {
  
  @JSImport("markdown-it/lib/parser_core", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Core {
    
    /* CompleteClass */
    var State: Instantiable3[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^
      ] = js.native
    
    /**
      * Executes core chain rules.
      */
    /* CompleteClass */
    override def process(state: typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^): Unit = js.native
    
    /* CompleteClass */
    var ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleCore] = js.native
  }
  
  trait Core extends StObject {
    
    var State: Instantiable3[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^
      ]
    
    /**
      * Executes core chain rules.
      */
    def process(state: typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^): Unit
    
    var ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleCore]
  }
  object Core {
    
    inline def apply(
      State: Instantiable3[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ Any, 
          typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^
        ],
      process: typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^ => Callback,
      ruler: typingsJapgolly.markdownIt.libRulerMod.^[RuleCore]
    ): Core = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^) => process(t0).runNow()), ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Core]
    }
    
    extension [Self <: Core](x: Self) {
      
      inline def setProcess(value: typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^ => Callback): Self = StObject.set(x, "process", js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^) => value(t0).runNow()))
      
      inline def setRuler(value: typingsJapgolly.markdownIt.libRulerMod.^[RuleCore]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: Instantiable3[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ Any, 
              typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleCore = js.Function1[/* state */ typingsJapgolly.markdownIt.libRulesCoreStateCoreMod.^, Unit]
}
