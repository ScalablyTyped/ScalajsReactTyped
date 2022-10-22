package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.Light")
@js.native
open class Light protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Light {
  /**
    * Creates a Light object in the scene.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The friendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsJapgolly.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
  
  /**
    * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
    * exceeding the number allowed of the materials.
    */
  /* CompleteClass */
  var renderPriority: Double = js.native
  
  /**
    * Gets or sets whether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  /* CompleteClass */
  var shadowEnabled: Boolean = js.native
}
/* static members */
object Light {
  
  @JSGlobal("BABYLON.Light")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_DEFAULT")
  @js.native
  val FALLOFF_DEFAULT: /* 0 */ Double = js.native
  
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_GLTF")
  @js.native
  val FALLOFF_GLTF: /* 2 */ Double = js.native
  
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_PHYSICAL")
  @js.native
  val FALLOFF_PHYSICAL: /* 1 */ Double = js.native
  
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_STANDARD")
  @js.native
  val FALLOFF_STANDARD: /* 3 */ Double = js.native
  
  /**
    * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
    * This new light is named "name" and added to the passed scene.
    * @param type Type according to the types available in Light.LIGHTTYPEID_x
    * @param name The friendly name of the light
    * @param scene The scene the new light will belong to
    * @returns the constructor function
    */
  inline def GetConstructorFromName(`type`: Double, name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene): Nullable[js.Function0[this.type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetConstructorFromName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Function0[this.type]]]
  
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_AUTOMATIC")
  @js.native
  val INTENSITYMODE_AUTOMATIC: /* 0 */ Double = js.native
  
  /**
    * lux (lm/m^2)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_ILLUMINANCE")
  @js.native
  val INTENSITYMODE_ILLUMINANCE: /* 3 */ Double = js.native
  
  /**
    * nit (cd/m^2)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_LUMINANCE")
  @js.native
  val INTENSITYMODE_LUMINANCE: /* 4 */ Double = js.native
  
  /**
    * candela (lm/sr)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_LUMINOUSINTENSITY")
  @js.native
  val INTENSITYMODE_LUMINOUSINTENSITY: /* 2 */ Double = js.native
  
  /**
    * lumen (lm)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_LUMINOUSPOWER")
  @js.native
  val INTENSITYMODE_LUMINOUSPOWER: /* 1 */ Double = js.native
  
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  @JSGlobal("BABYLON.Light.LIGHTMAP_DEFAULT")
  @js.native
  val LIGHTMAP_DEFAULT: /* 0 */ Double = js.native
  
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  @JSGlobal("BABYLON.Light.LIGHTMAP_SHADOWSONLY")
  @js.native
  val LIGHTMAP_SHADOWSONLY: /* 2 */ Double = js.native
  
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  @JSGlobal("BABYLON.Light.LIGHTMAP_SPECULAR")
  @js.native
  val LIGHTMAP_SPECULAR: /* 1 */ Double = js.native
  
  /**
    * Light type var id of the directional light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_DIRECTIONALLIGHT")
  @js.native
  val LIGHTTYPEID_DIRECTIONALLIGHT: /* 1 */ Double = js.native
  
  /**
    * Light type var id of the hemispheric light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_HEMISPHERICLIGHT")
  @js.native
  val LIGHTTYPEID_HEMISPHERICLIGHT: /* 3 */ Double = js.native
  
  /**
    * Light type var id of the point light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_POINTLIGHT")
  @js.native
  val LIGHTTYPEID_POINTLIGHT: /* 0 */ Double = js.native
  
  /**
    * Light type var id of the spot light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_SPOTLIGHT")
  @js.native
  val LIGHTTYPEID_SPOTLIGHT: /* 2 */ Double = js.native
  
  /**
    * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
    * @param parsedLight The JSON representation of the light
    * @param scene The scene to create the parsed light in
    * @returns the created light after parsing
    */
  inline def Parse(parsedLight: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene): Nullable[typingsJapgolly.babylonjs.BABYLON.Light] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedLight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Light]]
}
