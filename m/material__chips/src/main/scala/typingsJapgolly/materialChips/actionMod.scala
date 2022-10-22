package typingsJapgolly.materialChips

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialChips.anon.PartialMDCChipActionAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("@material/chips/action", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialChips.actionTrailingFoundationMod.default {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipAction")
  @js.native
  open class MDCChipAction protected ()
    extends typingsJapgolly.materialChips.actionComponentMod.MDCChipAction {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialChips.actionFoundationMod.MDCChipActionFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipAction {
    
    @JSImport("@material/chips/action", "MDCChipAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.actionComponentMod.MDCChipAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.actionComponentMod.MDCChipAction]
  }
  
  @JSImport("@material/chips/action", "MDCChipActionAttributes")
  @js.native
  object MDCChipActionAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes & String
      ] = js.native
    
    /* "aria-disabled" */ val ARIA_DISABLED: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_DISABLED & String = js.native
    
    /* "aria-hidden" */ val ARIA_HIDDEN: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_HIDDEN & String = js.native
    
    /* "aria-selected" */ val ARIA_SELECTED: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_SELECTED & String = js.native
    
    /* "data-mdc-deletable" */ val DATA_DELETABLE: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.DATA_DELETABLE & String = js.native
    
    /* "disabled" */ val DISABLED: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.DISABLED & String = js.native
    
    /* "role" */ val ROLE: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.ROLE & String = js.native
    
    /* "tabindex" */ val TAB_INDEX: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes.TAB_INDEX & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionCssClasses")
  @js.native
  object MDCChipActionCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionCssClasses & String
      ] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP_ROOT: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionCssClasses.CHIP_ROOT & String = js.native
    
    /* "mdc-evolution-chip__action--primary" */ val PRIMARY_ACTION: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionCssClasses.PRIMARY_ACTION & String = js.native
    
    /* "mdc-evolution-chip__action--trailing" */ val TRAILING_ACTION: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionCssClasses.TRAILING_ACTION & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionEvents")
  @js.native
  object MDCChipActionEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionEvents & String] = js.native
    
    /* "MDCChipAction:interaction" */ val INTERACTION: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionEvents.INTERACTION & String = js.native
    
    /* "MDCChipAction:navigation" */ val NAVIGATION: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionEvents.NAVIGATION & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionFocusBehavior")
  @js.native
  object MDCChipActionFocusBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior & Double
      ] = js.native
    
    /* 0 */ val FOCUSABLE: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE & Double = js.native
    
    /* 1 */ val FOCUSABLE_AND_FOCUSED: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE_AND_FOCUSED & Double = js.native
    
    /* 2 */ val NOT_FOCUSABLE: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.NOT_FOCUSABLE & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@material/chips/action", "MDCChipActionFoundation")
  @js.native
  open class MDCChipActionFoundation ()
    extends typingsJapgolly.materialChips.actionFoundationMod.MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipActionInteractionTrigger")
  @js.native
  object MDCChipActionInteractionTrigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger & Double
      ] = js.native
    
    /* 2 */ val BACKSPACE_KEY: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.BACKSPACE_KEY & Double = js.native
    
    /* 1 */ val CLICK: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.CLICK & Double = js.native
    
    /* 3 */ val DELETE_KEY: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.DELETE_KEY & Double = js.native
    
    /* 5 */ val ENTER_KEY: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.ENTER_KEY & Double = js.native
    
    /* 4 */ val SPACEBAR_KEY: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.SPACEBAR_KEY & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionType")
  @js.native
  object MDCChipActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType & Double] = js.native
    
    /* 1 */ val PRIMARY: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType.PRIMARY & Double = js.native
    
    /* 2 */ val TRAILING: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType.TRAILING & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipPrimaryActionFoundation")
  @js.native
  open class MDCChipPrimaryActionFoundation ()
    extends typingsJapgolly.materialChips.actionPrimaryFoundationMod.MDCChipPrimaryActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation ()
    extends typingsJapgolly.materialChips.actionTrailingFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
}
