package typingsJapgolly.phaser.Phaser.Types.Core

import typingsJapgolly.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typingsJapgolly.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsConfig extends StObject {
  
  /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
  var default: js.UndefOr[String] = js.undefined
  
  /**
    * Arcade Physics configuration.
    */
  var arcade: js.UndefOr[ArcadeWorldConfig] = js.undefined
  
  /**
    * Matter Physics configuration.
    */
  var matter: js.UndefOr[MatterWorldConfig] = js.undefined
}
object PhysicsConfig {
  
  inline def apply(): PhysicsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsConfig]
  }
  
  extension [Self <: PhysicsConfig](x: Self) {
    
    inline def setArcade(value: ArcadeWorldConfig): Self = StObject.set(x, "arcade", value.asInstanceOf[js.Any])
    
    inline def setArcadeUndefined: Self = StObject.set(x, "arcade", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatter(value: MatterWorldConfig): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    inline def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
