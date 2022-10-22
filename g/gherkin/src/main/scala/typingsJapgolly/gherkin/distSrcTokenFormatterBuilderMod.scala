package typingsJapgolly.gherkin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gherkin.distSrcParserMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenFormatterBuilderMod {
  
  @JSImport("gherkin/dist/src/TokenFormatterBuilder", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TokenFormatterBuilder {
    
    /* CompleteClass */
    override def build(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Unit = js.native
    
    /* CompleteClass */
    override def endRule(ruleType: RuleType): Unit = js.native
    
    /* CompleteClass */
    override def formatToken(token: typingsJapgolly.gherkin.distSrcTokenMod.default): String = js.native
    
    /* CompleteClass */
    override def getResult(): String = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def startRule(ruleType: RuleType): Unit = js.native
    
    /* private */ /* CompleteClass */
    var tokensText: Any = js.native
  }
  
  trait TokenFormatterBuilder extends StObject {
    
    def build(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Unit
    
    def endRule(ruleType: RuleType): Unit
    
    def formatToken(token: typingsJapgolly.gherkin.distSrcTokenMod.default): String
    
    def getResult(): String
    
    def reset(): Unit
    
    def startRule(ruleType: RuleType): Unit
    
    /* private */ var tokensText: Any
  }
  object TokenFormatterBuilder {
    
    inline def apply(
      build: typingsJapgolly.gherkin.distSrcTokenMod.default => Callback,
      endRule: RuleType => Callback,
      formatToken: typingsJapgolly.gherkin.distSrcTokenMod.default => String,
      getResult: CallbackTo[String],
      reset: Callback,
      startRule: RuleType => Callback,
      tokensText: Any
    ): TokenFormatterBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1((t0: typingsJapgolly.gherkin.distSrcTokenMod.default) => build(t0).runNow()), endRule = js.Any.fromFunction1((t0: RuleType) => endRule(t0).runNow()), formatToken = js.Any.fromFunction1(formatToken), getResult = getResult.toJsFn, reset = reset.toJsFn, startRule = js.Any.fromFunction1((t0: RuleType) => startRule(t0).runNow()), tokensText = tokensText.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenFormatterBuilder]
    }
    
    extension [Self <: TokenFormatterBuilder](x: Self) {
      
      inline def setBuild(value: typingsJapgolly.gherkin.distSrcTokenMod.default => Callback): Self = StObject.set(x, "build", js.Any.fromFunction1((t0: typingsJapgolly.gherkin.distSrcTokenMod.default) => value(t0).runNow()))
      
      inline def setEndRule(value: RuleType => Callback): Self = StObject.set(x, "endRule", js.Any.fromFunction1((t0: RuleType) => value(t0).runNow()))
      
      inline def setFormatToken(value: typingsJapgolly.gherkin.distSrcTokenMod.default => String): Self = StObject.set(x, "formatToken", js.Any.fromFunction1(value))
      
      inline def setGetResult(value: CallbackTo[String]): Self = StObject.set(x, "getResult", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setStartRule(value: RuleType => Callback): Self = StObject.set(x, "startRule", js.Any.fromFunction1((t0: RuleType) => value(t0).runNow()))
      
      inline def setTokensText(value: Any): Self = StObject.set(x, "tokensText", value.asInstanceOf[js.Any])
    }
  }
}
