package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugConfigurationProvider extends StObject {
  
  /**
    * Provides {@link DebugConfiguration debug configuration} to the debug service. If more than one debug configuration provider is
    * registered for the same type, debug configurations are concatenated in arbitrary order.
    *
    * @param folder The workspace folder for which the configurations are used or `undefined` for a folderless setup.
    * @param token A cancellation token.
    * @return An array of {@link DebugConfiguration debug configurations}.
    */
  var provideDebugConfigurations: js.UndefOr[
    js.Function2[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[js.Array[DebugConfiguration]]
    ]
  ] = js.undefined
  
  /**
    * Resolves a {@link DebugConfiguration debug configuration} by filling in missing values or by adding/changing/removing attributes.
    * If more than one debug configuration provider is registered for the same type, the resolveDebugConfiguration calls are chained
    * in arbitrary order and the initial debug configuration is piped through the chain.
    * Returning the value 'undefined' prevents the debug session from starting.
    * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
    *
    * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
    * @param debugConfiguration The {@link DebugConfiguration debug configuration} to resolve.
    * @param token A cancellation token.
    * @return The resolved debug configuration or undefined or null.
    */
  var resolveDebugConfiguration: js.UndefOr[
    js.Function3[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* debugConfiguration */ DebugConfiguration, 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[DebugConfiguration]
    ]
  ] = js.undefined
  
  /**
    * This hook is directly called after 'resolveDebugConfiguration' but with all variables substituted.
    * It can be used to resolve or verify a {@link DebugConfiguration debug configuration} by filling in missing values or by adding/changing/removing attributes.
    * If more than one debug configuration provider is registered for the same type, the 'resolveDebugConfigurationWithSubstitutedVariables' calls are chained
    * in arbitrary order and the initial debug configuration is piped through the chain.
    * Returning the value 'undefined' prevents the debug session from starting.
    * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
    *
    * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
    * @param debugConfiguration The {@link DebugConfiguration debug configuration} to resolve.
    * @param token A cancellation token.
    * @return The resolved debug configuration or undefined or null.
    */
  var resolveDebugConfigurationWithSubstitutedVariables: js.UndefOr[
    js.Function3[
      /* folder */ js.UndefOr[WorkspaceFolder], 
      /* debugConfiguration */ DebugConfiguration, 
      /* token */ js.UndefOr[CancellationToken], 
      ProviderResult[DebugConfiguration]
    ]
  ] = js.undefined
}
object DebugConfigurationProvider {
  
  inline def apply(): DebugConfigurationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugConfigurationProvider]
  }
  
  extension [Self <: DebugConfigurationProvider](x: Self) {
    
    inline def setProvideDebugConfigurations(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* token */ js.UndefOr[CancellationToken]) => ProviderResult[js.Array[DebugConfiguration]]
    ): Self = StObject.set(x, "provideDebugConfigurations", js.Any.fromFunction2(value))
    
    inline def setProvideDebugConfigurationsUndefined: Self = StObject.set(x, "provideDebugConfigurations", js.undefined)
    
    inline def setResolveDebugConfiguration(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration]
    ): Self = StObject.set(x, "resolveDebugConfiguration", js.Any.fromFunction3(value))
    
    inline def setResolveDebugConfigurationUndefined: Self = StObject.set(x, "resolveDebugConfiguration", js.undefined)
    
    inline def setResolveDebugConfigurationWithSubstitutedVariables(
      value: (/* folder */ js.UndefOr[WorkspaceFolder], /* debugConfiguration */ DebugConfiguration, /* token */ js.UndefOr[CancellationToken]) => ProviderResult[DebugConfiguration]
    ): Self = StObject.set(x, "resolveDebugConfigurationWithSubstitutedVariables", js.Any.fromFunction3(value))
    
    inline def setResolveDebugConfigurationWithSubstitutedVariablesUndefined: Self = StObject.set(x, "resolveDebugConfigurationWithSubstitutedVariables", js.undefined)
  }
}
