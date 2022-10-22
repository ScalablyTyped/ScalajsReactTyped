package typingsJapgolly.reactSelect

import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.PropsValue
import typingsJapgolly.reactSelect.reactSelectStrings.defaultInputValue
import typingsJapgolly.reactSelect.reactSelectStrings.defaultMenuIsOpen
import typingsJapgolly.reactSelect.reactSelectStrings.defaultValue
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUseStateManagerMod {
  
  @JSImport("react-select/dist/declarations/src/useStateManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](
    hasDefaultInputValueDefaultMenuIsOpenDefaultValuePropsInputValuePropsMenuIsOpenPropsOnChangePropsOnInputChangePropsOnMenuClosePropsOnMenuOpenPropsValueRestSelectProps: (StateManagerProps[Option, IsMulti, Group]) & AdditionalProps
  ): (PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasDefaultInputValueDefaultMenuIsOpenDefaultValuePropsInputValuePropsMenuIsOpenPropsOnChangePropsOnInputChangePropsOnMenuClosePropsOnMenuOpenPropsValueRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[(PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ])]
  
  type SelectPropsWithOptionalStateManagedProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (Omit[PublicBaseSelectProps[Option, IsMulti, Group], StateManagedPropKeys]) & (Partial[PublicBaseSelectProps[Option, IsMulti, Group]])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactSelect.reactSelectStrings.inputValue
    - typingsJapgolly.reactSelect.reactSelectStrings.menuIsOpen
    - typingsJapgolly.reactSelect.reactSelectStrings.onChange
    - typingsJapgolly.reactSelect.reactSelectStrings.onInputChange
    - typingsJapgolly.reactSelect.reactSelectStrings.onMenuClose
    - typingsJapgolly.reactSelect.reactSelectStrings.onMenuOpen
    - typingsJapgolly.reactSelect.reactSelectStrings.value
  */
  trait StateManagedPropKeys extends StObject
  object StateManagedPropKeys {
    
    inline def inputValue: typingsJapgolly.reactSelect.reactSelectStrings.inputValue = "inputValue".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.inputValue]
    
    inline def menuIsOpen: typingsJapgolly.reactSelect.reactSelectStrings.menuIsOpen = "menuIsOpen".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.menuIsOpen]
    
    inline def onChange: typingsJapgolly.reactSelect.reactSelectStrings.onChange = "onChange".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.onChange]
    
    inline def onInputChange: typingsJapgolly.reactSelect.reactSelectStrings.onInputChange = "onInputChange".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.onInputChange]
    
    inline def onMenuClose: typingsJapgolly.reactSelect.reactSelectStrings.onMenuClose = "onMenuClose".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.onMenuClose]
    
    inline def onMenuOpen: typingsJapgolly.reactSelect.reactSelectStrings.onMenuOpen = "onMenuOpen".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.onMenuOpen]
    
    inline def value: typingsJapgolly.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typingsJapgolly.reactSelect.reactSelectStrings.value]
  }
  
  trait StateManagerAdditionalProps[Option] extends StObject {
    
    var defaultInputValue: js.UndefOr[String] = js.undefined
    
    var defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[PropsValue[Option]] = js.undefined
  }
  object StateManagerAdditionalProps {
    
    inline def apply[Option](): StateManagerAdditionalProps[Option] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateManagerAdditionalProps[Option]]
    }
    
    extension [Self <: StateManagerAdditionalProps[?], Option](x: Self & StateManagerAdditionalProps[Option]) {
      
      inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
      
      inline def setDefaultMenuIsOpen(value: Boolean): Self = StObject.set(x, "defaultMenuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultMenuIsOpenUndefined: Self = StObject.set(x, "defaultMenuIsOpen", js.undefined)
      
      inline def setDefaultValue(value: PropsValue[Option]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: Option*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    }
  }
  
  type StateManagerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (SelectPropsWithOptionalStateManagedProps[Option, IsMulti, Group]) & StateManagerAdditionalProps[Option]
}
