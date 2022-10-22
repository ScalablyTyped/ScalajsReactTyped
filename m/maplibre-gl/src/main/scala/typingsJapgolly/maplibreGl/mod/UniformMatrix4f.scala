package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLUniformLocation
import typingsJapgolly.glMatrix.mod.mat4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "UniformMatrix4f")
@js.native
open class UniformMatrix4f protected ()
  extends StObject
     with Uniform[mat4] {
  def this(context: Context, location: WebGLUniformLocation) = this()
  
  /* CompleteClass */
  var current: mat4 = js.native
  
  /* CompleteClass */
  var gl: WebGLRenderingContext = js.native
  
  /* CompleteClass */
  var location: WebGLUniformLocation = js.native
  
  /* CompleteClass */
  override def set(v: mat4): scala.Unit = js.native
}
