package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoUpgradeError extends StObject {
  
  var autoUpgradeError: scala.Double
  
  var builtIn: scala.Double
  
  var disabled: scala.Double
  
  var error: scala.Double
  
  var multiVersion: scala.Double
  
  var needsReauthorization: scala.Double
  
  var none: scala.Double
  
  var trusted: scala.Double
  
  var unInstalled: scala.Double
  
  var versionCheckError: scala.Double
  
  var warning: scala.Double
}
object AutoUpgradeError {
  
  inline def apply(
    autoUpgradeError: scala.Double,
    builtIn: scala.Double,
    disabled: scala.Double,
    error: scala.Double,
    multiVersion: scala.Double,
    needsReauthorization: scala.Double,
    none: scala.Double,
    trusted: scala.Double,
    unInstalled: scala.Double,
    versionCheckError: scala.Double,
    warning: scala.Double
  ): AutoUpgradeError = {
    val __obj = js.Dynamic.literal(autoUpgradeError = autoUpgradeError.asInstanceOf[js.Any], builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], needsReauthorization = needsReauthorization.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unInstalled = unInstalled.asInstanceOf[js.Any], versionCheckError = versionCheckError.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoUpgradeError]
  }
  
  extension [Self <: AutoUpgradeError](x: Self) {
    
    inline def setAutoUpgradeError(value: scala.Double): Self = StObject.set(x, "autoUpgradeError", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: scala.Double): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: scala.Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMultiVersion(value: scala.Double): Self = StObject.set(x, "multiVersion", value.asInstanceOf[js.Any])
    
    inline def setNeedsReauthorization(value: scala.Double): Self = StObject.set(x, "needsReauthorization", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTrusted(value: scala.Double): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    
    inline def setUnInstalled(value: scala.Double): Self = StObject.set(x, "unInstalled", value.asInstanceOf[js.Any])
    
    inline def setVersionCheckError(value: scala.Double): Self = StObject.set(x, "versionCheckError", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: scala.Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
