package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.commands.Command
import typingsJapgolly.chrome.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcommands extends StObject {
  
  def getAll(): js.Promise[js.Array[Command]] = js.native
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
  
  var onCommand: CommandEvent = js.native
}
