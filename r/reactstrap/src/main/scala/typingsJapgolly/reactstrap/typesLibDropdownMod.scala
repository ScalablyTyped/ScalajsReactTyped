package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactstrap.reactstrapStrings.append
import typingsJapgolly.reactstrap.reactstrapStrings.prepend
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibDropdownMod {
  
  @JSImport("reactstrap/types/lib/Dropdown", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DropdownProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactstrap.reactstrapStrings.up
    - typingsJapgolly.reactstrap.reactstrapStrings.down
    - typingsJapgolly.reactstrap.reactstrapStrings.start
    - typingsJapgolly.reactstrap.reactstrapStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    inline def down: typingsJapgolly.reactstrap.reactstrapStrings.down = "down".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.down]
    
    inline def end: typingsJapgolly.reactstrap.reactstrapStrings.end = "end".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.end]
    
    inline def start: typingsJapgolly.reactstrap.reactstrapStrings.start = "start".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.start]
    
    inline def up: typingsJapgolly.reactstrap.reactstrapStrings.up = "up".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.up]
  }
  
  type Dropdown = japgolly.scalajs.react.facade.React.Component[DropdownProps & js.Object, js.Object]
  
  trait DropdownProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var a11y: js.UndefOr[Boolean] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var addonType: js.UndefOr[Boolean | prepend | append] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[Boolean] = js.undefined
    
    var inNavbar: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var menuRole: js.UndefOr[Boolean | String] = js.undefined
    
    var nav: js.UndefOr[Boolean] = js.undefined
    
    var setActiveFromChild: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    var toggle: js.UndefOr[KeyboardEventHandler[Any] | MouseEventHandler[Any]] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    extension [Self <: DropdownProps](x: Self) {
      
      inline def setA11y(value: Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      inline def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAddonType(value: Boolean | prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      inline def setAddonTypeUndefined: Self = StObject.set(x, "addonType", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setInNavbar(value: Boolean): Self = StObject.set(x, "inNavbar", value.asInstanceOf[js.Any])
      
      inline def setInNavbarUndefined: Self = StObject.set(x, "inNavbar", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMenuRole(value: Boolean | String): Self = StObject.set(x, "menuRole", value.asInstanceOf[js.Any])
      
      inline def setMenuRoleUndefined: Self = StObject.set(x, "menuRole", js.undefined)
      
      inline def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setSetActiveFromChild(value: Boolean): Self = StObject.set(x, "setActiveFromChild", value.asInstanceOf[js.Any])
      
      inline def setSetActiveFromChildUndefined: Self = StObject.set(x, "setActiveFromChild", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setToggle(value: (ReactKeyboardEventFrom[Any & Element]) | (ReactMouseEventFrom[Any & Element]) => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: (ReactKeyboardEventFrom[Any & Element]) | (ReactMouseEventFrom[Any & Element])) => value(t0).runNow()))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait UncontrolledDropdownProps
    extends StObject
       with DropdownProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[
        js.Function2[
          /* event */ ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element], 
          /* isOpen */ Boolean, 
          Unit
        ]
      ] = js.undefined
  }
  object UncontrolledDropdownProps {
    
    inline def apply(): UncontrolledDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncontrolledDropdownProps]
    }
    
    extension [Self <: UncontrolledDropdownProps](x: Self) {
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setOnToggle(
        value: (/* event */ ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element], /* isOpen */ Boolean) => Callback
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element], t1: /* isOpen */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
