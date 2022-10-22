package typingsJapgolly.aframe.anon

import typingsJapgolly.three.anon.AlphaMap
import typingsJapgolly.three.anon.AmbientLightColor
import typingsJapgolly.three.anon.AoMap
import typingsJapgolly.three.anon.BumpMap
import typingsJapgolly.three.anon.Diffuse
import typingsJapgolly.three.anon.DisplacementBias
import typingsJapgolly.three.anon.EmissiveMap
import typingsJapgolly.three.anon.EnvMap
import typingsJapgolly.three.anon.FogColor
import typingsJapgolly.three.anon.GradientMap
import typingsJapgolly.three.anon.LightMap
import typingsJapgolly.three.anon.MetalnessMap
import typingsJapgolly.three.anon.NormalMap
import typingsJapgolly.three.anon.RoughnessMap
import typingsJapgolly.three.anon.SpecularMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUniformsLib extends StObject {
  
  var aomap: AoMap
  
  var bumpmap: BumpMap
  
  var common: AlphaMap
  
  var displacementmap: DisplacementBias
  
  var emissivemap: EmissiveMap
  
  var envmap: EnvMap
  
  var fog: FogColor
  
  var gradientmap: GradientMap
  
  var lightmap: LightMap
  
  var lights: AmbientLightColor
  
  var metalnessmap: MetalnessMap
  
  var normalmap: NormalMap
  
  var points: Diffuse
  
  var roughnessmap: RoughnessMap
  
  var specularmap: SpecularMap
}
object TypeofUniformsLib {
  
  inline def apply(
    aomap: AoMap,
    bumpmap: BumpMap,
    common: AlphaMap,
    displacementmap: DisplacementBias,
    emissivemap: EmissiveMap,
    envmap: EnvMap,
    fog: FogColor,
    gradientmap: GradientMap,
    lightmap: LightMap,
    lights: AmbientLightColor,
    metalnessmap: MetalnessMap,
    normalmap: NormalMap,
    points: Diffuse,
    roughnessmap: RoughnessMap,
    specularmap: SpecularMap
  ): TypeofUniformsLib = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUniformsLib]
  }
  
  extension [Self <: TypeofUniformsLib](x: Self) {
    
    inline def setAomap(value: AoMap): Self = StObject.set(x, "aomap", value.asInstanceOf[js.Any])
    
    inline def setBumpmap(value: BumpMap): Self = StObject.set(x, "bumpmap", value.asInstanceOf[js.Any])
    
    inline def setCommon(value: AlphaMap): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDisplacementmap(value: DisplacementBias): Self = StObject.set(x, "displacementmap", value.asInstanceOf[js.Any])
    
    inline def setEmissivemap(value: EmissiveMap): Self = StObject.set(x, "emissivemap", value.asInstanceOf[js.Any])
    
    inline def setEnvmap(value: EnvMap): Self = StObject.set(x, "envmap", value.asInstanceOf[js.Any])
    
    inline def setFog(value: FogColor): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    inline def setGradientmap(value: GradientMap): Self = StObject.set(x, "gradientmap", value.asInstanceOf[js.Any])
    
    inline def setLightmap(value: LightMap): Self = StObject.set(x, "lightmap", value.asInstanceOf[js.Any])
    
    inline def setLights(value: AmbientLightColor): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setMetalnessmap(value: MetalnessMap): Self = StObject.set(x, "metalnessmap", value.asInstanceOf[js.Any])
    
    inline def setNormalmap(value: NormalMap): Self = StObject.set(x, "normalmap", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Diffuse): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setRoughnessmap(value: RoughnessMap): Self = StObject.set(x, "roughnessmap", value.asInstanceOf[js.Any])
    
    inline def setSpecularmap(value: SpecularMap): Self = StObject.set(x, "specularmap", value.asInstanceOf[js.Any])
  }
}
