package typingsJapgolly.docxTemplates

import typingsJapgolly.docxTemplates.libTypesMod.Context
import typingsJapgolly.docxTemplates.libTypesMod.ReportData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsSandboxMod {
  
  @JSImport("docx-templates/lib/jsSandbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runUserJsAndGetRaw(data: Unit, code: String, ctx: Context): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runUserJsAndGetRaw")(data.asInstanceOf[js.Any], code.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def runUserJsAndGetRaw(data: ReportData, code: String, ctx: Context): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runUserJsAndGetRaw")(data.asInstanceOf[js.Any], code.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
