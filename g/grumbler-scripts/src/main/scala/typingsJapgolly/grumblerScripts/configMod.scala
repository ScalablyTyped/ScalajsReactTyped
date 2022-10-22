package typingsJapgolly.grumblerScripts

import typingsJapgolly.grumblerScripts.anon.Version
import typingsJapgolly.grumblerScripts.configTypesMod.WebpackConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("grumbler-scripts/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(karma: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(karma.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("grumbler-scripts/config", "ENV")
  @js.native
  object ENV extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.grumblerScripts.configConstantsMod.ENV & String] = js.native
    
    /* "demo" */ val DEMO: typingsJapgolly.grumblerScripts.configConstantsMod.ENV.DEMO & String = js.native
    
    /* "local" */ val LOCAL: typingsJapgolly.grumblerScripts.configConstantsMod.ENV.LOCAL & String = js.native
    
    /* "production" */ val PRODUCTION: typingsJapgolly.grumblerScripts.configConstantsMod.ENV.PRODUCTION & String = js.native
    
    /* "sandbox" */ val SANDBOX: typingsJapgolly.grumblerScripts.configConstantsMod.ENV.SANDBOX & String = js.native
    
    /* "stage" */ val STAGE: typingsJapgolly.grumblerScripts.configConstantsMod.ENV.STAGE & String = js.native
    
    /* "test" */ val TEST: typingsJapgolly.grumblerScripts.configConstantsMod.ENV.TEST & String = js.native
  }
  
  inline def getCurrentVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getKarmaConfig(karma: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getKarmaConfig(karma: js.Object, cfg: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getNextVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getNextVersion(pkg: Version, level: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWebpackConfig(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")().asInstanceOf[js.Object]
  inline def getWebpackConfig(options: WebpackConfigOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
