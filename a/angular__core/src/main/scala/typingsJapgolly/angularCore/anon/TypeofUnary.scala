package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompiler.mod.AbsoluteSourceSpan
import typingsJapgolly.angularCompiler.mod.ParseSpan
import typingsJapgolly.angularCompiler.mod.Unary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUnary
  extends StObject
     with Instantiable0[Unary] {
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  def createMinus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  def createPlus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
}
