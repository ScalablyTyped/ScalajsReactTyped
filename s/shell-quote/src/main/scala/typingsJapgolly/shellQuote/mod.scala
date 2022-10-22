package typingsJapgolly.shellQuote

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shell-quote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(cmd: String): js.Array[ParseEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParseEntry]]
  inline def parse(cmd: String, env: StringDictionary[js.UndefOr[String]]): js.Array[ParseEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry]]
  inline def parse(cmd: String, env: StringDictionary[js.UndefOr[String]], opts: ParseOptions): js.Array[ParseEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry]]
  inline def parse(cmd: String, env: Unit, opts: ParseOptions): js.Array[ParseEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry]]
  inline def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]]): js.Array[ParseEntry | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry | T]]
  inline def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]], opts: ParseOptions): js.Array[ParseEntry | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry | T]]
  
  inline def quote(args: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object ControlOperator {
    
    inline def Ampersand: typingsJapgolly.shellQuote.shellQuoteStrings.Ampersand = "&".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.Ampersand]
    
    inline def AmpersandAmpersand: typingsJapgolly.shellQuote.shellQuoteStrings.AmpersandAmpersand = "&&".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.AmpersandAmpersand]
    
    inline def Greaterthansign: typingsJapgolly.shellQuote.shellQuoteStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.Greaterthansign]
    
    inline def GreaterthansignAmpersand: typingsJapgolly.shellQuote.shellQuoteStrings.GreaterthansignAmpersand = ">&".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.GreaterthansignAmpersand]
    
    inline def GreaterthansignGreaterthansign: typingsJapgolly.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign = ">>".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign]
    
    inline def Leftparenthesis: /* ( */ String = "(".asInstanceOf[/* ( */ String]
    
    inline def Lessthansign: typingsJapgolly.shellQuote.shellQuoteStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.Lessthansign]
    
    inline def LessthansignLeftparenthesis: /* <( */ String = "<(".asInstanceOf[/* <( */ String]
    
    inline def Rightparenthesis: /* ) */ String = ")".asInstanceOf[/* ) */ String]
    
    inline def Semicolon: typingsJapgolly.shellQuote.shellQuoteStrings.Semicolon = ";".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.Semicolon]
    
    inline def SemicolonSemicolon: typingsJapgolly.shellQuote.shellQuoteStrings.SemicolonSemicolon = ";;".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.SemicolonSemicolon]
    
    inline def Verticalline: typingsJapgolly.shellQuote.shellQuoteStrings.Verticalline = "|".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.Verticalline]
    
    inline def VerticallineAmpersand: typingsJapgolly.shellQuote.shellQuoteStrings.VerticallineAmpersand = "|&".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.VerticallineAmpersand]
    
    inline def VerticallineVerticalline: typingsJapgolly.shellQuote.shellQuoteStrings.VerticallineVerticalline = "||".asInstanceOf[typingsJapgolly.shellQuote.shellQuoteStrings.VerticallineVerticalline]
  }
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.shellQuote.shellQuoteStrings.VerticallineVerticalline
    - typingsJapgolly.shellQuote.shellQuoteStrings.AmpersandAmpersand
    - typingsJapgolly.shellQuote.shellQuoteStrings.SemicolonSemicolon
    - typingsJapgolly.shellQuote.shellQuoteStrings.VerticallineAmpersand
    - / * <( * / java.lang.String
    - typingsJapgolly.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign
    - typingsJapgolly.shellQuote.shellQuoteStrings.GreaterthansignAmpersand
    - typingsJapgolly.shellQuote.shellQuoteStrings.Ampersand
    - typingsJapgolly.shellQuote.shellQuoteStrings.Semicolon
    - typingsJapgolly.shellQuote.shellQuoteStrings.Verticalline
    - typingsJapgolly.shellQuote.shellQuoteStrings.Lessthansign
    - typingsJapgolly.shellQuote.shellQuoteStrings.Greaterthansign
  */
  type ControlOperator = _ControlOperator | (/* <( */ String)
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.shellQuote.anon.Op
    - typingsJapgolly.shellQuote.anon.Pattern
    - typingsJapgolly.shellQuote.anon.Comment
  */
  type ParseEntry = _ParseEntry | String
  
  trait ParseOptions extends StObject {
    
    /**
      * Custom escape character, default value is `\`
      */
    var escape: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    }
  }
  
  trait _ControlOperator extends StObject
  
  trait _ParseEntry extends StObject
  object _ParseEntry {
    
    inline def Comment(comment: String): typingsJapgolly.shellQuote.anon.Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.shellQuote.anon.Comment]
    }
    
    inline def Op(op: ControlOperator): typingsJapgolly.shellQuote.anon.Op = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.shellQuote.anon.Op]
    }
    
    inline def Pattern(pattern: String): typingsJapgolly.shellQuote.anon.Pattern = {
      val __obj = js.Dynamic.literal(op = "glob", pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.shellQuote.anon.Pattern]
    }
  }
}
