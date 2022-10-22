package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Polygon")
@js.native
open class Polygon ()
  extends typingsJapgolly.blackEngine.geomPolygonMod.Polygon {
  def this(vertices: js.Array[typingsJapgolly.blackEngine.geomVectorMod.Vector]) = this()
}
/* static members */
object Polygon {
  
  @JSImport("black-engine", "Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Polygon.__cache")
  @js.native
  val cache: typingsJapgolly.blackEngine.geomPolygonMod.Polygon = js.native
  
  inline def fromPath(path: String): typingsJapgolly.blackEngine.geomPolygonMod.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.geomPolygonMod.Polygon]
}
