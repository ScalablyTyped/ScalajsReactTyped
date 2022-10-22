package typingsJapgolly.babylonjs.mod

import org.scalajs.dom.File
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.IRegisteredPlugin
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.ISceneLoaderAsyncResult
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.ISceneLoaderPlugin
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.ISceneLoaderPluginAsync
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.ISceneLoaderPluginFactory
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.ISceneLoaderProgressEvent
import typingsJapgolly.babylonjs.loadingSceneLoaderMod.SceneLoaderSuccessCallback
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SceneLoader")
@js.native
open class SceneLoader ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.SceneLoader
/* static members */
object SceneLoader {
  
  @JSImport("babylonjs", "SceneLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Append a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  inline def Append(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[
      Nullable[js.Function1[/* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, Unit]]
    ],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[Any], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("Append")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
  
  /**
    * Append a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The given scene
    */
  inline def AppendAsync(rootUrl: String): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = ^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(rootUrl: String, sceneFilename: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def AppendAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  
  /**
    * Detailed logging while loading
    */
  @JSImport("babylonjs", "SceneLoader.DETAILED_LOGGING")
  @js.native
  val DETAILED_LOGGING: Double = js.native
  
  /**
    * Gets the default plugin (used to load Babylon files)
    * @returns the .babylon plugin
    */
  inline def GetDefaultPlugin(): IRegisteredPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaultPlugin")().asInstanceOf[IRegisteredPlugin]
  
  /**
    * Gets a plugin that can load the given extension
    * @param extension defines the extension to load
    * @returns a plugin or null if none works
    */
  inline def GetPluginForExtension(`extension`: String): ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPluginForExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory]
  
  /**
    * Import animations from a file into a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
    * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
    * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    */
  inline def ImportAnimations(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[
      typingsJapgolly.babylonjs.loadingSceneLoaderMod.SceneLoaderAnimationGroupLoadingMode
    ],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ Any, Any]]],
    onSuccess: js.UndefOr[
      Nullable[js.Function1[/* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, Unit]]
    ],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[Any], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportAnimations")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], overwriteAnimations.asInstanceOf[js.Any], animationGroupLoadingMode.asInstanceOf[js.Any], targetConverter.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Import animations from a file into a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
    * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
    * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns the updated scene with imported animations
    */
  inline def ImportAnimationsAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[
      typingsJapgolly.babylonjs.loadingSceneLoaderMod.SceneLoaderAnimationGroupLoadingMode
    ],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ Any, Any]]],
    onSuccess: js.UndefOr[
      Nullable[js.Function1[/* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, Unit]]
    ],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[Any], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportAnimationsAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], overwriteAnimations.asInstanceOf[js.Any], animationGroupLoadingMode.asInstanceOf[js.Any], targetConverter.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  
  /**
    * Import meshes into a scene
    * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene the instance of BABYLON.Scene to append to
    * @param onSuccess a callback with a list of imported meshes, particleSystems, skeletons, and animationGroups when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  inline def ImportMesh(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[Nullable[SceneLoaderSuccessCallback]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[Any], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMesh")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
  
  /**
    * Import meshes into a scene
    * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene the instance of BABYLON.Scene to append to
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
    */
  inline def ImportMeshAsync(meshNames: Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: String): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: File): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  inline def ImportMeshAsync(
    meshNames: Any,
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
  
  /**
    * Gets a boolean indicating that the given extension can be loaded
    * @param extension defines the extension to load
    * @returns true if the extension is supported
    */
  inline def IsPluginForExtensionAvailable(`extension`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPluginForExtensionAvailable")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Load a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param engine is the instance of BABYLON.Engine to use to create the scene
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  inline def Load(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    engine: js.UndefOr[Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine]],
    onSuccess: js.UndefOr[
      Nullable[js.Function1[/* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, Unit]]
    ],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[Any], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("Load")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
  
  /**
    * Load a scene into an asset container
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  inline def LoadAssetContainer(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]],
    onSuccess: js.UndefOr[
      Nullable[
        js.Function1[/* assets */ typingsJapgolly.babylonjs.assetContainerMod.AssetContainer, Unit]
      ]
    ],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[
          /* scene */ typingsJapgolly.babylonjs.sceneMod.Scene, 
          /* message */ String, 
          /* exception */ js.UndefOr[Any], 
          Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainer")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
  
  /**
    * Load a scene into an asset container
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
    * @param scene is the instance of Scene to append to
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded asset container
    */
  inline def LoadAssetContainerAsync(rootUrl: String): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: File, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  inline def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.assetContainerMod.AssetContainer]]
  
  /**
    * Load a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param engine is the instance of BABYLON.Engine to use to create the scene
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded scene
    */
  inline def LoadAsync(rootUrl: String): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Unit,
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Unit,
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Unit,
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  inline def LoadAsync(
    rootUrl: String,
    sceneFilename: Unit,
    engine: Nullable[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
    pluginExtension: Nullable[String]
  ): js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.sceneMod.Scene]]
  
  /**
    * Minimal logging while loading
    */
  @JSImport("babylonjs", "SceneLoader.MINIMAL_LOGGING")
  @js.native
  val MINIMAL_LOGGING: Double = js.native
  
  /**
    * No logging while loading
    */
  @JSImport("babylonjs", "SceneLoader.NO_LOGGING")
  @js.native
  val NO_LOGGING: Double = js.native
  
  /**
    * Event raised when a plugin is used to load a scene
    */
  @JSImport("babylonjs", "SceneLoader.OnPluginActivatedObservable")
  @js.native
  def OnPluginActivatedObservable: typingsJapgolly.babylonjs.miscObservableMod.Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  inline def OnPluginActivatedObservable_=(
    x: typingsJapgolly.babylonjs.miscObservableMod.Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnPluginActivatedObservable")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a new plugin to the list of registered plugins
    * @param plugin defines the plugin to add
    */
  inline def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Summary logging while loading
    */
  @JSImport("babylonjs", "SceneLoader.SUMMARY_LOGGING")
  @js.native
  val SUMMARY_LOGGING: Double = js.native
  
  @JSImport("babylonjs", "SceneLoader._FormatErrorMessage")
  @js.native
  def _FormatErrorMessage: Any = js.native
  inline def _FormatErrorMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatErrorMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._GetDirectLoad")
  @js.native
  def _GetDirectLoad: Any = js.native
  inline def _GetDirectLoad_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDirectLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._GetFileInfo")
  @js.native
  def _GetFileInfo: Any = js.native
  inline def _GetFileInfo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFileInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._GetPluginForDirectLoad")
  @js.native
  def _GetPluginForDirectLoad: Any = js.native
  inline def _GetPluginForDirectLoad_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForDirectLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._GetPluginForExtension")
  @js.native
  def _GetPluginForExtension: Any = js.native
  inline def _GetPluginForExtension_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForExtension")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._GetPluginForFilename")
  @js.native
  def _GetPluginForFilename: Any = js.native
  inline def _GetPluginForFilename_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForFilename")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._LoadData")
  @js.native
  def _LoadData: Any = js.native
  inline def _LoadData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadData")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._RegisteredPlugins")
  @js.native
  def _RegisteredPlugins: Any = js.native
  inline def _RegisteredPlugins_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RegisteredPlugins")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneLoader._ShowingLoadingScreen")
  @js.native
  def _ShowingLoadingScreen: Any = js.native
  inline def _ShowingLoadingScreen_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ShowingLoadingScreen")(x.asInstanceOf[js.Any])
}
