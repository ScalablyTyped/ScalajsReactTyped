package typingsJapgolly.phaser.Phaser.Physics.Matter

import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Bounce
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Collision
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Force
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Friction
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Gravity
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Mass
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Sensor
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.SetBody
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Sleep
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Static
import typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Velocity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Matter Physics Sprite Game Object.
  * 
  * A Sprite Game Object is used for the display of both static and animated images in your game.
  * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
  * and animated.
  * 
  * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
  * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
  * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.phaser.Phaser.Types.Physics.Matter.MatterBody because Already inherited
- typingsJapgolly.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined 
- typingsJapgolly.phaser.Phaser.Physics.Matter.Components.Transform because var conflicts: angle, rotation, scaleX, scaleY, x, y. Inlined setFixedRotation */ @js.native
trait Sprite
  extends StObject
     with typingsJapgolly.phaser.Phaser.GameObjects.Sprite
     with Bounce
     with Collision
     with Force
     with Friction
     with Gravity
     with Mass
     with Sensor
     with SetBody
     with Sleep
     with Static
     with Velocity {
  
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  def setFixedRotation(): this.type = js.native
  
  /**
    * A reference to the Matter.World instance that this body belongs to.
    */
  var world: World = js.native
}
