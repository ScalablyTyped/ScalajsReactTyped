package typingsJapgolly.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Calculator")
@js.native
class Calculator[Link] protected ()
  extends typingsJapgolly.webcola.shortestpathsMod.Calculator[Link] {
  def this(
    n: Double,
    es: js.Array[Link],
    getSourceIndex: js.Function1[/* l */ Link, Double],
    getTargetIndex: js.Function1[/* l */ Link, Double],
    getLength: js.Function1[/* l */ Link, Double]
  ) = this()
}

