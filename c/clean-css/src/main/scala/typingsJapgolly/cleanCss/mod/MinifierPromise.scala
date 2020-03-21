package typingsJapgolly.cleanCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface exposed when a new CleanCSS object is created with returnPromise set to true
  */
@js.native
trait MinifierPromise extends Minifier {
  def minify(sources: Sources): js.Promise[Output] = js.native
  def minify(sources: Sources, sourceMap: String): js.Promise[Output] = js.native
}

