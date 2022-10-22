package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeScriptCompiler")
@js.native
open class TypeScriptCompiler ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.TypeScriptCompiler {
  def this(logger: ILogger) = this()
  def this(
    logger: Unit,
    _settings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
  def this(
    logger: ILogger,
    _settings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}
object TypeScriptCompiler {
  
  @JSImport("typescript-services", "TypeScriptCompiler")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getFullDiagnosticText(
    diagnostic: typingsJapgolly.typescriptServices.TypeScript.Diagnostic,
    resolvePath: js.Function1[/* path */ String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullDiagnosticText")(diagnostic.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def getLocationText(location: Any, resolvePath: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationText")(location.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def mapToDTSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToDTSFileName")(fileName.asInstanceOf[js.Any], wholeFileNameReplaced.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def mapToFileNameExtension(`extension`: String, fileName: String, wholeFileNameReplaced: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToFileNameExtension")(`extension`.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], wholeFileNameReplaced.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def mapToJSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToJSFileName")(fileName.asInstanceOf[js.Any], wholeFileNameReplaced.asInstanceOf[js.Any])).asInstanceOf[String]
}
