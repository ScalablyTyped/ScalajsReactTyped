package typingsJapgolly.regexpp

import typingsJapgolly.regexpp.astMod.Node
import typingsJapgolly.regexpp.astMod.RegExpLiteral
import typingsJapgolly.regexpp.parserMod.RegExpParser.Options
import typingsJapgolly.regexpp.visitorMod.RegExpVisitor.Handlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regexpp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("regexpp", "RegExpParser")
  @js.native
  open class RegExpParser ()
    extends typingsJapgolly.regexpp.parserMod.RegExpParser {
    def this(options: Options) = this()
  }
  
  @JSImport("regexpp", "RegExpValidator")
  @js.native
  open class RegExpValidator ()
    extends typingsJapgolly.regexpp.validatorMod.RegExpValidator {
    def this(options: typingsJapgolly.regexpp.validatorMod.RegExpValidator.Options) = this()
  }
  
  inline def parseRegExpLiteral(source: String): RegExpLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any]).asInstanceOf[RegExpLiteral]
  inline def parseRegExpLiteral(source: String, options: Options): RegExpLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExpLiteral]
  inline def parseRegExpLiteral(source: js.RegExp): RegExpLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any]).asInstanceOf[RegExpLiteral]
  inline def parseRegExpLiteral(source: js.RegExp, options: Options): RegExpLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExpLiteral]
  
  inline def validateRegExpLiteral(source: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRegExpLiteral")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateRegExpLiteral(source: String, options: typingsJapgolly.regexpp.validatorMod.RegExpValidator.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRegExpLiteral")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def visitRegExpAST(node: Node, handlers: Handlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitRegExpAST")(node.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
