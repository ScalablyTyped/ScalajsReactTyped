package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibPluginsTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsNodejsPluginNpmLockParserMod {
  
  @JSImport("snyk/dist/lib/plugins/nodejs-plugin/npm-lock-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(root: String, targetFile: String, options: Options): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PkgTree */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(root.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PkgTree */ Any
  ]]
}
