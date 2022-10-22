package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsFocusTrapZoneFocusTrapZoneDottypesMod.IFocusTrapZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalloutFocusTrapCalloutDottypesMod {
  
  trait IFocusTrapCalloutProps
    extends StObject
       with ICalloutProps {
    
    /**
      * Optional props to be passed on to FocusTrapZone
      */
    var focusTrapProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
  }
  object IFocusTrapCalloutProps {
    
    inline def apply(): IFocusTrapCalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFocusTrapCalloutProps]
    }
    
    extension [Self <: IFocusTrapCalloutProps](x: Self) {
      
      inline def setFocusTrapProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapProps", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapPropsUndefined: Self = StObject.set(x, "focusTrapProps", js.undefined)
    }
  }
}
