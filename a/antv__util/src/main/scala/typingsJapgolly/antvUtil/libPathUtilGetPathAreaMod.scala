package typingsJapgolly.antvUtil

import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetPathAreaMod {
  
  @JSImport("@antv/util/lib/path/util/get-path-area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathArea(path: PathArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
}
