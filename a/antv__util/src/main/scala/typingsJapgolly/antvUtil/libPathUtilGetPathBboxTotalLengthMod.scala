package typingsJapgolly.antvUtil

import typingsJapgolly.antvUtil.anon.PartialPathLengthFactoryO
import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import typingsJapgolly.antvUtil.libPathTypesMod.PathBBoxTotalLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetPathBboxTotalLengthMod {
  
  @JSImport("@antv/util/lib/path/util/get-path-bbox-total-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathBBoxTotalLength(path: PathArray): PathBBoxTotalLength = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBoxTotalLength")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBoxTotalLength]
  inline def getPathBBoxTotalLength(path: PathArray, options: PartialPathLengthFactoryO): PathBBoxTotalLength = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBoxTotalLength")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBoxTotalLength]
}
