package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.ExposeGlobals
import typingsJapgolly.detox.anon.ShutdownDevice
import typingsJapgolly.detox.detoxStrings.auto
import typingsJapgolly.detox.detoxStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxBehaviorConfig extends StObject {
  
  var cleanup: js.UndefOr[ShutdownDevice] = js.undefined
  
  var init: js.UndefOr[ExposeGlobals] = js.undefined
  
  var launchApp: js.UndefOr[auto | manual] = js.undefined
}
object DetoxBehaviorConfig {
  
  inline def apply(): DetoxBehaviorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxBehaviorConfig]
  }
  
  extension [Self <: DetoxBehaviorConfig](x: Self) {
    
    inline def setCleanup(value: ShutdownDevice): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    
    inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
    
    inline def setInit(value: ExposeGlobals): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLaunchApp(value: auto | manual): Self = StObject.set(x, "launchApp", value.asInstanceOf[js.Any])
    
    inline def setLaunchAppUndefined: Self = StObject.set(x, "launchApp", js.undefined)
  }
}
