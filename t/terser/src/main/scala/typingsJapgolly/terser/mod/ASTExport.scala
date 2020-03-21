package typingsJapgolly.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTExport extends ASTNode {
  var exported_definition: ASTDefinitions | ASTLambda | ASTDefClass | Null = js.native
  var exported_names: js.Array[ASTNameMapping] = js.native
  var exported_value: ASTNode | Null = js.native
  var is_default: Boolean = js.native
  var module_name: ASTString = js.native
}

