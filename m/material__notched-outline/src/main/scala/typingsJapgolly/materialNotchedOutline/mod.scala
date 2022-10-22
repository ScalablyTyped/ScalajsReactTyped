package typingsJapgolly.materialNotchedOutline

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialNotchedOutline.anon.PartialMDCNotchedOutlineA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/notched-outline", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialNotchedOutline.foundationMod.default {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  
  @JSImport("@material/notched-outline", "MDCNotchedOutline")
  @js.native
  open class MDCNotchedOutline protected ()
    extends typingsJapgolly.materialNotchedOutline.componentMod.MDCNotchedOutline {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCNotchedOutline {
    
    @JSImport("@material/notched-outline", "MDCNotchedOutline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialNotchedOutline.componentMod.MDCNotchedOutline = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialNotchedOutline.componentMod.MDCNotchedOutline]
  }
  
  @JSImport("@material/notched-outline", "MDCNotchedOutlineFoundation")
  @js.native
  open class MDCNotchedOutlineFoundation ()
    extends typingsJapgolly.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/notched-outline", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/notched-outline", "cssClasses.NO_LABEL")
    @js.native
    def NO_LABEL: String = js.native
    inline def NO_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/notched-outline", "cssClasses.OUTLINE_NOTCHED")
    @js.native
    def OUTLINE_NOTCHED: String = js.native
    inline def OUTLINE_NOTCHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_NOTCHED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/notched-outline", "cssClasses.OUTLINE_UPGRADED")
    @js.native
    def OUTLINE_UPGRADED: String = js.native
    inline def OUTLINE_UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/notched-outline", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/notched-outline", "numbers.NOTCH_ELEMENT_PADDING")
    @js.native
    def NOTCH_ELEMENT_PADDING: Double = js.native
    inline def NOTCH_ELEMENT_PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTCH_ELEMENT_PADDING")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/notched-outline", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/notched-outline", "strings.NOTCH_ELEMENT_SELECTOR")
    @js.native
    def NOTCH_ELEMENT_SELECTOR: String = js.native
    inline def NOTCH_ELEMENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTCH_ELEMENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
