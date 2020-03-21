package typingsJapgolly.tern

import typingsJapgolly.tern.ternMod.FilesQuery
import typingsJapgolly.tern.ternMod.FilesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResult extends js.Object {
  var query: FilesQuery
  var result: FilesQueryResult
}

object AnonQueryResult {
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): AnonQueryResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResult]
  }
}

