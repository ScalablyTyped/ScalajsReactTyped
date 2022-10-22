package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  */
/* Inlined std.Partial<{  permanent :boolean}> */
trait AppLaunchArgsOperationOptions extends StObject {
  
  var permanent: js.UndefOr[Boolean] = js.undefined
}
object AppLaunchArgsOperationOptions {
  
  inline def apply(): AppLaunchArgsOperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppLaunchArgsOperationOptions]
  }
  
  extension [Self <: AppLaunchArgsOperationOptions](x: Self) {
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
  }
}
