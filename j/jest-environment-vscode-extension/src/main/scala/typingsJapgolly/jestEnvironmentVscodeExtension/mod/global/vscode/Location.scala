package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Location")
@js.native
open class Location protected ()
  extends typingsJapgolly.vscode.mod.Location {
  def this(uri: typingsJapgolly.vscode.mod.Uri, rangeOrPosition: typingsJapgolly.vscode.mod.Position) = this()
  /**
    * Creates a new location object.
    *
    * @param uri The resource identifier.
    * @param rangeOrPosition The range or position. Positions will be converted to an empty range.
    */
  def this(uri: typingsJapgolly.vscode.mod.Uri, rangeOrPosition: typingsJapgolly.vscode.mod.Range) = this()
}
