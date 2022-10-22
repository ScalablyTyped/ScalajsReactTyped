package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompiler.mod.Statement
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersInfo
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.ExportInfo
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisTypesMod.CompiledClass
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcReexportMod.Reexport
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorMod.ImportManager
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.Import
import typingsJapgolly.magicString.mod.default
import typingsJapgolly.std.Map
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingRenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/rendering_formatter", "RedundantDecoratorMap")
  @js.native
  val RedundantDecoratorMap: MapConstructor = js.native
  type RedundantDecoratorMap = Map[Node, js.Array[Node]]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/rendering_formatter", "RedundantDecoratorMap")
  @js.native
  /* standard es2015.collection */
  open class RedundantDecoratorMapCls[K, V] ()
    extends StObject
       with Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  
  trait RenderingFormatter extends StObject {
    
    def addAdjacentStatements(output: default, compiledClass: CompiledClass, statements: String): Unit
    
    def addConstants(output: default, constants: String, file: SourceFile): Unit
    
    def addDefinitions(output: default, compiledClass: CompiledClass, definitions: String): Unit
    
    def addDirectExports(output: default, exports: js.Array[Reexport], importManager: ImportManager, file: SourceFile): Unit
    
    def addExports(
      output: default,
      entryPointBasePath: String,
      exports: js.Array[ExportInfo],
      importManager: ImportManager,
      file: SourceFile
    ): Unit
    
    def addImports(output: default, imports: js.Array[Import], sf: SourceFile): Unit
    
    def addModuleWithProvidersParams(
      outputText: default,
      moduleWithProviders: js.Array[ModuleWithProvidersInfo],
      importManager: ImportManager
    ): Unit
    
    def printStatement(stmt: Statement, sourceFile: SourceFile, importManager: ImportManager): String
    
    def removeDecorators(
      output: default,
      decoratorsToRemove: typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap
    ): Unit
  }
  object RenderingFormatter {
    
    inline def apply(
      addAdjacentStatements: (default, CompiledClass, String) => Callback,
      addConstants: (default, String, SourceFile) => Callback,
      addDefinitions: (default, CompiledClass, String) => Callback,
      addDirectExports: (default, js.Array[Reexport], ImportManager, SourceFile) => Callback,
      addExports: (default, String, js.Array[ExportInfo], ImportManager, SourceFile) => Callback,
      addImports: (default, js.Array[Import], SourceFile) => Callback,
      addModuleWithProvidersParams: (default, js.Array[ModuleWithProvidersInfo], ImportManager) => Callback,
      printStatement: (Statement, SourceFile, ImportManager) => String,
      removeDecorators: (default, typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap) => Callback
    ): RenderingFormatter = {
      val __obj = js.Dynamic.literal(addAdjacentStatements = js.Any.fromFunction3((t0: default, t1: CompiledClass, t2: String) => (addAdjacentStatements(t0, t1, t2)).runNow()), addConstants = js.Any.fromFunction3((t0: default, t1: String, t2: SourceFile) => (addConstants(t0, t1, t2)).runNow()), addDefinitions = js.Any.fromFunction3((t0: default, t1: CompiledClass, t2: String) => (addDefinitions(t0, t1, t2)).runNow()), addDirectExports = js.Any.fromFunction4((t0: default, t1: js.Array[Reexport], t2: ImportManager, t3: SourceFile) => (addDirectExports(t0, t1, t2, t3)).runNow()), addExports = js.Any.fromFunction5((t0: default, t1: String, t2: js.Array[ExportInfo], t3: ImportManager, t4: SourceFile) => (addExports(t0, t1, t2, t3, t4)).runNow()), addImports = js.Any.fromFunction3((t0: default, t1: js.Array[Import], t2: SourceFile) => (addImports(t0, t1, t2)).runNow()), addModuleWithProvidersParams = js.Any.fromFunction3((t0: default, t1: js.Array[ModuleWithProvidersInfo], t2: ImportManager) => (addModuleWithProvidersParams(t0, t1, t2)).runNow()), printStatement = js.Any.fromFunction3(printStatement), removeDecorators = js.Any.fromFunction2((t0: default, t1: typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap) => (removeDecorators(t0, t1)).runNow()))
      __obj.asInstanceOf[RenderingFormatter]
    }
    
    extension [Self <: RenderingFormatter](x: Self) {
      
      inline def setAddAdjacentStatements(value: (default, CompiledClass, String) => Callback): Self = StObject.set(x, "addAdjacentStatements", js.Any.fromFunction3((t0: default, t1: CompiledClass, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddConstants(value: (default, String, SourceFile) => Callback): Self = StObject.set(x, "addConstants", js.Any.fromFunction3((t0: default, t1: String, t2: SourceFile) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddDefinitions(value: (default, CompiledClass, String) => Callback): Self = StObject.set(x, "addDefinitions", js.Any.fromFunction3((t0: default, t1: CompiledClass, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddDirectExports(value: (default, js.Array[Reexport], ImportManager, SourceFile) => Callback): Self = StObject.set(x, "addDirectExports", js.Any.fromFunction4((t0: default, t1: js.Array[Reexport], t2: ImportManager, t3: SourceFile) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAddExports(value: (default, String, js.Array[ExportInfo], ImportManager, SourceFile) => Callback): Self = StObject.set(x, "addExports", js.Any.fromFunction5((t0: default, t1: String, t2: js.Array[ExportInfo], t3: ImportManager, t4: SourceFile) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setAddImports(value: (default, js.Array[Import], SourceFile) => Callback): Self = StObject.set(x, "addImports", js.Any.fromFunction3((t0: default, t1: js.Array[Import], t2: SourceFile) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddModuleWithProvidersParams(value: (default, js.Array[ModuleWithProvidersInfo], ImportManager) => Callback): Self = StObject.set(x, "addModuleWithProvidersParams", js.Any.fromFunction3((t0: default, t1: js.Array[ModuleWithProvidersInfo], t2: ImportManager) => (value(t0, t1, t2)).runNow()))
      
      inline def setPrintStatement(value: (Statement, SourceFile, ImportManager) => String): Self = StObject.set(x, "printStatement", js.Any.fromFunction3(value))
      
      inline def setRemoveDecorators(
        value: (default, typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap) => Callback
      ): Self = StObject.set(x, "removeDecorators", js.Any.fromFunction2((t0: default, t1: typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap) => (value(t0, t1)).runNow()))
    }
  }
}
