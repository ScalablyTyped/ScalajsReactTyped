package typingsJapgolly.routeRecognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-recognizer/dist/route-recognizer/normalizer", JSImport.Namespace)
@js.native
object normalizerMod extends js.Object {
  def encodePathSegment(str: String): String = js.native
  def normalizePath(path: String): String = js.native
  def normalizeSegment(segment: String): String = js.native
}

