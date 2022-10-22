package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Config
import typingsJapgolly.angularDevkitBuildAngular.anon.TypeofimportedCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelLoaderMod {
  
  @JSImport("babel-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def custom[T](customizer: BabelLoaderCustomizer[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(customizer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type BabelLoaderCustomizer[T] = js.Function1[/* babel */ TypeofimportedCore, Config[T]]
}
