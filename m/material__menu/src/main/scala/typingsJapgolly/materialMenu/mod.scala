package typingsJapgolly.materialMenu

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialMenu.anon.PartialMDCMenuAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/menu", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialMenu.foundationMod.default {
    def this(adapter: PartialMDCMenuAdapter) = this()
  }
  
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @JSImport("@material/menu", "Corner")
  @js.native
  object Corner extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.materialMenuSurface.constantsMod.Corner & Double] = js.native
    
    /* 13 */ val BOTTOM_END: typingsJapgolly.materialMenuSurface.constantsMod.Corner.BOTTOM_END & Double = js.native
    
    /* 1 */ val BOTTOM_LEFT: typingsJapgolly.materialMenuSurface.constantsMod.Corner.BOTTOM_LEFT & Double = js.native
    
    /* 5 */ val BOTTOM_RIGHT: typingsJapgolly.materialMenuSurface.constantsMod.Corner.BOTTOM_RIGHT & Double = js.native
    
    /* 9 */ val BOTTOM_START: typingsJapgolly.materialMenuSurface.constantsMod.Corner.BOTTOM_START & Double = js.native
    
    /* 12 */ val TOP_END: typingsJapgolly.materialMenuSurface.constantsMod.Corner.TOP_END & Double = js.native
    
    /* 0 */ val TOP_LEFT: typingsJapgolly.materialMenuSurface.constantsMod.Corner.TOP_LEFT & Double = js.native
    
    /* 4 */ val TOP_RIGHT: typingsJapgolly.materialMenuSurface.constantsMod.Corner.TOP_RIGHT & Double = js.native
    
    /* 8 */ val TOP_START: typingsJapgolly.materialMenuSurface.constantsMod.Corner.TOP_START & Double = js.native
  }
  
  @JSImport("@material/menu", "DefaultFocusState")
  @js.native
  object DefaultFocusState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.materialMenu.constantsMod.DefaultFocusState & Double] = js.native
    
    /* 2 */ val FIRST_ITEM: typingsJapgolly.materialMenu.constantsMod.DefaultFocusState.FIRST_ITEM & Double = js.native
    
    /* 3 */ val LAST_ITEM: typingsJapgolly.materialMenu.constantsMod.DefaultFocusState.LAST_ITEM & Double = js.native
    
    /* 1 */ val LIST_ROOT: typingsJapgolly.materialMenu.constantsMod.DefaultFocusState.LIST_ROOT & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.materialMenu.constantsMod.DefaultFocusState.NONE & Double = js.native
  }
  
  @JSImport("@material/menu", "MDCMenu")
  @js.native
  open class MDCMenu protected ()
    extends typingsJapgolly.materialMenu.componentMod.MDCMenu {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialMenu.foundationMod.MDCMenuFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCMenu {
    
    @JSImport("@material/menu", "MDCMenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialMenu.componentMod.MDCMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialMenu.componentMod.MDCMenu]
  }
  
  @JSImport("@material/menu", "MDCMenuFoundation")
  @js.native
  open class MDCMenuFoundation ()
    extends typingsJapgolly.materialMenu.foundationMod.MDCMenuFoundation {
    def this(adapter: PartialMDCMenuAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/menu", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu", "cssClasses.MENU_SELECTED_LIST_ITEM")
    @js.native
    def MENU_SELECTED_LIST_ITEM: String = js.native
    inline def MENU_SELECTED_LIST_ITEM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTED_LIST_ITEM")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "cssClasses.MENU_SELECTION_GROUP")
    @js.native
    def MENU_SELECTION_GROUP: String = js.native
    inline def MENU_SELECTION_GROUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTION_GROUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/menu", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu", "numbers.FOCUS_ROOT_INDEX")
    @js.native
    def FOCUS_ROOT_INDEX: Double = js.native
    inline def FOCUS_ROOT_INDEX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_ROOT_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/menu", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu", "strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    inline def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.ARIA_DISABLED_ATTR")
    @js.native
    def ARIA_DISABLED_ATTR: String = js.native
    inline def ARIA_DISABLED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.CHECKBOX_SELECTOR")
    @js.native
    def CHECKBOX_SELECTOR: String = js.native
    inline def CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.LIST_SELECTOR")
    @js.native
    def LIST_SELECTOR: String = js.native
    inline def LIST_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    inline def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.SKIP_RESTORE_FOCUS")
    @js.native
    def SKIP_RESTORE_FOCUS: String = js.native
    inline def SKIP_RESTORE_FOCUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP_RESTORE_FOCUS")(x.asInstanceOf[js.Any])
  }
}
