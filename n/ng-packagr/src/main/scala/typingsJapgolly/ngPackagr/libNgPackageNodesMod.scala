package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.anon.AnalysesSourcesFileCache
import typingsJapgolly.ngPackagr.anon.Content
import typingsJapgolly.ngPackagr.anon.DestinationFiles
import typingsJapgolly.ngPackagr.libFileSystemFileCacheMod.FileCache
import typingsJapgolly.ngPackagr.libGraphBuildGraphMod.ComplexPredicate
import typingsJapgolly.ngPackagr.libGraphNodeMod.Node
import typingsJapgolly.ngPackagr.libNgPackageNgccCacheMod.NgccProcessingCache
import typingsJapgolly.ngPackagr.libNgPackagePackageMod.NgPackage
import typingsJapgolly.ngPackagr.ngPackagrStrings.DIR
import typingsJapgolly.ngPackagr.ngPackagrStrings.FILE
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageNodesMod {
  
  @JSImport("ng-packagr/lib/ng-package/nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr/lib/ng-package/nodes", "EntryPointNode")
  @js.native
  open class EntryPointNode protected () extends Node {
    def this(
      url: String,
      sourcesFileCache: FileCache,
      ngccProcessingCache: NgccProcessingCache,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
    
    var cache: AnalysesSourcesFileCache = js.native
    
    @JSName("data")
    var data_EntryPointNode: DestinationFiles = js.native
  }
  
  @JSImport("ng-packagr/lib/ng-package/nodes", "PackageNode")
  @js.native
  open class PackageNode protected () extends Node {
    def this(url: String) = this()
    
    var cache: typingsJapgolly.ngPackagr.anon.GlobCache = js.native
    
    @JSName("data")
    var data_PackageNode: NgPackage = js.native
  }
  
  @JSImport("ng-packagr/lib/ng-package/nodes", "TYPE_NG_ENTRY_POINT")
  @js.native
  val TYPE_NG_ENTRY_POINT: /* "application/ng-entry-point" */ String = js.native
  
  @JSImport("ng-packagr/lib/ng-package/nodes", "TYPE_NG_PACKAGE")
  @js.native
  val TYPE_NG_PACKAGE: /* "application/ng-package" */ String = js.native
  
  @JSImport("ng-packagr/lib/ng-package/nodes", "URL_PROTOCOL_FILE")
  @js.native
  val URL_PROTOCOL_FILE: /* "file://" */ String = js.native
  
  @JSImport("ng-packagr/lib/ng-package/nodes", "URL_PROTOCOL_NG")
  @js.native
  val URL_PROTOCOL_NG: /* "ng://" */ String = js.native
  
  inline def byEntryPoint(): ComplexPredicate[EntryPointNode, EntryPointNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("byEntryPoint")().asInstanceOf[ComplexPredicate[EntryPointNode, EntryPointNode]]
  
  inline def fileUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileUrlPath(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileUrlPath")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isEntryPoint(node: Node): /* is ng-packagr.ng-packagr/lib/ng-package/nodes.EntryPointNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntryPoint")(node.asInstanceOf[js.Any]).asInstanceOf[/* is ng-packagr.ng-packagr/lib/ng-package/nodes.EntryPointNode */ Boolean]
  
  inline def isEntryPointDirty(): ComplexPredicate[EntryPointNode, EntryPointNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntryPointDirty")().asInstanceOf[ComplexPredicate[EntryPointNode, EntryPointNode]]
  
  inline def isEntryPointInProgress(): ComplexPredicate[EntryPointNode, EntryPointNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntryPointInProgress")().asInstanceOf[ComplexPredicate[EntryPointNode, EntryPointNode]]
  
  inline def isFileUrl(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileUrl")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPackage(node: Node): /* is ng-packagr.ng-packagr/lib/ng-package/nodes.PackageNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackage")(node.asInstanceOf[js.Any]).asInstanceOf[/* is ng-packagr.ng-packagr/lib/ng-package/nodes.PackageNode */ Boolean]
  
  inline def ngUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ngUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type GlobCache = Record[String, Boolean | DIR | FILE | js.Array[String]]
  
  type OutputFileCache = Map[String, Content]
}
