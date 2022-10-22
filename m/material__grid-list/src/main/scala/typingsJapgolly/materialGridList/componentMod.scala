package typingsJapgolly.materialGridList

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialGridList.foundationMod.MDCGridListFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/grid-list/component", "MDCGridList")
  @js.native
  open class MDCGridList protected () extends MDCComponent[MDCGridListFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCGridListFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCGridList {
    
    @JSImport("@material/grid-list/component", "MDCGridList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCGridList = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCGridList]
  }
}
