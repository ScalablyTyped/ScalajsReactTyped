package typingsJapgolly.roarr.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoarrGlobalStateType extends WriterType {
  var sequence: Double
  var versions: js.Array[String]
}

object RoarrGlobalStateType {
  @scala.inline
  def apply(sequence: Double, versions: js.Array[String], write: String => Callback): RoarrGlobalStateType = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[RoarrGlobalStateType]
  }
}

