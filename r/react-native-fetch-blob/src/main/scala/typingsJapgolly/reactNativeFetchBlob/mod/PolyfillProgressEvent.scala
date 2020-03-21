package typingsJapgolly.reactNativeFetchBlob.mod

import typingsJapgolly.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyfillProgressEvent extends EventTarget {
  var lengthComputable: Boolean = js.native
  var loaded: Double = js.native
  var total: Double = js.native
}

