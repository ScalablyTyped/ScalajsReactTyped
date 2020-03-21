package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Printable {
  var leading: js.UndefOr[Boolean] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
  var value: String
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Comment")
@js.native
object Comment extends TopLevel[Type[Comment]]

