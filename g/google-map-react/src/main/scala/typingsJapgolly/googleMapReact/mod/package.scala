package typingsJapgolly.googleMapReact.mod

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.googleMapReact.anon.Center
import typingsJapgolly.googleMapReact.anon.From
import typingsJapgolly.googleMapReact.anon.H
import typingsJapgolly.googleMapReact.anon.Ne
import typingsJapgolly.googleMapReact.anon.Nw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertNeSwToNwSe(boundCorder: Ne): Nw = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNeSwToNwSe")(boundCorder.asInstanceOf[js.Any]).asInstanceOf[Nw]

inline def convertNwSeToNeSw(boundCorder: Nw): Ne = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNwSeToNeSw")(boundCorder.asInstanceOf[js.Any]).asInstanceOf[Ne]

inline def fitBounds(bounds: NESWBounds, size: Size): Center = (^.asInstanceOf[js.Dynamic].applyDynamic("fitBounds")(bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Center]

inline def getTilesIds(start: From, zoom: Double): js.Array[Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTilesIds")(start.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tile]]

inline def latLng2Tile(coords: Coords, zoom: Double): typingsJapgolly.googleMapReact.anon.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng2Tile")(coords.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleMapReact.anon.Point]

inline def meters2ScreenPixels(meters: Double, coords: Coords, zoom: Double): H = (^.asInstanceOf[js.Dynamic].applyDynamic("meters2ScreenPixels")(meters.asInstanceOf[js.Any], coords.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[H]

inline def tile2LatLng(point: Point, zoom: Double): typingsJapgolly.googleMapReact.anon.Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("tile2LatLng")(point.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleMapReact.anon.Coords]

type googleMapReact = Component[Props & js.Object, js.Object]
