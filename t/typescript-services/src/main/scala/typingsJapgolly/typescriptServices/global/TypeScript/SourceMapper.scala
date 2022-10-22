package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IASTSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SourceMapper")
@js.native
open class SourceMapper protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typingsJapgolly.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typingsJapgolly.typescriptServices.TypeScript.TextWriter,
    document: typingsJapgolly.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typingsJapgolly.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
  
  /* private */ /* CompleteClass */
  var allSourceMappings: Any = js.native
  
  /* CompleteClass */
  var currentMappings: js.Array[js.Array[typingsJapgolly.typescriptServices.TypeScript.SourceMapping]] = js.native
  
  /* CompleteClass */
  var currentNameIndex: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def decreaseMappingLevel(ast: IASTSpan): Unit = js.native
  
  /* CompleteClass */
  override def emitSourceMapping(): Unit = js.native
  
  /* CompleteClass */
  override def getOutputFile(): typingsJapgolly.typescriptServices.TypeScript.OutputFile = js.native
  
  /* CompleteClass */
  override def increaseMappingLevel(ast: IASTSpan): Unit = js.native
  
  /* private */ /* CompleteClass */
  var jsFile: Any = js.native
  
  /* private */ /* CompleteClass */
  var jsFileName: Any = js.native
  
  /* private */ /* CompleteClass */
  var mappingLevel: Any = js.native
  
  /* CompleteClass */
  var names: js.Array[String] = js.native
  
  /* CompleteClass */
  override def setNewSourceFile(
    document: typingsJapgolly.typescriptServices.TypeScript.Document,
    emitOptions: typingsJapgolly.typescriptServices.TypeScript.EmitOptions
  ): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def setNewSourceFilePath(document: Any, emitOptions: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def setSourceMapOptions(document: Any, jsFilePath: Any, emitOptions: Any, resolvePath: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapDirectory: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapEntries: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapOut: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceMapPath: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceRoot: Any = js.native
  
  /* private */ /* CompleteClass */
  var tsFilePaths: Any = js.native
}
object SourceMapper {
  
  @JSGlobal("TypeScript.SourceMapper")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SourceMapper.MapFileExtension")
  @js.native
  def MapFileExtension: String = js.native
  inline def MapFileExtension_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MapFileExtension")(x.asInstanceOf[js.Any])
}
