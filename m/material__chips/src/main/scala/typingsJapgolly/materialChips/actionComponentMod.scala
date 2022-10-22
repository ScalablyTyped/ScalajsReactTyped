package typingsJapgolly.materialChips

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType
import typingsJapgolly.materialChips.actionFoundationMod.MDCChipActionFoundation
import typingsJapgolly.materialRipple.componentMod.MDCRipple
import typingsJapgolly.materialRipple.componentMod.MDCRippleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/chips/action/component", "MDCChipAction")
  @js.native
  open class MDCChipAction protected () extends MDCComponent[MDCChipActionFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCChipActionFoundation, args: Any*) = this()
    
    def actionType(): MDCChipActionType = js.native
    
    /* private */ var computeRippleClientRect: Any = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    def isDisabled(): Boolean = js.native
    
    def isFocusable(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    def ripple: MDCRipple = js.native
    
    /* private */ var rippleInstance: Any = js.native
    
    /* private */ val rootHTML: Any = js.native
    
    def setDisabled(isDisabled: Boolean): Unit = js.native
    
    def setFocus(behavior: MDCChipActionFocusBehavior): Unit = js.native
    
    def setSelected(isSelected: Boolean): Unit = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCChipAction {
    
    @JSImport("@material/chips/action/component", "MDCChipAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCChipAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChipAction]
  }
  
  type MDCChipActionFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCChipActionFoundation], 
    MDCChipAction
  ]
}
