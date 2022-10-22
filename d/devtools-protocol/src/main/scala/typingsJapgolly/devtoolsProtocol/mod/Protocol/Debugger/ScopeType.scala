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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.global
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.local_
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`with`
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.closure
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`catch`
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.block
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.script_
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.eval
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.module
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
*/
trait ScopeType extends StObject
object ScopeType {
  
  inline def Block: block = "block".asInstanceOf[block]
  
  inline def Catch: `catch` = "catch".asInstanceOf[`catch`]
  
  inline def Closure: closure = "closure".asInstanceOf[closure]
  
  inline def Eval: eval = "eval".asInstanceOf[eval]
  
  inline def Global: global = "global".asInstanceOf[global]
  
  inline def Local: local_ = "local".asInstanceOf[local_]
  
  inline def Module: module = "module".asInstanceOf[module]
  
  inline def Script: script_ = "script".asInstanceOf[script_]
  
  inline def WasmExpressionStack: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  inline def With: `with` = "with".asInstanceOf[`with`]
}
