package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "InterpolationConfig")
@js.native
class InterpolationConfig protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.InterpolationConfig {
  def this(start: String, end: String) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "InterpolationConfig")
@js.native
object InterpolationConfig extends js.Object {
  def fromArray(): typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig = js.native
  def fromArray(markers: js.Tuple2[String, String]): typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig = js.native
}

