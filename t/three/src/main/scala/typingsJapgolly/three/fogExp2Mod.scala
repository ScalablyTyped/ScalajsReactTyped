package typingsJapgolly.three

import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.fogMod.IFog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/FogExp2", JSImport.Namespace)
@js.native
object fogExp2Mod extends js.Object {
  @js.native
  class FogExp2 protected () extends IFog {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, density: Double) = this()
    def this(hex: Double, density: Double) = this()
    /* CompleteClass */
    override var color: Color = js.native
    /**
    	 * Defines how fast the fog will grow dense.
    	 * Default is 0.00025.
    	 */
    var density: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
}

