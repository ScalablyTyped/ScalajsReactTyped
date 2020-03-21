package typingsJapgolly.googleMapsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, typingsJapgolly.googleMapsReact.mod.GoogleApiOptions]
  type Omit[T1, T2] = typingsJapgolly.std.Pick[T1, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]]
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], 
    /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], 
    /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
