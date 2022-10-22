package typingsJapgolly.wordpressNux

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wordpressNux.storeSelectorsMod.GuideInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofimportedActions extends StObject {
    
    def disableTips(): Unit
    
    def dismissTip(id: String): Unit
    
    def enableTips(): Unit
    
    def triggerGuide(tipIds: js.Array[String]): Unit
  }
  object TypeofimportedActions {
    
    inline def apply(
      disableTips: Callback,
      dismissTip: String => Callback,
      enableTips: Callback,
      triggerGuide: js.Array[String] => Callback
    ): TypeofimportedActions = {
      val __obj = js.Dynamic.literal(disableTips = disableTips.toJsFn, dismissTip = js.Any.fromFunction1((t0: String) => dismissTip(t0).runNow()), enableTips = enableTips.toJsFn, triggerGuide = js.Any.fromFunction1((t0: js.Array[String]) => triggerGuide(t0).runNow()))
      __obj.asInstanceOf[TypeofimportedActions]
    }
    
    extension [Self <: TypeofimportedActions](x: Self) {
      
      inline def setDisableTips(value: Callback): Self = StObject.set(x, "disableTips", value.toJsFn)
      
      inline def setDismissTip(value: String => Callback): Self = StObject.set(x, "dismissTip", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEnableTips(value: Callback): Self = StObject.set(x, "enableTips", value.toJsFn)
      
      inline def setTriggerGuide(value: js.Array[String] => Callback): Self = StObject.set(x, "triggerGuide", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    }
  }
  
  trait TypeofimportedSelectors extends StObject {
    
    def areTipsEnabled(): Boolean
    
    def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo]
    
    def isTipVisible(tipId: String): Boolean
  }
  object TypeofimportedSelectors {
    
    inline def apply(
      areTipsEnabled: CallbackTo[Boolean],
      getAssociatedGuide: String => js.UndefOr[GuideInfo],
      isTipVisible: String => Boolean
    ): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(areTipsEnabled = areTipsEnabled.toJsFn, getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    extension [Self <: TypeofimportedSelectors](x: Self) {
      
      inline def setAreTipsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "areTipsEnabled", value.toJsFn)
      
      inline def setGetAssociatedGuide(value: String => js.UndefOr[GuideInfo]): Self = StObject.set(x, "getAssociatedGuide", js.Any.fromFunction1(value))
      
      inline def setIsTipVisible(value: String => Boolean): Self = StObject.set(x, "isTipVisible", js.Any.fromFunction1(value))
    }
  }
}
