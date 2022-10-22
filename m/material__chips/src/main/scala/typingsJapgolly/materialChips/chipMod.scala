package typingsJapgolly.materialChips

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialChips.anon.PartialMDCChipAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod {
  
  @JSImport("@material/chips/chip", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialChips.chipFoundationMod.default {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  
  @JSImport("@material/chips/chip", "MDCChip")
  @js.native
  open class MDCChip protected ()
    extends typingsJapgolly.materialChips.chipComponentMod.MDCChip {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialChips.chipFoundationMod.MDCChipFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChip {
    
    @JSImport("@material/chips/chip", "MDCChip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.chipComponentMod.MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.chipComponentMod.MDCChip]
  }
  
  @JSImport("@material/chips/chip", "MDCChipAnimation")
  @js.native
  object MDCChipAnimation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipConstantsMod.MDCChipAnimation & String] = js.native
    
    /* "mdc-evolution-chip-enter" */ val ENTER: typingsJapgolly.materialChips.chipConstantsMod.MDCChipAnimation.ENTER & String = js.native
    
    /* "mdc-evolution-chip-exit" */ val EXIT: typingsJapgolly.materialChips.chipConstantsMod.MDCChipAnimation.EXIT & String = js.native
  }
  
  @JSImport("@material/chips/chip", "MDCChipAttributes")
  @js.native
  object MDCChipAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipConstantsMod.MDCChipAttributes & String] = js.native
    
    /* "data-mdc-added-announcement" */ val DATA_ADDED_ANNOUNCEMENT: typingsJapgolly.materialChips.chipConstantsMod.MDCChipAttributes.DATA_ADDED_ANNOUNCEMENT & String = js.native
    
    /* "data-mdc-removed-announcement" */ val DATA_REMOVED_ANNOUNCEMENT: typingsJapgolly.materialChips.chipConstantsMod.MDCChipAttributes.DATA_REMOVED_ANNOUNCEMENT & String = js.native
  }
  
  @JSImport("@material/chips/chip", "MDCChipCssClasses")
  @js.native
  object MDCChipCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses & String] = js.native
    
    /* "mdc-evolution-chip--deselecting" */ val DESELECTING: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.DESELECTING & String = js.native
    
    /* "mdc-evolution-chip--deselecting-with-primary-icon" */ val DESELECTING_WITH_PRIMARY_ICON: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.DESELECTING_WITH_PRIMARY_ICON & String = js.native
    
    /* "mdc-evolution-chip--disabled" */ val DISABLED: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.DISABLED & String = js.native
    
    /* "mdc-evolution-chip--enter" */ val ENTER: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.ENTER & String = js.native
    
    /* "mdc-evolution-chip--exit" */ val EXIT: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.EXIT & String = js.native
    
    /* "mdc-evolution-chip--hidden" */ val HIDDEN: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.HIDDEN & String = js.native
    
    /* "mdc-evolution-chip--selected" */ val SELECTED: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTED & String = js.native
    
    /* "mdc-evolution-chip--selecting" */ val SELECTING: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTING & String = js.native
    
    /* "mdc-evolution-chip--selecting-with-primary-icon" */ val SELECTING_WITH_PRIMARY_ICON: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTING_WITH_PRIMARY_ICON & String = js.native
    
    /* "mdc-evolution-chip--with-primary-icon" */ val WITH_PRIMARY_ICON: typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses.WITH_PRIMARY_ICON & String = js.native
  }
  
  @JSImport("@material/chips/chip", "MDCChipEvents")
  @js.native
  object MDCChipEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipConstantsMod.MDCChipEvents & String] = js.native
    
    /* "MDCChip:animation" */ val ANIMATION: typingsJapgolly.materialChips.chipConstantsMod.MDCChipEvents.ANIMATION & String = js.native
    
    /* "MDCChip:interaction" */ val INTERACTION: typingsJapgolly.materialChips.chipConstantsMod.MDCChipEvents.INTERACTION & String = js.native
    
    /* "MDCChip:navigation" */ val NAVIGATION: typingsJapgolly.materialChips.chipConstantsMod.MDCChipEvents.NAVIGATION & String = js.native
  }
  
  @JSImport("@material/chips/chip", "MDCChipFoundation")
  @js.native
  open class MDCChipFoundation ()
    extends typingsJapgolly.materialChips.chipFoundationMod.MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
}
