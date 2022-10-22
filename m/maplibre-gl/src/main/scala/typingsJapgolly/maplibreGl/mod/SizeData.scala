package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.LayoutSize
  - typingsJapgolly.maplibreGl.anon.`3`
  - typingsJapgolly.maplibreGl.anon.InterpolationType
  - typingsJapgolly.maplibreGl.anon.MaxZoom_
*/
trait SizeData extends StObject
object SizeData {
  
  inline def `3`(): typingsJapgolly.maplibreGl.anon.`3` = {
    val __obj = js.Dynamic.literal(kind = "source")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.`3`]
  }
  
  inline def InterpolationType(
    interpolationType: typingsJapgolly.maplibreGl.mod.InterpolationType,
    maxSize: Double,
    maxZoom: Double,
    minSize: Double,
    minZoom: Double
  ): typingsJapgolly.maplibreGl.anon.InterpolationType = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "camera", maxSize = maxSize.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.InterpolationType]
  }
  
  inline def LayoutSize(layoutSize: Double): typingsJapgolly.maplibreGl.anon.LayoutSize = {
    val __obj = js.Dynamic.literal(kind = "constant", layoutSize = layoutSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.LayoutSize]
  }
  
  inline def MaxZoom_(interpolationType: InterpolationType, maxZoom: Double, minZoom: Double): typingsJapgolly.maplibreGl.anon.MaxZoom_ = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "composite", maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.MaxZoom_]
  }
}
