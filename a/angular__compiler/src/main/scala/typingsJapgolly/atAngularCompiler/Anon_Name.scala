package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var pure: Boolean
  var `type`: CompileTypeMetadata
}

object Anon_Name {
  @scala.inline
  def apply(name: String, pure: Boolean, `type`: CompileTypeMetadata): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

