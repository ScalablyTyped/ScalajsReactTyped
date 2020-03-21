package typingsJapgolly.webcola

import typingsJapgolly.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/batch", JSImport.Namespace)
@js.native
object batchMod extends js.Object {
  def gridify(pgLayout: js.Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[Point]]] = js.native
  def powerGraphGridLayout(graph: AnonLinks, size: js.Array[Double], grouppadding: Double): AnonCola = js.native
}

