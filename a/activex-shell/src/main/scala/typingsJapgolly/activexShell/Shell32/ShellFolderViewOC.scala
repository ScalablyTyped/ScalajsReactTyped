package typingsJapgolly.activexShell.Shell32

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The **ShellFolderView** object fires two events, **EnumDone** and **SelectionChanged**, that are typically handled by applications. However, some applications
  * must handle events from a series of **ShellFolderView** objects. For example, an application might host a **WebBrowser** control that allows users to navigate through
  * a series of folders. Each folder has its own **ShellFolderView** object with its associated events. Handling these events can be difficult.
  *
  * The **ShellFolderViewOC** object simplifies event handling for such scenarios. It allows applications to handle events for all ShellFolderView objects with a single
  * pair of **ShellFolderViewOC** event handlers. Each time the user navigates to a new folder, the application passes the associated **ShellFolderView** object to the
  * **ShellFolderViewOC** object by calling **SetFolderView**. Then, when an **EnumDone** or **SelectionChanged** event is fired, the **ShellFolderViewOC** object
  * forwards the event to its own handler for processing.
  */
trait ShellFolderViewOC extends StObject {
  
  /** Set the ShellFolderView object to monitor events of. */
  def SetFolderView(pdisp: ShellFolderView): Unit
  
  /* private */ @JSName("Shell32.ShellFolderViewOC_typekey")
  var Shell32DotShellFolderViewOC_typekey: ShellFolderViewOC
}
object ShellFolderViewOC {
  
  inline def apply(SetFolderView: ShellFolderView => Callback, Shell32DotShellFolderViewOC_typekey: ShellFolderViewOC): ShellFolderViewOC = {
    val __obj = js.Dynamic.literal(SetFolderView = js.Any.fromFunction1((t0: ShellFolderView) => SetFolderView(t0).runNow()))
    __obj.updateDynamic("Shell32.ShellFolderViewOC_typekey")(Shell32DotShellFolderViewOC_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellFolderViewOC]
  }
  
  extension [Self <: ShellFolderViewOC](x: Self) {
    
    inline def setSetFolderView(value: ShellFolderView => Callback): Self = StObject.set(x, "SetFolderView", js.Any.fromFunction1((t0: ShellFolderView) => value(t0).runNow()))
    
    inline def setShell32DotShellFolderViewOC_typekey(value: ShellFolderViewOC): Self = StObject.set(x, "Shell32.ShellFolderViewOC_typekey", value.asInstanceOf[js.Any])
  }
}
