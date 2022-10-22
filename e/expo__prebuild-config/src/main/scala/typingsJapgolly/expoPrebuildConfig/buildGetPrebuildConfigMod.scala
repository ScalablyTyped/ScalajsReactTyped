package typingsJapgolly.expoPrebuildConfig

import typingsJapgolly.expoPrebuildConfig.anon.BundleIdentifier
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetPrebuildConfigMod {
  
  @JSImport("@expo/prebuild-config/build/getPrebuildConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrebuildConfigAsync(projectRoot: String, props: BundleIdentifier): js.Promise[
    ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof getConfig */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrebuildConfigAsync")(projectRoot.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof getConfig */ Any
    ]
  ]]
}
