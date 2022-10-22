package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Diagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsLoadTranslationsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/load-translations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTranslationLoader(): js.Promise[TranslationLoader] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTranslationLoader")().asInstanceOf[js.Promise[TranslationLoader]]
  
  type TranslationLoader = js.Function1[/* path */ String, Diagnostics]
}
