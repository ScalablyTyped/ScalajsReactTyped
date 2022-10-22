package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.error
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.ignore
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.warning
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsI18nOptionsMod.I18nOptions
import typingsJapgolly.angularDevkitBuildWebpack.srcUtilsMod.EmittedFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsI18nInliningMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/i18n-inlining", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def i18nInlineEmittedFiles(
    context: BuilderContext,
    emittedFiles: js.Array[EmittedFiles],
    i18n: I18nOptions,
    baseOutputPath: String,
    outputPaths: js.Array[String],
    scriptsEntryPointName: js.Array[String],
    emittedPath: String,
    es5: Boolean
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nInlineEmittedFiles")(context.asInstanceOf[js.Any], emittedFiles.asInstanceOf[js.Any], i18n.asInstanceOf[js.Any], baseOutputPath.asInstanceOf[js.Any], outputPaths.asInstanceOf[js.Any], scriptsEntryPointName.asInstanceOf[js.Any], emittedPath.asInstanceOf[js.Any], es5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def i18nInlineEmittedFiles(
    context: BuilderContext,
    emittedFiles: js.Array[EmittedFiles],
    i18n: I18nOptions,
    baseOutputPath: String,
    outputPaths: js.Array[String],
    scriptsEntryPointName: js.Array[String],
    emittedPath: String,
    es5: Boolean,
    missingTranslation: error | warning | ignore
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nInlineEmittedFiles")(context.asInstanceOf[js.Any], emittedFiles.asInstanceOf[js.Any], i18n.asInstanceOf[js.Any], baseOutputPath.asInstanceOf[js.Any], outputPaths.asInstanceOf[js.Any], scriptsEntryPointName.asInstanceOf[js.Any], emittedPath.asInstanceOf[js.Any], es5.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
