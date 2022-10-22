package typingsJapgolly.antvUtil

import typingsJapgolly.antvUtil.antvUtilStrings.off
import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessRoundPathMod {
  
  @JSImport("@antv/util/lib/path/process/round-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def roundPath(path: PathArray, round: Double): PathArray = (^.asInstanceOf[js.Dynamic].applyDynamic("roundPath")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[PathArray]
  
  inline def roundPath_off(path: PathArray, round: off): PathArray = (^.asInstanceOf[js.Dynamic].applyDynamic("roundPath")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[PathArray]
}
