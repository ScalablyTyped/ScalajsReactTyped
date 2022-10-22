package typingsJapgolly.materialChips

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialChips.anon.PartialMDCChipSetAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetMod {
  
  @JSImport("@material/chips/chip-set", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialChips.chipSetFoundationMod.default {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSet")
  @js.native
  open class MDCChipSet protected ()
    extends typingsJapgolly.materialChips.chipSetComponentMod.MDCChipSet {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialChips.chipSetFoundationMod.MDCChipSetFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/chip-set", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialChips.chipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialChips.chipSetComponentMod.MDCChipSet]
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetAttributes")
  @js.native
  object MDCChipSetAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetAttributes & String] = js.native
    
    /* "aria-multiselectable" */ val ARIA_MULTISELECTABLE: typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetAttributes.ARIA_MULTISELECTABLE & String = js.native
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetCssClasses")
  @js.native
  object MDCChipSetCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetCssClasses & String] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP: typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetCssClasses.CHIP & String = js.native
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetEvents")
  @js.native
  object MDCChipSetEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetEvents & String] = js.native
    
    /* "MDCChipSet:interaction" */ val INTERACTION: typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetEvents.INTERACTION & String = js.native
    
    /* "MDCChipSet:removal" */ val REMOVAL: typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetEvents.REMOVAL & String = js.native
    
    /* "MDCChipSet:selection" */ val SELECTION: typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetEvents.SELECTION & String = js.native
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation ()
    extends typingsJapgolly.materialChips.chipSetFoundationMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
}
