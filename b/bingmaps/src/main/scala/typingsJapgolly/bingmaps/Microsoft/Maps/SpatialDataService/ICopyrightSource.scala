package typingsJapgolly.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyrightSource extends js.Object {
  /** The copyright string from the source. */
  var Copyright: String
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String
  /** The name of the data provider represented by this Source element. */
  var SourceName: String
}

object ICopyrightSource {
  @scala.inline
  def apply(Copyright: String, SourceID: String, SourceName: String): ICopyrightSource = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICopyrightSource]
  }
}

