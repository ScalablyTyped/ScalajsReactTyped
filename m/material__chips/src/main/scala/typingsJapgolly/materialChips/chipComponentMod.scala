package typingsJapgolly.materialChips

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialChips.actionComponentMod.MDCChipActionFactory
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType
import typingsJapgolly.materialChips.chipConstantsMod.MDCChipAnimation
import typingsJapgolly.materialChips.chipFoundationMod.MDCChipFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipComponentMod {
  
  @JSImport("@material/chips/chip/component", "MDCChip")
  @js.native
  open class MDCChip protected () extends MDCComponent[MDCChipFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCChipFoundation, args: Any*) = this()
    
    /* private */ var actions: Any = js.native
    
    /** Returns the MDCChipActionTypes for the encapsulated actions. */
    def getActions(): js.Array[MDCChipActionType] = js.native
    
    /** Returns the ID of the root element. */
    def getElementID(): String = js.native
    
    /* private */ var handleActionInteraction: Any = js.native
    
    /* private */ var handleActionNavigation: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(actionFactory: MDCChipActionFactory): Unit = js.native
    
    /** Returns the focusability of the action. */
    def isActionFocusable(action: MDCChipActionType): Boolean = js.native
    
    /** Returns the selectability of the action. */
    def isActionSelectable(action: MDCChipActionType): Boolean = js.native
    
    /** Returns the selected state of the action. */
    def isActionSelected(action: MDCChipActionType): Boolean = js.native
    
    def isDisabled(): Boolean = js.native
    
    /** Exposed to be called by the parent chip set. */
    def remove(): Unit = js.native
    
    /* private */ val rootHTML: Any = js.native
    
    /** Sets the focus behavior of the action. */
    def setActionFocus(action: MDCChipActionType, focus: MDCChipActionFocusBehavior): Unit = js.native
    
    /** Sets the selected state of the action. */
    def setActionSelected(action: MDCChipActionType, isSelected: Boolean): Unit = js.native
    
    def setDisabled(isDisabled: Boolean): Unit = js.native
    
    /** Starts the animation on the chip. */
    def startAnimation(animation: MDCChipAnimation): Unit = js.native
  }
  /* static members */
  object MDCChip {
    
    @JSImport("@material/chips/chip/component", "MDCChip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChip]
  }
  
  type MDCChipFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCChipFoundation], 
    MDCChip
  ]
}
