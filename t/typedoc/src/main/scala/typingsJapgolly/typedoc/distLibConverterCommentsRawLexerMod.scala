package typingsJapgolly.typedoc

import typingsJapgolly.std.Generator
import typingsJapgolly.typedoc.distLibConverterCommentsLexerMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsRawLexerMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/rawLexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lexCommentString(file: String): Generator[Token, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("lexCommentString")(file.asInstanceOf[js.Any]).asInstanceOf[Generator[Token, Unit, Unit]]
}
