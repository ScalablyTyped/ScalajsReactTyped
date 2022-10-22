package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Lower
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRangeElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRangeRangeInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.A
    - typingsJapgolly.ionicCore.ionicCoreStrings.B
    - scala.Unit
  */
  type KnobName = js.UndefOr[_KnobName]
  
  type PinFormatter = js.Function1[/* value */ Double, Double | String]
  
  trait RangeChangeEventDetail extends StObject {
    
    var value: RangeValue
  }
  object RangeChangeEventDetail {
    
    inline def apply(value: RangeValue): RangeChangeEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeChangeEventDetail]
    }
    
    extension [Self <: RangeChangeEventDetail](x: Self) {
      
      inline def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RangeCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_RangeCustomEvent: RangeChangeEventDetail | RangeKnobMoveStartEventDetail | RangeKnobMoveEndEventDetail = js.native
    
    @JSName("target")
    var target_RangeCustomEvent: HTMLIonRangeElement = js.native
  }
  
  trait RangeKnobMoveEndEventDetail extends StObject {
    
    var value: RangeValue
  }
  object RangeKnobMoveEndEventDetail {
    
    inline def apply(value: RangeValue): RangeKnobMoveEndEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeKnobMoveEndEventDetail]
    }
    
    extension [Self <: RangeKnobMoveEndEventDetail](x: Self) {
      
      inline def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeKnobMoveStartEventDetail extends StObject {
    
    var value: RangeValue
  }
  object RangeKnobMoveStartEventDetail {
    
    inline def apply(value: RangeValue): RangeKnobMoveStartEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeKnobMoveStartEventDetail]
    }
    
    extension [Self <: RangeKnobMoveStartEventDetail](x: Self) {
      
      inline def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeValue = Double | Lower
  
  trait _KnobName extends StObject
}
