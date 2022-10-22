package typingsJapgolly.placemarkioCheckGeojson

import typingsJapgolly.geojson.mod.GeoJSON
import typingsJapgolly.placemarkioCheckGeojson.anon.Rejected
import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.HintIssue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@placemarkio/check-geojson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@placemarkio/check-geojson", "HintError")
  @js.native
  open class HintError protected ()
    extends typingsJapgolly.placemarkioCheckGeojson.distErrorsMod.HintError {
    def this(issues: js.Array[HintIssue]) = this()
  }
  
  inline def check(jsonStr: String): GeoJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(jsonStr.asInstanceOf[js.Any]).asInstanceOf[GeoJSON]
  
  inline def getIssues(jsonStr: String): js.Array[HintIssue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIssues")(jsonStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[HintIssue]]
  
  inline def scavenge(jsonStr: String): Rejected = ^.asInstanceOf[js.Dynamic].applyDynamic("scavenge")(jsonStr.asInstanceOf[js.Any]).asInstanceOf[Rejected]
}
