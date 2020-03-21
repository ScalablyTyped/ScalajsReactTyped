package typingsJapgolly.fsMerger.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fsMerger.AnonEncoding
import typingsJapgolly.fsMerger.AnonWithFileTypes
import typingsJapgolly.fsMerger.Fn0
import typingsJapgolly.fsMerger.FnCall
import typingsJapgolly.fsMerger.FnCallPathOptions
import typingsJapgolly.fsMerger.Typeofreaddir
import typingsJapgolly.fsMerger.fsMergerStrings.buffer
import typingsJapgolly.node.Anon4
import typingsJapgolly.node.Anon5
import typingsJapgolly.node.AnonEncodingFlag
import typingsJapgolly.node.AnonEncodingWithFileTypes
import typingsJapgolly.node.AnonFlag
import typingsJapgolly.node.AnonFlagString
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Dirent
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.walkSync.mod.WalkSyncEntry
import typingsJapgolly.walkSync.mod.WalkSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSMerger extends js.Object {
  var MAP: StringDictionary[FSMergerObject] | Null = js.native
  var PREFIXINDEXMAP: NumberDictionary[FSMergerObject] = js.native
  var _atList: js.Array[FSMerger] = js.native
  var _dirList: js.Array[Node] = js.native
  @JSName("entries")
  var entries_Original: Fn0 = js.native
  var fs: FS = js.native
  @JSName("readFileSync")
  var readFileSync_Original: FnCall = js.native
  var readdir: Typeofreaddir = js.native
  @JSName("readdirSync")
  var readdirSync_Original: FnCallPathOptions = js.native
  def _generateMap(): Unit = js.native
  def at(index: Double): FSMerger = js.native
  def entries(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ _
  ] = js.native
  def entries(
    dirPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ _
  ] = js.native
  def entries(path: String): js.Array[WalkSyncEntry] = js.native
  def entries(path: String, options: WalkSyncOptions): js.Array[WalkSyncEntry] = js.native
  def readFileMeta(filePath: String): js.UndefOr[FileMeta] = js.native
  def readFileMeta(filePath: String, options: FileMetaOption): FileMeta = js.native
  @JSName("readFileMeta")
  def readFileMeta_Union(filePath: String, options: FileMetaOption): js.UndefOr[FileMeta] = js.native
  def readFileSync(filePath: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: AnonEncoding): js.UndefOr[FileContent] = js.native
  def readFileSync(path: Double): String | Buffer = js.native
  def readFileSync(path: Double, options: String): String = js.native
  def readFileSync(path: Double, options: AnonEncodingFlag): String = js.native
  def readFileSync(path: Double, options: AnonFlag): Buffer = js.native
  def readFileSync(path: Double, options: AnonFlagString): String | Buffer = js.native
  def readFileSync(path: PathLike): String | Buffer = js.native
  def readFileSync(path: PathLike, options: String): String = js.native
  def readFileSync(path: PathLike, options: AnonEncodingFlag): String = js.native
  def readFileSync(path: PathLike, options: AnonFlag): Buffer = js.native
  def readFileSync(path: PathLike, options: AnonFlagString): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: Double): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double, options: String): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike, options: String): String | Buffer = js.native
  def readdir(
    dirPath: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: AnonWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdirSync(dirPath: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: AnonWithFileTypes): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: typingsJapgolly.node.AnonWithFileTypes): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

