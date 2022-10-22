package typingsJapgolly.typedoc

import typingsJapgolly.std.Generator
import typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.Token
import typingsJapgolly.typescript.mod.CommentRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsLineLexerMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/lineLexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lexLineComments(file: String, ranges: js.Array[CommentRange]): Generator[Token, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lexLineComments")(file.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Generator[Token, Unit, Unit]]
}
