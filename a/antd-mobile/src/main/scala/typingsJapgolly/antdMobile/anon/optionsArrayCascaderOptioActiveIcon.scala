package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antdMobile.antdMobileStrings.`additions removals`
import typingsJapgolly.antdMobile.antdMobileStrings.`additions text`
import typingsJapgolly.antdMobile.antdMobileStrings.`inline`
import typingsJapgolly.antdMobile.antdMobileStrings.`removals additions`
import typingsJapgolly.antdMobile.antdMobileStrings.`removals text`
import typingsJapgolly.antdMobile.antdMobileStrings.`text additions`
import typingsJapgolly.antdMobile.antdMobileStrings.`text removals`
import typingsJapgolly.antdMobile.antdMobileStrings.additions
import typingsJapgolly.antdMobile.antdMobileStrings.all
import typingsJapgolly.antdMobile.antdMobileStrings.ascending
import typingsJapgolly.antdMobile.antdMobileStrings.assertive
import typingsJapgolly.antdMobile.antdMobileStrings.both
import typingsJapgolly.antdMobile.antdMobileStrings.copy
import typingsJapgolly.antdMobile.antdMobileStrings.date
import typingsJapgolly.antdMobile.antdMobileStrings.descending
import typingsJapgolly.antdMobile.antdMobileStrings.dialog
import typingsJapgolly.antdMobile.antdMobileStrings.execute
import typingsJapgolly.antdMobile.antdMobileStrings.grammar
import typingsJapgolly.antdMobile.antdMobileStrings.grid
import typingsJapgolly.antdMobile.antdMobileStrings.horizontal
import typingsJapgolly.antdMobile.antdMobileStrings.link
import typingsJapgolly.antdMobile.antdMobileStrings.list
import typingsJapgolly.antdMobile.antdMobileStrings.listbox
import typingsJapgolly.antdMobile.antdMobileStrings.location
import typingsJapgolly.antdMobile.antdMobileStrings.menu
import typingsJapgolly.antdMobile.antdMobileStrings.mixed
import typingsJapgolly.antdMobile.antdMobileStrings.move
import typingsJapgolly.antdMobile.antdMobileStrings.none
import typingsJapgolly.antdMobile.antdMobileStrings.off
import typingsJapgolly.antdMobile.antdMobileStrings.other
import typingsJapgolly.antdMobile.antdMobileStrings.page
import typingsJapgolly.antdMobile.antdMobileStrings.polite
import typingsJapgolly.antdMobile.antdMobileStrings.popup
import typingsJapgolly.antdMobile.antdMobileStrings.removals
import typingsJapgolly.antdMobile.antdMobileStrings.spelling
import typingsJapgolly.antdMobile.antdMobileStrings.step
import typingsJapgolly.antdMobile.antdMobileStrings.text
import typingsJapgolly.antdMobile.antdMobileStrings.time
import typingsJapgolly.antdMobile.antdMobileStrings.tree
import typingsJapgolly.antdMobile.antdMobileStrings.vertical
import typingsJapgolly.antdMobile.esComponentsCascaderCascaderMod.CascaderActions
import typingsJapgolly.antdMobile.esComponentsCascaderViewCascaderViewMod.CascaderOption
import typingsJapgolly.antdMobile.esComponentsCascaderViewCascaderViewMod.CascaderValueExtend
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typingsJapgolly.antdMobile.esUtilsWithStopPropagationMod.PropagationEvent
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  options :std.Array<antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderOption>,   value :std.Array<string> | undefined,   defaultValue :std.Array<string> | undefined,   placeholder :string | undefined,   onSelect :(value : std.Array<string>, extend : antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderValueExtend): void | undefined,   onConfirm :(value : std.Array<string>, extend : antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderValueExtend): void | undefined,   onCancel :(): void | undefined,   onClose :(): void | undefined,   visible :boolean | undefined,   title :react.react.ReactNode | undefined,   confirmText :react.react.ReactNode | undefined,   cancelText :react.react.ReactNode | undefined,   children :(items : std.Array<antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderOption | null>, actions : antd-mobile.antd-mobile/es/components/cascader/cascader.CascaderActions): react.react.ReactNode | undefined,   onTabsChange :(index : number): void | undefined,   activeIcon :react.react.ReactNode | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<never, string>> | undefined,   tabIndex :number | undefined} & std.Pick<antd-mobile.antd-mobile/es/components/popup.PopupProps, 'onClick' | 'destroyOnClose' | 'forceRender' | 'getContainer' | 'afterShow' | 'afterClose' | 'stopPropagation'> & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/cascader/cascader.CascaderActions> */
trait optionsArrayCascaderOptioActiveIcon extends StObject {
  
