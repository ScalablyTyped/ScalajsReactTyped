package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Points
import typingsJapgolly.antvGLite.mod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserPointsMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePoints(pointsOrStr: String, `object`: DisplayObject[Any, Any]): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]
  inline def parsePoints(pointsOrStr: js.Array[js.Tuple2[Double, Double]], `object`: DisplayObject[Any, Any]): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]
}
