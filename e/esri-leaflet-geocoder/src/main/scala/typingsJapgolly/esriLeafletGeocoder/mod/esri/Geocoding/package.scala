package typingsJapgolly.esriLeafletGeocoder.mod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Geocoding {
  type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, scala.Unit]
  type GeosearchConstructor = org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.esriLeafletGeocoder.mod.esri.Geocoding.GeosearchObject
    ], 
    typingsJapgolly.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_
  ]
  type Geosearch_ = typingsJapgolly.esriLeafletGeocoder.mod.esri.Geocoding.GeosearchControl with typingsJapgolly.leaflet.mod.Evented
}
