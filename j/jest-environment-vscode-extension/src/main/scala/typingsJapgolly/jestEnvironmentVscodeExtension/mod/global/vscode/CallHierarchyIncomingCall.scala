package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CallHierarchyIncomingCall")
@js.native
open class CallHierarchyIncomingCall protected ()
  extends typingsJapgolly.vscode.mod.CallHierarchyIncomingCall {
  /**
    * Create a new call object.
    *
    * @param item The item making the call.
    * @param fromRanges The ranges at which the calls appear.
    */
  def this(
    item: typingsJapgolly.vscode.mod.CallHierarchyItem,
    fromRanges: js.Array[typingsJapgolly.vscode.mod.Range]
  ) = this()
}
