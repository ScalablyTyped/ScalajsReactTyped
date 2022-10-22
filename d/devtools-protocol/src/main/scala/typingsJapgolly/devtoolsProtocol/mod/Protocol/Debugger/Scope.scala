package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`catch`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`with`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.block
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.closure
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.eval
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.global
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.local_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.module
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.script_
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /**
    * Location in the source code where scope ends
    */
  var endLocation: js.UndefOr[Location] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Object representing the scope. For `global` and `with` scopes it represents the actual
    * object; for the rest of the scopes, it is artificial transient object enumerating scope
    * variables as its properties.
    */
  var `object`: RemoteObject
  
  /**
    * Location in the source code where scope starts
    */
  var startLocation: js.UndefOr[Location] = js.undefined
  
  /**
    * Scope type. (ScopeType enum)
    */
  var `type`: global | local_ | `with` | closure | `catch` | block | script_ | eval | module | `wasm-expression-stack`
}
object Scope {
  
  inline def apply(
    `object`: RemoteObject,
    `type`: global | local_ | `with` | closure | `catch` | block | script_ | eval | module | `wasm-expression-stack`
  ): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  extension [Self <: Scope](x: Self) {
    
    inline def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    inline def setEndLocationUndefined: Self = StObject.set(x, "endLocation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    inline def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    inline def setType(
      value: global | local_ | `with` | closure | `catch` | block | script_ | eval | module | `wasm-expression-stack`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
