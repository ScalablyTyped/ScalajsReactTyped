package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
class ArrayBuffer ()
  extends typingsJapgolly.wonderJs.arrayBufferMod.ArrayBuffer

/* static members */
@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def create(data: js.Array[Double], size: Double): typingsJapgolly.wonderJs.arrayBufferMod.ArrayBuffer = js.native
  def create(data: js.Array[Double], size: Double, `type`: typingsJapgolly.wonderJs.ebuffertypeMod.EBufferType): typingsJapgolly.wonderJs.arrayBufferMod.ArrayBuffer = js.native
  def create(
    data: js.Array[Double],
    size: Double,
    `type`: typingsJapgolly.wonderJs.ebuffertypeMod.EBufferType,
    usage: typingsJapgolly.wonderJs.ebufferusageMod.EBufferUsage
  ): typingsJapgolly.wonderJs.arrayBufferMod.ArrayBuffer = js.native
}

