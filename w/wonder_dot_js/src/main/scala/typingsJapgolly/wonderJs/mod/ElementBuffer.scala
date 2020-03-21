package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
class ElementBuffer ()
  extends typingsJapgolly.wonderJs.elementBufferMod.ElementBuffer

/* static members */
@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
object ElementBuffer extends js.Object {
  def create(data: js.Array[Double]): typingsJapgolly.wonderJs.elementBufferMod.ElementBuffer = js.native
  def create(data: js.Array[Double], `type`: typingsJapgolly.wonderJs.ebuffertypeMod.EBufferType): typingsJapgolly.wonderJs.elementBufferMod.ElementBuffer = js.native
  def create(
    data: js.Array[Double],
    `type`: typingsJapgolly.wonderJs.ebuffertypeMod.EBufferType,
    usage: typingsJapgolly.wonderJs.ebufferusageMod.EBufferUsage
  ): typingsJapgolly.wonderJs.elementBufferMod.ElementBuffer = js.native
}

