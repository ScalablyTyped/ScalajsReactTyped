package typingsJapgolly.typescript

import typingsJapgolly.typescript.typescriptMod.CompilerOptions
import typingsJapgolly.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[Diagnostic]
  var options: CompilerOptions
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: CompilerOptions): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

