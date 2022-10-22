package typingsJapgolly.a11yDialog

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog
import typingsJapgolly.a11yDialog.mod.A11yDialog.Targets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("a11y-dialog", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with A11yDialog {
    def this(node: Element) = this()
    def this(node: Element, targets: Targets) = this()
  }
  
  object A11yDialog {
    
    @js.native
    trait A11yDialog extends StObject {
      
      /* private */ def _bindKeypress(event: Event): Unit = js.native
      
      /* private */ def _fire(`type`: EventType, event: Event): Unit = js.native
      
      /* private */ def _maintainFocus(event: Event): Unit = js.native
      
      def create(targets: Targets): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def destroy(): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def hide(): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      def hide(event: Event): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def off(`type`: EventType, handler: EventHandler): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def on(`type`: EventType, handler: EventHandler): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def show(): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      def show(event: Event): typingsJapgolly.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      var shown: Boolean = js.native
    }
    
    type EventHandler = js.Function2[/* node */ Element, /* event */ js.UndefOr[Event], Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.a11yDialog.a11yDialogStrings.show
      - typingsJapgolly.a11yDialog.a11yDialogStrings.hide
      - typingsJapgolly.a11yDialog.a11yDialogStrings.destroy
      - typingsJapgolly.a11yDialog.a11yDialogStrings.create
    */
    trait EventType extends StObject
    object EventType {
      
      inline def create: typingsJapgolly.a11yDialog.a11yDialogStrings.create = "create".asInstanceOf[typingsJapgolly.a11yDialog.a11yDialogStrings.create]
      
      inline def destroy: typingsJapgolly.a11yDialog.a11yDialogStrings.destroy = "destroy".asInstanceOf[typingsJapgolly.a11yDialog.a11yDialogStrings.destroy]
      
      inline def hide: typingsJapgolly.a11yDialog.a11yDialogStrings.hide = "hide".asInstanceOf[typingsJapgolly.a11yDialog.a11yDialogStrings.hide]
      
      inline def show: typingsJapgolly.a11yDialog.a11yDialogStrings.show = "show".asInstanceOf[typingsJapgolly.a11yDialog.a11yDialogStrings.show]
    }
    
    type Targets = NodeList[Node] | Element | String
  }
}
