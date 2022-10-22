package typingsJapgolly.expoMetroConfig

import typingsJapgolly.expoMetroConfig.buildTransformerCreateMultiRuleTransformerMod.Rule
import typingsJapgolly.metroConfig.configTypesMod.ConfigT
import typingsJapgolly.metroConfig.configTypesMod.InputConfigT
import typingsJapgolly.metroConfig.configTypesMod.YargArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Folders extends StObject {
    
    var folders: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Folders {
    
    inline def apply(): Folders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Folders]
    }
    
    extension [Self <: Folders](x: Self) {
      
      inline def setFolders(value: js.Array[String]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setFoldersVarargs(value: String*): Self = StObject.set(x, "folders", js.Array(value*))
    }
  }
  
  trait FoldersModuleIds extends StObject {
    
    var folders: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleIds: js.Array[String]
  }
  object FoldersModuleIds {
    
    inline def apply(moduleIds: js.Array[String]): FoldersModuleIds = {
      val __obj = js.Dynamic.literal(moduleIds = moduleIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoldersModuleIds]
    }
    
    extension [Self <: FoldersModuleIds](x: Self) {
      
      inline def setFolders(value: js.Array[String]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setFoldersVarargs(value: String*): Self = StObject.set(x, "folders", js.Array(value*))
      
      inline def setModuleIds(value: js.Array[String]): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      inline def setModuleIdsVarargs(value: String*): Self = StObject.set(x, "moduleIds", js.Array(value*))
    }
  }
  
  trait GetRuleType extends StObject {
    
    def getRuleType(
      args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ Any
    ): String
    
    var rules: js.Array[Rule]
  }
  object GetRuleType {
    
    inline def apply(
      getRuleType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ Any => String,
      rules: js.Array[Rule]
    ): GetRuleType = {
      val __obj = js.Dynamic.literal(getRuleType = js.Any.fromFunction1(getRuleType), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleType]
    }
    
    extension [Self <: GetRuleType](x: Self) {
      
      inline def setGetRuleType(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ Any => String
      ): Self = StObject.set(x, "getRuleType", js.Any.fromFunction1(value))
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  trait ModuleIds extends StObject {
    
    var folders: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ModuleIds {
    
    inline def apply(): ModuleIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleIds]
    }
    
    extension [Self <: ModuleIds](x: Self) {
      
      inline def setFolders(value: js.Array[String]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setFoldersVarargs(value: String*): Self = StObject.set(x, "folders", js.Array(value*))
      
      inline def setModuleIds(value: js.Array[String]): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      inline def setModuleIdsVarargs(value: String*): Self = StObject.set(x, "moduleIds", js.Array(value*))
    }
  }
  
  trait NodeModulesPaths extends StObject {
    
    var nodeModulesPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var transpileModules: js.UndefOr[js.Array[String]] = js.undefined
  }
  object NodeModulesPaths {
    
    inline def apply(): NodeModulesPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeModulesPaths]
    }
    
    extension [Self <: NodeModulesPaths](x: Self) {
      
      inline def setNodeModulesPaths(value: js.Array[String]): Self = StObject.set(x, "nodeModulesPaths", value.asInstanceOf[js.Any])
      
      inline def setNodeModulesPathsUndefined: Self = StObject.set(x, "nodeModulesPaths", js.undefined)
      
      inline def setNodeModulesPathsVarargs(value: String*): Self = StObject.set(x, "nodeModulesPaths", js.Array(value*))
      
      inline def setTranspileModules(value: js.Array[String]): Self = StObject.set(x, "transpileModules", value.asInstanceOf[js.Any])
      
      inline def setTranspileModulesUndefined: Self = StObject.set(x, "transpileModules", js.undefined)
      
      inline def setTranspileModulesVarargs(value: String*): Self = StObject.set(x, "transpileModules", js.Array(value*))
    }
  }
  
  @js.native
  trait TypeofMetroConfig extends StObject {
    
    def loadConfig(): js.Promise[ConfigT] = js.native
    def loadConfig(argv: Unit, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = js.native
    def loadConfig(argv: YargArguments): js.Promise[ConfigT] = js.native
    def loadConfig(argv: YargArguments, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = js.native
  }
}
