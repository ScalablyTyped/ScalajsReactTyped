package typingsJapgolly.sparkMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spark-md5", "ArrayBuffer")
@js.native
class ArrayBuffer () extends js.Object {
  def append(str: scala.scalajs.js.typedarray.ArrayBuffer): ArrayBuffer = js.native
  def destroy(): Unit = js.native
  def end(): String = js.native
  def end(raw: Boolean): String = js.native
  def getState(): State = js.native
  def reset(): ArrayBuffer = js.native
  def setState(state: State): State = js.native
}

/* static members */
@JSImport("spark-md5", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def hash(arr: scala.scalajs.js.typedarray.ArrayBuffer): String = js.native
  def hash(arr: scala.scalajs.js.typedarray.ArrayBuffer, raw: Boolean): String = js.native
}

