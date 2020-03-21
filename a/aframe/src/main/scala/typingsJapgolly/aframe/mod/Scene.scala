package typingsJapgolly.aframe.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.std.EventListener
import typingsJapgolly.three.mod.Camera
import typingsJapgolly.three.mod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene
  extends Entity[ObjectMap[Component[js.Any, System[js.Any]]]] {
  var behaviors: js.Array[Behavior] = js.native
  var camera: Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var isMobile: Boolean = js.native
  @JSName("object3D")
  var object3D_Scene: typingsJapgolly.three.mod.Scene = js.native
  var renderStarted: Boolean = js.native
  var renderer: WebGLRenderer = js.native
  var systems: ObjectMap[System[_]] = js.native
  var time: Double = js.native
  def addEventListener(`type`: SceneEvents, listener: EventListener): Unit = js.native
  def addEventListener(`type`: SceneEvents, listener: EventListener, useCapture: Boolean): Unit = js.native
  def enterVR(): js.Promise[Unit] | Unit = js.native
  def exitVR(): js.Promise[Unit] | Unit = js.native
  def reload(): Unit = js.native
}

