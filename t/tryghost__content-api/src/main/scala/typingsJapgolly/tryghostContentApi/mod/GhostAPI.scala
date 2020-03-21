package typingsJapgolly.tryghostContentApi.mod

import typingsJapgolly.tryghostContentApi.Anon0
import typingsJapgolly.tryghostContentApi.AnonBrowse
import typingsJapgolly.tryghostContentApi.AnonBrowseBrowseFunction
import typingsJapgolly.tryghostContentApi.AnonBrowseRead
import typingsJapgolly.tryghostContentApi.AnonRead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostAPI extends js.Object {
  var authors: AnonRead
  var pages: AnonBrowseBrowseFunction
  var posts: AnonBrowse
  var settings: Anon0
  var tags: AnonBrowseRead
}

object GhostAPI {
  @scala.inline
  def apply(
    authors: AnonRead,
    pages: AnonBrowseBrowseFunction,
    posts: AnonBrowse,
    settings: Anon0,
    tags: AnonBrowseRead
  ): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GhostAPI]
  }
}

