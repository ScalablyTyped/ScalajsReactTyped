package typingsJapgolly.vueComponentCompilerUtils.compileStyleMod

import typingsJapgolly.postcss.mod.LazyResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleCompileResults extends js.Object {
  var code: String
  var errors: js.Array[String]
  var map: js.Any | Unit
  var rawResult: LazyResult | Unit
}

object StyleCompileResults {
  @scala.inline
  def apply(code: String, errors: js.Array[String], map: js.Any | Unit, rawResult: LazyResult | Unit): StyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleCompileResults]
  }
}

