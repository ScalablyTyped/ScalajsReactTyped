package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedDays extends StObject {
  
  /**
    * Rules for Custom Channel.
    */
  var CUSTOM: js.UndefOr[ListOfClosedDaysRules] = js.undefined
  
  /**
    * Rules for Email Channel.
    */
  var EMAIL: js.UndefOr[ListOfClosedDaysRules] = js.undefined
  
  /**
    * Rules for Push Channel.
    */
  var PUSH: js.UndefOr[ListOfClosedDaysRules] = js.undefined
  
  /**
    * Rules for SMS Channel.
    */
  var SMS: js.UndefOr[ListOfClosedDaysRules] = js.undefined
  
  /**
    * Rules for Voice Channel.
    */
  var VOICE: js.UndefOr[ListOfClosedDaysRules] = js.undefined
}
object ClosedDays {
  
  inline def apply(): ClosedDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedDays]
  }
  
  extension [Self <: ClosedDays](x: Self) {
    
    inline def setCUSTOM(value: ListOfClosedDaysRules): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
    
    inline def setCUSTOMUndefined: Self = StObject.set(x, "CUSTOM", js.undefined)
    
    inline def setCUSTOMVarargs(value: ClosedDaysRule*): Self = StObject.set(x, "CUSTOM", js.Array(value*))
    
    inline def setEMAIL(value: ListOfClosedDaysRules): Self = StObject.set(x, "EMAIL", value.asInstanceOf[js.Any])
    
    inline def setEMAILUndefined: Self = StObject.set(x, "EMAIL", js.undefined)
    
    inline def setEMAILVarargs(value: ClosedDaysRule*): Self = StObject.set(x, "EMAIL", js.Array(value*))
    
    inline def setPUSH(value: ListOfClosedDaysRules): Self = StObject.set(x, "PUSH", value.asInstanceOf[js.Any])
    
    inline def setPUSHUndefined: Self = StObject.set(x, "PUSH", js.undefined)
    
    inline def setPUSHVarargs(value: ClosedDaysRule*): Self = StObject.set(x, "PUSH", js.Array(value*))
    
    inline def setSMS(value: ListOfClosedDaysRules): Self = StObject.set(x, "SMS", value.asInstanceOf[js.Any])
    
    inline def setSMSUndefined: Self = StObject.set(x, "SMS", js.undefined)
    
    inline def setSMSVarargs(value: ClosedDaysRule*): Self = StObject.set(x, "SMS", js.Array(value*))
    
    inline def setVOICE(value: ListOfClosedDaysRules): Self = StObject.set(x, "VOICE", value.asInstanceOf[js.Any])
    
    inline def setVOICEUndefined: Self = StObject.set(x, "VOICE", js.undefined)
    
    inline def setVOICEVarargs(value: ClosedDaysRule*): Self = StObject.set(x, "VOICE", js.Array(value*))
  }
}
