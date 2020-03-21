package typingsJapgolly.rotJs.mod

import typingsJapgolly.rotJs.PartialOptionsEmissionThreshold
import typingsJapgolly.rotJs.lightingMod.ReflectivityCallback
import typingsJapgolly.rotJs.lightingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Lighting")
@js.native
class Lighting protected () extends default {
  def this(reflectivityCallback: ReflectivityCallback) = this()
  def this(reflectivityCallback: ReflectivityCallback, options: PartialOptionsEmissionThreshold) = this()
}

