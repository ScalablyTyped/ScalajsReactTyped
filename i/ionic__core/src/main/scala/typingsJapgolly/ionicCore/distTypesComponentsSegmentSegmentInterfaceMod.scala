package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSegmentElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSegmentSegmentInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-top`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-start`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-end`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-bottom`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`icon-hide`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`label-hide`
  */
  trait SegmentButtonLayout extends StObject
  object SegmentButtonLayout {
    
    inline def `icon-bottom`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-bottom` = "icon-bottom".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-bottom`]
    
    inline def `icon-end`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-end` = "icon-end".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-end`]
    
    inline def `icon-hide`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-hide` = "icon-hide".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-hide`]
    
    inline def `icon-start`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-start` = "icon-start".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-start`]
    
    inline def `icon-top`: typingsJapgolly.ionicCore.ionicCoreStrings.`icon-top` = "icon-top".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`icon-top`]
    
    inline def `label-hide`: typingsJapgolly.ionicCore.ionicCoreStrings.`label-hide` = "label-hide".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`label-hide`]
  }
  
  trait SegmentChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SegmentChangeEventDetail {
    
    inline def apply(): SegmentChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentChangeEventDetail]
    }
    
    extension [Self <: SegmentChangeEventDetail](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SegmentCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_SegmentCustomEvent: SegmentChangeEventDetail = js.native
    
    @JSName("target")
    var target_SegmentCustomEvent: HTMLIonSegmentElement = js.native
  }
}
