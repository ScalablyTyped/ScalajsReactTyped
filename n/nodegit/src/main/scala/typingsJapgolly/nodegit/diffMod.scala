package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.blobMod.Blob
import typingsJapgolly.nodegit.bufMod.Buf
import typingsJapgolly.nodegit.convenientPatchMod.ConvenientPatch
import typingsJapgolly.nodegit.diffDeltaMod.DiffDelta
import typingsJapgolly.nodegit.diffMod.Diff.FORMAT
import typingsJapgolly.nodegit.diffOptionsMod.DiffOptions
import typingsJapgolly.nodegit.diffPerfDataMod.DiffPerfdata
import typingsJapgolly.nodegit.diffStatsMod.DiffStats
import typingsJapgolly.nodegit.indexMod.Index
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1024`
import typingsJapgolly.nodegit.nodegitInts.`1048576`
import typingsJapgolly.nodegit.nodegitInts.`1073741824`
import typingsJapgolly.nodegit.nodegitInts.`10`
import typingsJapgolly.nodegit.nodegitInts.`128`
import typingsJapgolly.nodegit.nodegitInts.`131072`
import typingsJapgolly.nodegit.nodegitInts.`16384`
import typingsJapgolly.nodegit.nodegitInts.`16777216`
import typingsJapgolly.nodegit.nodegitInts.`16`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2048`
import typingsJapgolly.nodegit.nodegitInts.`2097152`
import typingsJapgolly.nodegit.nodegitInts.`255`
import typingsJapgolly.nodegit.nodegitInts.`256`
import typingsJapgolly.nodegit.nodegitInts.`268435456`
import typingsJapgolly.nodegit.nodegitInts.`2`
import typingsJapgolly.nodegit.nodegitInts.`32768`
import typingsJapgolly.nodegit.nodegitInts.`32`
import typingsJapgolly.nodegit.nodegitInts.`33554432`
import typingsJapgolly.nodegit.nodegitInts.`3`
import typingsJapgolly.nodegit.nodegitInts.`4096`
import typingsJapgolly.nodegit.nodegitInts.`4194304`
import typingsJapgolly.nodegit.nodegitInts.`43`
import typingsJapgolly.nodegit.nodegitInts.`45`
import typingsJapgolly.nodegit.nodegitInts.`48`
import typingsJapgolly.nodegit.nodegitInts.`4`
import typingsJapgolly.nodegit.nodegitInts.`512`
import typingsJapgolly.nodegit.nodegitInts.`536870912`
import typingsJapgolly.nodegit.nodegitInts.`5`
import typingsJapgolly.nodegit.nodegitInts.`60`
import typingsJapgolly.nodegit.nodegitInts.`61`
import typingsJapgolly.nodegit.nodegitInts.`62`
import typingsJapgolly.nodegit.nodegitInts.`64`
import typingsJapgolly.nodegit.nodegitInts.`65536`
import typingsJapgolly.nodegit.nodegitInts.`66`
import typingsJapgolly.nodegit.nodegitInts.`67108864`
import typingsJapgolly.nodegit.nodegitInts.`6`
import typingsJapgolly.nodegit.nodegitInts.`70`
import typingsJapgolly.nodegit.nodegitInts.`72`
import typingsJapgolly.nodegit.nodegitInts.`7`
import typingsJapgolly.nodegit.nodegitInts.`8192`
import typingsJapgolly.nodegit.nodegitInts.`8388608`
import typingsJapgolly.nodegit.nodegitInts.`8`
import typingsJapgolly.nodegit.nodegitInts.`9`
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("nodegit/diff", "Diff")
  @js.native
  open class Diff () extends StObject {
    
    def findSimilar(): js.Promise[Double] = js.native
    def findSimilar(options: DiffFindOptions): js.Promise[Double] = js.native
    
    def getDelta(idx: Double): DiffDelta = js.native
    
    def getPerfdata(): js.Promise[DiffPerfdata] = js.native
    
    /**
      * @returns - Structure containg the diff statistics.
      */
    def getStats(): js.Promise[DiffStats] = js.native
    
    def merge(from: Diff): js.Promise[Double] = js.native
    
    def numDeltas(): Double = js.native
    
    /**
      * Retrieve patches in this difflist
      *
      *
      */
    def patches(): js.Promise[js.Array[ConvenientPatch]] = js.native
    
    def toBuf(format: FORMAT): js.Promise[Buf] = js.native
  }
  /* static members */
  object Diff {
    
    @JSImport("nodegit/diff", "Diff")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Directly run a diff between a blob and a buffer.
      *
      *
      */
    inline def blobToBuffer(
      oldBlob: js.UndefOr[Blob],
      oldAsPath: js.UndefOr[String],
      buffer: js.UndefOr[String],
      bufferAsPath: js.UndefOr[String],
      opts: js.UndefOr[DiffOptions],
      fileCb: js.UndefOr[js.Function],
      binaryCb: js.UndefOr[js.Function],
      hunkCb: js.UndefOr[js.Function],
      lineCb: js.UndefOr[js.Function]
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobToBuffer")(oldBlob.asInstanceOf[js.Any], oldAsPath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], bufferAsPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fileCb.asInstanceOf[js.Any], binaryCb.asInstanceOf[js.Any], hunkCb.asInstanceOf[js.Any], lineCb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def fromBuffer(content: String, contentLen: Double): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(content.asInstanceOf[js.Any], contentLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    inline def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    inline def indexToWorkdir(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    inline def indexToWorkdir(repo: Repository, index: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def indexToWorkdir(repo: Repository, index: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def indexToWorkdir(repo: Repository, index: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    inline def treeToIndex(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Unit, index: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Unit, index: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Unit, index: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Tree, index: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Tree, index: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToIndex(repo: Repository, oldTree: Tree, index: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    inline def treeToTree(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Unit, new_tree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Unit, new_tree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Unit, new_tree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Tree, new_tree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    inline def treeToWorkdir(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    inline def treeToWorkdir(repo: Repository, oldTree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToWorkdir(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToWorkdir(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    inline def treeToWorkdirWithIndex(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    inline def treeToWorkdirWithIndex(repo: Repository, oldTree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    inline def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`3`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`5`
      - typingsJapgolly.nodegit.nodegitInts.`6`
      - typingsJapgolly.nodegit.nodegitInts.`7`
      - typingsJapgolly.nodegit.nodegitInts.`8`
      - typingsJapgolly.nodegit.nodegitInts.`9`
      - typingsJapgolly.nodegit.nodegitInts.`10`
    */
    trait DELTA extends StObject
    object DELTA {
      
      inline def ADDED: `1` = 1.asInstanceOf[`1`]
      
      inline def CONFLICTED: `10` = 10.asInstanceOf[`10`]
      
      inline def COPIED: `5` = 5.asInstanceOf[`5`]
      
      inline def DELETED: `2` = 2.asInstanceOf[`2`]
      
      inline def IGNORED: `6` = 6.asInstanceOf[`6`]
      
      inline def MODIFIED: `3` = 3.asInstanceOf[`3`]
      
      inline def RENAMED: `4` = 4.asInstanceOf[`4`]
      
      inline def TYPECHANGE: `8` = 8.asInstanceOf[`8`]
      
      inline def UNMODIFIED: `0` = 0.asInstanceOf[`0`]
      
      inline def UNREADABLE: `9` = 9.asInstanceOf[`9`]
      
      inline def UNTRACKED: `7` = 7.asInstanceOf[`7`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`8`
      - typingsJapgolly.nodegit.nodegitInts.`16`
      - typingsJapgolly.nodegit.nodegitInts.`32`
      - typingsJapgolly.nodegit.nodegitInts.`48`
      - typingsJapgolly.nodegit.nodegitInts.`64`
      - typingsJapgolly.nodegit.nodegitInts.`255`
      - typingsJapgolly.nodegit.nodegitInts.`4096`
      - typingsJapgolly.nodegit.nodegitInts.`8192`
      - typingsJapgolly.nodegit.nodegitInts.`16384`
      - typingsJapgolly.nodegit.nodegitInts.`32768`
      - typingsJapgolly.nodegit.nodegitInts.`65536`
    */
    trait FIND extends StObject
    object FIND {
      
      inline def ALL: `255` = 255.asInstanceOf[`255`]
      
      inline def AND_BREAK_REWRITES: `48` = 48.asInstanceOf[`48`]
      
      inline def BREAK_REWRITES: `32` = 32.asInstanceOf[`32`]
      
      inline def BREAK_REWRITES_FOR_RENAMES_ONLY: `32768` = 32768.asInstanceOf[`32768`]
      
      inline def BY_CONFIG: `0` = 0.asInstanceOf[`0`]
      
      inline def COPIES: `4` = 4.asInstanceOf[`4`]
      
      inline def COPIES_FROM_UNMODIFIED: `8` = 8.asInstanceOf[`8`]
      
      inline def DONT_IGNORE_WHITESPACE: `8192` = 8192.asInstanceOf[`8192`]
      
      inline def EXACT_MATCH_ONLY: `16384` = 16384.asInstanceOf[`16384`]
      
      inline def FOR_UNTRACKED: `64` = 64.asInstanceOf[`64`]
      
      inline def IGNORE_LEADING_WHITESPACE: `0` = 0.asInstanceOf[`0`]
      
      inline def IGNORE_WHITESPACE: `4096` = 4096.asInstanceOf[`4096`]
      
      inline def REMOVE_UNMODIFIED: `65536` = 65536.asInstanceOf[`65536`]
      
      inline def RENAMES: `1` = 1.asInstanceOf[`1`]
      
      inline def RENAMES_FROM_REWRITES: `2` = 2.asInstanceOf[`2`]
      
      inline def REWRITES: `16` = 16.asInstanceOf[`16`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`8`
    */
    trait FLAG extends StObject
    object FLAG {
      
      inline def BINARY: `1` = 1.asInstanceOf[`1`]
      
      inline def EXISTS: `8` = 8.asInstanceOf[`8`]
      
      inline def NOT_BINARY: `2` = 2.asInstanceOf[`2`]
      
      inline def VALID_ID: `4` = 4.asInstanceOf[`4`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`3`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`5`
    */
    trait FORMAT extends StObject
    object FORMAT {
      
      inline def NAME_ONLY: `4` = 4.asInstanceOf[`4`]
      
      inline def NAME_STATUS: `5` = 5.asInstanceOf[`5`]
      
      inline def PATCH: `1` = 1.asInstanceOf[`1`]
      
      inline def PATCH_HEADER: `2` = 2.asInstanceOf[`2`]
      
      inline def RAW: `3` = 3.asInstanceOf[`3`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
    */
    trait FORMAT_EMAIL_FLAGS extends StObject
    object FORMAT_EMAIL_FLAGS {
      
      inline def FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER: `1` = 1.asInstanceOf[`1`]
      
      inline def FORMAT_EMAIL_NONE: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`32`
      - typingsJapgolly.nodegit.nodegitInts.`43`
      - typingsJapgolly.nodegit.nodegitInts.`45`
      - typingsJapgolly.nodegit.nodegitInts.`61`
      - typingsJapgolly.nodegit.nodegitInts.`62`
      - typingsJapgolly.nodegit.nodegitInts.`60`
      - typingsJapgolly.nodegit.nodegitInts.`70`
      - typingsJapgolly.nodegit.nodegitInts.`72`
      - typingsJapgolly.nodegit.nodegitInts.`66`
    */
    trait LINE extends StObject
    object LINE {
      
      inline def ADDITION: `43` = 43.asInstanceOf[`43`]
      
      inline def ADD_EOFNL: `62` = 62.asInstanceOf[`62`]
      
      inline def BINARY: `66` = 66.asInstanceOf[`66`]
      
      inline def CONTEXT: `32` = 32.asInstanceOf[`32`]
      
      inline def CONTEXT_EOFNL: `61` = 61.asInstanceOf[`61`]
      
      inline def DELETION: `45` = 45.asInstanceOf[`45`]
      
      inline def DEL_EOFNL: `60` = 60.asInstanceOf[`60`]
      
      inline def FILE_HDR: `70` = 70.asInstanceOf[`70`]
      
      inline def HUNK_HDR: `72` = 72.asInstanceOf[`72`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`8`
      - typingsJapgolly.nodegit.nodegitInts.`16`
      - typingsJapgolly.nodegit.nodegitInts.`32`
      - typingsJapgolly.nodegit.nodegitInts.`64`
      - typingsJapgolly.nodegit.nodegitInts.`128`
      - typingsJapgolly.nodegit.nodegitInts.`256`
      - typingsJapgolly.nodegit.nodegitInts.`512`
      - typingsJapgolly.nodegit.nodegitInts.`1024`
      - typingsJapgolly.nodegit.nodegitInts.`2048`
      - typingsJapgolly.nodegit.nodegitInts.`4096`
      - typingsJapgolly.nodegit.nodegitInts.`8192`
      - typingsJapgolly.nodegit.nodegitInts.`16384`
      - typingsJapgolly.nodegit.nodegitInts.`32768`
      - typingsJapgolly.nodegit.nodegitInts.`65536`
      - typingsJapgolly.nodegit.nodegitInts.`131072`
      - typingsJapgolly.nodegit.nodegitInts.`1048576`
      - typingsJapgolly.nodegit.nodegitInts.`2097152`
      - typingsJapgolly.nodegit.nodegitInts.`4194304`
      - typingsJapgolly.nodegit.nodegitInts.`8388608`
      - typingsJapgolly.nodegit.nodegitInts.`16777216`
      - typingsJapgolly.nodegit.nodegitInts.`33554432`
      - typingsJapgolly.nodegit.nodegitInts.`67108864`
      - typingsJapgolly.nodegit.nodegitInts.`268435456`
      - typingsJapgolly.nodegit.nodegitInts.`536870912`
      - typingsJapgolly.nodegit.nodegitInts.`1073741824`
    */
    trait OPTION extends StObject
    object OPTION {
      
      inline def DISABLE_PATHSPEC_MATCH: `4096` = 4096.asInstanceOf[`4096`]
      
      inline def ENABLE_FAST_UNTRACKED_DIRS: `16384` = 16384.asInstanceOf[`16384`]
      
      inline def FORCE_BINARY: `2097152` = 2097152.asInstanceOf[`2097152`]
      
      inline def FORCE_TEXT: `1048576` = 1048576.asInstanceOf[`1048576`]
      
      inline def IGNORE_CASE: `1024` = 1024.asInstanceOf[`1024`]
      
      inline def IGNORE_FILEMODE: `256` = 256.asInstanceOf[`256`]
      
      inline def IGNORE_SUBMODULES: `512` = 512.asInstanceOf[`512`]
      
      inline def IGNORE_WHITESPACE: `4194304` = 4194304.asInstanceOf[`4194304`]
      
      inline def IGNORE_WHITESPACE_CHANGE: `8388608` = 8388608.asInstanceOf[`8388608`]
      
      inline def IGNORE_WHITESPACE_EOL: `16777216` = 16777216.asInstanceOf[`16777216`]
      
      inline def INCLUDE_CASECHANGE: `2048` = 2048.asInstanceOf[`2048`]
      
      inline def INCLUDE_IGNORED: `2` = 2.asInstanceOf[`2`]
      
      inline def INCLUDE_TYPECHANGE: `64` = 64.asInstanceOf[`64`]
      
      inline def INCLUDE_TYPECHANGE_TREES: `128` = 128.asInstanceOf[`128`]
      
      inline def INCLUDE_UNMODIFIED: `32` = 32.asInstanceOf[`32`]
      
      inline def INCLUDE_UNREADABLE: `65536` = 65536.asInstanceOf[`65536`]
      
      inline def INCLUDE_UNREADABLE_AS_UNTRACKED: `131072` = 131072.asInstanceOf[`131072`]
      
      inline def INCLUDE_UNTRACKED: `8` = 8.asInstanceOf[`8`]
      
      inline def MINIMAL: `536870912` = 536870912.asInstanceOf[`536870912`]
      
      inline def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      inline def PATIENCE: `268435456` = 268435456.asInstanceOf[`268435456`]
      
      inline def RECURSE_IGNORED_DIRS: `4` = 4.asInstanceOf[`4`]
      
      inline def RECURSE_UNTRACKED_DIRS: `16` = 16.asInstanceOf[`16`]
      
      inline def REVERSE: `1` = 1.asInstanceOf[`1`]
      
      inline def SHOW_BINARY: `1073741824` = 1073741824.asInstanceOf[`1073741824`]
      
      inline def SHOW_UNMODIFIED: `67108864` = 67108864.asInstanceOf[`67108864`]
      
      inline def SHOW_UNTRACKED_CONTENT: `33554432` = 33554432.asInstanceOf[`33554432`]
      
      inline def SKIP_BINARY_CHECK: `8192` = 8192.asInstanceOf[`8192`]
      
      inline def UPDATE_INDEX: `32768` = 32768.asInstanceOf[`32768`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`8`
    */
    trait STATS_FORMAT extends StObject
    object STATS_FORMAT {
      
      inline def STATS_FULL: `1` = 1.asInstanceOf[`1`]
      
      inline def STATS_INCLUDE_SUMMARY: `8` = 8.asInstanceOf[`8`]
      
      inline def STATS_NONE: `0` = 0.asInstanceOf[`0`]
      
      inline def STATS_NUMBER: `4` = 4.asInstanceOf[`4`]
      
      inline def STATS_SHORT: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  trait DiffFindOptions extends StObject {
    
    var breakRewriteThreshold: js.UndefOr[Double] = js.undefined
    
    var copyThreshold: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var renameFromRewriteThreshold: js.UndefOr[Double] = js.undefined
    
    var renameLimit: js.UndefOr[Double] = js.undefined
    
    var renameThreshold: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object DiffFindOptions {
    
    inline def apply(): DiffFindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffFindOptions]
    }
    
    extension [Self <: DiffFindOptions](x: Self) {
      
      inline def setBreakRewriteThreshold(value: Double): Self = StObject.set(x, "breakRewriteThreshold", value.asInstanceOf[js.Any])
      
      inline def setBreakRewriteThresholdUndefined: Self = StObject.set(x, "breakRewriteThreshold", js.undefined)
      
      inline def setCopyThreshold(value: Double): Self = StObject.set(x, "copyThreshold", value.asInstanceOf[js.Any])
      
      inline def setCopyThresholdUndefined: Self = StObject.set(x, "copyThreshold", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setRenameFromRewriteThreshold(value: Double): Self = StObject.set(x, "renameFromRewriteThreshold", value.asInstanceOf[js.Any])
      
      inline def setRenameFromRewriteThresholdUndefined: Self = StObject.set(x, "renameFromRewriteThreshold", js.undefined)
      
      inline def setRenameLimit(value: Double): Self = StObject.set(x, "renameLimit", value.asInstanceOf[js.Any])
      
      inline def setRenameLimitUndefined: Self = StObject.set(x, "renameLimit", js.undefined)
      
      inline def setRenameThreshold(value: Double): Self = StObject.set(x, "renameThreshold", value.asInstanceOf[js.Any])
      
      inline def setRenameThresholdUndefined: Self = StObject.set(x, "renameThreshold", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
