package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.anon.Tsjest
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMigrationsUpdate1240UpdateJestPresetAngularMod {
  
  @JSImport("@nrwl/jest/src/migrations/update-12-4-0/update-jest-preset-angular", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getNewAstTransformers(astTransformers: ASTTransformers): ASTTransformers | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewAstTransformers")(astTransformers.asInstanceOf[js.Any]).asInstanceOf[ASTTransformers | Null]
  
  inline def transformerIsFromJestPresetAngular(transformer: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformerIsFromJestPresetAngular")(transformer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def transformerIsFromJestPresetAngular(transformer: ASTTransformer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformerIsFromJestPresetAngular")(transformer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def updateASTTransformers(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    jestConfigPath: String,
    jestConfig: PartialJestConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateASTTransformers")(tree.asInstanceOf[js.Any], jestConfigPath.asInstanceOf[js.Any], jestConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateTransform(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    jestConfigPath: String,
    jestConfig: PartialJestConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTransform")(tree.asInstanceOf[js.Any], jestConfigPath.asInstanceOf[js.Any], jestConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usesJestPresetAngular(jestConfig: PartialJestConfig): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usesJestPresetAngular")(jestConfig.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ASTTransformer extends StObject {
    
    var options: Any
    
    var path: String
  }
  object ASTTransformer {
    
    inline def apply(options: Any, path: String): ASTTransformer = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTTransformer]
    }
    
    extension [Self <: ASTTransformer](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait ASTTransformers extends StObject {
    
    var after: js.Array[ASTTransformer | String]
    
    var afterDeclarations: js.Array[ASTTransformer | String]
    
    var before: js.Array[ASTTransformer | String]
  }
  object ASTTransformers {
    
    inline def apply(
      after: js.Array[ASTTransformer | String],
      afterDeclarations: js.Array[ASTTransformer | String],
      before: js.Array[ASTTransformer | String]
    ): ASTTransformers = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterDeclarations = afterDeclarations.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTTransformers]
    }
    
    extension [Self <: ASTTransformers](x: Self) {
      
      inline def setAfter(value: js.Array[ASTTransformer | String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterDeclarations(value: js.Array[ASTTransformer | String]): Self = StObject.set(x, "afterDeclarations", value.asInstanceOf[js.Any])
      
      inline def setAfterDeclarationsVarargs(value: (ASTTransformer | String)*): Self = StObject.set(x, "afterDeclarations", js.Array(value*))
      
      inline def setAfterVarargs(value: (ASTTransformer | String)*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[ASTTransformer | String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeVarargs(value: (ASTTransformer | String)*): Self = StObject.set(x, "before", js.Array(value*))
    }
  }
  
  trait PartialJestConfig extends StObject {
    
    var globals: Tsjest
    
    var transform: js.UndefOr[Record[String, String]] = js.undefined
  }
  object PartialJestConfig {
    
    inline def apply(globals: Tsjest): PartialJestConfig = {
      val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialJestConfig]
    }
    
    extension [Self <: PartialJestConfig](x: Self) {
      
      inline def setGlobals(value: Tsjest): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Record[String, String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
