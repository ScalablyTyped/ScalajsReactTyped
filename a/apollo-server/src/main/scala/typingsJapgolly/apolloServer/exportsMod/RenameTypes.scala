package typingsJapgolly.apolloServer.exportsMod

import typingsJapgolly.graphqlTools.renameTypesMod.RenameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typingsJapgolly.graphqlTools.mod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
}

