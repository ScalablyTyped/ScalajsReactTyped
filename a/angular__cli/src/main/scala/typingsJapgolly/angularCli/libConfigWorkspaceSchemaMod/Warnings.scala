package typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warnings extends StObject {
  
  /**
    * Show a warning when the global version is newer than the local one.
    */
  var versionMismatch: js.UndefOr[Boolean] = js.undefined
}
object Warnings {
  
  inline def apply(): Warnings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warnings]
  }
  
  extension [Self <: Warnings](x: Self) {
    
    inline def setVersionMismatch(value: Boolean): Self = StObject.set(x, "versionMismatch", value.asInstanceOf[js.Any])
    
    inline def setVersionMismatchUndefined: Self = StObject.set(x, "versionMismatch", js.undefined)
  }
}
