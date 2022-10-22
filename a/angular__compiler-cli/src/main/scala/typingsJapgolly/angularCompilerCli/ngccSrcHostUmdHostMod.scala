package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.Parameter
import typingsJapgolly.angularCompilerCli.anon.RecordamdDefinecommonJsco
import typingsJapgolly.angularCompilerCli.ngccSrcHostEsm5HostMod.Esm5ReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesBundleProgramMod.BundleProgram
import typingsJapgolly.angularCompilerCli.ngccSrcUtilsMod.FactoryMap
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcHostUmdHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/umd_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/umd_host", "UmdReflectionHost")
  @js.native
  open class UmdReflectionHost protected () extends Esm5ReflectionHost {
    def this(logger: Logger, isCore: Boolean, src: BundleProgram) = this()
    def this(logger: Logger, isCore: Boolean, src: BundleProgram, dts: BundleProgram) = this()
    
    /* protected */ var compilerHost: CompilerHost = js.native
    
    /* private */ var computeExportsOfUmdModule: Any = js.native
    
    /* private */ var computeImportPath: Any = js.native
    
    /* private */ var computeUmdModule: Any = js.native
    
    /* private */ var extractBasicUmdExportDeclaration: Any = js.native
    
    /* private */ var extractUmdDefinePropertyExportDeclaration: Any = js.native
    
    /* private */ var extractUmdWildcardReexports: Any = js.native
    
    /**
      * Is the identifier a parameter on a UMD factory function, e.g. `function factory(this, core)`?
      * If so then return its declaration.
      */
    /* private */ var findUmdImportParameter: Any = js.native
    
    /* private */ var getExportsDeclaration: Any = js.native
    
    /* private */ var getImportPathFromParameter: Any = js.native
    
    /* private */ var getImportPathFromRequireCall: Any = js.native
    
    /* private */ var getUmdDeclaration: Any = js.native
    
    def getUmdImportPath(importParameter: ParameterDeclaration): String | Null = js.native
    
    def getUmdModule(sourceFile: SourceFile): UmdModule | Null = js.native
    
    /* private */ var getUmdModuleDeclaration: Any = js.native
    
    /* protected */ var program: Program = js.native
    
    /* private */ var resolveModuleName: Any = js.native
    
    /* protected */ var umdExports: FactoryMap[
        SourceFile, 
        (Map[
          String, 
          typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
        ]) | Null
      ] = js.native
    
    /* protected */ var umdImportPaths: FactoryMap[ParameterDeclaration, String | Null] = js.native
    
    /* protected */ var umdModules: FactoryMap[SourceFile, UmdModule | Null] = js.native
  }
  
  inline def getImportsOfUmdModule(umdModule: UmdModule): js.Array[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImportsOfUmdModule")(umdModule.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parameter]]
  
  inline def parseStatementForUmdModule(statement: Statement): UmdModule | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatementForUmdModule")(statement.asInstanceOf[js.Any]).asInstanceOf[UmdModule | Null]
  
  trait UmdModule extends StObject {
    
    var factoryCalls: RecordamdDefinecommonJsco
    
    var factoryFn: FunctionExpression
    
    var wrapperFn: FunctionExpression
  }
  object UmdModule {
    
    inline def apply(
      factoryCalls: RecordamdDefinecommonJsco,
      factoryFn: FunctionExpression,
      wrapperFn: FunctionExpression
    ): UmdModule = {
      val __obj = js.Dynamic.literal(factoryCalls = factoryCalls.asInstanceOf[js.Any], factoryFn = factoryFn.asInstanceOf[js.Any], wrapperFn = wrapperFn.asInstanceOf[js.Any])
      __obj.asInstanceOf[UmdModule]
    }
    
    extension [Self <: UmdModule](x: Self) {
      
      inline def setFactoryCalls(value: RecordamdDefinecommonJsco): Self = StObject.set(x, "factoryCalls", value.asInstanceOf[js.Any])
      
      inline def setFactoryFn(value: FunctionExpression): Self = StObject.set(x, "factoryFn", value.asInstanceOf[js.Any])
      
      inline def setWrapperFn(value: FunctionExpression): Self = StObject.set(x, "wrapperFn", value.asInstanceOf[js.Any])
    }
  }
}
