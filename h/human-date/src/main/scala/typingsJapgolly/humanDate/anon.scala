package typingsJapgolly.humanDate

import typingsJapgolly.humanDate.humanDateBooleans.`false`
import typingsJapgolly.humanDate.humanDateBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined human-date.human-date.RelativeTimeOptions & {  returnObject :false | undefined} */
  trait RelativeTimeOptionsreturn extends StObject {
    
    var allUnits: js.UndefOr[Boolean] = js.undefined
    
    var futureSuffix: js.UndefOr[String] = js.undefined
    
    var pastSuffix: js.UndefOr[String] = js.undefined
    
    var presentText: js.UndefOr[String] = js.undefined
    
    var returnObject: js.UndefOr[Boolean] & js.UndefOr[`false`]
  }
  object RelativeTimeOptionsreturn {
    
    inline def apply(returnObject: js.UndefOr[Boolean] & js.UndefOr[`false`]): RelativeTimeOptionsreturn = {
      val __obj = js.Dynamic.literal(returnObject = returnObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeOptionsreturn]
    }
    
    extension [Self <: RelativeTimeOptionsreturn](x: Self) {
      
      inline def setAllUnits(value: Boolean): Self = StObject.set(x, "allUnits", value.asInstanceOf[js.Any])
      
      inline def setAllUnitsUndefined: Self = StObject.set(x, "allUnits", js.undefined)
      
      inline def setFutureSuffix(value: String): Self = StObject.set(x, "futureSuffix", value.asInstanceOf[js.Any])
      
      inline def setFutureSuffixUndefined: Self = StObject.set(x, "futureSuffix", js.undefined)
      
      inline def setPastSuffix(value: String): Self = StObject.set(x, "pastSuffix", value.asInstanceOf[js.Any])
      
      inline def setPastSuffixUndefined: Self = StObject.set(x, "pastSuffix", js.undefined)
      
      inline def setPresentText(value: String): Self = StObject.set(x, "presentText", value.asInstanceOf[js.Any])
      
      inline def setPresentTextUndefined: Self = StObject.set(x, "presentText", js.undefined)
      
      inline def setReturnObject(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "returnObject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined human-date.human-date.RelativeTimeOptions & {  returnObject :true} */
  trait RelativeTimeOptionsreturnAllUnits extends StObject {
    
    var allUnits: js.UndefOr[Boolean] = js.undefined
    
    var futureSuffix: js.UndefOr[String] = js.undefined
    
    var pastSuffix: js.UndefOr[String] = js.undefined
    
    var presentText: js.UndefOr[String] = js.undefined
    
    var returnObject: js.UndefOr[Boolean] & `true`
  }
  object RelativeTimeOptionsreturnAllUnits {
    
    inline def apply(returnObject: js.UndefOr[Boolean] & `true`): RelativeTimeOptionsreturnAllUnits = {
      val __obj = js.Dynamic.literal(returnObject = returnObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeOptionsreturnAllUnits]
    }
    
    extension [Self <: RelativeTimeOptionsreturnAllUnits](x: Self) {
      
      inline def setAllUnits(value: Boolean): Self = StObject.set(x, "allUnits", value.asInstanceOf[js.Any])
      
      inline def setAllUnitsUndefined: Self = StObject.set(x, "allUnits", js.undefined)
      
      inline def setFutureSuffix(value: String): Self = StObject.set(x, "futureSuffix", value.asInstanceOf[js.Any])
      
      inline def setFutureSuffixUndefined: Self = StObject.set(x, "futureSuffix", js.undefined)
      
      inline def setPastSuffix(value: String): Self = StObject.set(x, "pastSuffix", value.asInstanceOf[js.Any])
      
      inline def setPastSuffixUndefined: Self = StObject.set(x, "pastSuffix", js.undefined)
      
      inline def setPresentText(value: String): Self = StObject.set(x, "presentText", value.asInstanceOf[js.Any])
      
      inline def setPresentTextUndefined: Self = StObject.set(x, "presentText", js.undefined)
      
      inline def setReturnObject(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "returnObject", value.asInstanceOf[js.Any])
    }
  }
}
