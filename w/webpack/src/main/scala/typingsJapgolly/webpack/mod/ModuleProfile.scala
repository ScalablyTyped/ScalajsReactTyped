package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleProfile extends StObject {
  
  var additionalFactories: Double
  
  var additionalFactoriesParallelismFactor: Double
  
  var additionalFactoryTimes: Any
  
  var additionalIntegration: Double
  
  var building: Double
  
  var buildingEndTime: Double
  
  var buildingParallelismFactor: Double
  
  var buildingStartTime: Double
  
  var factory: Double
  
  var factoryEndTime: Double
  
  var factoryParallelismFactor: Double
  
  var factoryStartTime: Double
  
  var integration: Double
  
  var integrationEndTime: Double
  
  var integrationParallelismFactor: Double
  
  var integrationStartTime: Double
  
  def markBuildingEnd(): Unit
  
  def markBuildingStart(): Unit
  
  def markFactoryEnd(): Unit
  
  def markFactoryStart(): Unit
  
  def markIntegrationEnd(): Unit
  
  def markIntegrationStart(): Unit
  
  def markRestoringEnd(): Unit
  
  def markRestoringStart(): Unit
  
  def markStoringEnd(): Unit
  
  def markStoringStart(): Unit
  
  /**
  	 * Merge this profile into another one
  	 */
  def mergeInto(realProfile: ModuleProfile): Unit
  
  var restoring: Double
  
  var restoringEndTime: Double
  
  var restoringParallelismFactor: Double
  
  var restoringStartTime: Double
  
  var startTime: Double
  
  var storing: Double
  
  var storingEndTime: Double
  
  var storingParallelismFactor: Double
  
  var storingStartTime: Double
}
object ModuleProfile {
  
