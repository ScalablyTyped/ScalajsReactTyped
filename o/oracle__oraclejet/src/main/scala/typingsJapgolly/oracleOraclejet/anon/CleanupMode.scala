package typingsJapgolly.oracleOraclejet.anon

import org.scalajs.dom.Node
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.onDisconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanupMode extends StObject {
  
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.undefined
  
  var view: js.Array[Node]
  
  var viewModel: js.Object | Null
}
object CleanupMode {
  
  inline def apply(view: js.Array[Node]): CleanupMode = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = null)
    __obj.asInstanceOf[CleanupMode]
  }
  
  extension [Self <: CleanupMode](x: Self) {
    
    inline def setCleanupMode(value: onDisconnect | none): Self = StObject.set(x, "cleanupMode", value.asInstanceOf[js.Any])
    
    inline def setCleanupModeUndefined: Self = StObject.set(x, "cleanupMode", js.undefined)
    
    inline def setView(value: js.Array[Node]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: js.Object): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelNull: Self = StObject.set(x, "viewModel", null)
    
    inline def setViewVarargs(value: Node*): Self = StObject.set(x, "view", js.Array(value*))
  }
}
