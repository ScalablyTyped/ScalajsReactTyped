package typingsJapgolly.bootstrapMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bootstrap-menu", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BootstrapMenu {
    /**
      * @param selector Css selector of the element to attach the Menu to
      * @param options Options to configure the menu
      */
    def this(selector: String, options: BootstrapMenuOptions) = this()
    
    /**
      * Close the context menu
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Close the menu and remove every event listeners
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  trait BootstrapMenu extends StObject {
    
    /**
      * Close the context menu
      */
    def close(): Unit
    
    /**
      * Close the menu and remove every event listeners
      */
    def destroy(): Unit
  }
  object BootstrapMenu {
    
    inline def apply(close: Callback, destroy: Callback): BootstrapMenu = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn)
      __obj.asInstanceOf[BootstrapMenu]
    }
    
    extension [Self <: BootstrapMenu](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
  
  /**
    * Every function attribute is called before rendering the menu each time it is opened.
    * If `fetchElementData` was defined, these functions will receive as first argument its returned value for the currently selected element.
    */
  trait BootstrapMenuActions extends StObject {
    
    /**
      * Optional, classes to add to the action.
      */
    var classNames: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.undefined
    
    /**
      * Optional, Font Awesome class of the icon to show for the action.
      */
    var iconClass: js.UndefOr[String] = js.undefined
    
    /**
      * Optional, decides if the action should appear enabled or disabled in the context menu.
      */
    var isEnabled: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.undefined
    
    /**
      * Optional, decides if the action should be shown or hidden in the context menu.
      */
    var isShown: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.undefined
    
    /**
      * The name of the action.
      */
    var name: String
    
    /**
      * Handler to run when an action is clicked.
      */
    def onClick(rowElement: BootstrapMenuRowElement): Unit
  }
  object BootstrapMenuActions {
    
    inline def apply(name: String, onClick: BootstrapMenuRowElement => Callback): BootstrapMenuActions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: BootstrapMenuRowElement) => onClick(t0).runNow()))
      __obj.asInstanceOf[BootstrapMenuActions]
    }
    
    extension [Self <: BootstrapMenuActions](x: Self) {
      
      inline def setClassNames(value: String | js.Object | (js.Function0[String | js.Object])): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesCallbackTo(value: CallbackTo[String | js.Object]): Self = StObject.set(x, "classNames", value.toJsFn)
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIsEnabled(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsShown(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = StObject.set(x, "isShown", js.Any.fromFunction1(value))
      
      inline def setIsShownUndefined: Self = StObject.set(x, "isShown", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: BootstrapMenuRowElement => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: BootstrapMenuRowElement) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.click
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.`right-click`
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.hover
  */
  trait BootstrapMenuEvent extends StObject
  object BootstrapMenuEvent {
    
    inline def click: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.click = "click".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.click]
    
    inline def hover: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.hover = "hover".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.hover]
    
    inline def `right-click`: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.`right-click` = "right-click".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.`right-click`]
  }
  
  trait BootstrapMenuOptions extends StObject {
    
    /**
      * In some weird cases, another plugin may be installing 'click' listeners
      * in the anchors used for each action of the context menu, and stopping
      * the event bubbling before it reachs this plugin's listener.
      *
      * For those cases, _actionSelectEvent can be used to change the event we
      * listen to, for example to 'mousedown'.
      *
      * Unless the context menu is not working due to this and a workaround is
      * needed, this option can be safely ignored.
      */
    var _actionSelectEvent: js.UndefOr[String] = js.undefined
    
    /**
      * Array or object containing the list of actions to be rendered in the context menu.
      */
    var actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]
    
    /**
      * Array to group actions to render them next to each other, with a separator between each group.
      */
    var actionsGroups: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    /**
      * Container of the context menu, where it will be created and where event listeners will be installed.
      */
    var container: js.UndefOr[String] = js.undefined
    
    /**
      * Obtain specific data about the currently opened element, to pass it to the rest of user-defined functions of an action.
      */
    var fetchElementData: js.UndefOr[js.Function1[/* jqueryElement */ JQuery[HTMLElement], BootstrapMenuRowElement]] = js.undefined
    
    /**
      * The event to listen to open the menu. Valid values are *click*, *right-click*, *hover*. Defaults to *right-click*.
      */
    var menuEvent: js.UndefOr[BootstrapMenuEvent] = js.undefined
    
    /**
      * How to calculate the position of the context menu based on its source. Valid values are *aboveLeft*, *aboveRight*, *belowLeft*, and *belowRight*. Defaults to *belowLeft*.
      */
    var menuPosition: js.UndefOr[BootstrapMenuPosition] = js.undefined
    
    /**
      * What the source of the context menu should be when opened. Valid values are *mouse* and *element*. Defaults to *mouse*.
      */
    var menuSource: js.UndefOr[BootstrapMenuSource] = js.undefined
    
    /**
      * Message to show when there are no actions to show in a menu
      * (isShown() returned false on all actions)
      */
    var noActionsMessage: js.UndefOr[String] = js.undefined
  }
  object BootstrapMenuOptions {
    
    inline def apply(actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): BootstrapMenuOptions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapMenuOptions]
    }
    
    extension [Self <: BootstrapMenuOptions](x: Self) {
      
      inline def setActions(value: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsGroups(value: js.Array[js.Array[String]]): Self = StObject.set(x, "actionsGroups", value.asInstanceOf[js.Any])
      
      inline def setActionsGroupsUndefined: Self = StObject.set(x, "actionsGroups", js.undefined)
      
      inline def setActionsGroupsVarargs(value: js.Array[String]*): Self = StObject.set(x, "actionsGroups", js.Array(value*))
      
      inline def setActionsVarargs(value: BootstrapMenuActions*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFetchElementData(value: /* jqueryElement */ JQuery[HTMLElement] => BootstrapMenuRowElement): Self = StObject.set(x, "fetchElementData", js.Any.fromFunction1(value))
      
      inline def setFetchElementDataUndefined: Self = StObject.set(x, "fetchElementData", js.undefined)
      
      inline def setMenuEvent(value: BootstrapMenuEvent): Self = StObject.set(x, "menuEvent", value.asInstanceOf[js.Any])
      
      inline def setMenuEventUndefined: Self = StObject.set(x, "menuEvent", js.undefined)
      
      inline def setMenuPosition(value: BootstrapMenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      inline def setMenuSource(value: BootstrapMenuSource): Self = StObject.set(x, "menuSource", value.asInstanceOf[js.Any])
      
      inline def setMenuSourceUndefined: Self = StObject.set(x, "menuSource", js.undefined)
      
      inline def setNoActionsMessage(value: String): Self = StObject.set(x, "noActionsMessage", value.asInstanceOf[js.Any])
      
      inline def setNoActionsMessageUndefined: Self = StObject.set(x, "noActionsMessage", js.undefined)
      
      inline def set_actionSelectEvent(value: String): Self = StObject.set(x, "_actionSelectEvent", value.asInstanceOf[js.Any])
      
      inline def set_actionSelectEventUndefined: Self = StObject.set(x, "_actionSelectEvent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.aboveLeft
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.aboveRight
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.belowLeft
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.belowRight
  */
  trait BootstrapMenuPosition extends StObject
  object BootstrapMenuPosition {
    
    inline def aboveLeft: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.aboveLeft = "aboveLeft".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.aboveLeft]
    
    inline def aboveRight: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.aboveRight = "aboveRight".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.aboveRight]
    
    inline def belowLeft: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.belowLeft = "belowLeft".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.belowLeft]
    
    inline def belowRight: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.belowRight = "belowRight".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.belowRight]
  }
  
  type BootstrapMenuRowElement = Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.mouse
    - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.element
  */
  trait BootstrapMenuSource extends StObject
  object BootstrapMenuSource {
    
    inline def element: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.element = "element".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.element]
    
    inline def mouse: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.mouse = "mouse".asInstanceOf[typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.mouse]
  }
}
