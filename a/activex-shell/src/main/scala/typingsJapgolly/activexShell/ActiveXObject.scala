package typingsJapgolly.activexShell

import typingsJapgolly.activexShell.Shell32.ShellFolderView
import typingsJapgolly.activexShell.Shell32.ShellFolderViewOC
import typingsJapgolly.activexShell.activexShellStrings.BeginDrag
import typingsJapgolly.activexShell.activexShellStrings.DefaultVerbInvoked
import typingsJapgolly.activexShell.activexShellStrings.EnumDone
import typingsJapgolly.activexShell.activexShellStrings.SelectionChanged
import typingsJapgolly.activexShell.activexShellStrings.VerbInvoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: ShellFolderViewOC,
    event: BeginDrag | DefaultVerbInvoked | EnumDone | SelectionChanged | VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ShellFolderView,
    event: BeginDrag | DefaultVerbInvoked | EnumDone | SelectionChanged | VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
