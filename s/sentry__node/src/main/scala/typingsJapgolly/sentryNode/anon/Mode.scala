package typingsJapgolly.sentryNode.anon

import typingsJapgolly.sentryNode.typesIntegrationsOnunhandledrejectionMod.UnhandledRejectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  /**
    * Option deciding what to do after capturing unhandledRejection,
    * that mimicks behavior of node's --unhandled-rejection flag.
    */
  var mode: UnhandledRejectionMode
}
object Mode {
  
  inline def apply(mode: UnhandledRejectionMode): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: UnhandledRejectionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
