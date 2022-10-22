package typingsJapgolly.materialNotchedOutline

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/notched-outline/component", "MDCNotchedOutline")
  @js.native
  open class MDCNotchedOutline protected () extends MDCComponent[MDCNotchedOutlineFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCNotchedOutlineFoundation, args: Any*) = this()
    
    /**
      * Updates classes and styles to close the notch.
      */
    def closeNotch(): Unit = js.native
    
    /**
      * Updates classes and styles to open the notch to the specified width.
      * @param notchWidth The notch width in the outline.
      */
    def notch(notchWidth: Double): Unit = js.native
    
    /* private */ var notchElement: Any = js.native
  }
  /* static members */
  object MDCNotchedOutline {
    
    @JSImport("@material/notched-outline/component", "MDCNotchedOutline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCNotchedOutline = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCNotchedOutline]
  }
  
  type MDCNotchedOutlineFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCNotchedOutlineFoundation], 
    MDCNotchedOutline
  ]
}
