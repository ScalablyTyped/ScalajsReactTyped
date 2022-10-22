package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.tabrisStrings.cancel
import typingsJapgolly.tabris.tabrisStrings.neutral
import typingsJapgolly.tabris.tabrisStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertDialogCloseEvent[Target] extends EventObject[Target] {
  
  val button: ok | cancel | neutral | Null = js.native
  
  val texts: js.Array[String] = js.native
}
