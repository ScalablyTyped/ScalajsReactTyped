package typingsJapgolly.inboxsdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.inboxsdk.anon.PreventDefault
import typingsJapgolly.inboxsdk.inboxsdkStrings.CREATE
import typingsJapgolly.inboxsdk.inboxsdkStrings.DROPDOWN_BUTTON
import typingsJapgolly.inboxsdk.inboxsdkStrings.ICON_BUTTON
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.mod.Common.DropdownView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavMenu {
  
  trait CreateAccessoryDescriptor extends StObject {
    
    def onClick(): Unit
    
    var `type`: CREATE
  }
  object CreateAccessoryDescriptor {
    
    inline def apply(onClick: Callback): CreateAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(onClick = onClick.toJsFn)
      __obj.updateDynamic("type")("CREATE")
      __obj.asInstanceOf[CreateAccessoryDescriptor]
    }
    
    extension [Self <: CreateAccessoryDescriptor](x: Self) {
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setType(value: CREATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownButtonAccessoryDescriptor extends StObject {
    
    var buttonBackgroundColor: String
    
    var buttonForegroundColor: String
    
    def onClick(event: DropdownButtonClickEvent): Unit
    
    var `type`: DROPDOWN_BUTTON
  }
  object DropdownButtonAccessoryDescriptor {
    
    inline def apply(
      buttonBackgroundColor: String,
      buttonForegroundColor: String,
      onClick: DropdownButtonClickEvent => Callback
    ): DropdownButtonAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: DropdownButtonClickEvent) => onClick(t0).runNow()))
      __obj.updateDynamic("type")("DROPDOWN_BUTTON")
      __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
    }
    
    extension [Self <: DropdownButtonAccessoryDescriptor](x: Self) {
      
      inline def setButtonBackgroundColor(value: String): Self = StObject.set(x, "buttonBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setButtonForegroundColor(value: String): Self = StObject.set(x, "buttonForegroundColor", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: DropdownButtonClickEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: DropdownButtonClickEvent) => value(t0).runNow()))
      
      inline def setType(value: DROPDOWN_BUTTON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownButtonClickEvent extends StObject {
    
    var dropdown: DropdownView
  }
  object DropdownButtonClickEvent {
    
    inline def apply(dropdown: DropdownView): DropdownButtonClickEvent = {
      val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonClickEvent]
    }
    
    extension [Self <: DropdownButtonClickEvent](x: Self) {
      
      inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconButtonAccessoryDescriptor extends StObject {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: String
    
    def onClick(): Unit
    
    var `type`: ICON_BUTTON
  }
  object IconButtonAccessoryDescriptor {
    
    inline def apply(iconUrl: String, onClick: Callback): IconButtonAccessoryDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = onClick.toJsFn)
      __obj.updateDynamic("type")("ICON_BUTTON")
      __obj.asInstanceOf[IconButtonAccessoryDescriptor]
    }
    
    extension [Self <: IconButtonAccessoryDescriptor](x: Self) {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setType(value: ICON_BUTTON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor
    - typingsJapgolly.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor
  */
  trait NavItemDescriptor extends StObject
  object NavItemDescriptor {
    
    inline def NavItemIconHtmlDescriptor(name: String): typingsJapgolly.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor]
    }
    
    inline def NavItemIconUrlDescriptor(name: String): typingsJapgolly.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor]
    }
  }
  
  trait NavItemDescriptorBase extends StObject {
    
    var accessory: js.UndefOr[
        CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
      ] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var expanderForegroundColor: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var onClick: js.UndefOr[js.Function1[/* event */ PreventDefault, Unit]] = js.undefined
    
    var orderHint: js.UndefOr[Double] = js.undefined
    
    var routeID: js.UndefOr[String] = js.undefined
    
    var routeParams: js.UndefOr[js.Object] = js.undefined
    
    var `type`: js.UndefOr[NavItemTypes] = js.undefined
  }
  object NavItemDescriptorBase {
    
    inline def apply(name: String): NavItemDescriptorBase = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemDescriptorBase]
    }
    
    extension [Self <: NavItemDescriptorBase](x: Self) {
      
      inline def setAccessory(
        value: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
      ): Self = StObject.set(x, "accessory", value.asInstanceOf[js.Any])
      
      inline def setAccessoryUndefined: Self = StObject.set(x, "accessory", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setExpanderForegroundColor(value: String): Self = StObject.set(x, "expanderForegroundColor", value.asInstanceOf[js.Any])
      
      inline def setExpanderForegroundColorUndefined: Self = StObject.set(x, "expanderForegroundColor", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ PreventDefault => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ PreventDefault) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      inline def setRouteID(value: String): Self = StObject.set(x, "routeID", value.asInstanceOf[js.Any])
      
      inline def setRouteIDUndefined: Self = StObject.set(x, "routeID", js.undefined)
      
      inline def setRouteParams(value: js.Object): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
      
      inline def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
      
      inline def setType(value: NavItemTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NavItemIconHtmlDescriptor
    extends StObject
       with NavItemDescriptorBase
       with NavItemDescriptor {
    
    var iconElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object NavItemIconHtmlDescriptor {
    
    inline def apply(name: String): NavItemIconHtmlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemIconHtmlDescriptor]
    }
    
    extension [Self <: NavItemIconHtmlDescriptor](x: Self) {
      
      inline def setIconElement(value: HTMLElement): Self = StObject.set(x, "iconElement", value.asInstanceOf[js.Any])
      
      inline def setIconElementUndefined: Self = StObject.set(x, "iconElement", js.undefined)
    }
  }
  
  trait NavItemIconUrlDescriptor
    extends StObject
       with NavItemDescriptorBase
       with NavItemDescriptor {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
  }
  object NavItemIconUrlDescriptor {
    
    inline def apply(name: String): NavItemIconUrlDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemIconUrlDescriptor]
    }
    
    extension [Self <: NavItemIconUrlDescriptor](x: Self) {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inboxsdk.inboxsdkStrings.LINK
    - typingsJapgolly.inboxsdk.inboxsdkStrings.NAVIGATION
  */
  trait NavItemTypes extends StObject
  object NavItemTypes {
    
    inline def LINK: typingsJapgolly.inboxsdk.inboxsdkStrings.LINK = "LINK".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.LINK]
    
    inline def NAVIGATION: typingsJapgolly.inboxsdk.inboxsdkStrings.NAVIGATION = "NAVIGATION".asInstanceOf[typingsJapgolly.inboxsdk.inboxsdkStrings.NAVIGATION]
  }
  
  trait NavItemView extends StObject {
    
    def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
    
    var destroyed: Boolean
    
    def isCollapsed(): Boolean
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
    
    def remove(): Unit
    
    def setCollapsed(collapseValue: Boolean): Unit
  }
  object NavItemView {
    
    inline def apply(
      addNavItem: NavItemDescriptor => NavItemView,
      destroyed: Boolean,
      isCollapsed: CallbackTo[Boolean],
      on: (destroy, js.Function0[Unit]) => Callback,
      remove: Callback,
      setCollapsed: Boolean => Callback
    ): NavItemView = {
      val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem), destroyed = destroyed.asInstanceOf[js.Any], isCollapsed = isCollapsed.toJsFn, on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), remove = remove.toJsFn, setCollapsed = js.Any.fromFunction1((t0: Boolean) => setCollapsed(t0).runNow()))
      __obj.asInstanceOf[NavItemView]
    }
    
    extension [Self <: NavItemView](x: Self) {
      
      inline def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = StObject.set(x, "addNavItem", js.Any.fromFunction1(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCollapsed", value.toJsFn)
      
      inline def setOn(value: (destroy, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setSetCollapsed(value: Boolean => Callback): Self = StObject.set(x, "setCollapsed", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait NavMenuInstance extends StObject {
    
    def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
  }
  object NavMenuInstance {
    
    inline def apply(addNavItem: NavItemDescriptor => NavItemView): NavMenuInstance = {
      val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem))
      __obj.asInstanceOf[NavMenuInstance]
    }
    
    extension [Self <: NavMenuInstance](x: Self) {
      
      inline def setAddNavItem(value: NavItemDescriptor => NavItemView): Self = StObject.set(x, "addNavItem", js.Any.fromFunction1(value))
    }
  }
}
