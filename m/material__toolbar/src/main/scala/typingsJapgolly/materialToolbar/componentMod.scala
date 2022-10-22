package typingsJapgolly.materialToolbar

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialToolbar.foundationMod.MDCToolbarFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/toolbar/component", "MDCToolbar")
  @js.native
  open class MDCToolbar protected () extends MDCComponent[MDCToolbarFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCToolbarFoundation, args: Any*) = this()
    
    var fixedAdjustElement: HTMLElement | Null = js.native
    
    def initialize(): Unit = js.native
    
    /* protected */ var root_ : HTMLElement = js.native
  }
  /* static members */
  object MDCToolbar {
    
    @JSImport("@material/toolbar/component", "MDCToolbar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCToolbar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCToolbar]
  }
}
