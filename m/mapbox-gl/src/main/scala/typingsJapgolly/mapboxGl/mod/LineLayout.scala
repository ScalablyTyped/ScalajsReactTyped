package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.bevel
import typingsJapgolly.mapboxGl.mapboxGlStrings.butt
import typingsJapgolly.mapboxGl.mapboxGlStrings.miter
import typingsJapgolly.mapboxGl.mapboxGlStrings.round
import typingsJapgolly.mapboxGl.mapboxGlStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLayout
  extends StObject
     with Layout
     with _AnyLayout {
  
  var `line-cap`: js.UndefOr[butt | round | square | Expression] = js.undefined
  
  var `line-join`: js.UndefOr[bevel | round | miter | Expression] = js.undefined
  
  var `line-miter-limit`: js.UndefOr[Double | Expression] = js.undefined
  
  var `line-round-limit`: js.UndefOr[Double | Expression] = js.undefined
  
  var `line-sort-key`: js.UndefOr[Double | Expression] = js.undefined
}
object LineLayout {
  
  inline def apply(): LineLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLayout]
  }
  
  extension [Self <: LineLayout](x: Self) {
    
    inline def `setLine-cap`(value: butt | round | square | Expression): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    inline def `setLine-join`(value: bevel | round | miter | Expression): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    inline def `setLine-joinUndefined`: Self = StObject.set(x, "line-join", js.undefined)
    
    inline def `setLine-miter-limit`(value: Double | Expression): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-miter-limitUndefined`: Self = StObject.set(x, "line-miter-limit", js.undefined)
    
    inline def `setLine-round-limit`(value: Double | Expression): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-round-limitUndefined`: Self = StObject.set(x, "line-round-limit", js.undefined)
    
    inline def `setLine-sort-key`(value: Double | Expression): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setLine-sort-keyUndefined`: Self = StObject.set(x, "line-sort-key", js.undefined)
  }
}
