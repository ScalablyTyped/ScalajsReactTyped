package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.commonBufferMod.CommonBuffer
import typingsJapgolly.wonderJs.ebuffertypeMod.EBufferType
import typingsJapgolly.wonderJs.ebufferusageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", JSImport.Namespace)
@js.native
object elementBufferMod extends js.Object {
  @js.native
  class ElementBuffer () extends CommonBuffer {
    @JSName("data")
    var data_ElementBuffer: scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = js.native
    val typeSize: Double = js.native
    def initWhenCreate(data: js.Array[Double], `type`: EBufferType, usage: EBufferUsage): js.Any = js.native
    def resetData(data: js.Array[Double]): this.type = js.native
    def resetData(data: js.Array[Double], `type`: EBufferType): this.type = js.native
    def resetData(data: js.Array[Double], `type`: EBufferType, offset: Double): this.type = js.native
  }
  
  /* static members */
  @js.native
  object ElementBuffer extends js.Object {
    def create(data: js.Array[Double]): ElementBuffer = js.native
    def create(data: js.Array[Double], `type`: EBufferType): ElementBuffer = js.native
    def create(data: js.Array[Double], `type`: EBufferType, usage: EBufferUsage): ElementBuffer = js.native
  }
  
}