  inline def apply(
    additionalFactories: Double,
    additionalFactoriesParallelismFactor: Double,
    additionalFactoryTimes: Any,
    additionalIntegration: Double,
    building: Double,
    buildingEndTime: Double,
    buildingParallelismFactor: Double,
    buildingStartTime: Double,
    factory: Double,
    factoryEndTime: Double,
    factoryParallelismFactor: Double,
    factoryStartTime: Double,
    integration: Double,
    integrationEndTime: Double,
    integrationParallelismFactor: Double,
    integrationStartTime: Double,
    markBuildingEnd: Callback,
    markBuildingStart: Callback,
    markFactoryEnd: Callback,
    markFactoryStart: Callback,
    markIntegrationEnd: Callback,
    markIntegrationStart: Callback,
    markRestoringEnd: Callback,
    markRestoringStart: Callback,
    markStoringEnd: Callback,
    markStoringStart: Callback,
    mergeInto: ModuleProfile => Callback,
    restoring: Double,
    restoringEndTime: Double,
    restoringParallelismFactor: Double,
    restoringStartTime: Double,
    startTime: Double,
    storing: Double,
    storingEndTime: Double,
    storingParallelismFactor: Double,
    storingStartTime: Double
  ): ModuleProfile = {
    val __obj = js.Dynamic.literal(additionalFactories = additionalFactories.asInstanceOf[js.Any], additionalFactoriesParallelismFactor = additionalFactoriesParallelismFactor.asInstanceOf[js.Any], additionalFactoryTimes = additionalFactoryTimes.asInstanceOf[js.Any], additionalIntegration = additionalIntegration.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], buildingEndTime = buildingEndTime.asInstanceOf[js.Any], buildingParallelismFactor = buildingParallelismFactor.asInstanceOf[js.Any], buildingStartTime = buildingStartTime.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], factoryEndTime = factoryEndTime.asInstanceOf[js.Any], factoryParallelismFactor = factoryParallelismFactor.asInstanceOf[js.Any], factoryStartTime = factoryStartTime.asInstanceOf[js.Any], integration = integration.asInstanceOf[js.Any], integrationEndTime = integrationEndTime.asInstanceOf[js.Any], integrationParallelismFactor = integrationParallelismFactor.asInstanceOf[js.Any], integrationStartTime = integrationStartTime.asInstanceOf[js.Any], markBuildingEnd = markBuildingEnd.toJsFn, markBuildingStart = markBuildingStart.toJsFn, markFactoryEnd = markFactoryEnd.toJsFn, markFactoryStart = markFactoryStart.toJsFn, markIntegrationEnd = markIntegrationEnd.toJsFn, markIntegrationStart = markIntegrationStart.toJsFn, markRestoringEnd = markRestoringEnd.toJsFn, markRestoringStart = markRestoringStart.toJsFn, markStoringEnd = markStoringEnd.toJsFn, markStoringStart = markStoringStart.toJsFn, mergeInto = js.Any.fromFunction1((t0: ModuleProfile) => mergeInto(t0).runNow()), restoring = restoring.asInstanceOf[js.Any], restoringEndTime = restoringEndTime.asInstanceOf[js.Any], restoringParallelismFactor = restoringParallelismFactor.asInstanceOf[js.Any], restoringStartTime = restoringStartTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], storing = storing.asInstanceOf[js.Any], storingEndTime = storingEndTime.asInstanceOf[js.Any], storingParallelismFactor = storingParallelismFactor.asInstanceOf[js.Any], storingStartTime = storingStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleProfile]
  }
  
  extension [Self <: ModuleProfile](x: Self) {
    
    inline def setAdditionalFactories(value: Double): Self = StObject.set(x, "additionalFactories", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFactoriesParallelismFactor(value: Double): Self = StObject.set(x, "additionalFactoriesParallelismFactor", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFactoryTimes(value: Any): Self = StObject.set(x, "additionalFactoryTimes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalIntegration(value: Double): Self = StObject.set(x, "additionalIntegration", value.asInstanceOf[js.Any])
    
    inline def setBuilding(value: Double): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setBuildingEndTime(value: Double): Self = StObject.set(x, "buildingEndTime", value.asInstanceOf[js.Any])
    
    inline def setBuildingParallelismFactor(value: Double): Self = StObject.set(x, "buildingParallelismFactor", value.asInstanceOf[js.Any])
    
    inline def setBuildingStartTime(value: Double): Self = StObject.set(x, "buildingStartTime", value.asInstanceOf[js.Any])
    
    inline def setFactory(value: Double): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryEndTime(value: Double): Self = StObject.set(x, "factoryEndTime", value.asInstanceOf[js.Any])
    
    inline def setFactoryParallelismFactor(value: Double): Self = StObject.set(x, "factoryParallelismFactor", value.asInstanceOf[js.Any])
    
    inline def setFactoryStartTime(value: Double): Self = StObject.set(x, "factoryStartTime", value.asInstanceOf[js.Any])
    
    inline def setIntegration(value: Double): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    inline def setIntegrationEndTime(value: Double): Self = StObject.set(x, "integrationEndTime", value.asInstanceOf[js.Any])
    
    inline def setIntegrationParallelismFactor(value: Double): Self = StObject.set(x, "integrationParallelismFactor", value.asInstanceOf[js.Any])
    
    inline def setIntegrationStartTime(value: Double): Self = StObject.set(x, "integrationStartTime", value.asInstanceOf[js.Any])
    
    inline def setMarkBuildingEnd(value: Callback): Self = StObject.set(x, "markBuildingEnd", value.toJsFn)
    
    inline def setMarkBuildingStart(value: Callback): Self = StObject.set(x, "markBuildingStart", value.toJsFn)
    
    inline def setMarkFactoryEnd(value: Callback): Self = StObject.set(x, "markFactoryEnd", value.toJsFn)
    
    inline def setMarkFactoryStart(value: Callback): Self = StObject.set(x, "markFactoryStart", value.toJsFn)
    
    inline def setMarkIntegrationEnd(value: Callback): Self = StObject.set(x, "markIntegrationEnd", value.toJsFn)
    
    inline def setMarkIntegrationStart(value: Callback): Self = StObject.set(x, "markIntegrationStart", value.toJsFn)
    
    inline def setMarkRestoringEnd(value: Callback): Self = StObject.set(x, "markRestoringEnd", value.toJsFn)
    
    inline def setMarkRestoringStart(value: Callback): Self = StObject.set(x, "markRestoringStart", value.toJsFn)
    
    inline def setMarkStoringEnd(value: Callback): Self = StObject.set(x, "markStoringEnd", value.toJsFn)
    
    inline def setMarkStoringStart(value: Callback): Self = StObject.set(x, "markStoringStart", value.toJsFn)
    
    inline def setMergeInto(value: ModuleProfile => Callback): Self = StObject.set(x, "mergeInto", js.Any.fromFunction1((t0: ModuleProfile) => value(t0).runNow()))
    
    inline def setRestoring(value: Double): Self = StObject.set(x, "restoring", value.asInstanceOf[js.Any])
    
    inline def setRestoringEndTime(value: Double): Self = StObject.set(x, "restoringEndTime", value.asInstanceOf[js.Any])
    
    inline def setRestoringParallelismFactor(value: Double): Self = StObject.set(x, "restoringParallelismFactor", value.asInstanceOf[js.Any])
    
    inline def setRestoringStartTime(value: Double): Self = StObject.set(x, "restoringStartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStoring(value: Double): Self = StObject.set(x, "storing", value.asInstanceOf[js.Any])
    
    inline def setStoringEndTime(value: Double): Self = StObject.set(x, "storingEndTime", value.asInstanceOf[js.Any])
    
    inline def setStoringParallelismFactor(value: Double): Self = StObject.set(x, "storingParallelismFactor", value.asInstanceOf[js.Any])
    
    inline def setStoringStartTime(value: Double): Self = StObject.set(x, "storingStartTime", value.asInstanceOf[js.Any])
  }
}
