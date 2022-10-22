package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.Log
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ProjectType
import typingsJapgolly.ionic.definitionsMod.StarterList
import typingsJapgolly.ionic.definitionsMod.StarterManifest
import typingsJapgolly.ionic.definitionsMod.StarterTemplate
import typingsJapgolly.ionic.ionicBooleans.`false`
import typingsJapgolly.ionic.ionicBooleans.`true`
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStartMod {
  
  @JSImport("ionic/lib/start", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/start", "STARTER_BASE_URL")
  @js.native
  val STARTER_BASE_URL: /* "https://d2ql0qc7j8u4b2.cloudfront.net" */ String = js.native
  
  @JSImport("ionic/lib/start", "STARTER_TEMPLATES")
  @js.native
  val STARTER_TEMPLATES: js.Array[StarterTemplate] = js.native
  
  @JSImport("ionic/lib/start", "SUPPORTED_FRAMEWORKS")
  @js.native
  val SUPPORTED_FRAMEWORKS: js.Array[SupportedFramework] = js.native
  
  inline def getAdvertisement(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdvertisement")().asInstanceOf[String]
  
  inline def getStarterList(config: IConfig): js.Promise[StarterList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStarterList")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StarterList]]
  inline def getStarterList(config: IConfig, tag: String): js.Promise[StarterList] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStarterList")(config.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StarterList]]
  
  inline def getStarterProjectTypes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStarterProjectTypes")().asInstanceOf[js.Array[String]]
  
  inline def readStarterManifest(p: String): js.Promise[StarterManifest] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStarterManifest")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StarterManifest]]
  
  inline def verifyOptions(options: CommandLineOptions, hasLog: Log): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyOptions")(options.asInstanceOf[js.Any], hasLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionic.libStartMod.NewAppSchema
    - typingsJapgolly.ionic.libStartMod.ClonedAppSchema
  */
  trait AppSchema extends StObject
  object AppSchema {
    
    inline def ClonedAppSchema(projectDir: String, projectId: String, url: String): typingsJapgolly.ionic.libStartMod.ClonedAppSchema = {
      val __obj = js.Dynamic.literal(cloned = true, projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ionic.libStartMod.ClonedAppSchema]
    }
    
    inline def NewAppSchema(name: String, projectDir: String, projectId: String, template: String, `type`: ProjectType): typingsJapgolly.ionic.libStartMod.NewAppSchema = {
      val __obj = js.Dynamic.literal(cloned = false, name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ionic.libStartMod.NewAppSchema]
    }
  }
  
  trait BaseAppSchema extends StObject {
    
    var appflowId: js.UndefOr[String] = js.undefined
    
    var packageId: js.UndefOr[String] = js.undefined
    
    var projectDir: String
    
    var projectId: String
  }
  object BaseAppSchema {
    
    inline def apply(projectDir: String, projectId: String): BaseAppSchema = {
      val __obj = js.Dynamic.literal(projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAppSchema]
    }
    
    extension [Self <: BaseAppSchema](x: Self) {
      
      inline def setAppflowId(value: String): Self = StObject.set(x, "appflowId", value.asInstanceOf[js.Any])
      
      inline def setAppflowIdUndefined: Self = StObject.set(x, "appflowId", js.undefined)
      
      inline def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
      
      inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
      
      inline def setProjectDir(value: String): Self = StObject.set(x, "projectDir", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClonedAppSchema
    extends StObject
       with BaseAppSchema
       with AppSchema {
    
    var cloned: `true`
    
    var url: String
  }
  object ClonedAppSchema {
    
    inline def apply(projectDir: String, projectId: String, url: String): ClonedAppSchema = {
      val __obj = js.Dynamic.literal(cloned = true, projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClonedAppSchema]
    }
    
    extension [Self <: ClonedAppSchema](x: Self) {
      
      inline def setCloned(value: `true`): Self = StObject.set(x, "cloned", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewAppSchema
    extends StObject
       with BaseAppSchema
       with AppSchema {
    
    var cloned: `false`
    
    var name: String
    
    var template: String
    
    var `type`: ProjectType
  }
  object NewAppSchema {
    
    inline def apply(name: String, projectDir: String, projectId: String, template: String, `type`: ProjectType): NewAppSchema = {
      val __obj = js.Dynamic.literal(cloned = false, name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewAppSchema]
    }
    
    extension [Self <: NewAppSchema](x: Self) {
      
      inline def setCloned(value: `false`): Self = StObject.set(x, "cloned", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SupportedFramework extends StObject {
    
    var description: String
    
    var name: String
    
    var `type`: ProjectType
  }
  object SupportedFramework {
    
    inline def apply(description: String, name: String, `type`: ProjectType): SupportedFramework = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedFramework]
    }
    
    extension [Self <: SupportedFramework](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
