package typingsJapgolly.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Axes")
@js.native
open class Axes ()
  extends typingsJapgolly.matterJs.mod.Axes
/* static members */
object Axes {
  
  @JSGlobal("Matter.Axes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {Vertices} vertices
    * @returns {axes} A new axes from the given vertices
    */
  inline def fromVertices(vertices: js.Array[typingsJapgolly.matterJs.mod.Vector]): js.Array[typingsJapgolly.matterJs.mod.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.matterJs.mod.Vector]]
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  inline def rotate(axes: js.Array[typingsJapgolly.matterJs.mod.Vector], angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
