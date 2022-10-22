package typingsJapgolly.sqltoolsFormatter

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sqltoolsFormatter.libCoreTypesMod.Config
import typingsJapgolly.sqltoolsFormatter.libCoreTypesMod.Token
import typingsJapgolly.sqltoolsFormatter.libCoreTypesMod.TokenizerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguagesUtilsAbstractMod {
  
  /* note: abstract class */ @JSImport("@sqltools/formatter/lib/languages/utils/abstract", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AbstractFormatter {
    def this(cfg: Config) = this()
    
    /* CompleteClass */
    var cfg: Config = js.native
    
    /* CompleteClass */
    override def format(query: String): String = js.native
    
    /* CompleteClass */
    override def getTokenizerConfig(): TokenizerConfig = js.native
    
    /* CompleteClass */
    override def tokenize(query: String): js.Array[Token] = js.native
    
    /* CompleteClass */
    override def tokenizer(): typingsJapgolly.sqltoolsFormatter.libCoreTokenizerMod.default = js.native
  }
  
  trait AbstractFormatter extends StObject {
    
    var cfg: Config
    
    def format(query: String): String
    
    def getTokenizerConfig(): TokenizerConfig
    
    /* protected */ var tokenOverride: js.UndefOr[js.Function2[/* token */ Token, /* previousToken */ js.UndefOr[Token], Token]] = js.undefined
    
    def tokenize(query: String): js.Array[Token]
    
    def tokenizer(): typingsJapgolly.sqltoolsFormatter.libCoreTokenizerMod.default
  }
  object AbstractFormatter {
    
    inline def apply(
      cfg: Config,
      format: String => String,
      getTokenizerConfig: CallbackTo[TokenizerConfig],
      tokenize: String => js.Array[Token],
      tokenizer: CallbackTo[typingsJapgolly.sqltoolsFormatter.libCoreTokenizerMod.default]
    ): AbstractFormatter = {
      val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), getTokenizerConfig = getTokenizerConfig.toJsFn, tokenize = js.Any.fromFunction1(tokenize), tokenizer = tokenizer.toJsFn)
      __obj.asInstanceOf[AbstractFormatter]
    }
    
    extension [Self <: AbstractFormatter](x: Self) {
      
      inline def setCfg(value: Config): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setGetTokenizerConfig(value: CallbackTo[TokenizerConfig]): Self = StObject.set(x, "getTokenizerConfig", value.toJsFn)
      
      inline def setTokenOverride(value: (/* token */ Token, /* previousToken */ js.UndefOr[Token]) => Token): Self = StObject.set(x, "tokenOverride", js.Any.fromFunction2(value))
      
      inline def setTokenOverrideUndefined: Self = StObject.set(x, "tokenOverride", js.undefined)
      
      inline def setTokenize(value: String => js.Array[Token]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
      
      inline def setTokenizer(value: CallbackTo[typingsJapgolly.sqltoolsFormatter.libCoreTokenizerMod.default]): Self = StObject.set(x, "tokenizer", value.toJsFn)
    }
  }
}
