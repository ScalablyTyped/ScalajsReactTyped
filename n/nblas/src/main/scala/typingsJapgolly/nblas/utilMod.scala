package typingsJapgolly.nblas

import typingsJapgolly.nblas.nblasStrings.d
import typingsJapgolly.nblas.nblasStrings.s
import typingsJapgolly.nblas.typesMod.FloatArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas/built/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def prefix(x: FloatArray): d | s = js.native
}

