package typingsJapgolly.babylonjs.miscIndexMod

import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "Reflector")
@js.native
open class Reflector protected ()
  extends typingsJapgolly.babylonjs.miscReflectorMod.Reflector {
  /**
    * Constructs a reflector object.
    * @param scene The scene to use
    * @param hostname The hostname of the reflector bridge
    * @param port The port of the reflector bridge
    */
  def this(scene: Scene, hostname: String, port: Double) = this()
}
/* static members */
object Reflector {
  
  @JSImport("babylonjs/Misc/index", "Reflector._SERVER_PREFIX")
  @js.native
  val _SERVER_PREFIX: Any = js.native
}
