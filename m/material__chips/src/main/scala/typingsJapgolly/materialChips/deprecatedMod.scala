package typingsJapgolly.materialChips

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialChips.anon.PartialMDCChipAdapterAddClass
import typingsJapgolly.materialChips.anon.PartialMDCChipSetAdapterAnnounceMessage
import typingsJapgolly.materialChips.anon.PartialMDCChipTrailingAct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("@material/chips/deprecated", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialChips.deprecatedChipSetMod.default {
    def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
  }
  
  @JSImport("@material/chips/deprecated", "MDCChip")
  @js.native
  open class MDCChip protected ()
    extends typingsJapgolly.materialChips.deprecatedChipMod.MDCChip {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialChips.deprecatedChipFoundationMod.MDCChipFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChip {
    
    @JSImport("@material/chips/deprecated", "MDCChip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.deprecatedChipComponentMod.MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.deprecatedChipComponentMod.MDCChip]
  }
  
  @JSImport("@material/chips/deprecated", "MDCChipFoundation")
  @js.native
  open class MDCChipFoundation ()
    extends typingsJapgolly.materialChips.deprecatedChipMod.MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapterAddClass) = this()
  }
  
  @JSImport("@material/chips/deprecated", "MDCChipSet")
  @js.native
  open class MDCChipSet protected ()
    extends typingsJapgolly.materialChips.deprecatedChipSetMod.MDCChipSet {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialChips.deprecatedChipSetFoundationMod.MDCChipSetFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/deprecated", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.deprecatedChipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.deprecatedChipSetComponentMod.MDCChipSet]
  }
  
  @JSImport("@material/chips/deprecated", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation ()
    extends typingsJapgolly.materialChips.deprecatedChipSetMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
  }
  
  @JSImport("@material/chips/deprecated", "MDCChipTrailingAction")
  @js.native
  open class MDCChipTrailingAction protected ()
    extends typingsJapgolly.materialChips.deprecatedTrailingactionMod.MDCChipTrailingAction {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialChips.deprecatedTrailingactionFoundationMod.MDCChipTrailingActionFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips/deprecated", "MDCChipTrailingAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction]
  }
  
  @JSImport("@material/chips/deprecated", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation ()
    extends typingsJapgolly.materialChips.deprecatedTrailingactionMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  object chipCssClasses {
    
    @JSImport("@material/chips/deprecated", "chipCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.CHECKMARK")
    @js.native
    def CHECKMARK: String = js.native
    inline def CHECKMARK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.CHIP_EXIT")
    @js.native
    def CHIP_EXIT: String = js.native
    inline def CHIP_EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_EXIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.DELETABLE")
    @js.native
    def DELETABLE: String = js.native
    inline def DELETABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.EDITABLE")
    @js.native
    def EDITABLE: String = js.native
    inline def EDITABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.EDITING")
    @js.native
    def EDITING: String = js.native
    inline def EDITING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.HIDDEN_LEADING_ICON")
    @js.native
    def HIDDEN_LEADING_ICON: String = js.native
    inline def HIDDEN_LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN_LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.LEADING_ICON")
    @js.native
    def LEADING_ICON: String = js.native
    inline def LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.PRIMARY_ACTION")
    @js.native
    def PRIMARY_ACTION: String = js.native
    inline def PRIMARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.PRIMARY_ACTION_FOCUSED")
    @js.native
    def PRIMARY_ACTION_FOCUSED: String = js.native
    inline def PRIMARY_ACTION_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.SELECTED")
    @js.native
    def SELECTED: String = js.native
    inline def SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.TEXT")
    @js.native
    def TEXT: String = js.native
    inline def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.TRAILING_ACTION")
    @js.native
    def TRAILING_ACTION: String = js.native
    inline def TRAILING_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipCssClasses.TRAILING_ICON")
    @js.native
    def TRAILING_ICON: String = js.native
    inline def TRAILING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON")(x.asInstanceOf[js.Any])
  }
  
  object chipSetCssClasses {
    
    @JSImport("@material/chips/deprecated", "chipSetCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated", "chipSetCssClasses.CHOICE")
    @js.native
    def CHOICE: String = js.native
    inline def CHOICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipSetCssClasses.FILTER")
    @js.native
    def FILTER: String = js.native
    inline def FILTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER")(x.asInstanceOf[js.Any])
  }
  
  object chipSetStrings {
    
    @JSImport("@material/chips/deprecated", "chipSetStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated", "chipSetStrings.CHIP_SELECTOR")
    @js.native
    def CHIP_SELECTOR: String = js.native
    inline def CHIP_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object chipStrings {
    
    @JSImport("@material/chips/deprecated", "chipStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated", "chipStrings.ADDED_ANNOUNCEMENT_ATTRIBUTE")
    @js.native
    def ADDED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    inline def ADDED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ARIA_CHECKED")
    @js.native
    def ARIA_CHECKED: String = js.native
    inline def ARIA_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ARROW_DOWN_KEY")
    @js.native
    def ARROW_DOWN_KEY: String = js.native
    inline def ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ARROW_LEFT_KEY")
    @js.native
    def ARROW_LEFT_KEY: String = js.native
    inline def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ARROW_RIGHT_KEY")
    @js.native
    def ARROW_RIGHT_KEY: String = js.native
    inline def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ARROW_UP_KEY")
    @js.native
    def ARROW_UP_KEY: String = js.native
    inline def ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.BACKSPACE_KEY")
    @js.native
    def BACKSPACE_KEY: String = js.native
    inline def BACKSPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.CHECKMARK_SELECTOR")
    @js.native
    def CHECKMARK_SELECTOR: String = js.native
    inline def CHECKMARK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.DELETE_KEY")
    @js.native
    def DELETE_KEY: String = js.native
    inline def DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.END_KEY")
    @js.native
    def END_KEY: String = js.native
    inline def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ENTER_KEY")
    @js.native
    def ENTER_KEY: String = js.native
    inline def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.ENTRY_ANIMATION_NAME")
    @js.native
    def ENTRY_ANIMATION_NAME: String = js.native
    inline def ENTRY_ANIMATION_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRY_ANIMATION_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.HOME_KEY")
    @js.native
    def HOME_KEY: String = js.native
    inline def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.IE_ARROW_DOWN_KEY")
    @js.native
    def IE_ARROW_DOWN_KEY: String = js.native
    inline def IE_ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.IE_ARROW_LEFT_KEY")
    @js.native
    def IE_ARROW_LEFT_KEY: String = js.native
    inline def IE_ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.IE_ARROW_RIGHT_KEY")
    @js.native
    def IE_ARROW_RIGHT_KEY: String = js.native
    inline def IE_ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.IE_ARROW_UP_KEY")
    @js.native
    def IE_ARROW_UP_KEY: String = js.native
    inline def IE_ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_UP_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.IE_DELETE_KEY")
    @js.native
    def IE_DELETE_KEY: String = js.native
    inline def IE_DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_DELETE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.LEADING_ICON_SELECTOR")
    @js.native
    def LEADING_ICON_SELECTOR: String = js.native
    inline def LEADING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.PRIMARY_ACTION_SELECTOR")
    @js.native
    def PRIMARY_ACTION_SELECTOR: String = js.native
    inline def PRIMARY_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.REMOVAL_EVENT")
    @js.native
    def REMOVAL_EVENT: String = js.native
    inline def REMOVAL_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVAL_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.REMOVED_ANNOUNCEMENT_ATTRIBUTE")
    @js.native
    def REMOVED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    inline def REMOVED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.SELECTION_EVENT")
    @js.native
    def SELECTION_EVENT: String = js.native
    inline def SELECTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.SPACEBAR_KEY")
    @js.native
    def SPACEBAR_KEY: String = js.native
    inline def SPACEBAR_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACEBAR_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.TRAILING_ACTION_SELECTOR")
    @js.native
    def TRAILING_ACTION_SELECTOR: String = js.native
    inline def TRAILING_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.TRAILING_ICON_INTERACTION_EVENT")
    @js.native
    def TRAILING_ICON_INTERACTION_EVENT: String = js.native
    inline def TRAILING_ICON_INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "chipStrings.TRAILING_ICON_SELECTOR")
    @js.native
    def TRAILING_ICON_SELECTOR: String = js.native
    inline def TRAILING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object trailingActionStrings {
    
    @JSImport("@material/chips/deprecated", "trailingActionStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated", "trailingActionStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "trailingActionStrings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "trailingActionStrings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated", "trailingActionStrings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
  }
}
