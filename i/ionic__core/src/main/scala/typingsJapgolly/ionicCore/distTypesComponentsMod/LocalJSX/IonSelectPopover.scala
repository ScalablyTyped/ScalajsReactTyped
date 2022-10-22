package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import typingsJapgolly.ionicCore.distTypesComponentsSelectPopoverSelectPopoverInterfaceMod.SelectPopoverOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSelectPopover extends StObject {
  
  /**
    * The header text of the popover
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * The text content of the popover body
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the select accepts multiple values
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of options for the popover
    */
  var options: js.UndefOr[js.Array[SelectPopoverOption]] = js.undefined
  
  /**
    * The subheader text of the popover
    */
  var subHeader: js.UndefOr[String] = js.undefined
}
object IonSelectPopover {
  
  inline def apply(): IonSelectPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSelectPopover]
  }
  
  extension [Self <: IonSelectPopover](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOptions(value: js.Array[SelectPopoverOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SelectPopoverOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSubHeader(value: String): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
    
    inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
  }
}
