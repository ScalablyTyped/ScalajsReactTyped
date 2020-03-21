package typingsJapgolly.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shelf contains a collection of books with a theme.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1Shelf extends js.Object {
  /**
    * Output only. The resource name of the shelf. Shelf names have the form
    * `shelves/{shelf_id}`. The name is ignored when creating a shelf.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The theme of the shelf
    */
  var theme: js.UndefOr[String] = js.native
}

object SchemaGoogleExampleLibraryagentV1Shelf {
  @scala.inline
  def apply(name: String = null, theme: String = null): SchemaGoogleExampleLibraryagentV1Shelf = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Shelf]
  }
}

