package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CallHierarchyOutgoingCall")
@js.native
open class CallHierarchyOutgoingCall protected ()
  extends typingsJapgolly.vscode.mod.CallHierarchyOutgoingCall {
  /**
    * Create a new call object.
    *
    * @param item The item being called
    * @param fromRanges The ranges at which the calls appear.
    */
  def this(
    item: typingsJapgolly.vscode.mod.CallHierarchyItem,
    fromRanges: js.Array[typingsJapgolly.vscode.mod.Range]
  ) = this()
}