  var activeIcon: js.UndefOr[Node] = js.undefined
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.undefined
  
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.undefined
  
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Booleanish] = js.undefined
  
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var cancelText: js.UndefOr[Node] = js.undefined
  
  var children: js.UndefOr[
    js.Function2[/* items */ js.Array[CascaderOption | Null], /* actions */ CascaderActions, Node]
  ] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var confirmText: js.UndefOr[Node] = js.undefined
  
  var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
  
  var destroyOnClose: js.UndefOr[Boolean] = js.undefined
  
  var forceRender: js.UndefOr[Boolean] = js.undefined
  
  var getContainer: js.UndefOr[GetContainer] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[
    js.Function2[/* value */ js.Array[String], /* extend */ CascaderValueExtend, Unit]
  ] = js.undefined
  
  var onSelect: js.UndefOr[
    js.Function2[/* value */ js.Array[String], /* extend */ CascaderValueExtend, Unit]
  ] = js.undefined
  
  var onTabsChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var options: js.Array[CascaderOption]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[Ref[CascaderActions]] = js.undefined
  
  var stopPropagation: js.UndefOr[js.Array[PropagationEvent]] = js.undefined
  
  var style: js.UndefOr[CSSProperties & (Partial[Record[scala.Nothing, String]])] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
  
  var value: js.UndefOr[js.Array[String]] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object optionsArrayCascaderOptioActiveIcon {
  
  inline def apply(options: js.Array[CascaderOption]): optionsArrayCascaderOptioActiveIcon = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[optionsArrayCascaderOptioActiveIcon]
  }
  
  extension [Self <: optionsArrayCascaderOptioActiveIcon](x: Self) {
    
    inline def setActiveIcon(value: VdomNode): Self = StObject.set(x, "activeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setActiveIconNull: Self = StObject.set(x, "activeIcon", null)
    
    inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
    
    inline def setActiveIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "activeIcon", js.Array(value*))
    
    inline def setActiveIconVdomElement(value: VdomElement): Self = StObject.set(x, "activeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setAfterShow(value: Callback): Self = StObject.set(x, "afterShow", value.toJsFn)
    
    inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setCancelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
    
    inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildren(value: (/* items */ js.Array[CascaderOption | Null], /* actions */ CascaderActions) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setConfirmText(value: VdomNode): Self = StObject.set(x, "confirmText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setConfirmTextNull: Self = StObject.set(x, "confirmText", null)
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setConfirmTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "confirmText", js.Array(value*))
    
    inline def setConfirmTextVdomElement(value: VdomElement): Self = StObject.set(x, "confirmText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
    
    inline def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
    
    inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
    
    inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
    
    inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerCallbackTo(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
    
    inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnClick(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnConfirm(value: (/* value */ js.Array[String], /* extend */ CascaderValueExtend) => Callback): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2((t0: /* value */ js.Array[String], t1: /* extend */ CascaderValueExtend) => (value(t0, t1)).runNow()))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setOnSelect(value: (/* value */ js.Array[String], /* extend */ CascaderValueExtend) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* value */ js.Array[String], t1: /* extend */ CascaderValueExtend) => (value(t0, t1)).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnTabsChange(value: /* index */ Double => Callback): Self = StObject.set(x, "onTabsChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnTabsChangeUndefined: Self = StObject.set(x, "onTabsChange", js.undefined)
    
    inline def setOptions(value: js.Array[CascaderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: CascaderOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRef(value: Ref[CascaderActions]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: CascaderActions | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: CascaderActions | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStopPropagation(value: js.Array[PropagationEvent]): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    inline def setStopPropagationVarargs(value: PropagationEvent*): Self = StObject.set(x, "stopPropagation", js.Array(value*))
    
    inline def setStyle(value: CSSProperties & (Partial[Record[scala.Nothing, String]])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
