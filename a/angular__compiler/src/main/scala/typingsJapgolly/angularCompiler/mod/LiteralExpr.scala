package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "LiteralExpr")
@js.native
open class LiteralExpr () extends Expression {
  def this(value: String) = this()
  def this(value: Boolean) = this()
  def this(value: Double) = this()
  def this(value: String, `type`: Type) = this()
  def this(value: Boolean, `type`: Type) = this()
  def this(value: Double, `type`: Type) = this()
  def this(value: Null, `type`: Type) = this()
  def this(value: Unit, `type`: Type) = this()
  def this(value: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Boolean, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Boolean, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(value: Boolean, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Double, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Double, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(value: Double, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Unit, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Unit, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(value: Unit, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var value: js.UndefOr[Double | String | Boolean | Null] = js.native
}
