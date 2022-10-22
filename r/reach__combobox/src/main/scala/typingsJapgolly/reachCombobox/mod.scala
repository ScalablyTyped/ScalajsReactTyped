package typingsJapgolly.reachCombobox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.reachCombobox.anon.ComboboxPopoverPropsParti
import typingsJapgolly.reachCombobox.reachComboboxStrings.button
import typingsJapgolly.reachCombobox.reachComboboxStrings.div
import typingsJapgolly.reachCombobox.reachComboboxStrings.input
import typingsJapgolly.reachCombobox.reachComboboxStrings.li
import typingsJapgolly.reachCombobox.reachComboboxStrings.ul
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/combobox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Welcome to @reach/combobox!
    *
    * Accessible combobox (autocomplete or autosuggest) component for React.
    *
    * A combobox is the combination of an `<input type="text"/>` and a list. The
    * list is designed to help the user arrive at a value, but the value does not
    * necessarily have to come from that list. Don't think of it like a
    * `<select/>`, but more of an `<input type="text"/>` with some suggestions. You
    * can, however, validate that the value comes from the list, that's up to your
    * app.
    *
    * ???: navigate w/ arrows, then hit backspace: should it delete the
    *      autocompleted text or the old value the user had typed?!
    *
    * @see Docs     https://reach.tech/combobox
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/combobox
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#combobox
    */
  /**
    * Combobox
    *
    * @see Docs https://reach.tech/combobox#combobox
    */
  @JSImport("@reach/combobox", "Combobox")
  @js.native
  val Combobox: ForwardRefComponent[div, ComboboxProps] = js.native
  
  /**
    * ComboboxButton
    */
  @JSImport("@reach/combobox", "ComboboxButton")
  @js.native
  val ComboboxButton: ForwardRefComponent[button, ComboboxButtonProps] = js.native
  
  /**
    * ComboboxInput
    *
    * Wraps an `<input/>` with a couple extra props that work with the combobox.
    *
    * @see Docs https://reach.tech/combobox#comboboxinput
    */
  @JSImport("@reach/combobox", "ComboboxInput")
  @js.native
  val ComboboxInput: ForwardRefComponent[input, ComboboxInputProps] = js.native
  
  /**
    * ComboboxList
    *
    * Contains the `ComboboxOption` elements and sets up the proper aria attributes
    * for the list.
    *
    * @see Docs https://reach.tech/combobox#comboboxlist
    */
  @JSImport("@reach/combobox", "ComboboxList")
  @js.native
  val ComboboxList: ForwardRefComponent[ul, ComboboxListProps] = js.native
  
  /**
    * ComboboxOption
    *
    * An option that is suggested to the user as they interact with the combobox.
    *
    * @see Docs https://reach.tech/combobox#comboboxoption
    */
  @JSImport("@reach/combobox", "ComboboxOption")
  @js.native
  val ComboboxOption: ForwardRefComponent[li, ComboboxOptionProps] = js.native
  
  /**
    * ComboboxPopover
    *
    * Contains the popup that renders the list. Because some UI needs to render
    * more than the list in the popup, you need to render one of these around the
    * list. For example, maybe you want to render the number of results suggested.
    *
    * @see Docs https://reach.tech/combobox#comboboxpopover
    */
  @JSImport("@reach/combobox", "ComboboxPopover")
  @js.native
  val ComboboxPopover: ForwardRefComponent[div, ComboboxPopoverPropsParti] = js.native
  
  /**
    * Escape regexp special characters in `str`
    *
    * @see https://github.com/component/escape-regexp/blob/5ce923c1510c9802b3da972c90b6861dd2829b6b/index.js
    * @param str
    */
  inline def escapeRegexp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegexp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * We want the same events when the input or the popup have focus (HOW COOL ARE
    * HOOKS BTW?) This is probably the hairiest piece but it's not bad.
    */
  inline def unstableUseKeyDown(): js.Function1[/* event */ ReactKeyboardEventFrom[Element], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useKeyDown")().asInstanceOf[js.Function1[/* event */ ReactKeyboardEventFrom[Element], Unit]]
  
  /**
    * A hook that exposes data for a given `Combobox` component to its descendants.
    *
    * @see Docs https://reach.tech/combobox#usecomboboxcontext
    */
  inline def useComboboxContext(): ComboboxContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useComboboxContext")().asInstanceOf[ComboboxContextValue]
  
  /**
    * A hook that exposes data for a given `ComboboxOption` component to its descendants.
    *
    * @see Docs https://reach.tech/combobox#usecomboboxcontext
    */
  inline def useComboboxOptionContext(): ComboboxOptionContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useComboboxOptionContext")().asInstanceOf[ComboboxOptionContextValue]
  
  trait ComboboxButtonProps extends StObject
  
  trait ComboboxContextValue extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var isExpanded: Boolean
    
    var navigationValue: ComboboxValue | Null
    
    var state: State
  }
  object ComboboxContextValue {
    
    inline def apply(isExpanded: Boolean, state: State): ComboboxContextValue = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], navigationValue = null)
      __obj.asInstanceOf[ComboboxContextValue]
    }
    
    extension [Self <: ComboboxContextValue](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setNavigationValue(value: ComboboxValue): Self = StObject.set(x, "navigationValue", value.asInstanceOf[js.Any])
      
      inline def setNavigationValueNull: Self = StObject.set(x, "navigationValue", null)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/combobox#comboboxinput-props
    */
  trait ComboboxInputProps extends StObject {
    
    /**
      * Determines if the value in the input changes or not as the user navigates
      * with the keyboard. If true, the value changes, if false the value doesn't
      * change.
      *
      * Set this to false when you don't really need the value from the input but
      * want to populate some other state (like the recipient selector in Gmail).
      * But if your input is more like a normal `<input type="text"/>`, then leave
      * the `true` default.
      *
      * @see Docs https://reach.tech/combobox#comboboxinput-autocomplete
      */
    var autocomplete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, when the user clicks inside the text box the current value will
      * be selected. Use this if the user is likely to delete all the text anyway
      * (like the URL bar in browsers).
      *
      * However, if the user is likely to want to tweak the value, leave this
      * false, like a google search--the user is likely wanting to edit their
      * search, not replace it completely.
      *
      * @see Docs https://reach.tech/combobox#comboboxinput-selectonclick
      */
    var selectOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see Docs https://reach.tech/combobox#comboboxinput-value
      */
    var value: js.UndefOr[ComboboxValue] = js.undefined
  }
  object ComboboxInputProps {
    
    inline def apply(): ComboboxInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxInputProps]
    }
    
    extension [Self <: ComboboxInputProps](x: Self) {
      
      inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setSelectOnClick(value: Boolean): Self = StObject.set(x, "selectOnClick", value.asInstanceOf[js.Any])
      
      inline def setSelectOnClickUndefined: Self = StObject.set(x, "selectOnClick", js.undefined)
      
      inline def setValue(value: ComboboxValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/combobox#comboboxlist-props
    */
  trait ComboboxListProps extends StObject {
    
    /**
      * Defaults to false. When true and the list is opened, if an option's value
      * matches the value in the input, it will automatically be highlighted and
      * be the starting point for any keyboard navigation of the list.
      *
      * This allows you to treat a Combobox more like a `<select>` than an
      * `<input/>`, but be mindful that the user is still able to put any
      * arbitrary value into the input, so if the only valid values for the input
      * are from the list, your app will need to do that validation on blur or
      * submit of the form.
      *
      * @see Docs https://reach.tech/combobox#comboboxlist-persistselection
      */
    var persistSelection: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxListProps {
    
    inline def apply(): ComboboxListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxListProps]
    }
    
    extension [Self <: ComboboxListProps](x: Self) {
      
      inline def setPersistSelection(value: Boolean): Self = StObject.set(x, "persistSelection", value.asInstanceOf[js.Any])
      
      inline def setPersistSelectionUndefined: Self = StObject.set(x, "persistSelection", js.undefined)
    }
  }
  
  trait ComboboxOptionContextValue extends StObject {
    
    var index: Double
    
    var value: ComboboxValue
  }
  object ComboboxOptionContextValue {
    
    inline def apply(index: Double, value: ComboboxValue): ComboboxOptionContextValue = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxOptionContextValue]
    }
    
    extension [Self <: ComboboxOptionContextValue](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ComboboxValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/combobox#comboboxoption-props
    */
  trait ComboboxOptionProps extends StObject {
    
    /**
      * Optional. If omitted, the `value` will be used as the children like as:
      * `<ComboboxOption value="Seattle, Tacoma, Washington" />`. But if you need
      * to control a bit more, you can put whatever children you want, but make
      * sure to render a `ComboboxOptionText` as well, so the value is still
      * displayed with the text highlighting on the matched portions.
      *
      * @example
      *   <ComboboxOption value="Apple" />
      *     🍎 <ComboboxOptionText />
      *   </ComboboxOption>
      *
      * @see Docs https://reach.tech/combobox#comboboxoption-children
      */
    var children: js.UndefOr[Node | (js.Function1[/* props */ ComboboxOptionContextValue, Node])] = js.undefined
    
    /**
      * TODO: Document this!
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * The value to match against when suggesting.
      *
      * @see Docs https://reach.tech/combobox#comboboxoption-value
      */
    var value: String
  }
  object ComboboxOptionProps {
    
    inline def apply(value: String): ComboboxOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxOptionProps]
    }
    
    extension [Self <: ComboboxOptionProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* props */ ComboboxOptionContextValue, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ComboboxOptionContextValue => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/combobox#comboboxpopover-props
    */
  trait ComboboxPopoverProps extends StObject {
    
    /**
      * If you pass `<ComboboxPopover portal={false} />` the popover will not
      * render inside of a portal, but in the same order as the React tree. This
      * is mostly useful for styling the entire component together, like the pink
      * focus outline in the example earlier in this page.
      *
      * @see Docs https://reach.tech/combobox#comboboxpopover-portal
      */
    var portal: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxPopoverProps {
    
    inline def apply(): ComboboxPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxPopoverProps]
    }
    
    extension [Self <: ComboboxPopoverProps](x: Self) {
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/combobox#combobox-props
    */
  trait ComboboxProps extends StObject {
    
    /**
      * Defines a string value that labels the current element.
      * @see Docs https://reach.tech/combobox#accessibility
      */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see Docs https://reach.tech/combobox#accessibility
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /**
      * @see Docs https://reach.tech/combobox#combobox-children
      */
    var children: Node | (js.Function1[/* props */ ComboboxContextValue, Node])
    
    /**
      * Called with the selection value when the user makes a selection from the
      * list.
      *
      * @see Docs https://reach.tech/combobox#combobox-onselect
      */
    var onSelect: js.UndefOr[js.Function1[/* value */ ComboboxValue, Unit]] = js.undefined
    
    /**
      * If true, the popover opens when focus is on the text box.
      *
      * @see Docs https://reach.tech/combobox#combobox-openonfocus
      */
    var openOnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxProps {
    
    inline def apply(): ComboboxProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ComboboxProps]
    }
    
    extension [Self <: ComboboxProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setChildren(value: Node | (js.Function1[/* props */ ComboboxContextValue, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ComboboxContextValue => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: /* value */ ComboboxValue => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* value */ ComboboxValue) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
    }
  }
  
  type ComboboxValue = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reachCombobox.reachComboboxStrings.IDLE
    - typingsJapgolly.reachCombobox.reachComboboxStrings.SUGGESTING
    - typingsJapgolly.reachCombobox.reachComboboxStrings.NAVIGATING
    - typingsJapgolly.reachCombobox.reachComboboxStrings.INTERACTING
  */
  trait State extends StObject
  object State {
    
    inline def IDLE: typingsJapgolly.reachCombobox.reachComboboxStrings.IDLE = "IDLE".asInstanceOf[typingsJapgolly.reachCombobox.reachComboboxStrings.IDLE]
    
    inline def INTERACTING: typingsJapgolly.reachCombobox.reachComboboxStrings.INTERACTING = "INTERACTING".asInstanceOf[typingsJapgolly.reachCombobox.reachComboboxStrings.INTERACTING]
    
    inline def NAVIGATING: typingsJapgolly.reachCombobox.reachComboboxStrings.NAVIGATING = "NAVIGATING".asInstanceOf[typingsJapgolly.reachCombobox.reachComboboxStrings.NAVIGATING]
    
    inline def SUGGESTING: typingsJapgolly.reachCombobox.reachComboboxStrings.SUGGESTING = "SUGGESTING".asInstanceOf[typingsJapgolly.reachCombobox.reachComboboxStrings.SUGGESTING]
  }
}
