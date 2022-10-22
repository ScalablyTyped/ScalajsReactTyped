package typingsJapgolly.reactQuery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactQuery.reactQueryStrings.`bottom-left`
import typingsJapgolly.reactQuery.reactQueryStrings.`bottom-right`
import typingsJapgolly.reactQuery.reactQueryStrings.`top-left`
import typingsJapgolly.reactQuery.reactQueryStrings.`top-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDevtoolsDevtoolsMod {
  
  @JSImport("react-query/types/devtools/devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ReactQueryDevtools(
    hasInitialIsOpenPanelPropsCloseButtonPropsToggleButtonPropsPositionContainerStyleNonce: DevtoolsOptions
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactQueryDevtools")(hasInitialIsOpenPanelPropsCloseButtonPropsToggleButtonPropsPositionContainerStyleNonce.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("react-query/types/devtools/devtools", "ReactQueryDevtoolsPanel")
  @js.native
  val ReactQueryDevtoolsPanel: ForwardRefExoticComponent[DevtoolsPanelOptions & RefAttributes[HTMLDivElement]] = js.native
  
  trait DevtoolsOptions extends StObject {
    
    /**
      * Use this to add props to the close button. For example, you can add className, style (merge and override default style), onClick (extend default handler), etc.
      */
    var closeButtonProps: js.UndefOr[DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]] = js.undefined
    
    /**
      * Use this to render the devtools inside a different type of container element for a11y purposes.
      * Any string which corresponds to a valid intrinsic JSX element is allowed.
      * Defaults to 'aside'.
      */
    var containerElement: js.UndefOr[String | Any] = js.undefined
    
    /**
      * Set this true if you want the dev tools to default to being open
      */
    var initialIsOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this to add props to the panel. For example, you can add className, style (merge and override default style), etc.
      */
    var panelProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
    
    /**
      * The position of the React Query logo to open and close the devtools panel.
      * Defaults to 'bottom-left'.
      */
    var position: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.undefined
    
    /**
      * nonce for style element for CSP
      */
    var styleNonce: js.UndefOr[String] = js.undefined
    
    /**
      * Use this to add props to the toggle button. For example, you can add className, style (merge and override default style), onClick (extend default handler), etc.
      */
    var toggleButtonProps: js.UndefOr[DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]] = js.undefined
  }
  object DevtoolsOptions {
    
    inline def apply(): DevtoolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevtoolsOptions]
    }
    
    extension [Self <: DevtoolsOptions](x: Self) {
      
      inline def setCloseButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = StObject.set(x, "closeButtonProps", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonPropsUndefined: Self = StObject.set(x, "closeButtonProps", js.undefined)
      
      inline def setContainerElement(value: String | Any): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setInitialIsOpen(value: Boolean): Self = StObject.set(x, "initialIsOpen", value.asInstanceOf[js.Any])
      
      inline def setInitialIsOpenUndefined: Self = StObject.set(x, "initialIsOpen", js.undefined)
      
      inline def setPanelProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "panelProps", value.asInstanceOf[js.Any])
      
      inline def setPanelPropsUndefined: Self = StObject.set(x, "panelProps", js.undefined)
      
      inline def setPosition(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyleNonce(value: String): Self = StObject.set(x, "styleNonce", value.asInstanceOf[js.Any])
      
      inline def setStyleNonceUndefined: Self = StObject.set(x, "styleNonce", js.undefined)
      
      inline def setToggleButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = StObject.set(x, "toggleButtonProps", value.asInstanceOf[js.Any])
      
      inline def setToggleButtonPropsUndefined: Self = StObject.set(x, "toggleButtonProps", js.undefined)
    }
  }
  
  trait DevtoolsPanelOptions extends StObject {
    
    /**
      * The standard React className property used to style a component with classes
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Handles the opening and closing the devtools panel
      */
    def handleDragStart(e: ReactMouseEventFrom[HTMLDivElement]): Unit
    
    /**
      * A boolean variable indicating whether the panel is open or closed
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that toggles the open and close state of the panel
      */
    def setIsOpen(isOpen: Boolean): Unit
    
    /**
      * The standard React style object used to style a component with inline styles
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * nonce for style element for CSP
      */
    var styleNonce: js.UndefOr[String] = js.undefined
  }
  object DevtoolsPanelOptions {
    
    inline def apply(handleDragStart: ReactMouseEventFrom[HTMLDivElement] => Callback, setIsOpen: Boolean => Callback): DevtoolsPanelOptions = {
      val __obj = js.Dynamic.literal(handleDragStart = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement]) => handleDragStart(t0).runNow()), setIsOpen = js.Any.fromFunction1((t0: Boolean) => setIsOpen(t0).runNow()))
      __obj.asInstanceOf[DevtoolsPanelOptions]
    }
    
    extension [Self <: DevtoolsPanelOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHandleDragStart(value: ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "handleDragStart", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setSetIsOpen(value: Boolean => Callback): Self = StObject.set(x, "setIsOpen", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNonce(value: String): Self = StObject.set(x, "styleNonce", value.asInstanceOf[js.Any])
      
      inline def setStyleNonceUndefined: Self = StObject.set(x, "styleNonce", js.undefined)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
