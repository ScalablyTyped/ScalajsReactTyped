package typingsJapgolly.materialSelect

import typingsJapgolly.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import typingsJapgolly.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCSelectEvent
    extends StObject
       with Event {
    
    val detail: MDCSelectEventDetail = js.native
  }
  
  trait MDCSelectEventDetail extends StObject {
    
    var index: Double
    
    var value: String
  }
  object MDCSelectEventDetail {
    
    inline def apply(index: Double, value: String): MDCSelectEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSelectEventDetail]
    }
    
    extension [Self <: MDCSelectEventDetail](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCSelectFoundationMap extends StObject {
    
    var helperText: MDCSelectHelperTextFoundation
    
    var leadingIcon: MDCSelectIconFoundation
  }
  object MDCSelectFoundationMap {
    
    inline def apply(helperText: MDCSelectHelperTextFoundation, leadingIcon: MDCSelectIconFoundation): MDCSelectFoundationMap = {
      val __obj = js.Dynamic.literal(helperText = helperText.asInstanceOf[js.Any], leadingIcon = leadingIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSelectFoundationMap]
    }
    
    extension [Self <: MDCSelectFoundationMap](x: Self) {
      
      inline def setHelperText(value: MDCSelectHelperTextFoundation): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setLeadingIcon(value: MDCSelectIconFoundation): Self = StObject.set(x, "leadingIcon", value.asInstanceOf[js.Any])
    }
  }
}
