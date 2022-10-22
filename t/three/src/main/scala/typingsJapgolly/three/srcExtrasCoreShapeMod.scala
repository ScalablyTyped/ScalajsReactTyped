package typingsJapgolly.three

import typingsJapgolly.three.anon.Holes
import typingsJapgolly.three.srcExtrasCorePathMod.Path
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreShapeMod {
  
  @JSImport("three/src/extras/core/Shape", "Shape")
  @js.native
  open class Shape () extends Path {
    def this(points: js.Array[Vector2]) = this()
    
    def extractPoints(divisions: Double): Holes = js.native
    
    def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
    
    /**
      * @default []
      */
    var holes: js.Array[Path] = js.native
    
    var uuid: String = js.native
  }
}
