package typingsJapgolly.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchSort")
@js.native
open class SearchSort () extends StObject {
  
  /**
    * Specifies whether to sort descending or not.
    */
  def descending(descending: Boolean): this.type = js.native
}
object SearchSort {
  
  @JSImport("couchbase", "SearchSort")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("couchbase", "SearchSort.FieldSort")
  @js.native
  open class FieldSort () extends SearchSort {
    
    def missing(missing: String): this.type = js.native
    
    def mode(mode: String): this.type = js.native
    
    def `type`(`type`: String): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchSort.GeoDistanceSort")
  @js.native
  open class GeoDistanceSort () extends SearchSort {
    
    def unit(unit: String): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchSort.IdSort")
  @js.native
  open class IdSort () extends SearchSort
  
  @JSImport("couchbase", "SearchSort.ScoreSort")
  @js.native
  open class ScoreSort () extends SearchSort
  
  inline def field(field: String): FieldSort = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any]).asInstanceOf[FieldSort]
  
  inline def geoDistance(field: String, lat: Double, lon: Double): GeoDistanceSort = (^.asInstanceOf[js.Dynamic].applyDynamic("geoDistance")(field.asInstanceOf[js.Any], lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[GeoDistanceSort]
  
  inline def id(): IdSort = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[IdSort]
  
  inline def score(): ScoreSort = ^.asInstanceOf[js.Dynamic].applyDynamic("score")().asInstanceOf[ScoreSort]
}
