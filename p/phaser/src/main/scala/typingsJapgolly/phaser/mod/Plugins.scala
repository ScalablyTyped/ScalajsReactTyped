package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.Phaser.Types.Plugins.CorePluginContainer
import typingsJapgolly.phaser.Phaser.Types.Plugins.CustomPluginContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  /**
    * A Global Plugin is installed just once into the Game owned Plugin Manager.
    * It can listen for Game events and respond to them.
    */
  @JSImport("phaser", "Plugins.BasePlugin")
  @js.native
  open class BasePlugin protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Plugins.BasePlugin {
    /**
      * 
      * @param pluginManager A reference to the Plugin Manager.
      */
    def this(pluginManager: typingsJapgolly.phaser.Phaser.Plugins.PluginManager) = this()
  }
  
  /**
    * The Default Plugins.
    */
  object DefaultPlugins {
    
    @JSImport("phaser", "Plugins.DefaultPlugins")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * These are the core plugins that are installed into every Scene.Systems instance, no matter what.
      * They are optionally exposed in the Scene as well (see the InjectionMap for details)
      * 
      * They are created in the order in which they appear in this array and EventEmitter is always first.
      */
    @JSImport("phaser", "Plugins.DefaultPlugins.CoreScene")
    @js.native
    def CoreScene: js.Array[Any] = js.native
    inline def CoreScene_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CoreScene")(x.asInstanceOf[js.Any])
    
    /**
      * These plugins are created in Scene.Systems in addition to the CoreScenePlugins.
      * 
      * You can elect not to have these plugins by either creating a DefaultPlugins object as part
      * of the Game Config, by creating a Plugins object as part of a Scene Config, or by modifying this array
      * and building your own bundle.
      * 
      * They are optionally exposed in the Scene as well (see the InjectionMap for details)
      * 
      * They are always created in the order in which they appear in the array.
      */
    @JSImport("phaser", "Plugins.DefaultPlugins.DefaultScene")
    @js.native
    def DefaultScene: js.Array[Any] = js.native
    inline def DefaultScene_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultScene")(x.asInstanceOf[js.Any])
    
    /**
      * These are the Global Managers that are created by the Phaser.Game instance.
      * They are referenced from Scene.Systems so that plugins can use them.
      */
    @JSImport("phaser", "Plugins.DefaultPlugins.Global")
    @js.native
    def Global: js.Array[Any] = js.native
    inline def Global_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Global")(x.asInstanceOf[js.Any])
  }
  
  object PluginCache {
    
    @JSImport("phaser", "Plugins.PluginCache")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Removes all Core Plugins.
      * 
      * This includes all of the internal system plugins that Phaser needs, like the Input Plugin and Loader Plugin.
      * So be sure you only call this if you do not wish to run Phaser again.
      */
    inline def destroyCorePlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyCorePlugins")().asInstanceOf[Unit]
    
    /**
      * Removes all Custom Plugins.
      */
    inline def destroyCustomPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyCustomPlugins")().asInstanceOf[Unit]
    
    /**
      * Returns the core plugin object from the cache based on the given key.
      * @param key The key of the core plugin to get.
      */
    inline def getCore(key: String): CorePluginContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("getCore")(key.asInstanceOf[js.Any]).asInstanceOf[CorePluginContainer]
    
    /**
      * Returns the custom plugin object from the cache based on the given key.
      * @param key The key of the custom plugin to get.
      */
    inline def getCustom(key: String): CustomPluginContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustom")(key.asInstanceOf[js.Any]).asInstanceOf[CustomPluginContainer]
    
    /**
      * Returns an object from the custom cache based on the given key that can be instantiated.
      * @param key The key of the custom plugin to get.
      */
    inline def getCustomClass(key: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomClass")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Checks if the given key is already being used in the core plugin cache.
      * @param key The key to check for.
      */
    inline def hasCore(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCore")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Checks if the given key is already being used in the custom plugin cache.
      * @param key The key to check for.
      */
    inline def hasCustom(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCustom")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Static method called directly by the Core internal Plugins.
      * Key is a reference used to get the plugin from the plugins object (i.e. InputPlugin)
      * Plugin is the object to instantiate to create the plugin
      * Mapping is what the plugin is injected into the Scene.Systems as (i.e. input)
      * @param key A reference used to get this plugin from the plugin cache.
      * @param plugin The plugin to be stored. Should be the core object, not instantiated.
      * @param mapping If this plugin is to be injected into the Scene Systems, this is the property key map used.
      * @param custom Core Scene plugin or a Custom Scene plugin? Default false.
      */
    inline def register(key: String, plugin: js.Function, mapping: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(key.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(key: String, plugin: js.Function, mapping: String, custom: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(key.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], custom.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Stores a custom plugin in the global plugin cache.
      * The key must be unique, within the scope of the cache.
      * @param key A reference used to get this plugin from the plugin cache.
      * @param plugin The plugin to be stored. Should be the core object, not instantiated.
      * @param mapping If this plugin is to be injected into the Scene Systems, this is the property key map used.
      * @param data A value to be passed to the plugin's `init` method.
      */
    inline def registerCustom(key: String, plugin: js.Function, mapping: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustom")(key.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a core plugin based on the given key.
      * @param key The key of the core plugin to remove.
      */
    inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes a custom plugin based on the given key.
      * @param key The key of the custom plugin to remove.
      */
    inline def removeCustom(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustom")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * The PluginManager is responsible for installing and adding plugins to Phaser.
    * 
    * It is a global system and therefore belongs to the Game instance, not a specific Scene.
    * 
    * It works in conjunction with the PluginCache. Core internal plugins automatically register themselves
    * with the Cache, but it's the Plugin Manager that is responsible for injecting them into the Scenes.
    * 
    * There are two types of plugin:
    * 
    * 1. A Global Plugin
    * 2. A Scene Plugin
    * 
    * A Global Plugin is a plugin that lives within the Plugin Manager rather than a Scene. You can get
    * access to it by calling `PluginManager.get` and providing a key. Any Scene that requests a plugin in
    * this way will all get access to the same plugin instance, allowing you to use a single plugin across
    * multiple Scenes.
    * 
    * A Scene Plugin is a plugin dedicated to running within a Scene. These are different to Global Plugins
    * in that their instances do not live within the Plugin Manager, but within the Scene Systems class instead.
    * And that every Scene created is given its own unique instance of a Scene Plugin. Examples of core Scene
    * Plugins include the Input Plugin, the Tween Plugin and the physics Plugins.
    * 
    * You can add a plugin to Phaser in three different ways:
    * 
    * 1. Preload it
    * 2. Include it in your source code and install it via the Game Config
    * 3. Include it in your source code and install it within a Scene
    * 
    * For examples of all of these approaches please see the Phaser 3 Examples Repo `plugins` folder.
    * 
    * For information on creating your own plugin please see the Phaser 3 Plugin Template.
    */
  @JSImport("phaser", "Plugins.PluginManager")
  @js.native
  open class PluginManager protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Plugins.PluginManager {
    /**
      * 
      * @param game The game instance that owns this Plugin Manager.
      */
    def this(game: typingsJapgolly.phaser.Phaser.Game) = this()
  }
  
  /**
    * A Scene Level Plugin is installed into every Scene and belongs to that Scene.
    * It can listen for Scene events and respond to them.
    * It can map itself to a Scene property, or into the Scene Systems, or both.
    */
  @JSImport("phaser", "Plugins.ScenePlugin")
  @js.native
  open class ScenePlugin protected ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Plugins.ScenePlugin {
    /**
      * 
      * @param scene A reference to the Scene that has installed this plugin.
      * @param pluginManager A reference to the Plugin Manager.
      * @param pluginKey The key under which this plugin has been installed into the Scene Systems.
      */
    def this(
      scene: typingsJapgolly.phaser.Phaser.Scene,
      pluginManager: typingsJapgolly.phaser.Phaser.Plugins.PluginManager,
      pluginKey: String
    ) = this()
  }
}
