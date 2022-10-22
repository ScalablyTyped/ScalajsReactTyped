package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.angularCliStrings.directory
import typingsJapgolly.angularCli.angularCliStrings.file
import typingsJapgolly.angularCli.angularCliStrings.git
import typingsJapgolly.angularCli.angularCliStrings.range
import typingsJapgolly.angularCli.angularCliStrings.remote
import typingsJapgolly.angularCli.angularCliStrings.tag
import typingsJapgolly.angularCli.angularCliStrings.version
import typingsJapgolly.angularCli.anon.Migrations
import typingsJapgolly.angularCli.anon.PartialNpmRepositoryPacka
import typingsJapgolly.angularCli.anon.Registry
import typingsJapgolly.angularCli.anon.Save
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typingsJapgolly.pacote.anon.Created
import typingsJapgolly.pacote.anon.Latest
import typingsJapgolly.pacote.mod.Manifest_
import typingsJapgolly.pacote.mod.PackageDist
import typingsJapgolly.pacote.mod.Packument_
import typingsJapgolly.pacote.mod.Person
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesPackageMetadataMod {
  
  @JSImport("@angular/cli/src/utilities/package-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchPackageManifest(name: String, logger: LoggerApi): js.Promise[PackageManifest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchPackageManifest")(name.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageManifest]]
  inline def fetchPackageManifest(name: String, logger: LoggerApi, options: Registry): js.Promise[PackageManifest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchPackageManifest")(name.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageManifest]]
  
  inline def fetchPackageMetadata(name: String, logger: LoggerApi): js.Promise[PackageMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchPackageMetadata")(name.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageMetadata]]
  inline def fetchPackageMetadata(name: String, logger: LoggerApi, options: Registry): js.Promise[PackageMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchPackageMetadata")(name.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageMetadata]]
  
  inline def getNpmPackageJson(packageName: String, logger: LoggerApi): js.Promise[PartialNpmRepositoryPacka] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNpmPackageJson")(packageName.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialNpmRepositoryPacka]]
  inline def getNpmPackageJson(packageName: String, logger: LoggerApi, options: Registry): js.Promise[PartialNpmRepositoryPacka] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNpmPackageJson")(packageName.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialNpmRepositoryPacka]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCli.angularCliStrings.dependencies
    - typingsJapgolly.angularCli.angularCliStrings.devDependencies
    - scala.Boolean
  */
  type NgAddSaveDependency = _NgAddSaveDependency | Boolean
  
  trait NgPackageManifestProperties extends StObject {
    
    var `ng-add`: js.UndefOr[Save] = js.undefined
    
    var `ng-update`: js.UndefOr[Migrations] = js.undefined
  }
  object NgPackageManifestProperties {
    
    inline def apply(): NgPackageManifestProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgPackageManifestProperties]
    }
    
    extension [Self <: NgPackageManifestProperties](x: Self) {
      
      inline def `setNg-add`(value: Save): Self = StObject.set(x, "ng-add", value.asInstanceOf[js.Any])
      
      inline def `setNg-addUndefined`: Self = StObject.set(x, "ng-add", js.undefined)
      
      inline def `setNg-update`(value: Migrations): Self = StObject.set(x, "ng-update", value.asInstanceOf[js.Any])
      
      inline def `setNg-updateUndefined`: Self = StObject.set(x, "ng-update", js.undefined)
    }
  }
  
  trait NpmRepositoryPackageJson
    extends StObject
       with PackageMetadata {
    
    var requestedName: js.UndefOr[String] = js.undefined
  }
  object NpmRepositoryPackageJson {
    
    inline def apply(
      `dist-tags`: Latest & (Record[String, String]),
      maintainers: js.Array[Person],
      name: String,
      tags: Record[String, PackageManifest],
      time: (Record[String, String]) & Created,
      versions: Record[String, PackageManifest]
    ): NpmRepositoryPackageJson = {
      val __obj = js.Dynamic.literal(maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NpmRepositoryPackageJson]
    }
    
    extension [Self <: NpmRepositoryPackageJson](x: Self) {
      
      inline def setRequestedName(value: String): Self = StObject.set(x, "requestedName", value.asInstanceOf[js.Any])
      
      inline def setRequestedNameUndefined: Self = StObject.set(x, "requestedName", js.undefined)
    }
  }
  
  trait PackageIdentifier extends StObject {
    
    var fetchSpec: String
    
    var name: String
    
    var raw: String
    
    var rawSpec: String
    
    var registry: Boolean
    
    var scope: String | Null
    
    var `type`: git | tag | version | range | file | directory | remote
  }
  object PackageIdentifier {
    
    inline def apply(
      fetchSpec: String,
      name: String,
      raw: String,
      rawSpec: String,
      registry: Boolean,
      `type`: git | tag | version | range | file | directory | remote
    ): PackageIdentifier = {
      val __obj = js.Dynamic.literal(fetchSpec = fetchSpec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawSpec = rawSpec.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], scope = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageIdentifier]
    }
    
    extension [Self <: PackageIdentifier](x: Self) {
      
      inline def setFetchSpec(value: String): Self = StObject.set(x, "fetchSpec", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawSpec(value: String): Self = StObject.set(x, "rawSpec", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: Boolean): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setType(value: git | tag | version | range | file | directory | remote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageManifest
    extends StObject
       with Manifest_
       with NgPackageManifestProperties {
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
  }
  object PackageManifest {
    
    inline def apply(
      _id: String,
      _nodeVersion: String,
      _npmUser: Person,
      _npmVersion: String,
      dist: PackageDist,
      maintainers: js.Array[Person],
      name: String,
      version: String
    ): PackageManifest = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _nodeVersion = _nodeVersion.asInstanceOf[js.Any], _npmUser = _npmUser.asInstanceOf[js.Any], _npmVersion = _npmVersion.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageManifest]
    }
    
    extension [Self <: PackageManifest](x: Self) {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    }
  }
  
  trait PackageMetadata
    extends StObject
       with Packument_
       with NgPackageManifestProperties {
    
    var tags: Record[String, PackageManifest]
    
    @JSName("versions")
    var versions_PackageMetadata: Record[String, PackageManifest]
  }
  object PackageMetadata {
    
    inline def apply(
      `dist-tags`: Latest & (Record[String, String]),
      maintainers: js.Array[Person],
      name: String,
      tags: Record[String, PackageManifest],
      time: (Record[String, String]) & Created,
      versions: Record[String, PackageManifest]
    ): PackageMetadata = {
      val __obj = js.Dynamic.literal(maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageMetadata]
    }
    
    extension [Self <: PackageMetadata](x: Self) {
      
      inline def setTags(value: Record[String, PackageManifest]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: Record[String, PackageManifest]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait _NgAddSaveDependency extends StObject
}
