package typingsJapgolly.forgeViewer.Autodesk.Viewing.Private

import japgolly.scalajs.react.Callback
import typingsJapgolly.forgeViewer.Autodesk.Viewing.Model
import typingsJapgolly.forgeViewer.THREE.Material
import typingsJapgolly.forgeViewer.THREE.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialManager extends StObject {
  
  def addCompactLayoutSupport(material: Material): Material
  
  def addHDRMaterial(name: String, mat: ShaderMaterial): Unit
  
  def addInstancingSupport(material: Material): Material
  
  def addLineMaterial(name: String, mat: ShaderMaterial, modelId: Double): Unit
  
  def addMaterial(name: String, mat: Material, skipSimplePhongHeuristics: Boolean): Unit
  
  def addMaterialNonHDR(name: String, mat: ShaderMaterial): Unit
  
  def addNonHDRMaterial(name: String, mat: ShaderMaterial): Unit
  
  def addOverrideMaterial(name: String, mat: Material): Unit
  
  def cloneMaterial(mat: Material, model: Model): Material
  
  def getMaterialVariant(srcMaterial: Material, variant: MATERIAL_VARIANT, model: Model): Material
  
  def getModelMaterials(model: Model, includeOTG: Boolean): Any
  
  def removeMaterial(name: String): Unit
  
  def removeNonHDRMaterial(name: String): Unit
}
object MaterialManager {
  
  inline def apply(
    addCompactLayoutSupport: Material => Material,
    addHDRMaterial: (String, ShaderMaterial) => Callback,
    addInstancingSupport: Material => Material,
    addLineMaterial: (String, ShaderMaterial, Double) => Callback,
    addMaterial: (String, Material, Boolean) => Callback,
    addMaterialNonHDR: (String, ShaderMaterial) => Callback,
    addNonHDRMaterial: (String, ShaderMaterial) => Callback,
    addOverrideMaterial: (String, Material) => Callback,
    cloneMaterial: (Material, Model) => Material,
    getMaterialVariant: (Material, MATERIAL_VARIANT, Model) => Material,
    getModelMaterials: (Model, Boolean) => Any,
    removeMaterial: String => Callback,
    removeNonHDRMaterial: String => Callback
  ): MaterialManager = {
    val __obj = js.Dynamic.literal(addCompactLayoutSupport = js.Any.fromFunction1(addCompactLayoutSupport), addHDRMaterial = js.Any.fromFunction2((t0: String, t1: ShaderMaterial) => (addHDRMaterial(t0, t1)).runNow()), addInstancingSupport = js.Any.fromFunction1(addInstancingSupport), addLineMaterial = js.Any.fromFunction3((t0: String, t1: ShaderMaterial, t2: Double) => (addLineMaterial(t0, t1, t2)).runNow()), addMaterial = js.Any.fromFunction3((t0: String, t1: Material, t2: Boolean) => (addMaterial(t0, t1, t2)).runNow()), addMaterialNonHDR = js.Any.fromFunction2((t0: String, t1: ShaderMaterial) => (addMaterialNonHDR(t0, t1)).runNow()), addNonHDRMaterial = js.Any.fromFunction2((t0: String, t1: ShaderMaterial) => (addNonHDRMaterial(t0, t1)).runNow()), addOverrideMaterial = js.Any.fromFunction2((t0: String, t1: Material) => (addOverrideMaterial(t0, t1)).runNow()), cloneMaterial = js.Any.fromFunction2(cloneMaterial), getMaterialVariant = js.Any.fromFunction3(getMaterialVariant), getModelMaterials = js.Any.fromFunction2(getModelMaterials), removeMaterial = js.Any.fromFunction1((t0: String) => removeMaterial(t0).runNow()), removeNonHDRMaterial = js.Any.fromFunction1((t0: String) => removeNonHDRMaterial(t0).runNow()))
    __obj.asInstanceOf[MaterialManager]
  }
  
  extension [Self <: MaterialManager](x: Self) {
    
    inline def setAddCompactLayoutSupport(value: Material => Material): Self = StObject.set(x, "addCompactLayoutSupport", js.Any.fromFunction1(value))
    
    inline def setAddHDRMaterial(value: (String, ShaderMaterial) => Callback): Self = StObject.set(x, "addHDRMaterial", js.Any.fromFunction2((t0: String, t1: ShaderMaterial) => (value(t0, t1)).runNow()))
    
    inline def setAddInstancingSupport(value: Material => Material): Self = StObject.set(x, "addInstancingSupport", js.Any.fromFunction1(value))
    
    inline def setAddLineMaterial(value: (String, ShaderMaterial, Double) => Callback): Self = StObject.set(x, "addLineMaterial", js.Any.fromFunction3((t0: String, t1: ShaderMaterial, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddMaterial(value: (String, Material, Boolean) => Callback): Self = StObject.set(x, "addMaterial", js.Any.fromFunction3((t0: String, t1: Material, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddMaterialNonHDR(value: (String, ShaderMaterial) => Callback): Self = StObject.set(x, "addMaterialNonHDR", js.Any.fromFunction2((t0: String, t1: ShaderMaterial) => (value(t0, t1)).runNow()))
    
    inline def setAddNonHDRMaterial(value: (String, ShaderMaterial) => Callback): Self = StObject.set(x, "addNonHDRMaterial", js.Any.fromFunction2((t0: String, t1: ShaderMaterial) => (value(t0, t1)).runNow()))
    
    inline def setAddOverrideMaterial(value: (String, Material) => Callback): Self = StObject.set(x, "addOverrideMaterial", js.Any.fromFunction2((t0: String, t1: Material) => (value(t0, t1)).runNow()))
    
    inline def setCloneMaterial(value: (Material, Model) => Material): Self = StObject.set(x, "cloneMaterial", js.Any.fromFunction2(value))
    
    inline def setGetMaterialVariant(value: (Material, MATERIAL_VARIANT, Model) => Material): Self = StObject.set(x, "getMaterialVariant", js.Any.fromFunction3(value))
    
    inline def setGetModelMaterials(value: (Model, Boolean) => Any): Self = StObject.set(x, "getModelMaterials", js.Any.fromFunction2(value))
    
    inline def setRemoveMaterial(value: String => Callback): Self = StObject.set(x, "removeMaterial", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveNonHDRMaterial(value: String => Callback): Self = StObject.set(x, "removeNonHDRMaterial", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
