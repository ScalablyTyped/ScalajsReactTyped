package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.ngtoolsWebpack.anon.PartialAngularWebpackPlug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ngtools/webpack", "AngularWebpackLoaderPath")
  @js.native
  val AngularWebpackLoaderPath: String = js.native
  
  @JSImport("@ngtools/webpack", "AngularWebpackPlugin")
  @js.native
  open class AngularWebpackPlugin ()
    extends typingsJapgolly.ngtoolsWebpack.srcIvyMod.AngularWebpackPlugin {
    def this(options: PartialAngularWebpackPlug) = this()
  }
}
