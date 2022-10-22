package typingsJapgolly.next

import typingsJapgolly.next.anon.EslintOptions
import typingsJapgolly.next.anon.EventInfo
import typingsJapgolly.next.anon.Formatter
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEslintRunLintCheckMod {
  
  @JSImport("next/dist/lib/eslint/runLintCheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runLintCheck(baseDir: String, lintDirs: js.Array[String], opts: EslintOptions): ReturnType[
    js.Function6[
      /* baseDir */ String, 
      /* lintDirs */ js.Array[String], 
      /* eslintrcFile */ String | Null, 
      /* pkgJsonPath */ String | Null, 
      /* hasAppDir */ Boolean, 
      /* hasLintDuringBuildEslintOptionsReportErrorsOnlyMaxWarningsFormatterOutputFile */ Formatter, 
      js.Promise[String | Null | EventInfo]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runLintCheck")(baseDir.asInstanceOf[js.Any], lintDirs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function6[
      /* baseDir */ String, 
      /* lintDirs */ js.Array[String], 
      /* eslintrcFile */ String | Null, 
      /* pkgJsonPath */ String | Null, 
      /* hasAppDir */ Boolean, 
      /* hasLintDuringBuildEslintOptionsReportErrorsOnlyMaxWarningsFormatterOutputFile */ Formatter, 
      js.Promise[String | Null | EventInfo]
    ]
  ]]
}
