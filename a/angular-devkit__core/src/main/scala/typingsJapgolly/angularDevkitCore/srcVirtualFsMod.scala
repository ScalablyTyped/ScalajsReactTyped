package typingsJapgolly.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularDevkitCore.srcUtilsLiteralsMod.TemplateTag
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostCreateMod.SyncHostHandler
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.ReadonlyHost
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PosixPath
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.WindowsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs", "InvalidPathException")
  @js.native
  open class InvalidPathException protected ()
    extends typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.InvalidPathException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs", "NormalizedRoot")
  @js.native
  val NormalizedRoot: Path_ = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs", "NormalizedSep")
  @js.native
  val NormalizedSep: Path_ = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs", "PathCannotBeFragmentException")
  @js.native
  open class PathCannotBeFragmentException protected ()
    extends typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathCannotBeFragmentException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs", "PathMustBeAbsoluteException")
  @js.native
  open class PathMustBeAbsoluteException protected ()
    extends typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathMustBeAbsoluteException {
    def this(path: String) = this()
  }
  
  inline def asPosixPath(path: Path_): PosixPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asPosixPath")(path.asInstanceOf[js.Any]).asInstanceOf[PosixPath]
  
  inline def asWindowsPath(path: Path_): WindowsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asWindowsPath")(path.asInstanceOf[js.Any]).asInstanceOf[WindowsPath]
  
  inline def basename(path: Path_): PathFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[PathFragment]
  
  inline def dirname(path: Path_): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]
  
  inline def extname(path: Path_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fragment(path: String): PathFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(path.asInstanceOf[js.Any]).asInstanceOf[PathFragment]
  
  inline def getSystemPath(path: Path_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(p: Path_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(p1: Path_, others: String*): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(p1.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Path_]
  
  inline def noCacheNormalize(path: String): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("noCacheNormalize")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]
  
  inline def normalize(path: String): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]
  
  @JSImport("@angular-devkit/core/src/virtual-fs", "path")
  @js.native
  val path: TemplateTag[Path_] = js.native
  
  inline def relative(from: Path_, to: Path_): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def resetNormalizeCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetNormalizeCache")().asInstanceOf[Unit]
  
  inline def resolve(p1: Path_, p2: Path_): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def split(path: Path_): js.Array[PathFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathFragment]]
  
  object virtualFs {
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.AliasHost")
    @js.native
    open class AliasHost[StatsT /* <: js.Object */] protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.AliasHost[StatsT] {
      def this(_delegate: Host[StatsT]) = this()
    }
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.CordHost")
    @js.native
    open class CordHost protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.CordHost {
      def this(_back: ReadonlyHost[js.Object]) = this()
    }
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.Empty")
    @js.native
    open class Empty ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.Empty
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.PatternMatchingHost")
    @js.native
    open class PatternMatchingHost[StatsT /* <: js.Object */] protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.PatternMatchingHost[StatsT] {
      def this(_delegate: Host[StatsT]) = this()
    }
    
    /* note: abstract class */ @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.ResolverHost")
    @js.native
    open class ResolverHost[T /* <: js.Object */] protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.ResolverHost[T] {
      def this(_delegate: Host[T]) = this()
    }
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.SafeReadonlyHost")
    @js.native
    open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.SafeReadonlyHost[StatsT] {
      def this(_delegate: ReadonlyHost[StatsT]) = this()
    }
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.ScopedHost")
    @js.native
    open class ScopedHost[T /* <: js.Object */] protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.ScopedHost[T] {
      def this(delegate: Host[T]) = this()
      def this(delegate: Host[T], _root: Path_) = this()
    }
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.SimpleMemoryHost")
    @js.native
    open class SimpleMemoryHost ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.SimpleMemoryHost
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.SyncDelegateHost")
    @js.native
    open class SyncDelegateHost[T /* <: js.Object */] protected ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.SyncDelegateHost[T] {
      def this(_delegate: Host[T]) = this()
    }
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.SynchronousDelegateExpectedException")
    @js.native
    open class SynchronousDelegateExpectedException ()
      extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.SynchronousDelegateExpectedException
    
    inline def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncHost")(handler.asInstanceOf[js.Any]).asInstanceOf[Host[StatsT]]
    
    @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.fileBuffer")
    @js.native
    val fileBuffer: TemplateTag[js.typedarray.ArrayBuffer] = js.native
    
    inline def fileBufferToString(fileBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileBufferToString")(fileBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringToFileBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFileBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    object test {
      
      @JSImport("@angular-devkit/core/src/virtual-fs", "virtualFs.test.TestHost")
      @js.native
      open class TestHost ()
        extends typingsJapgolly.angularDevkitCore.srcVirtualFsHostMod.test.TestHost {
        def this(map: StringDictionary[String]) = this()
      }
    }
  }
}
