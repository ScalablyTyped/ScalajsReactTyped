package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceEventWindowResult extends StObject {
  
  /**
    * Information about the event window.
    */
  var InstanceEventWindow: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.InstanceEventWindow] = js.undefined
}
object ModifyInstanceEventWindowResult {
  
  inline def apply(): ModifyInstanceEventWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceEventWindowResult]
  }
  
  extension [Self <: ModifyInstanceEventWindowResult](x: Self) {
    
    inline def setInstanceEventWindow(value: InstanceEventWindow): Self = StObject.set(x, "InstanceEventWindow", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowUndefined: Self = StObject.set(x, "InstanceEventWindow", js.undefined)
  }
}
