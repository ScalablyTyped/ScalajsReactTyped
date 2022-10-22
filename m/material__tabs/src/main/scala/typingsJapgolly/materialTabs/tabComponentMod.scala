package typingsJapgolly.materialTabs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialTabs.tabFoundationMod.MDCTabFoundation
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabComponentMod {
  
  @JSImport("@material/tabs/tab/component", "MDCTab")
  @js.native
  open class MDCTab protected () extends MDCComponent[MDCTabFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTabFoundation, args: Any*) = this()
    
    val computedLeft: Double = js.native
    
    val computedWidth: Double = js.native
    
    var isActive: Boolean = js.native
    
    def measureSelf(): Unit = js.native
    
    var preventDefaultOnClick: Boolean = js.native
    
    /* protected */ var root_ : HTMLElement = js.native
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tabs/tab/component", "MDCTab")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCTab = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTab]
  }
  
  type MDCTabFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCTabFoundation], 
    MDCTab
  ]
  
  @js.native
  trait MDCTabSelectedEvent
    extends StObject
       with Event {
    
    val detail: MDCTabSelectedEventDetail = js.native
  }
  
  trait MDCTabSelectedEventDetail extends StObject {
    
    var tab: MDCTab
  }
  object MDCTabSelectedEventDetail {
    
    inline def apply(tab: MDCTab): MDCTabSelectedEventDetail = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabSelectedEventDetail]
    }
    
    extension [Self <: MDCTabSelectedEventDetail](x: Self) {
      
      inline def setTab(value: MDCTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
}
