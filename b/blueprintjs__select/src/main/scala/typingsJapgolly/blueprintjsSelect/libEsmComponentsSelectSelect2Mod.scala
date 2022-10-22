package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typingsJapgolly.blueprintjsCore.mod.AbstractPureComponent2
import typingsJapgolly.blueprintjsSelect.libEsmCommonListItemsPropsMod.ListItemsProps
import typingsJapgolly.blueprintjsSelect.libEsmCommonSelectPopoverPropsMod.SelectPopoverProps
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSelectSelect2Mod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/select/select2", "Select2")
  @js.native
  open class Select2[T] protected ()
    extends AbstractPureComponent2[Select2Props[T], Select2State, js.Object] {
    def this(props: Select2Props[T]) = this()
    def this(props: Select2Props[T], context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSelect2(prevProps: Select2Props[T], prevState: Select2State): Unit = js.native
    
    /* private */ var getPopoverTargetRenderer: Any = js.native
    
    /* private */ var handleInputRef: Any = js.native
    
    /* private */ var handleItemSelect: Any = js.native
    
    /* private */ var handlePopoverClosing: Any = js.native
    
    /* private */ var handlePopoverInteraction: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var handlePopoverOpening: Any = js.native
    
    /* private */ var handleQueryListRef: Any = js.native
    
    /**
      * Target wrapper element "keydown" handler while the popover is closed.
      */
    /* private */ var handleTargetKeyDown: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var listboxId: Any = js.native
    
    /* private */ var maybeRenderClearButton: Any = js.native
    
    /* private */ var previousFocusedElement: Any = js.native
    
    /* private */ var queryList: Any = js.native
    
    /* private */ var renderQueryList: Any = js.native
    
    /* private */ var resetQuery: Any = js.native
  }
  /* static members */
  object Select2 {
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select2", "Select2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select2", "Select2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[/* props */ Select2Props[U], Select2[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ Select2Props[U], Select2[U]]]
  }
  
  @js.native
  trait Select2Props[T]
    extends StObject
       with ListItemsProps[T]
       with SelectPopoverProps {
    
    /**
      * Element which triggers the select popover. In most cases, you should display
      * the name or label of the curently selected item here.
      */
    var children: js.UndefOr[Node] = js.native
    
    /**
      * Whether the component is non-interactive.
      * If true, the list's item renderer will not be called.
      * Note that you'll also need to disable the component's children, if appropriate.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component should take up the full width of its container.
      * This overrides `popoverProps.fill`. You also have to ensure that the child
      * component has `fill` set to `true` or is styled appropriately.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the dropdown list can be filtered.
      * Disabling this option will remove the `InputGroup` and ignore `inputProps`.
      *
      * @default true
      */
    var filterable: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to the query `InputGroup`. Use `query` and
      * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
      * to control this input.
      */
    var inputProps: js.UndefOr[InputGroupProps2] = js.native
    
    /**
      * Props to spread to the `Menu` listbox containing the selectable options.
      */
    var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.native
    
    /**
      * Props to add to the popover target wrapper element.
      */
    var popoverTargetProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
      *
      * @default false
      */
    var resetOnClose: js.UndefOr[Boolean] = js.native
  }
  
  trait Select2State extends StObject {
    
    var isOpen: Boolean
  }
  object Select2State {
    
    inline def apply(isOpen: Boolean): Select2State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Select2State]
    }
    
    extension [Self <: Select2State](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
