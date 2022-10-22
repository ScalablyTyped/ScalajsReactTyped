package typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(config: SdkConfig): DirectionsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[DirectionsService]
inline def default(config: typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.default): DirectionsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[DirectionsService]

type DirectionsRequest[T /* <: DirectionsGeometry */] = CommonDirectionsRequest[T] & DirectionsProfileExclusion

type Polyline = String

type RouteGeometry = LineString | MultiLineString | Polyline
