package typingsJapgolly.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAnalytics.distSrcTypesMod.DynamicConfig
import typingsJapgolly.firebaseAnalytics.distSrcTypesMod.MinimalDynamicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationPromisesMap extends StObject {
  
  var dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  
  var initializationPromisesMap: StringDictionary[js.Promise[String]]
}
object InitializationPromisesMap {
  
  inline def apply(
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    initializationPromisesMap: StringDictionary[js.Promise[String]]
  ): InitializationPromisesMap = {
    val __obj = js.Dynamic.literal(dynamicConfigPromisesList = dynamicConfigPromisesList.asInstanceOf[js.Any], initializationPromisesMap = initializationPromisesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationPromisesMap]
  }
  
  extension [Self <: InitializationPromisesMap](x: Self) {
    
    inline def setDynamicConfigPromisesList(value: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]): Self = StObject.set(x, "dynamicConfigPromisesList", value.asInstanceOf[js.Any])
    
    inline def setDynamicConfigPromisesListVarargs(value: (js.Promise[DynamicConfig | MinimalDynamicConfig])*): Self = StObject.set(x, "dynamicConfigPromisesList", js.Array(value*))
    
    inline def setInitializationPromisesMap(value: StringDictionary[js.Promise[String]]): Self = StObject.set(x, "initializationPromisesMap", value.asInstanceOf[js.Any])
  }
}
