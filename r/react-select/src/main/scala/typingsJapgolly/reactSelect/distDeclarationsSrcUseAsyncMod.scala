package typingsJapgolly.reactSelect

import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectStrings.cacheOptions
import typingsJapgolly.reactSelect.reactSelectStrings.defaultOptions
import typingsJapgolly.reactSelect.reactSelectStrings.isLoading
import typingsJapgolly.reactSelect.reactSelectStrings.loadOptions
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUseAsyncMod {
  
  @JSImport("react-select/dist/declarations/src/useAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](
    hasPropsDefaultOptionsCacheOptionsPropsLoadOptionsPropsOptionsPropsIsLoadingPropsOnInputChangeFilterOptionRestSelectProps: (AsyncProps[Option, IsMulti, Group]) & AdditionalProps
  ): (StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPropsDefaultOptionsCacheOptionsPropsLoadOptionsPropsOptionsPropsIsLoadingPropsOnInputChangeFilterOptionRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[(StateManagerProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultOptions | cacheOptions | loadOptions | isLoading | AsyncManagedPropKeys
  ])]
  
  trait AsyncAdditionalProps[Option, Group /* <: GroupBase[Option] */] extends StObject {
    
    /**
      * If cacheOptions is truthy, then the loaded data will be cached. The cache
      * will remain until `cacheOptions` changes value.
      */
    var cacheOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * The default set of options to show before the user starts searching. When
      * set to `true`, the results for loadOptions('') will be autoloaded.
      */
    var defaultOptions: js.UndefOr[(OptionsOrGroups[Option, Group]) | Boolean] = js.undefined
    
    /**
      * Will cause the select to be displayed in the loading state, even if the
      * Async select is not currently waiting for loadOptions to resolve
      */
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that returns a promise, which is the set of options to be used
      * once the promise resolves.
      */
    var loadOptions: js.UndefOr[
        js.Function2[
          /* inputValue */ String, 
          /* callback */ js.Function1[/* options */ OptionsOrGroups[Option, Group], Unit], 
          (js.Promise[OptionsOrGroups[Option, Group]]) | Unit
        ]
      ] = js.undefined
  }
  object AsyncAdditionalProps {
    
    inline def apply[Option, Group /* <: GroupBase[Option] */](): AsyncAdditionalProps[Option, Group] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncAdditionalProps[Option, Group]]
    }
    
    extension [Self <: AsyncAdditionalProps[?, ?], Option, Group /* <: GroupBase[Option] */](x: Self & (AsyncAdditionalProps[Option, Group])) {
      
      inline def setCacheOptions(value: Any): Self = StObject.set(x, "cacheOptions", value.asInstanceOf[js.Any])
      
      inline def setCacheOptionsUndefined: Self = StObject.set(x, "cacheOptions", js.undefined)
      
      inline def setDefaultOptions(value: (OptionsOrGroups[Option, Group]) | Boolean): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      inline def setDefaultOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "defaultOptions", js.Array(value*))
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setLoadOptions(
        value: (/* inputValue */ String, /* callback */ js.Function1[/* options */ OptionsOrGroups[Option, Group], Unit]) => (js.Promise[OptionsOrGroups[Option, Group]]) | Unit
      ): Self = StObject.set(x, "loadOptions", js.Any.fromFunction2(value))
      
      inline def setLoadOptionsUndefined: Self = StObject.set(x, "loadOptions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactSelect.reactSelectStrings.options
    - typingsJapgolly.reactSelect.reactSelectStrings.isLoading
    - typingsJapgolly.reactSelect.reactSelectStrings.onInputChange
    - typingsJapgolly.reactSelect.reactSelectStrings.filterOption
  */
  trait AsyncManagedPropKeys extends StObject
  object AsyncManagedPropKeys {
    
    inline def filterOption: typingsJapgolly.reactSelect.reactSelectStrings.filterOption = "filterOption".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.filterOption]
    
    inline def isLoading: typingsJapgolly.reactSelect.reactSelectStrings.isLoading = "isLoading".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.isLoading]
    
    inline def onInputChange: typingsJapgolly.reactSelect.reactSelectStrings.onInputChange = "onInputChange".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.onInputChange]
    
    inline def options: typingsJapgolly.reactSelect.reactSelectStrings.options = "options".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.options]
  }
  
  type AsyncProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (StateManagerProps[Option, IsMulti, Group]) & (AsyncAdditionalProps[Option, Group])
}
