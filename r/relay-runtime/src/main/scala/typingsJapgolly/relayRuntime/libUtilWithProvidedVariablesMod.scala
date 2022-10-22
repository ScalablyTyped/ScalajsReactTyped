package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ProvidedVariablesType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilWithProvidedVariablesMod {
  
  @JSImport("relay-runtime/lib/util/withProvidedVariables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(userSuppliedVariables: Variables): Variables = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userSuppliedVariables.asInstanceOf[js.Any]).asInstanceOf[Variables]
  inline def default(userSuppliedVariables: Variables, providedVariables: ProvidedVariablesType): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(userSuppliedVariables.asInstanceOf[js.Any], providedVariables.asInstanceOf[js.Any])).asInstanceOf[Variables]
}
