package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.SyntheticValue
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsNgModuleSrcModuleWithProvidersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModuleWithProvidersResolver(reflector: ReflectionHost, isCore: Boolean): ForeignFunctionResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleWithProvidersResolver")(reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[ForeignFunctionResolver]
  
  inline def isResolvedModuleWithProviders(sv: SyntheticValue[Any]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResolvedModuleWithProviders")(sv.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean]
  
  trait ResolvedModuleWithProviders extends StObject {
    
    var mwpCall: CallExpression
    
    var ngModule: Reference[ClassDeclaration[DeclarationNode]]
  }
  object ResolvedModuleWithProviders {
    
    inline def apply(mwpCall: CallExpression, ngModule: Reference[ClassDeclaration[DeclarationNode]]): ResolvedModuleWithProviders = {
      val __obj = js.Dynamic.literal(mwpCall = mwpCall.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedModuleWithProviders]
    }
    
    extension [Self <: ResolvedModuleWithProviders](x: Self) {
      
      inline def setMwpCall(value: CallExpression): Self = StObject.set(x, "mwpCall", value.asInstanceOf[js.Any])
      
      inline def setNgModule(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    }
  }
}
