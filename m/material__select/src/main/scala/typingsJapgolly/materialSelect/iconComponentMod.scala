package typingsJapgolly.materialSelect

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconComponentMod {
  
  @JSImport("@material/select/icon/component", "MDCSelectIcon")
  @js.native
  open class MDCSelectIcon protected () extends MDCComponent[MDCSelectIconFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCSelectIconFoundation, args: Any*) = this()
    
    def foundationForSelect: MDCSelectIconFoundation = js.native
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("@material/select/icon/component", "MDCSelectIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCSelectIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSelectIcon]
  }
  
  type MDCSelectIconFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCSelectIconFoundation], 
    MDCSelectIcon
  ]
}
