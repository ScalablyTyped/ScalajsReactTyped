package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
open class ImmutableCompilationSettings protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings {
  def this(
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    watch: Boolean,
    noResolve: Boolean,
    allowAutomaticSemicolonInsertion: Boolean,
    noImplicitAny: Boolean,
    noLib: Boolean,
    codeGenTarget: typingsJapgolly.typescriptServices.TypeScript.LanguageVersion,
    moduleGenTarget: typingsJapgolly.typescriptServices.TypeScript.ModuleGenTarget,
    outFileOption: String,
    outDirOption: String,
    mapSourceFiles: Boolean,
    mapRoot: String,
    sourceRoot: String,
    generateDeclarationFiles: Boolean,
    useCaseSensitiveFileResolution: Boolean,
    gatherDiagnostics: Boolean,
    codepage: Double,
    createFileLog: Boolean
  ) = this()
  
  /* private */ /* CompleteClass */
  var _allowAutomaticSemicolonInsertion: Any = js.native
  
  /* private */ /* CompleteClass */
  var _codeGenTarget: Any = js.native
  
  /* private */ /* CompleteClass */
  var _codepage: Any = js.native
  
  /* private */ /* CompleteClass */
  var _createFileLog: Any = js.native
  
  /* private */ /* CompleteClass */
  var _gatherDiagnostics: Any = js.native
  
  /* private */ /* CompleteClass */
  var _generateDeclarationFiles: Any = js.native
  
  /* private */ /* CompleteClass */
  var _mapRoot: Any = js.native
  
  /* private */ /* CompleteClass */
  var _mapSourceFiles: Any = js.native
  
  /* private */ /* CompleteClass */
  var _moduleGenTarget: Any = js.native
  
  /* private */ /* CompleteClass */
  var _noImplicitAny: Any = js.native
  
  /* private */ /* CompleteClass */
  var _noLib: Any = js.native
  
  /* private */ /* CompleteClass */
  var _noResolve: Any = js.native
  
  /* private */ /* CompleteClass */
  var _outDirOption: Any = js.native
  
  /* private */ /* CompleteClass */
  var _outFileOption: Any = js.native
  
  /* private */ /* CompleteClass */
  var _propagateEnumConstants: Any = js.native
  
  /* private */ /* CompleteClass */
  var _removeComments: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sourceRoot: Any = js.native
  
  /* private */ /* CompleteClass */
  var _useCaseSensitiveFileResolution: Any = js.native
  
  /* private */ /* CompleteClass */
  var _watch: Any = js.native
  
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  
  /* CompleteClass */
  override def codeGenTarget(): typingsJapgolly.typescriptServices.TypeScript.LanguageVersion = js.native
  
  /* CompleteClass */
  override def codepage(): Double = js.native
  
  /* CompleteClass */
  override def createFileLog(): Boolean = js.native
  
  /* CompleteClass */
  override def gatherDiagnostics(): Boolean = js.native
  
  /* CompleteClass */
  override def generateDeclarationFiles(): Boolean = js.native
  
  /* CompleteClass */
  override def mapRoot(): String = js.native
  
  /* CompleteClass */
  override def mapSourceFiles(): Boolean = js.native
  
  /* CompleteClass */
  override def moduleGenTarget(): typingsJapgolly.typescriptServices.TypeScript.ModuleGenTarget = js.native
  
  /* CompleteClass */
  override def noImplicitAny(): Boolean = js.native
  
  /* CompleteClass */
  override def noLib(): Boolean = js.native
  
  /* CompleteClass */
  override def noResolve(): Boolean = js.native
  
  /* CompleteClass */
  override def outDirOption(): String = js.native
  
  /* CompleteClass */
  override def outFileOption(): String = js.native
  
  /* CompleteClass */
  override def propagateEnumConstants(): Boolean = js.native
  
  /* CompleteClass */
  override def removeComments(): Boolean = js.native
  
  /* CompleteClass */
  override def sourceRoot(): String = js.native
  
  /* CompleteClass */
  override def toCompilationSettings(): Any = js.native
  
  /* CompleteClass */
  override def useCaseSensitiveFileResolution(): Boolean = js.native
  
  /* CompleteClass */
  override def watch(): Boolean = js.native
}
object ImmutableCompilationSettings {
  
  @JSGlobal("TypeScript.ImmutableCompilationSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ImmutableCompilationSettings._defaultSettings")
  @js.native
  def _defaultSettings: Any = js.native
  inline def _defaultSettings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultSettings")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultSettings(): typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSettings")().asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings]
  
  /* static member */
  inline def fromCompilationSettings(settings: typingsJapgolly.typescriptServices.TypeScript.CompilationSettings): typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompilationSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings]
}
