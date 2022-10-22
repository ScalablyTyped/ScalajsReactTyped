package typingsJapgolly.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.MeshGeometry")
@js.native
/**
  * Constructs a new mesh geometry.
  *
  * @param [vertices=Float32Array(0)] - The vertex buffer (Float32Array).
  * @param [indices=null] - The index buffer (Uint16Array/Uint32Array).
  */
open class MeshGeometry ()
  extends typingsJapgolly.yuka.mod.MeshGeometry {
  def this(vertices: js.typedarray.Float32Array) = this()
  def this(vertices: js.typedarray.Float32Array, indices: js.typedarray.Uint16Array) = this()
  def this(vertices: js.typedarray.Float32Array, indices: js.typedarray.Uint32Array) = this()
  def this(vertices: Unit, indices: js.typedarray.Uint16Array) = this()
  def this(vertices: Unit, indices: js.typedarray.Uint32Array) = this()
}
