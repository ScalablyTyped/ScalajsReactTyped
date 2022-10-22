package typingsJapgolly.phaser.mod.GameObjects

import typingsJapgolly.phaser.Phaser.Geom.Point
import typingsJapgolly.phaser.Phaser.Scene
import typingsJapgolly.phaser.Phaser.Textures.Frame
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.DeathZoneSource
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.GravityWellConfig
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Particles {
  
  /**
    * A Particle Emitter property.
    * 
    * Facilitates changing Particle properties as they are emitted and throughout their lifetime.
    */
  @JSImport("phaser", "GameObjects.Particles.EmitterOp")
  @js.native
  open class EmitterOp protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.GameObjects.Particles.EmitterOp {
    /**
      * 
      * @param config Settings for the Particle Emitter that owns this property.
      * @param key The name of the property.
      * @param defaultValue The default value of the property.
      * @param emitOnly Whether the property can only be modified when a Particle is emitted. Default false.
      */
    def this(config: ParticleEmitterConfig, key: String, defaultValue: Double) = this()
    def this(config: ParticleEmitterConfig, key: String, defaultValue: Double, emitOnly: Boolean) = this()
  }
  
  /**
    * The GravityWell action applies a force on the particle to draw it towards, or repel it from, a single point.
    * 
    * The force applied is inversely proportional to the square of the distance from the particle to the point, in accordance with Newton's law of gravity.
    * 
    * This simulates the effect of gravity over large distances (as between planets, for example).
    */
  @JSImport("phaser", "GameObjects.Particles.GravityWell")
  @js.native
  /**
    * 
    * @param x The x coordinate of the Gravity Well, in world space. Default 0.
    * @param y The y coordinate of the Gravity Well, in world space. Default 0.
    * @param power The strength of the gravity force - larger numbers produce a stronger force. Default 0.
    * @param epsilon The minimum distance for which the gravity force is calculated. Default 100.
    * @param gravity The gravitational force of this Gravity Well. Default 50.
    */
  open class GravityWell ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.GameObjects.Particles.GravityWell {
    def this(x: Double) = this()
    def this(x: GravityWellConfig) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: GravityWellConfig, y: Double) = this()
    def this(x: Double, y: Double, power: Double) = this()
    def this(x: Double, y: Unit, power: Double) = this()
    def this(x: Unit, y: Double, power: Double) = this()
    def this(x: Unit, y: Unit, power: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Double) = this()
    def this(x: Double, y: Double, power: Unit, epsilon: Double) = this()
    def this(x: Double, y: Unit, power: Double, epsilon: Double) = this()
    def this(x: Double, y: Unit, power: Unit, epsilon: Double) = this()
    def this(x: Unit, y: Double, power: Double, epsilon: Double) = this()
    def this(x: Unit, y: Double, power: Unit, epsilon: Double) = this()
    def this(x: Unit, y: Unit, power: Double, epsilon: Double) = this()
    def this(x: Unit, y: Unit, power: Unit, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Unit, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Unit, epsilon: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Double, y: Double, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Double, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Unit, epsilon: Unit, gravity: Double) = this()
    
    /**
      * The active state of the Gravity Well. An inactive Gravity Well will not influence any particles.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The minimum distance for which the gravity force is calculated.
      */
    /* CompleteClass */
    var epsilon: Double = js.native
    
    /**
      * The strength of the gravity force - larger numbers produce a stronger force.
      */
    /* CompleteClass */
    var power: Double = js.native
    
    /**
      * Takes a Particle and updates it based on the properties of this Gravity Well.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      */
    /* CompleteClass */
    override def update(
      particle: typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle,
      delta: Double,
      step: Double
    ): Unit = js.native
    
    /**
      * The x coordinate of the Gravity Well, in world space.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The y coordinate of the Gravity Well, in world space.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * A Particle is a simple Game Object controlled by a Particle Emitter and Manager, and rendered by the Manager.
    * It uses its own lightweight physics system, and can interact only with its Emitter's bounds and zones.
    */
  @JSImport("phaser", "GameObjects.Particles.Particle")
  @js.native
  open class Particle protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle {
    /**
      * 
      * @param emitter The Emitter to which this Particle belongs.
      */
    def this(emitter: typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter) = this()
    
    /**
      * The x acceleration of this Particle.
      */
    /* CompleteClass */
    var accelerationX: Double = js.native
    
    /**
      * The y acceleration of this Particle.
      */
    /* CompleteClass */
    var accelerationY: Double = js.native
    
    /**
      * The alpha value of this Particle.
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * The angle of this Particle in degrees.
      */
    /* CompleteClass */
    var angle: Double = js.native
    
    /**
      * The bounciness, or restitution, of this Particle.
      */
    /* CompleteClass */
    var bounce: Double = js.native
    
    /**
      * Checks if this Particle is still within the bounds defined by the given Emitter.
      * 
      * If not, and depending on the Emitter collision flags, the Particle may either stop or rebound.
      * @param emitter The Emitter to check the bounds against.
      */
    /* CompleteClass */
    override def checkBounds(emitter: typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter): Unit = js.native
    
    /**
      * An internal method that calculates the velocity of the Particle.
      * @param emitter The Emitter that is updating this Particle.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param processors Particle processors (gravity wells).
      */
    /* CompleteClass */
    override def computeVelocity(
      emitter: typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter,
      delta: Double,
      step: Double,
      processors: js.Array[Any]
    ): Unit = js.native
    
    /**
      * The data used by the ease equation.
      */
    /* CompleteClass */
    var data: js.Object = js.native
    
    /**
      * The delay applied to this Particle upon emission, in ms.
      */
    /* CompleteClass */
    var delayCurrent: Double = js.native
    
    /**
      * The Emitter to which this Particle belongs.
      * 
      * A Particle can only belong to a single Emitter and is created, updated and destroyed via it.
      */
    /* CompleteClass */
    var emitter: typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter = js.native
    
    /**
      * Starts this Particle from the given coordinates.
      * @param x The x coordinate to launch this Particle from.
      * @param y The y coordinate to launch this Particle from.
      */
    /* CompleteClass */
    override def fire(x: Double, y: Double): Unit = js.native
    
    /**
      * The texture frame used to render this Particle.
      */
    /* CompleteClass */
    var frame: Frame = js.native
    
    /**
      * Checks to see if this Particle is alive and updating.
      */
    /* CompleteClass */
    override def isAlive(): Boolean = js.native
    
    /**
      * The lifespan of this Particle in ms.
      */
    /* CompleteClass */
    var life: Double = js.native
    
    /**
      * The current life of this Particle in ms.
      */
    /* CompleteClass */
    var lifeCurrent: Double = js.native
    
    /**
      * The normalized lifespan T value, where 0 is the start and 1 is the end.
      */
    /* CompleteClass */
    var lifeT: Double = js.native
    
    /**
      * The maximum horizontal velocity this Particle can travel at.
      */
    /* CompleteClass */
    var maxVelocityX: Double = js.native
    
    /**
      * The maximum vertical velocity this Particle can travel at.
      */
    /* CompleteClass */
    var maxVelocityY: Double = js.native
    
    /**
      * Resets the position of this particle back to zero.
      */
    /* CompleteClass */
    override def resetPosition(): Unit = js.native
    
    /**
      * The angle of this Particle in radians.
      */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /**
      * The horizontal scale of this Particle.
      */
    /* CompleteClass */
    var scaleX: Double = js.native
    
    /**
      * The vertical scale of this Particle.
      */
    /* CompleteClass */
    var scaleY: Double = js.native
    
    /**
      * The tint applied to this Particle.
      */
    /* CompleteClass */
    var tint: Double = js.native
    
    /**
      * The main update method for this Particle.
      * 
      * Updates its life values, computes the velocity and repositions the Particle.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param processors An optional array of update processors.
      */
    /* CompleteClass */
    override def update(delta: Double, step: Double, processors: js.Array[Any]): Boolean = js.native
    
    /**
      * The x velocity of this Particle.
      */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /**
      * The y velocity of this Particle.
      */
    /* CompleteClass */
    var velocityY: Double = js.native
    
    /**
      * The x coordinate of this Particle.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The y coordinate of this Particle.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * A particle emitter represents a single particle stream.
    * It controls a pool of {@link Phaser.GameObjects.Particles.Particle Particles} and is controlled by a {@link Phaser.GameObjects.Particles.ParticleEmitterManager Particle Emitter Manager}.
    */
  @JSImport("phaser", "GameObjects.Particles.ParticleEmitter")
  @js.native
  open class ParticleEmitter protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter {
    /**
      * 
      * @param manager The Emitter Manager this Emitter belongs to.
      * @param config Settings for this emitter.
      */
    def this(
      manager: typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitterManager,
      config: ParticleEmitterConfig
    ) = this()
    
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  /**
    * A Particle Emitter Manager creates and controls {@link Phaser.GameObjects.Particles.ParticleEmitter Particle Emitters} and {@link Phaser.GameObjects.Particles.GravityWell Gravity Wells}.
    */
  @JSImport("phaser", "GameObjects.Particles.ParticleEmitterManager")
  @js.native
  open class ParticleEmitterManager protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitterManager {
    /**
      * 
      * @param scene The Scene to which this Emitter Manager belongs.
      * @param texture The key of the Texture this Emitter Manager will use to render particles, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Emitter Manager will use to render particles.
      * @param emitters Configuration settings for one or more emitters to create.
      */
    def this(scene: Scene, texture: String) = this()
    def this(scene: Scene, texture: String, frame: String) = this()
    def this(scene: Scene, texture: String, frame: Double) = this()
    def this(scene: Scene, texture: String, frame: String, emitters: js.Array[ParticleEmitterConfig]) = this()
    def this(scene: Scene, texture: String, frame: String, emitters: ParticleEmitterConfig) = this()
    def this(scene: Scene, texture: String, frame: Double, emitters: js.Array[ParticleEmitterConfig]) = this()
    def this(scene: Scene, texture: String, frame: Double, emitters: ParticleEmitterConfig) = this()
    def this(scene: Scene, texture: String, frame: Unit, emitters: js.Array[ParticleEmitterConfig]) = this()
    def this(scene: Scene, texture: String, frame: Unit, emitters: ParticleEmitterConfig) = this()
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    var depth: Double = js.native
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: Double): this.type = js.native
    
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  object Zones {
    
    /**
      * A Death Zone.
      * 
      * A Death Zone is a special type of zone that will kill a Particle as soon as it either enters, or leaves, the zone.
      * 
      * The zone consists of a `source` which could be a Geometric shape, such as a Rectangle or Ellipse, or your own
      * object as long as it includes a `contains` method for which the Particles can be tested against.
      */
    @JSImport("phaser", "GameObjects.Particles.Zones.DeathZone")
    @js.native
    open class DeathZone protected ()
      extends StObject
         with typingsJapgolly.phaser.Phaser.GameObjects.Particles.Zones.DeathZone {
      /**
        * 
        * @param source An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * @param killOnEnter Should the Particle be killed when it enters the zone? `true` or leaves it? `false`
        */
      def this(source: DeathZoneSource, killOnEnter: Boolean) = this()
      
      /**
        * Set to `true` if the Particle should be killed if it enters this zone.
        * Set to `false` to kill the Particle if it leaves this zone.
        */
      /* CompleteClass */
      var killOnEnter: Boolean = js.native
      
      /**
        * An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * This could be a Geometry shape, such as `Phaser.Geom.Circle`, or your own custom object.
        */
      /* CompleteClass */
      var source: DeathZoneSource = js.native
      
      /**
        * Checks if the given Particle will be killed or not by this zone.
        * @param particle The Particle to be checked against this zone.
        */
      /* CompleteClass */
      override def willKill(particle: typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle): Boolean = js.native
    }
    
    /**
      * A zone that places particles on a shape's edges.
      */
    @JSImport("phaser", "GameObjects.Particles.Zones.EdgeZone")
    @js.native
    open class EdgeZone protected ()
      extends StObject
         with typingsJapgolly.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone {
      /**
        * 
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        * @param quantity The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        * @param stepRate The distance between each particle. When set, `quantity` is implied and should be set to 0.
        * @param yoyo Whether particles are placed from start to end and then end to start. Default false.
        * @param seamless Whether one endpoint will be removed if it's identical to the other. Default true.
        */
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double) = this()
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double, yoyo: Boolean) = this()
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double, yoyo: Boolean, seamless: Boolean) = this()
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double, yoyo: Unit, seamless: Boolean) = this()
      
      /**
        * Change the source of the EdgeZone.
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      /* CompleteClass */
      override def changeSource(source: EdgeZoneSource): this.type = js.native
      
      /**
        * The counter used for iterating the EdgeZone's points.
        */
      /* CompleteClass */
      var counter: Double = js.native
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      /* CompleteClass */
      override def getPoint(particle: typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle): Unit = js.native
      
      /**
        * The points placed on the source edge.
        */
      /* CompleteClass */
      var points: js.Array[Point] = js.native
      
      /**
        * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        */
      /* CompleteClass */
      var quantity: Double = js.native
      
      /**
        * Whether one endpoint will be removed if it's identical to the other.
        */
      /* CompleteClass */
      var seamless: Boolean = js.native
      
      /**
        * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      /* CompleteClass */
      var source: EdgeZoneSource | RandomZoneSource = js.native
      
      /**
        * The distance between each particle. When set, `quantity` is implied and should be set to 0.
        */
      /* CompleteClass */
      var stepRate: Double = js.native
      
      /**
        * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
        * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
        * 
        * Also updates internal properties.
        */
      /* CompleteClass */
      override def updateSource(): this.type = js.native
      
      /**
        * Whether particles are placed from start to end and then end to start.
        */
      /* CompleteClass */
      var yoyo: Boolean = js.native
    }
    
    /**
      * A zone that places particles randomly within a shapes area.
      */
    @JSImport("phaser", "GameObjects.Particles.Zones.RandomZone")
    @js.native
    open class RandomZone protected ()
      extends StObject
         with typingsJapgolly.phaser.Phaser.GameObjects.Particles.Zones.RandomZone {
      /**
        * 
        * @param source An object instance with a `getRandomPoint(point)` method.
        */
      def this(source: RandomZoneSource) = this()
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      /* CompleteClass */
      override def getPoint(particle: typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle): Unit = js.native
      
      /**
        * An object instance with a `getRandomPoint(point)` method.
        */
      /* CompleteClass */
      var source: RandomZoneSource = js.native
    }
  }
}
