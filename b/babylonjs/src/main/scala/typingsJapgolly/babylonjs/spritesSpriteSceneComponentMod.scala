package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo
import typingsJapgolly.babylonjs.cullingRayMod.Ray
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneComponentMod.ISceneComponent
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.spritesSpriteManagerMod.ISpriteManager
import typingsJapgolly.babylonjs.spritesSpriteMod.Sprite
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spritesSpriteSceneComponentMod {
  
  @JSImport("babylonjs/Sprites/spriteSceneComponent", "SpriteSceneComponent")
  @js.native
  open class SpriteSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _pickSpriteButKeepRay: Any = js.native
    
    /* private */ var _pointerDown: Any = js.native
    
    /* private */ var _pointerMove: Any = js.native
    
    /* private */ var _pointerUp: Any = js.native
    
    /** @internal */
    /* private */ var _spritePredicate: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal */
      def _internalMultiPickSprites(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /** @internal */
      def _internalPickSprites(ray: Ray): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      
      /** @internal */
      var _pickedDownSprite: Nullable[Sprite] = js.native
      
      /** @internal */
      var _pointerOverSprite: Nullable[Sprite] = js.native
      
      /** @internal */
      var _tempSpritePickingRay: Nullable[Ray] = js.native
      
      /**
        * Gets the sprite under the pointer
        * @returns a Sprite or null if no sprite is under the pointer
        */
      def getPointerOverSprite(): Nullable[Sprite] = js.native
      
      /** Launch a ray to try to pick sprites in the scene
        * @param x position on screen
        * @param y position on screen
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo array
        */
      def multiPickSprite(x: Double, y: Double): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /** Use the given ray to pick sprites in the scene
        * @param ray The ray (in world space) to use to pick meshes
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo array
        */
      def multiPickSpriteWithRay(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /**
        * An event triggered when sprites rendering is done
        * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
        */
      var onAfterSpritesRenderingObservable: Observable[
            typingsJapgolly.babylonjs.spritesSpriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
      
      /**
        * An event triggered when sprites rendering is about to start
        * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
        */
      var onBeforeSpritesRenderingObservable: Observable[
            typingsJapgolly.babylonjs.spritesSpriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
      
      /** Launch a ray to try to pick a sprite in the scene
        * @param x position on screen
        * @param y position on screen
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param fastCheck defines if the first intersection will be used (and not the closest)
        * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo
        */
      def pickSprite(x: Double, y: Double): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Unit,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      
      /** Use the given ray to pick a sprite in the scene
        * @param ray The ray (in world space) to use to pick meshes
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param fastCheck defines if the first intersection will be used (and not the closest)
        * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo
        */
      def pickSpriteWithRay(ray: Ray): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      
      /**
        * Force the sprite under the pointer
        * @param sprite defines the sprite to use
        */
      def setPointerOverSprite(sprite: Nullable[Sprite]): Unit = js.native
      
      /**
        * All of the sprite managers added to this scene
        * @see https://doc.babylonjs.com/babylon101/sprites
        */
      var spriteManagers: js.Array[ISpriteManager] = js.native
    }
  }
}
