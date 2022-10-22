package typingsJapgolly.appBuilderLib

import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.builderUtil.outArchMod.ArchType
import typingsJapgolly.builderUtilRuntime.outPublishOptionsMod.AllPublishOptions
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outCoreMod {
  
  @JSImport("app-builder-lib/out/core", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("app-builder-lib/out/core", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("app-builder-lib/out/core", "Platform")
  @js.native
  open class Platform protected () extends StObject {
    def this(
      name: String,
      buildConfigurationKey: String,
      nodeName: typingsJapgolly.node.processMod.global.NodeJS.Platform
    ) = this()
    
    var buildConfigurationKey: String = js.native
    
    def createTarget(`type`: String, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    def createTarget(`type`: js.Array[String], archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    def createTarget(`type`: Null, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    def createTarget(`type`: Unit, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    
    var name: String = js.native
    
    var nodeName: typingsJapgolly.node.processMod.global.NodeJS.Platform = js.native
  }
  /* static members */
  object Platform {
    
    @JSImport("app-builder-lib/out/core", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/core", "Platform.LINUX")
    @js.native
    def LINUX: Platform = js.native
    inline def LINUX_=(x: Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib/out/core", "Platform.MAC")
    @js.native
    def MAC: Platform = js.native
    inline def MAC_=(x: Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib/out/core", "Platform.WINDOWS")
    @js.native
    def WINDOWS: Platform = js.native
    inline def WINDOWS_=(x: Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    inline def current(): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[Platform]
    
    inline def fromString(name: String): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(name.asInstanceOf[js.Any]).asInstanceOf[Platform]
  }
  
  /* note: abstract class */ @JSImport("app-builder-lib/out/core", "Target")
  @js.native
  open class Target protected () extends StObject {
    /* protected */ def this(name: String) = this()
    /* protected */ def this(name: String, isAsyncSupported: Boolean) = this()
    
    def build(appOutDir: String, arch: Arch): js.Promise[Any] = js.native
    
    def checkOptions(): js.Promise[Any] = js.native
    
    def finishBuild(): js.Promise[Any] = js.native
    
    val isAsyncSupported: Boolean = js.native
    
    val name: String = js.native
    
    val options: js.UndefOr[TargetSpecificOptions | Null] = js.native
    
    val outDir: String = js.native
  }
  
  trait BeforeBuildContext extends StObject {
    
    val appDir: String
    
    val arch: String
    
    val electronVersion: String
    
    val platform: Platform
  }
  object BeforeBuildContext {
    
    inline def apply(appDir: String, arch: String, electronVersion: String, platform: Platform): BeforeBuildContext = {
      val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronVersion = electronVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeBuildContext]
    }
    
    extension [Self <: BeforeBuildContext](x: Self) {
      
      inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setElectronVersion(value: String): Self = StObject.set(x, "electronVersion", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.store
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.normal
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.maximum
  */
  trait CompressionLevel extends StObject
  object CompressionLevel {
    
    inline def maximum: typingsJapgolly.appBuilderLib.appBuilderLibStrings.maximum = "maximum".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.maximum]
    
    inline def normal: typingsJapgolly.appBuilderLib.appBuilderLibStrings.normal = "normal".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.normal]
    
    inline def store: typingsJapgolly.appBuilderLib.appBuilderLibStrings.store = "store".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.store]
  }
  
  type Publish = AllPublishOptions | js.Array[AllPublishOptions] | Null
  
  trait SourceRepositoryInfo extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var project: String
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object SourceRepositoryInfo {
    
    inline def apply(project: String, user: String): SourceRepositoryInfo = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceRepositoryInfo]
    }
    
    extension [Self <: SourceRepositoryInfo](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetConfigType = (js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null
  
  trait TargetConfiguration extends StObject {
    
    /**
      * The arch or list of archs.
      */
    val arch: js.UndefOr[js.Array[ArchType] | ArchType] = js.undefined
    
    /**
      * The target name. e.g. `snap`.
      */
    val target: String
  }
  object TargetConfiguration {
    
    inline def apply(target: String): TargetConfiguration = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetConfiguration]
    }
    
    extension [Self <: TargetConfiguration](x: Self) {
      
      inline def setArch(value: js.Array[ArchType] | ArchType): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setArchVarargs(value: ArchType*): Self = StObject.set(x, "arch", js.Array(value*))
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetSpecificOptions extends StObject {
    
    /**
      The [artifact file name template](/configuration/configuration#artifact-file-name-template).
      */
    val artifactName: js.UndefOr[String | Null] = js.undefined
    
    var publish: js.UndefOr[Publish] = js.undefined
  }
  object TargetSpecificOptions {
    
    inline def apply(): TargetSpecificOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetSpecificOptions]
    }
    
    extension [Self <: TargetSpecificOptions](x: Self) {
      
      inline def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      inline def setArtifactNameNull: Self = StObject.set(x, "artifactName", null)
      
      inline def setArtifactNameUndefined: Self = StObject.set(x, "artifactName", js.undefined)
      
      inline def setPublish(value: Publish): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishNull: Self = StObject.set(x, "publish", null)
      
      inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
      
      inline def setPublishVarargs(value: AllPublishOptions*): Self = StObject.set(x, "publish", js.Array(value*))
    }
  }
}
