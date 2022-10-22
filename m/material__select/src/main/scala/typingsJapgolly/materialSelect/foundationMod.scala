package typingsJapgolly.materialSelect

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialSelect.adapterMod.MDCSelectAdapter
import typingsJapgolly.materialSelect.anon.PartialMDCSelectAdapter
import typingsJapgolly.materialSelect.anon.PartialMDCSelectFoundatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/select/foundation", JSImport.Default)
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  open class default () extends MDCSelectFoundation {
    def this(adapter: PartialMDCSelectAdapter) = this()
    def this(adapter: Unit, foundationMap: PartialMDCSelectFoundatio) = this()
    def this(adapter: PartialMDCSelectAdapter, foundationMap: PartialMDCSelectFoundatio) = this()
  }
  
  @JSImport("@material/select/foundation", "MDCSelectFoundation")
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  open class MDCSelectFoundation () extends MDCFoundation[MDCSelectAdapter] {
    def this(adapter: PartialMDCSelectAdapter) = this()
    def this(adapter: Unit, foundationMap: PartialMDCSelectFoundatio) = this()
    def this(adapter: PartialMDCSelectAdapter, foundationMap: PartialMDCSelectFoundatio) = this()
    
    /**
      * Unfocuses the select component.
      */
    /* private */ var blur: Any = js.native
    
    /* private */ var clickDebounceTimeout: Any = js.native
    
    /* private */ var customValidity: Any = js.native
    
    /* private */ var disabled: Any = js.native
    
    def getDisabled(): Boolean = js.native
    
    def getRequired(): Boolean = js.native
    
    /** Returns the index of the currently selected menu item, or -1 if none. */
    def getSelectedIndex(): Double = js.native
    
    def getUseDefaultValidation(): Boolean = js.native
    
    def getValue(): String = js.native
    
    /**
      * Handles blur events from select element.
      */
    def handleBlur(): Unit = js.native
    
    /**
      * Handles value changes, via change event or programmatic updates.
      */
    def handleChange(): Unit = js.native
    
    def handleClick(normalizedX: Double): Unit = js.native
    
    /**
      * Handles focus events from select element.
      */
    def handleFocus(): Unit = js.native
    
    /**
      * Handles keydown events on select element. Depending on the type of
      * character typed, does typeahead matching or opens menu.
      */
    def handleKeydown(event: KeyboardEvent): Unit = js.native
    
    def handleMenuClosed(): Unit = js.native
    
    def handleMenuClosing(): Unit = js.native
    
    def handleMenuItemAction(index: Double): Unit = js.native
    
    def handleMenuOpened(): Unit = js.native
    
    /* private */ val helperText: Any = js.native
    
    /* private */ var isMenuOpen: Any = js.native
    
    def isValid(): Boolean = js.native
    
    /* private */ var lastSelectedIndex: Any = js.native
    
    /**
      * Re-calculates if the notched outline should be notched and if the label
      * should float.
      */
    def layout(): Unit = js.native
    
    /**
      * Synchronizes the list of options with the state of the foundation. Call
      * this whenever menu options are dynamically updated.
      */
    def layoutOptions(): Unit = js.native
    
    /* private */ val leadingIcon: Any = js.native
    
    /**
      * Opens/closes the notched outline.
      */
    def notchOutline(openNotch: Boolean): Unit = js.native
    
    /** Opens the menu. */
    def openMenu(): Unit = js.native
    
    /* private */ var recentlyClicked: Any = js.native
    
    /* private */ var setClickDebounceTimeout: Any = js.native
    
    def setDisabled(isDisabled: Boolean): Unit = js.native
    
    /**
      * @param content Sets the content of the helper text.
      */
    def setHelperTextContent(content: String): Unit = js.native
    
    /**
      * Sets the aria label of the leading icon.
      */
    def setLeadingIconAriaLabel(label: String): Unit = js.native
    
    /**
      * Sets the text content of the leading icon.
      */
    def setLeadingIconContent(content: String): Unit = js.native
    
    def setRequired(isRequired: Boolean): Unit = js.native
    
    def setSelectedIndex(index: Double): Unit = js.native
    def setSelectedIndex(index: Double, closeMenu: Boolean): Unit = js.native
    def setSelectedIndex(index: Double, closeMenu: Boolean, skipNotify: Boolean): Unit = js.native
    def setSelectedIndex(index: Double, closeMenu: Unit, skipNotify: Boolean): Unit = js.native
    
    def setUseDefaultValidation(useDefaultValidation: Boolean): Unit = js.native
    
    def setValid(isValid: Boolean): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: String, skipNotify: Boolean): Unit = js.native
    
    /* private */ var syncHelperTextValidity: Any = js.native
    
    /* private */ var useDefaultValidation: Any = js.native
  }
}
