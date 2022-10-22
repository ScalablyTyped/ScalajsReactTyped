package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncManagedPropKeys
import typingsJapgolly.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncProps
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectBooleans.`false`
import typingsJapgolly.reactSelect.reactSelectStrings.cacheOptions
import typingsJapgolly.reactSelect.reactSelectStrings.defaultOptions
import typingsJapgolly.reactSelect.reactSelectStrings.isLoading
import typingsJapgolly.reactSelect.reactSelectStrings.loadOptions
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAsyncMod {
  
  @JSImport("react-select/dist/declarations/src/Async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/Async", JSImport.Default)
  @js.native
  val default: AsyncSelect = js.native
  
  inline def useAsync[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](
    hasPropsDefaultOptionsCacheOptionsPropsLoadOptionsPropsOptionsPropsIsLoadingPropsOnInputChangeFilterOptionRestSelectProps: (AsyncProps[Option, IsMulti, Group]) & AdditionalProps
  ): (StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(hasPropsDefaultOptionsCacheOptionsPropsLoadOptionsPropsOptionsPropsIsLoadingPropsOnInputChangeFilterOptionRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[(StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ])]
  
  type AsyncSelect = js.Function1[
    /* props */ (AsyncProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    Element
  ]
}
