package typingsJapgolly.apolloServer.mod

import typingsJapgolly.graphqlTools.renameTypesMod.RenameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typingsJapgolly.apolloServer.exportsMod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
}

