package typingsJapgolly.antvUtil

import typingsJapgolly.antvUtil.anon.PartialPathLengthFactoryO
import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import typingsJapgolly.antvUtil.libPathTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetPointAtLengthMod {
  
  @JSImport("@antv/util/lib/path/util/get-point-at-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPointAtLength(pathInput: String, distance: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPointAtLength(pathInput: String, distance: Double, options: PartialPathLengthFactoryO): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPointAtLength(pathInput: PathArray, distance: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPointAtLength(pathInput: PathArray, distance: Double, options: PartialPathLengthFactoryO): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointAtLength")(pathInput.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Point]
}
