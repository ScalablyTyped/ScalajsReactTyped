package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.ngtoolsWebpack.anon.PartialAngularWebpackPlug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvyMod {
  
  @JSImport("@ngtools/webpack/src/ivy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(content: String, map: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(content.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ngtools/webpack/src/ivy", "AngularWebpackLoaderPath")
  @js.native
  val AngularWebpackLoaderPath: String = js.native
  
  @JSImport("@ngtools/webpack/src/ivy", "AngularWebpackPlugin")
  @js.native
  open class AngularWebpackPlugin ()
    extends typingsJapgolly.ngtoolsWebpack.srcIvyPluginMod.AngularWebpackPlugin {
    def this(options: PartialAngularWebpackPlug) = this()
  }
}
