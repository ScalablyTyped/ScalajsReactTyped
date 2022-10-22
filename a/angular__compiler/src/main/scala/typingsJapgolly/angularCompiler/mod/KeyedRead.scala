package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "KeyedRead")
@js.native
open class KeyedRead protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, receiver: AST, key: AST) = this()
  
  var key: AST = js.native
  
  var receiver: AST = js.native
}
