package typingsJapgolly.phaser.Phaser

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.Animations.AnimationManager
import typingsJapgolly.phaser.Phaser.Cache.CacheManager
import typingsJapgolly.phaser.Phaser.Cameras.Scene2D.CameraManager
import typingsJapgolly.phaser.Phaser.Data.DataManager
import typingsJapgolly.phaser.Phaser.Events.EventEmitter
import typingsJapgolly.phaser.Phaser.GameObjects.DisplayList
import typingsJapgolly.phaser.Phaser.GameObjects.GameObjectCreator
import typingsJapgolly.phaser.Phaser.GameObjects.GameObjectFactory
import typingsJapgolly.phaser.Phaser.GameObjects.LightsManager
import typingsJapgolly.phaser.Phaser.Input.InputPlugin
import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Physics.Arcade.ArcadePhysics
import typingsJapgolly.phaser.Phaser.Physics.Matter.MatterPhysics
import typingsJapgolly.phaser.Phaser.Plugins.PluginManager
import typingsJapgolly.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typingsJapgolly.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typingsJapgolly.phaser.Phaser.Scale.ScaleManager
import typingsJapgolly.phaser.Phaser.Scenes.ScenePlugin
import typingsJapgolly.phaser.Phaser.Scenes.Systems
import typingsJapgolly.phaser.Phaser.Sound.HTML5AudioSoundManager
import typingsJapgolly.phaser.Phaser.Sound.NoAudioSoundManager
import typingsJapgolly.phaser.Phaser.Sound.WebAudioSoundManager
import typingsJapgolly.phaser.Phaser.Textures.TextureManager
import typingsJapgolly.phaser.Phaser.Time.Clock
import typingsJapgolly.phaser.Phaser.Tweens.TweenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
trait Scene extends StObject {
  
  /**
    * The Scene Game Object Factory.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var add: GameObjectFactory
  
  /**
    * A reference to the global Animation Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var anims: AnimationManager
  
  /**
    * A reference to the global Cache.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cache: CacheManager
  
  /**
    * The Scene Camera Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cameras: CameraManager
  
  /**
    * The Game Object Display List belonging to this Scene.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var children: DisplayList
  
  /**
    * A Scene specific Data Manager Plugin.
    * 
    * See the `registry` property for the global Data Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var data: DataManager
  
  /**
    * A Scene specific Event Emitter.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var events: EventEmitter
  
  /**
    * The Facebook Instant Games Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var facebook: FacebookInstantGamesPlugin
  
  /**
    * A reference to the Phaser.Game instance.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var game: Game
  
  /**
    * The Scene Input Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var input: InputPlugin
  
  /**
    * The Scene Lights Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var lights: LightsManager
  
  /**
    * The Scene Loader Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var load: LoaderPlugin
  
  /**
    * The Scene Game Object Creator.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var make: GameObjectCreator
  
  /**
    * The Scene Matter Physics Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var matter: MatterPhysics
  
  /**
    * The Scene Arcade Physics Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var physics: ArcadePhysics
  
  /**
    * A reference to the global Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  var plugins: PluginManager
  
  /**
    * A reference to the global Data Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var registry: DataManager
  
  /**
    * A reference to the renderer instance Phaser is using, either Canvas Renderer or WebGL Renderer.
    */
  var renderer: CanvasRenderer | WebGLRenderer
  
  /**
    * A reference to the global Scale Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scale: ScaleManager
  
  /**
    * A reference to the Scene Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scene: ScenePlugin
  
  /**
    * A reference to the Sound Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var sound: NoAudioSoundManager | HTML5AudioSoundManager | WebAudioSoundManager
  
  /**
    * The Scene Systems. You must never overwrite this property, or all hell will break lose.
    */
  var sys: Systems
  
  /**
    * A reference to the Texture Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  var textures: TextureManager
  
  /**
    * The Scene Time and Clock Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var time: Clock
  
  /**
    * The Scene Tween Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var tweens: TweenManager
  
  /**
    * This method should be overridden by your own Scenes.
    * 
    * This method is called once per game step while the scene is running.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: Double, delta: Double): Unit
}
object Scene {
  
  inline def apply(
    add: GameObjectFactory,
    anims: AnimationManager,
    cache: CacheManager,
    cameras: CameraManager,
    children: DisplayList,
    data: DataManager,
    events: EventEmitter,
    facebook: FacebookInstantGamesPlugin,
    game: Game,
    input: InputPlugin,
    lights: LightsManager,
    load: LoaderPlugin,
    make: GameObjectCreator,
    matter: MatterPhysics,
    physics: ArcadePhysics,
    plugins: PluginManager,
    registry: DataManager,
    renderer: CanvasRenderer | WebGLRenderer,
    scale: ScaleManager,
    scene: ScenePlugin,
    sound: NoAudioSoundManager | HTML5AudioSoundManager | WebAudioSoundManager,
    sys: Systems,
    textures: TextureManager,
    time: Clock,
    tweens: TweenManager,
    update: (Double, Double) => Callback
  ): Scene = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], anims = anims.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], matter = matter.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tweens = tweens.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: Double, t1: Double) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[Scene]
  }
  
  extension [Self <: Scene](x: Self) {
    
    inline def setAdd(value: GameObjectFactory): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAnims(value: AnimationManager): Self = StObject.set(x, "anims", value.asInstanceOf[js.Any])
    
    inline def setCache(value: CacheManager): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCameras(value: CameraManager): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: DisplayList): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataManager): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFacebook(value: FacebookInstantGamesPlugin): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputPlugin): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLights(value: LightsManager): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: LoaderPlugin): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setMake(value: GameObjectCreator): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
    
    inline def setMatter(value: MatterPhysics): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    inline def setPhysics(value: ArcadePhysics): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: PluginManager): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: DataManager): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: CanvasRenderer | WebGLRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScaleManager): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScene(value: ScenePlugin): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSound(value: NoAudioSoundManager | HTML5AudioSoundManager | WebAudioSoundManager): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSys(value: Systems): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setTextures(value: TextureManager): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Clock): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTweens(value: TweenManager): Self = StObject.set(x, "tweens", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
