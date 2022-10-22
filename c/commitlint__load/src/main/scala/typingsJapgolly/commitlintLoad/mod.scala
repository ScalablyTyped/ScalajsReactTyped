package typingsJapgolly.commitlintLoad

import typingsJapgolly.commitlintTypes.libLoadMod.LoadOptions
import typingsJapgolly.commitlintTypes.libLoadMod.QualifiedConfig
import typingsJapgolly.commitlintTypes.libLoadMod.UserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/load", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[QualifiedConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[QualifiedConfig]]
  inline def default(seed: Unit, options: LoadOptions): js.Promise[QualifiedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(seed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[QualifiedConfig]]
  inline def default(seed: UserConfig): js.Promise[QualifiedConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QualifiedConfig]]
  inline def default(seed: UserConfig, options: LoadOptions): js.Promise[QualifiedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(seed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[QualifiedConfig]]
}
