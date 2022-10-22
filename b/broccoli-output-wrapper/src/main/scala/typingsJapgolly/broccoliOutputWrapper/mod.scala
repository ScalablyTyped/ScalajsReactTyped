package typingsJapgolly.broccoliOutputWrapper

import typingsJapgolly.broccoliOutputWrapper.anon.Fn0
import typingsJapgolly.broccoliOutputWrapper.anon.FnCall
import typingsJapgolly.broccoliOutputWrapper.anon.FnCallFileDataOptions
import typingsJapgolly.broccoliOutputWrapper.anon.FnCallPathDataOptions
import typingsJapgolly.broccoliOutputWrapper.anon.FnCallPathOptions
import typingsJapgolly.broccoliOutputWrapper.anon.FnCallTargetPathType
import typingsJapgolly.broccoliOutputWrapper.anon.Recursive
import typingsJapgolly.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.anon.EncodingFlag
import typingsJapgolly.node.anon.EncodingWithFileTypes
import typingsJapgolly.node.anon.Flag
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecur
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecurMode
import typingsJapgolly.node.anon.ObjectEncodingOptionsflagEncoding
import typingsJapgolly.node.anon.ObjectEncodingOptionswith
import typingsJapgolly.node.anon.ObjectEncodingOptionswithEncoding
import typingsJapgolly.node.anon.StatSyncOptionsbigintbool
import typingsJapgolly.node.anon.StatSyncOptionsbigintfals
import typingsJapgolly.node.anon.StatSyncOptionsbigintfalsBigint
import typingsJapgolly.node.anon.StatSyncOptionsbiginttrue
import typingsJapgolly.node.anon.StatSyncOptionsbiginttrueBigint
import typingsJapgolly.node.anon.WithFileTypes
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.Dirent
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.Mode
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.StatSyncFn
import typingsJapgolly.node.fsMod.StatSyncOptions
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.node.fsMod.TimeLike
import typingsJapgolly.node.fsMod.WriteFileOptions
import typingsJapgolly.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(node: Any): FSOutput = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[FSOutput]
  
  @JSImport("broccoli-output-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FSOutput extends StObject {
    
    def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = js.native
    def appendFileSync(path: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
    def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = js.native
    def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
    @JSName("appendFileSync")
    var appendFileSync_Original: FnCallPathDataOptions = js.native
    
    def existsSync(path: PathLike): Boolean = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    
    def lstatSync(path: PathLike): Stats = js.native
    def lstatSync(path: PathLike, options: Unit): Stats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
    @JSName("lstatSync")
    var lstatSync_Original: StatSyncFn = js.native
    @JSName("lstatSync")
    def lstatSync_Union(path: PathLike): js.UndefOr[Stats] = js.native
    
    def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn0 = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
    
    def readFileSync(path: PathOrFileDescriptor): String | Buffer = js.native
    def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = js.native
    
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: EncodingWithFileTypes): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    
    def rmdirSync(path: String): Unit = js.native
    def rmdirSync(path: String, options: Recursive): Unit = js.native
    
    def statSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike, options: Unit): Stats = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
    def statSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
    @JSName("statSync")
    var statSync_Original: StatSyncFn = js.native
    @JSName("statSync")
    def statSync_Union(path: PathLike): js.UndefOr[Stats] = js.native
    
    def symlinkOrCopySync(srcPath: String, destPath: String): Unit = js.native
    
    def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
    def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
    @JSName("symlinkSync")
    var symlinkSync_Original: FnCallTargetPathType = js.native
    
    def unlinkSync(path: PathLike): Unit = js.native
    @JSName("unlinkSync")
    var unlinkSync_Original: js.Function1[/* path */ PathLike, Unit] = js.native
    
    def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = js.native
    @JSName("utimesSync")
    var utimesSync_Original: js.Function3[/* path */ PathLike, /* atime */ TimeLike, /* mtime */ TimeLike, Unit] = js.native
    
    def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = js.native
    def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = js.native
    def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallFileDataOptions = js.native
  }
}
