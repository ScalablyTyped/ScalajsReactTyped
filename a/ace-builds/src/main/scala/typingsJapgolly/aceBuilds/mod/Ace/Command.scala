package typingsJapgolly.aceBuilds.mod.Ace

import typingsJapgolly.aceBuilds.anon.Mac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  var bindKey: js.UndefOr[String | Mac] = js.native
  
  def exec(editor: Editor): Unit = js.native
  def exec(editor: Editor, args: Any): Unit = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
}
