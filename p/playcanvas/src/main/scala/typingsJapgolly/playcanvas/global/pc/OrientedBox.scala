package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.Mat4
import typingsJapgolly.playcanvas.mod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Oriented Box.
  */
@JSGlobal("pc.OrientedBox")
@js.native
/**
  * Create a new OrientedBox instance.
  *
  * @param {Mat4} [worldTransform] - Transform that has the orientation and position of the box.
  * Scale is assumed to be one.
  * @param {Vec3} [halfExtents] - Half the distance across the box in each local axis. The
  * constructor takes a reference of this parameter.
  */
open class OrientedBox ()
  extends typingsJapgolly.playcanvas.mod.OrientedBox {
  def this(worldTransform: Mat4) = this()
  def this(worldTransform: Unit, halfExtents: Vec3) = this()
  def this(worldTransform: Mat4, halfExtents: Vec3) = this()
}
