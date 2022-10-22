package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleItemProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListSelectedPeopleListItemsEditingItemDottypesMod {
  
  trait IEditingSelectedPeopleItemProps
    extends StObject
       with ISelectedPeopleItemProps {
    
    var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.undefined
    
    var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.undefined
    
    def onEditingComplete(oldItem: Any, newItem: Any): Unit
    
    var onRenderFloatingPicker: js.UndefOr[ComponentType[IBaseFloatingPickerProps[IPersonaProps]]] = js.undefined
  }
  object IEditingSelectedPeopleItemProps {
    
    inline def apply(onEditingComplete: (Any, Any) => Callback): IEditingSelectedPeopleItemProps = {
      val __obj = js.Dynamic.literal(onEditingComplete = js.Any.fromFunction2((t0: Any, t1: Any) => (onEditingComplete(t0, t1)).runNow()))
      __obj.asInstanceOf[IEditingSelectedPeopleItemProps]
    }
    
    extension [Self <: IEditingSelectedPeopleItemProps](x: Self) {
      
      inline def setFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = StObject.set(x, "floatingPickerProps", value.asInstanceOf[js.Any])
      
      inline def setFloatingPickerPropsUndefined: Self = StObject.set(x, "floatingPickerProps", js.undefined)
      
      inline def setGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = StObject.set(x, "getEditingItemText", js.Any.fromFunction1(value))
      
      inline def setGetEditingItemTextUndefined: Self = StObject.set(x, "getEditingItemText", js.undefined)
      
      inline def setOnEditingComplete(value: (Any, Any) => Callback): Self = StObject.set(x, "onEditingComplete", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[IPersonaProps]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      inline def setOnRenderFloatingPickerUndefined: Self = StObject.set(x, "onRenderFloatingPicker", js.undefined)
    }
  }
  
  trait IEditingSelectedPeopleItemStyles extends StObject {
    
    var input: IStyle
    
    var root: IStyle
  }
  object IEditingSelectedPeopleItemStyles {
    
    inline def apply(): IEditingSelectedPeopleItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditingSelectedPeopleItemStyles]
    }
    
    extension [Self <: IEditingSelectedPeopleItemStyles](x: Self) {
      
      inline def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait IEditingSelectedPeopleItemStylesProps extends StObject
}
