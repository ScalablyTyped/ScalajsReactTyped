package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.DataHookString
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNestableListBaseNestableListBaseDotdriverMod {
  
  trait NestableItemDetails extends StObject {
    
    var dataHook: String
    
    var depthLevel: Double
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object NestableItemDetails {
    
    inline def apply(dataHook: String, depthLevel: Double): NestableItemDetails = {
      val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], depthLevel = depthLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestableItemDetails]
    }
    
    extension [Self <: NestableItemDetails](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDepthLevel(value: Double): Self = StObject.set(x, "depthLevel", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  trait NestableListBaseDriver
    extends StObject
       with BaseDriver {
    
    def changeItemDepth(itemDetails: NestableItemDetails): Unit
    
    def getItemDepth(itemDetails: DataHookString): Double
    
    def getItemPosition(itemDetails: DataHookString): Double
    
    def reorder(dataHooks: ReorderDataHooks): Unit
  }
  object NestableListBaseDriver {
    
    inline def apply(
      changeItemDepth: NestableItemDetails => Callback,
      exists: CallbackTo[Boolean],
      getItemDepth: DataHookString => Double,
      getItemPosition: DataHookString => Double,
      reorder: ReorderDataHooks => Callback
    ): NestableListBaseDriver = {
      val __obj = js.Dynamic.literal(changeItemDepth = js.Any.fromFunction1((t0: NestableItemDetails) => changeItemDepth(t0).runNow()), exists = exists.toJsFn, getItemDepth = js.Any.fromFunction1(getItemDepth), getItemPosition = js.Any.fromFunction1(getItemPosition), reorder = js.Any.fromFunction1((t0: ReorderDataHooks) => reorder(t0).runNow()))
      __obj.asInstanceOf[NestableListBaseDriver]
    }
    
    extension [Self <: NestableListBaseDriver](x: Self) {
      
      inline def setChangeItemDepth(value: NestableItemDetails => Callback): Self = StObject.set(x, "changeItemDepth", js.Any.fromFunction1((t0: NestableItemDetails) => value(t0).runNow()))
      
      inline def setGetItemDepth(value: DataHookString => Double): Self = StObject.set(x, "getItemDepth", js.Any.fromFunction1(value))
      
      inline def setGetItemPosition(value: DataHookString => Double): Self = StObject.set(x, "getItemPosition", js.Any.fromFunction1(value))
      
      inline def setReorder(value: ReorderDataHooks => Callback): Self = StObject.set(x, "reorder", js.Any.fromFunction1((t0: ReorderDataHooks) => value(t0).runNow()))
    }
  }
  
  trait ReorderDataHooks extends StObject {
    
    var dataHookFrom: String
    
    var dataHookTo: String
  }
  object ReorderDataHooks {
    
    inline def apply(dataHookFrom: String, dataHookTo: String): ReorderDataHooks = {
      val __obj = js.Dynamic.literal(dataHookFrom = dataHookFrom.asInstanceOf[js.Any], dataHookTo = dataHookTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReorderDataHooks]
    }
    
    extension [Self <: ReorderDataHooks](x: Self) {
      
      inline def setDataHookFrom(value: String): Self = StObject.set(x, "dataHookFrom", value.asInstanceOf[js.Any])
      
      inline def setDataHookTo(value: String): Self = StObject.set(x, "dataHookTo", value.asInstanceOf[js.Any])
    }
  }
}
