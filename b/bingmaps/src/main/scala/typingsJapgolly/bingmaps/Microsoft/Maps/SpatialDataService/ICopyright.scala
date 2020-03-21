package typingsJapgolly.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyright extends js.Object {
  /** The copyright URL for the GeoData service. */
  var CopyrightURL: String
  /** A collection of CopyrightSource objects that give information about the sources of the polygon data that is returned. */
  var Sources: js.Array[ICopyrightSource]
}

object ICopyright {
  @scala.inline
  def apply(CopyrightURL: String, Sources: js.Array[ICopyrightSource]): ICopyright = {
    val __obj = js.Dynamic.literal(CopyrightURL = CopyrightURL.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICopyright]
  }
}

