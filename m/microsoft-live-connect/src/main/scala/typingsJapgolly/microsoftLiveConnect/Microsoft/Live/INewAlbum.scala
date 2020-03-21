package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new album.
  */
trait INewAlbum extends js.Object {
  /**
    * A description of the album.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the album.
    */
  var name: String
}

object INewAlbum {
  @scala.inline
  def apply(name: String, description: String = null): INewAlbum = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewAlbum]
  }
}

