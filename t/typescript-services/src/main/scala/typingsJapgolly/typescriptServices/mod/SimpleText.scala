package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimpleText")
@js.native
object SimpleText extends js.Object {
  def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): ISimpleText = js.native
  def fromString(value: String): ISimpleText = js.native
}

