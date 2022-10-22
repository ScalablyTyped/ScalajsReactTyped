package typingsJapgolly.typedoc

import typingsJapgolly.std.Generator
import typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.Token
import typingsJapgolly.typedoc.distLibConverterCommentsMod.CommentParserConfig
import typingsJapgolly.typedoc.distLibModelsMod.Comment
import typingsJapgolly.typedoc.distLibUtilsMinimalSourceFileMod.MinimalSourceFile
import typingsJapgolly.typedoc.distLibUtilsMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsParserMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseComment(
    tokens: Generator[Token, Unit, Unit],
    config: CommentParserConfig,
    file: MinimalSourceFile,
    logger: Logger
  ): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComment")(tokens.asInstanceOf[js.Any], config.asInstanceOf[js.Any], file.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Comment]
}
