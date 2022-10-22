package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "EmptyExpr")
@js.native
open class EmptyExpr protected () extends AST {
  def this(
    span: ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: AbsoluteSourceSpan
  ) = this()
}
