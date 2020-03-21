package typingsJapgolly.threeTdsLoader

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.three.bufferAttributeMod.BufferAttribute
import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBufferGeometryUtils extends js.Object {
  def computeTangents(geometry: BufferGeometry): Null
  def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute
  def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry
}

object TypeofBufferGeometryUtils {
  @scala.inline
  def apply(
    computeTangents: BufferGeometry => CallbackTo[Null],
    mergeBufferAttributes: js.Array[BufferAttribute] => CallbackTo[BufferAttribute],
    mergeBufferGeometries: js.Array[BufferGeometry] => CallbackTo[BufferGeometry]
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computeTangents")(js.Any.fromFunction1((t0: typingsJapgolly.three.bufferGeometryMod.BufferGeometry) => computeTangents(t0).runNow()))
    __obj.updateDynamic("mergeBufferAttributes")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.three.bufferAttributeMod.BufferAttribute]) => mergeBufferAttributes(t0).runNow()))
    __obj.updateDynamic("mergeBufferGeometries")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.three.bufferGeometryMod.BufferGeometry]) => mergeBufferGeometries(t0).runNow()))
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
}

