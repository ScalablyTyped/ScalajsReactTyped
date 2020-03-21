package typingsJapgolly.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "parseHostBindings")
@js.native
object parseHostBindings extends js.Object {
  def apply(host: StringDictionary[String | Expression]): ParsedHostBindings = js.native
}

