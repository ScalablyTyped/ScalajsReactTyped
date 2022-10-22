package typingsJapgolly.three

import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcScenesFogMod.FogBase
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScenesFogExp2Mod {
  
  @JSImport("three/src/scenes/FogExp2", "FogExp2")
  @js.native
  open class FogExp2 protected ()
    extends StObject
       with FogBase {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, density: Double) = this()
    def this(hex: Double, density: Double) = this()
    
    /* CompleteClass */
    var color: Color = js.native
    
    /**
      * Defines how fast the fog will grow dense.
      * @default 0.00025
      */
    var density: Double = js.native
    
    val isFogExp2: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
