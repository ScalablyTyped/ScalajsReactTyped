package typingsJapgolly.winrt.global.Windows.UI

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.UI.Popups.IUICommand
import typingsJapgolly.winrt.Windows.UI.Popups.MessageDialogOptions
import typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popups {
  
  @JSGlobal("Windows.UI.Popups.MessageDialog")
  @js.native
  open class MessageDialog protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Popups.MessageDialog {
    def this(content: String) = this()
    def this(content: String, title: String) = this()
    
    /* CompleteClass */
    var cancelCommandIndex: Double = js.native
    
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /* CompleteClass */
    var content: String = js.native
    
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /* CompleteClass */
    var options: MessageDialogOptions = js.native
    
    /* CompleteClass */
    override def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Popups.MessageDialogOptions & Double] = js.native
    
    /* 1 */ val acceptUserInputAfterDelay: typingsJapgolly.winrt.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Popups.MessageDialogOptions.none & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Popups.Placement & Double] = js.native
    
    /* 0 */ val default: typingsJapgolly.winrt.Windows.UI.Popups.Placement.default & Double = js.native
    
    /* 1 */ val above: typingsJapgolly.winrt.Windows.UI.Popups.Placement.above & Double = js.native
    
    /* 2 */ val below: typingsJapgolly.winrt.Windows.UI.Popups.Placement.below & Double = js.native
    
    /* 3 */ val left: typingsJapgolly.winrt.Windows.UI.Popups.Placement.left & Double = js.native
    
    /* 4 */ val right: typingsJapgolly.winrt.Windows.UI.Popups.Placement.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.PopupMenu")
  @js.native
  open class PopupMenu ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Popups.PopupMenu
  
  @JSGlobal("Windows.UI.Popups.UICommand")
  @js.native
  open class UICommand ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Popups.UICommand {
    def this(label: String) = this()
    def this(label: String, action: UICommandInvokedHandler) = this()
    def this(label: String, action: UICommandInvokedHandler, commandId: Any) = this()
    
    /* CompleteClass */
    var id: Any = js.native
    
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.UICommandSeparator")
  @js.native
  open class UICommandSeparator ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Popups.UICommandSeparator {
    
    /* CompleteClass */
    var id: Any = js.native
    
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
}
