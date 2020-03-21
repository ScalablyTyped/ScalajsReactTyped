package typingsJapgolly.amapJsApiMap3d.AMap

import typingsJapgolly.amapJsApi.AMap.Layer
import typingsJapgolly.amapJsApiMap3d.AMap.Object3DLayer.Options
import typingsJapgolly.amapJsApiMap3d.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3DLayer")
@js.native
class Object3DLayer_ () extends Layer {
  def this(options: Options) = this()
  def add(object3d: Object3D): Unit = js.native
  def clear(): Unit = js.native
  def reDraw(): Unit = js.native
  def remove(object3d: Object3D): Unit = js.native
  // internal
  def setOption(options: AnonHeight): Unit = js.native
}

