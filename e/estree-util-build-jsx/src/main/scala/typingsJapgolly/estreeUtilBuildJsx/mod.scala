package typingsJapgolly.estreeUtilBuildJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-util-build-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildJsx[T /* <: typingsJapgolly.estree.mod.Node */](tree: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def buildJsx[T /* <: typingsJapgolly.estree.mod.Node */](tree: T, options: typingsJapgolly.estreeUtilBuildJsx.libMod.Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type BuildJsxOptions = Options
  
  type Node = org.scalajs.dom.Node
  
  type Options = typingsJapgolly.estreeUtilBuildJsx.libMod.Options
}
