package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.reactWidgets.anon.Source
import typingsJapgolly.reactWidgets.anon.`0`
import typingsJapgolly.reactWidgets.esmMessagesMod.UserProvidedMessages
import typingsJapgolly.reactWidgets.esmPopupMod.PopupProps
import typingsJapgolly.reactWidgets.esmSharedMod.BaseListboxInputProps
import typingsJapgolly.reactWidgets.esmSharedMod.ChangeHandler
import typingsJapgolly.reactWidgets.esmSharedMod.Filterable
import typingsJapgolly.reactWidgets.esmSharedMod.SelectHandler
import typingsJapgolly.reactWidgets.esmSharedMod.WidgetHTMLProps
import typingsJapgolly.reactWidgets.esmTypesMod.WidgetHandle
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComboboxMod extends Shortcut {
  
  /**
    * ---
    * shortcuts:
    *   - { key: alt + down arrow, label: open combobox }
    *   - { key: alt + up arrow, label: close combobox }
    *   - { key: down arrow, label: move focus to next item }
    *   - { key: up arrow, label: move focus to previous item }
    *   - { key: home, label: move focus to first item }
    *   - { key: end, label: move focus to last item }
    *   - { key: enter, label: select focused item }
    *   - { key: any key, label: search list for item starting with key }
    * ---
    *
    * Select an item from the list, or input a custom value. The Combobox can also make suggestions as you type.
    * @public
    */
  @JSImport("react-widgets/esm/Combobox", JSImport.Default)
  @js.native
  val default: Combobox = js.native
  
  @js.native
  trait Combobox extends StObject {
    
    def apply[TDataItem](props: ComboboxProps[TDataItem] & RefAttributes[ComboboxHandle]): Element | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[Any] = js.native
  }
  
  type ComboboxHandle = WidgetHandle
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reactWidgets.esmSharedMod.PopupWidgetProps because var conflicts: className, onKeyDown, onKeyPress. Inlined open, defaultOpen, onToggle, containerClassName, dropUp, popupProps, popupTransition, popupComponent
  - typingsJapgolly.reactWidgets.esmSharedMod.WidgetProps because var conflicts: className, id, tabIndex. Inlined autoFocus, messages */ trait ComboboxProps[TDataItem]
    extends StObject
       with WidgetHTMLProps[HTMLDivElement]
       with Filterable[TDataItem]
       with BaseListboxInputProps[TDataItem, String | TDataItem] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a `data` item matches the current typed value select it automatically.
      */
    var autoSelectMatches: js.UndefOr[Boolean] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var dropUp: js.UndefOr[Boolean] = js.undefined
    
    var hideCaret: js.UndefOr[Boolean] = js.undefined
    
    var hideEmptyPopup: js.UndefOr[Boolean] = js.undefined
    
    var messages: js.UndefOr[UserProvidedMessages] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("onChange")
    var onChange_ComboboxProps: js.UndefOr[ChangeHandler[TDataItem | String]] = js.undefined
    
    @JSName("onSelect")
    var onSelect_ComboboxProps: js.UndefOr[SelectHandler[TDataItem | String]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var popupComponent: js.UndefOr[ComponentType[PopupProps]] = js.undefined
    
    var popupProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    var popupTransition: js.UndefOr[ComponentType[TransitionProps[Unit]]] = js.undefined
  }
  object ComboboxProps {
    
    inline def apply[TDataItem](): ComboboxProps[TDataItem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxProps[TDataItem]]
    }
    
    extension [Self <: ComboboxProps[?], TDataItem](x: Self & ComboboxProps[TDataItem]) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSelectMatches(value: Boolean): Self = StObject.set(x, "autoSelectMatches", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectMatchesUndefined: Self = StObject.set(x, "autoSelectMatches", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
      
      inline def setHideCaret(value: Boolean): Self = StObject.set(x, "hideCaret", value.asInstanceOf[js.Any])
      
      inline def setHideCaretUndefined: Self = StObject.set(x, "hideCaret", js.undefined)
      
      inline def setHideEmptyPopup(value: Boolean): Self = StObject.set(x, "hideEmptyPopup", value.asInstanceOf[js.Any])
      
      inline def setHideEmptyPopupUndefined: Self = StObject.set(x, "hideEmptyPopup", js.undefined)
      
      inline def setMessages(value: UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (TDataItem | String, /* metadata */ Source) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: TDataItem | String, t1: /* metadata */ Source) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSelect(value: (TDataItem | String, /* metadata */ `0`) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: TDataItem | String, t1: /* metadata */ `0`) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnToggle(value: /* isOpen */ Boolean => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPopupComponent(value: ComponentType[PopupProps]): Self = StObject.set(x, "popupComponent", value.asInstanceOf[js.Any])
      
      inline def setPopupComponentUndefined: Self = StObject.set(x, "popupComponent", js.undefined)
      
      inline def setPopupProps(value: Record[String, Any]): Self = StObject.set(x, "popupProps", value.asInstanceOf[js.Any])
      
      inline def setPopupPropsUndefined: Self = StObject.set(x, "popupProps", js.undefined)
      
      inline def setPopupTransition(value: ComponentType[TransitionProps[Unit]]): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionUndefined: Self = StObject.set(x, "popupTransition", js.undefined)
    }
  }
  
  type _To = Combobox
  
  /* This means you don't have to write `default`, but can instead just say `esmComboboxMod.foo` */
  override def _to: Combobox = default
}
