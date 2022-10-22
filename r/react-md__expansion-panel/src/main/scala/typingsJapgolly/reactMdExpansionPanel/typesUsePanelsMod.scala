package typingsJapgolly.reactMdExpansionPanel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUsePanelsMod {
  
  @JSImport("@react-md/expansion-panel/types/usePanels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("usePanels")(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  type CreateExpandById = js.Function1[/* panelId */ String, js.Function0[Unit]]
  
  type ExpandedIds = js.Array[String]
  
  type ExpansionDispatcher = Dispatch[SetStateAction[ExpandedIds]]
  
  type ExpansionPanelKeyDownHandler = KeyboardEventHandler[HTMLDivElement]
  
  trait ProvidedPanelProps extends StObject {
    
    /**
      * Boolean if the panel's expansion state should be disabled. This will only
      * be true when the `preventAllClosed` option has been enabled and the panel
      * is the last remaining expanded panel.
      */
    var disabled: Boolean
    
    /**
      * Boolean if the panel is currently expanded.
      */
    var expanded: Boolean
    
    /**
      * A ref object for the panel. This is required so that the parent keyboard
      * event handler can focus the next/previous/first/last panel when the correct
      * arrow key or home/end key is pressed. If there is only one panel and the
      * keydown event handler isn't being used, this prop is not required to be
      * passed to the expansion panel.
      */
    var headerRef: RefHandle[HTMLButtonElement]
    
    /**
      * The DOM id for the panel which is really just `${idPrefix}-${index + 1}`.
      */
    var id: String
    
    /**
      * This will be `true` when the panel is expanded or the previous panel was
      * expanded and the panel is not the first panel in the list.
      */
    var marginTop: Boolean
    
    /**
      * A function that will toggle the expansion of this panel in the list.
      */
    def onExpandClick(): Unit
  }
  object ProvidedPanelProps {
    
    inline def apply(
      disabled: Boolean,
      expanded: Boolean,
      headerRef: RefHandle[HTMLButtonElement],
      id: String,
      marginTop: Boolean,
      onExpandClick: Callback
    ): ProvidedPanelProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], headerRef = headerRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], onExpandClick = onExpandClick.toJsFn)
      __obj.asInstanceOf[ProvidedPanelProps]
    }
    
    extension [Self <: ProvidedPanelProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setHeaderRef(value: RefHandle[HTMLButtonElement]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMarginTop(value: Boolean): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setOnExpandClick(value: Callback): Self = StObject.set(x, "onExpandClick", value.toJsFn)
    }
  }
  
  type ReturnValue = js.Tuple5[
    js.Array[ProvidedPanelProps], 
    ExpansionPanelKeyDownHandler, 
    ExpandedIds, 
    ExpansionDispatcher, 
    CreateExpandById
  ]
  
  trait UsePanelsOptions extends StObject {
    
    /**
      * The number of panels that will be used by this expansion logic and
      * generates the number of panel props to be used in the return value. This
      * should be a number greater than 0 and will throw a `RangeError` if it is
      * not in development.
      */
    var count: Double
    
    /**
      * Either the index that should be expanded by default, a list of indexes that
      * should be expanded by default, or `-1` which will expand all panels by
      * default.
      *
      * When this is omitted and `undefined`, no panels will be expanded by
      * default.
      */
    var defaultExpandedIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * The prefix to use for all of the panel ids. This is used to generate the id
      * for each panel as well as determine if a panel is expanded.
      */
    var idPrefix: String
    
    /**
      * Boolean if multiple panels can be expanded at a time. The default behavior
      * is to only allow one panel to be expanded and will close the previous panel
      * when a new one is expanded.
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the expansion logic should prevent all the panels from being
      * closed.
      */
    var preventAllClosed: js.UndefOr[Boolean] = js.undefined
  }
  object UsePanelsOptions {
    
    inline def apply(count: Double, idPrefix: String): UsePanelsOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], idPrefix = idPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePanelsOptions]
    }
    
    extension [Self <: UsePanelsOptions](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultExpandedIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedIndexUndefined: Self = StObject.set(x, "defaultExpandedIndex", js.undefined)
      
      inline def setDefaultExpandedIndexVarargs(value: Double*): Self = StObject.set(x, "defaultExpandedIndex", js.Array(value*))
      
      inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setPreventAllClosed(value: Boolean): Self = StObject.set(x, "preventAllClosed", value.asInstanceOf[js.Any])
      
      inline def setPreventAllClosedUndefined: Self = StObject.set(x, "preventAllClosed", js.undefined)
    }
  }
}
