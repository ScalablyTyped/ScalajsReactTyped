package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.maplibreGl.anon.SourceString
import typingsJapgolly.maplibreGl.maplibreGlStrings.source_
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapGeoJSONFeature extends GeoJSONFeature {
  
  var layer: (Omit[LayerSpecification, source_]) & SourceString = js.native
  
  var source: String = js.native
  
  var sourceLayer: js.UndefOr[String] = js.native
  
  var state: StringDictionary[Any] = js.native
}
