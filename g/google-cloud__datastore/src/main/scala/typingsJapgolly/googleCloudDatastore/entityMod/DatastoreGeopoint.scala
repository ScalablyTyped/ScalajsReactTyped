package typingsJapgolly.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreGeopoint extends js.Object {
  var value: DatastoreCoords
}

object DatastoreGeopoint {
  @scala.inline
  def apply(value: DatastoreCoords): DatastoreGeopoint = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatastoreGeopoint]
  }
}

