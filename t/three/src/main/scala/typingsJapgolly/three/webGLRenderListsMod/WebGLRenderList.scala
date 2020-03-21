package typingsJapgolly.three.webGLRenderListsMod

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.groupMod.Group
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderList")
@js.native
class WebGLRenderList () extends js.Object {
  var opaque: js.Array[RenderItem] = js.native
  var transparent: js.Array[RenderItem] = js.native
  def init(): Unit = js.native
  def push(`object`: Object3D, geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def push(
    `object`: Object3D,
    geometry: Null,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def push(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def push(
    `object`: Object3D,
    geometry: BufferGeometry,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def sort(): Unit = js.native
  def unshift(`object`: Object3D, geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def unshift(
    `object`: Object3D,
    geometry: Null,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def unshift(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def unshift(
    `object`: Object3D,
    geometry: BufferGeometry,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
}

