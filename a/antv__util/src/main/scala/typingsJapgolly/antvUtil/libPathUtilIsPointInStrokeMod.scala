package typingsJapgolly.antvUtil

import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import typingsJapgolly.antvUtil.libPathTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilIsPointInStrokeMod {
  
  @JSImport("@antv/util/lib/path/util/is-point-in-stroke", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInStroke(pathInput: String, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInStroke")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointInStroke(pathInput: PathArray, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInStroke")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
