package typingsJapgolly.reactMdIcon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdIcon.reactMdIconStrings.back
import typingsJapgolly.reactMdIcon.reactMdIconStrings.checkbox
import typingsJapgolly.reactMdIcon.reactMdIconStrings.dropdown
import typingsJapgolly.reactMdIcon.reactMdIconStrings.error
import typingsJapgolly.reactMdIcon.reactMdIconStrings.expander
import typingsJapgolly.reactMdIcon.reactMdIconStrings.forward
import typingsJapgolly.reactMdIcon.reactMdIconStrings.menu
import typingsJapgolly.reactMdIcon.reactMdIconStrings.notification
import typingsJapgolly.reactMdIcon.reactMdIconStrings.password
import typingsJapgolly.reactMdIcon.reactMdIconStrings.radio
import typingsJapgolly.reactMdIcon.reactMdIconStrings.selected
import typingsJapgolly.reactMdIcon.reactMdIconStrings.sort
import typingsJapgolly.reactMdIcon.reactMdIconStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIconProviderMod {
  
  @JSImport("@react-md/icon/types/IconProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def IconProvider(
    hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload: IconProviderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconProvider")(hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload
  ): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload,
    `override`: Node
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  trait ConfigurableIcons extends StObject {
    
    /**
      * The general icon for navigating backwards or closing an item to the left.
      */
    var back: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for checkboxes.
      */
    var checkbox: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for dropdown menus or content that expands
      * vertically in a new material instead of inline like the `expander` icon.
      */
    var dropdown: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use when there are form errors.
      *
      * @remarks \@since 2.5.0
      */
    var error: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for expanding content vertically.
      */
    var expander: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon for navigating forwards or closing an item to the right.
      * This is also used internally for nested dropdown menus.
      */
    var forward: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for displaying a main navigation menu.
      */
    var menu: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon for displaying notifications. This is used internally in
      * the `BadgedButton` in the `@react-md/badge` package.
      */
    var notification: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon for temporarily displaying a password's field value as
      * plain text.
      */
    var password: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for radio buttons.
      */
    var radio: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for showing that something has been selected that
      * is not a radio or checkbox. This is used internally for the `Chip` in the
      * `@react-md/chip` package.
      */
    var selected: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon for sorting content. This defaults to the sort ascending
      * behavior.
      */
    var sort: js.UndefOr[Node] = js.undefined
    
    /**
      * The general icon to use for the `FileInput` component (normally file
      * uploads).
      *
      * @remarks \@since 5.0.0
      */
    var upload: js.UndefOr[Node] = js.undefined
  }
  object ConfigurableIcons {
    
    inline def apply(): ConfigurableIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurableIcons]
    }
    
    extension [Self <: ConfigurableIcons](x: Self) {
      
      inline def setBack(value: VdomNode): Self = StObject.set(x, "back", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBackNull: Self = StObject.set(x, "back", null)
      
      inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
      
      inline def setBackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "back", js.Array(value*))
      
      inline def setBackVdomElement(value: VdomElement): Self = StObject.set(x, "back", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: VdomNode): Self = StObject.set(x, "checkbox", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckboxNull: Self = StObject.set(x, "checkbox", null)
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setCheckboxVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkbox", js.Array(value*))
      
      inline def setCheckboxVdomElement(value: VdomElement): Self = StObject.set(x, "checkbox", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDropdown(value: VdomNode): Self = StObject.set(x, "dropdown", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDropdownNull: Self = StObject.set(x, "dropdown", null)
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setDropdownVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "dropdown", js.Array(value*))
      
      inline def setDropdownVdomElement(value: VdomElement): Self = StObject.set(x, "dropdown", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: VdomNode): Self = StObject.set(x, "error", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpander(value: VdomNode): Self = StObject.set(x, "expander", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpanderNull: Self = StObject.set(x, "expander", null)
      
      inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
      
      inline def setExpanderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expander", js.Array(value*))
      
      inline def setExpanderVdomElement(value: VdomElement): Self = StObject.set(x, "expander", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForward(value: VdomNode): Self = StObject.set(x, "forward", value.rawNode.asInstanceOf[js.Any])
      
      inline def setForwardNull: Self = StObject.set(x, "forward", null)
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setForwardVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "forward", js.Array(value*))
      
      inline def setForwardVdomElement(value: VdomElement): Self = StObject.set(x, "forward", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMenu(value: VdomNode): Self = StObject.set(x, "menu", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMenuNull: Self = StObject.set(x, "menu", null)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setMenuVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "menu", js.Array(value*))
      
      inline def setMenuVdomElement(value: VdomElement): Self = StObject.set(x, "menu", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNotification(value: VdomNode): Self = StObject.set(x, "notification", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNotificationNull: Self = StObject.set(x, "notification", null)
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      inline def setNotificationVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "notification", js.Array(value*))
      
      inline def setNotificationVdomElement(value: VdomElement): Self = StObject.set(x, "notification", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPassword(value: VdomNode): Self = StObject.set(x, "password", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPasswordNull: Self = StObject.set(x, "password", null)
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPasswordVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "password", js.Array(value*))
      
      inline def setPasswordVdomElement(value: VdomElement): Self = StObject.set(x, "password", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRadio(value: VdomNode): Self = StObject.set(x, "radio", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRadioNull: Self = StObject.set(x, "radio", null)
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setRadioVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "radio", js.Array(value*))
      
      inline def setRadioVdomElement(value: VdomElement): Self = StObject.set(x, "radio", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelected(value: VdomNode): Self = StObject.set(x, "selected", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSelectedNull: Self = StObject.set(x, "selected", null)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setSelectedVdomElement(value: VdomElement): Self = StObject.set(x, "selected", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSort(value: VdomNode): Self = StObject.set(x, "sort", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSortNull: Self = StObject.set(x, "sort", null)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sort", js.Array(value*))
      
      inline def setSortVdomElement(value: VdomElement): Self = StObject.set(x, "sort", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUpload(value: VdomNode): Self = StObject.set(x, "upload", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUploadNull: Self = StObject.set(x, "upload", null)
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      inline def setUploadVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "upload", js.Array(value*))
      
      inline def setUploadVdomElement(value: VdomElement): Self = StObject.set(x, "upload", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@react-md/icon.@react-md/icon/types/IconProvider.ConfigurableIcons> */
  trait ConfiguredIcons extends StObject {
    
    var back: Node
    
    var checkbox: Node
    
    var dropdown: Node
    
    var error: Node
    
    var expander: Node
    
    var forward: Node
    
    var menu: Node
    
    var notification: Node
    
    var password: Node
    
    var radio: Node
    
    var selected: Node
    
    var sort: Node
    
    var upload: Node
  }
  object ConfiguredIcons {
    
    inline def apply(): ConfiguredIcons = {
      val __obj = js.Dynamic.literal(back = null, checkbox = null, dropdown = null, error = null, expander = null, forward = null, menu = null, notification = null, password = null, radio = null, selected = null, sort = null, upload = null)
      __obj.asInstanceOf[ConfiguredIcons]
    }
    
    extension [Self <: ConfiguredIcons](x: Self) {
      
      inline def setBack(value: VdomNode): Self = StObject.set(x, "back", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBackNull: Self = StObject.set(x, "back", null)
      
      inline def setBackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "back", js.Array(value*))
      
      inline def setBackVdomElement(value: VdomElement): Self = StObject.set(x, "back", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: VdomNode): Self = StObject.set(x, "checkbox", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckboxNull: Self = StObject.set(x, "checkbox", null)
      
      inline def setCheckboxVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkbox", js.Array(value*))
      
      inline def setCheckboxVdomElement(value: VdomElement): Self = StObject.set(x, "checkbox", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDropdown(value: VdomNode): Self = StObject.set(x, "dropdown", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDropdownNull: Self = StObject.set(x, "dropdown", null)
      
      inline def setDropdownVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "dropdown", js.Array(value*))
      
      inline def setDropdownVdomElement(value: VdomElement): Self = StObject.set(x, "dropdown", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: VdomNode): Self = StObject.set(x, "error", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpander(value: VdomNode): Self = StObject.set(x, "expander", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpanderNull: Self = StObject.set(x, "expander", null)
      
      inline def setExpanderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expander", js.Array(value*))
      
      inline def setExpanderVdomElement(value: VdomElement): Self = StObject.set(x, "expander", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForward(value: VdomNode): Self = StObject.set(x, "forward", value.rawNode.asInstanceOf[js.Any])
      
      inline def setForwardNull: Self = StObject.set(x, "forward", null)
      
      inline def setForwardVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "forward", js.Array(value*))
      
      inline def setForwardVdomElement(value: VdomElement): Self = StObject.set(x, "forward", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMenu(value: VdomNode): Self = StObject.set(x, "menu", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMenuNull: Self = StObject.set(x, "menu", null)
      
      inline def setMenuVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "menu", js.Array(value*))
      
      inline def setMenuVdomElement(value: VdomElement): Self = StObject.set(x, "menu", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNotification(value: VdomNode): Self = StObject.set(x, "notification", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNotificationNull: Self = StObject.set(x, "notification", null)
      
      inline def setNotificationVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "notification", js.Array(value*))
      
      inline def setNotificationVdomElement(value: VdomElement): Self = StObject.set(x, "notification", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPassword(value: VdomNode): Self = StObject.set(x, "password", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPasswordNull: Self = StObject.set(x, "password", null)
      
      inline def setPasswordVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "password", js.Array(value*))
      
      inline def setPasswordVdomElement(value: VdomElement): Self = StObject.set(x, "password", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRadio(value: VdomNode): Self = StObject.set(x, "radio", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRadioNull: Self = StObject.set(x, "radio", null)
      
      inline def setRadioVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "radio", js.Array(value*))
      
      inline def setRadioVdomElement(value: VdomElement): Self = StObject.set(x, "radio", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelected(value: VdomNode): Self = StObject.set(x, "selected", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSelectedNull: Self = StObject.set(x, "selected", null)
      
      inline def setSelectedVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setSelectedVdomElement(value: VdomElement): Self = StObject.set(x, "selected", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSort(value: VdomNode): Self = StObject.set(x, "sort", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSortNull: Self = StObject.set(x, "sort", null)
      
      inline def setSortVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sort", js.Array(value*))
      
      inline def setSortVdomElement(value: VdomElement): Self = StObject.set(x, "sort", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUpload(value: VdomNode): Self = StObject.set(x, "upload", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUploadNull: Self = StObject.set(x, "upload", null)
      
      inline def setUploadVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "upload", js.Array(value*))
      
      inline def setUploadVdomElement(value: VdomElement): Self = StObject.set(x, "upload", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait IconProviderProps
    extends StObject
       with ConfigurableIcons {
    
    /**
      * The children that should inherit the icon provider context. This is
      * required since this component is pretty much worthless to use if you don't
      * inherit the overridden icons.
      */
    var children: Node
  }
  object IconProviderProps {
    
    inline def apply(): IconProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[IconProviderProps]
    }
    
    extension [Self <: IconProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
