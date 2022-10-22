package typingsJapgolly.antvPathUtil

import typingsJapgolly.antvPathUtil.anon.ArcFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetArcParamsMod {
  
  @JSImport("@antv/path-util/lib/get-arc-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(startPoint: Any, params: Any): ArcFlag = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(startPoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[ArcFlag]
  
  inline def isSamePoint(point1: Any, point2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSamePoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
