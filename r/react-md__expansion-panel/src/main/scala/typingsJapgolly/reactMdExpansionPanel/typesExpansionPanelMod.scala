package typingsJapgolly.reactMdExpansionPanel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdCard.typesCardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpansionPanelMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionPanel", "ExpansionPanel")
  @js.native
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Inlined std.Pick<@react-md/card.@react-md/card.CardContentProps, 'disablePadding' | 'disableSecondaryColor' | 'disableParagraphMargin'> */
  trait ConfigurableCardContentProps extends StObject {
    
    var disablePadding: js.UndefOr[Boolean] = js.undefined
    
    var disableParagraphMargin: js.UndefOr[Boolean] = js.undefined
    
    var disableSecondaryColor: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurableCardContentProps {
    
    inline def apply(): ConfigurableCardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurableCardContentProps]
    }
    
    extension [Self <: ConfigurableCardContentProps](x: Self) {
      
      inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      inline def setDisableParagraphMargin(value: Boolean): Self = StObject.set(x, "disableParagraphMargin", value.asInstanceOf[js.Any])
      
      inline def setDisableParagraphMarginUndefined: Self = StObject.set(x, "disableParagraphMargin", js.undefined)
      
      inline def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      inline def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
    }
  }
  
  trait ExpansionPanelProps
    extends StObject
       with CardProps
       with ConfigurableCardContentProps {
    
    /**
      * An optional className to provide the content of the panel.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to provide to the content of the panel.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An optional header element to display instead of the default
      * implementation.
      */
    var customHeader: js.UndefOr[Node] = js.undefined
    
    /**
      * Boolean if the collapse transition should be disabled for the content
      * within the panel. It is recommended to disable this transition if there is
      * a lot of content within the panel since animating max-height isn't super
      * great since it causes DOM repaints during the entire transition.
      */
    var disableTransition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if clicking on the header should no longer toggle the expansion
      * state. This will automatically be provided from the `usePanels` hook for
      * when a panel cannot be closed to do preventing all panels from being closed
      * at a time.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the panel is currently expanded.
      */
    var expanded: Boolean
    
    /**
      * An optional expander icon to use within the default header implementation.
      * This defaults to the `"expander"` icon.
      */
    var expanderIcon: js.UndefOr[Node] = js.undefined
    
    /**
      * The children to display within the default header element.
      */
    var header: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional className to provide to the default header implementation. If
      * the `header` prop is provided, this will do nothing.
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional ref to pass to the default header implementation. This will be
      * provided automatically if you are using the `usePanels` hook to allow
      * keyboard movement with the arrow keys and home/end keys. If you provide
      * your own `header`, you'll need to pass the `headerRef` to your custom
      * implementation to the focusable element for the keyboard focus behavior to
      * work.
      */
    var headerRef: js.UndefOr[Ref[HTMLButtonElement]] = js.undefined
    
    /**
      * An optional style object to provide to the default header implementation. If
      * the `header` prop is provided, this will do nothing.
      */
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An id for the panel that is required for a11y.
      */
    @JSName("id")
    var id_ExpansionPanelProps: String
    
    /**
      * Boolean if margin top should be applied to this header to add some
      * additional spacing between this panel and the previous panel. This will
      * automatically be provided for panels when using the `usePanels` hook.
      */
    var marginTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that should attempt to change the expansion state of the panel.
      */
    var onExpandClick: MouseEventHandler[HTMLButtonElement]
    
    /**
      * Boolean if the content should be persistent within the DOM instead of
      * unmounting once no longer expanded. This is only really helpful if you want
      * to maintain state while the panel is hidden since the children will unmount
      * when not expanded.
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object ExpansionPanelProps {
    
    inline def apply(
      expanded: Boolean,
      id: String,
      onExpandClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback
    ): ExpansionPanelProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onExpandClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onExpandClick(t0).runNow()))
      __obj.asInstanceOf[ExpansionPanelProps]
    }
    
    extension [Self <: ExpansionPanelProps](x: Self) {
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setCustomHeader(value: VdomNode): Self = StObject.set(x, "customHeader", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCustomHeaderNull: Self = StObject.set(x, "customHeader", null)
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setCustomHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "customHeader", js.Array(value*))
      
      inline def setCustomHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "customHeader", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      inline def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpanderIcon(value: VdomNode): Self = StObject.set(x, "expanderIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpanderIconNull: Self = StObject.set(x, "expanderIcon", null)
      
      inline def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      inline def setExpanderIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "expanderIcon", js.Array(value*))
      
      inline def setExpanderIconVdomElement(value: VdomElement): Self = StObject.set(x, "expanderIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeader(value: VdomNode): Self = StObject.set(x, "header", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderRef(value: Ref[HTMLButtonElement]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
      
      inline def setHeaderRefFunction1(value: HTMLButtonElement | Null => Callback): Self = StObject.set(x, "headerRef", js.Any.fromFunction1((t0: HTMLButtonElement | Null) => value(t0).runNow()))
      
      inline def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
      
      inline def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMarginTop(value: Boolean): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setOnExpandClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onExpandClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
