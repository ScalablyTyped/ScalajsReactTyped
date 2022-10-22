package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.AbsolutePath
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject
import typingsJapgolly.antvGLite.distDomInterfacesMod.IElement
import typingsJapgolly.antvUtil.libPathTypesMod.CurveArray
import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserPathMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergePaths(left: AbsolutePath, right: AbsolutePath, `object`: IElement[Any, Any]): js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePaths")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]]]
  
  inline def parsePath(path: String, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
  inline def parsePath(path: PathArray, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
}
