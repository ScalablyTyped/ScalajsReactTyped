package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SafeCall")
@js.native
open class SafeCall protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    receiver: AST,
    args: js.Array[AST],
    argumentSpan: AbsoluteSourceSpan
  ) = this()
  
  var args: js.Array[AST] = js.native
  
  var argumentSpan: AbsoluteSourceSpan = js.native
  
  var receiver: AST = js.native
}
