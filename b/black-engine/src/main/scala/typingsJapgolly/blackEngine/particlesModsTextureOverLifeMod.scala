package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.particlesModifierMod.Modifier
import typingsJapgolly.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsTextureOverLifeMod {
  
  @JSImport("black-engine/particles/mods/TextureOverLife", "TextureOverLife")
  @js.native
  open class TextureOverLife protected () extends Modifier {
    def this(values: (Double | FloatScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
