package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsJapgolly.nodegit.commitMod.Commit
import typingsJapgolly.nodegit.mod.Index
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1024`
import typingsJapgolly.nodegit.nodegitInts.`1048576`
import typingsJapgolly.nodegit.nodegitInts.`128`
import typingsJapgolly.nodegit.nodegitInts.`131072`
import typingsJapgolly.nodegit.nodegitInts.`16`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2048`
import typingsJapgolly.nodegit.nodegitInts.`2097152`
import typingsJapgolly.nodegit.nodegitInts.`256`
import typingsJapgolly.nodegit.nodegitInts.`262144`
import typingsJapgolly.nodegit.nodegitInts.`2`
import typingsJapgolly.nodegit.nodegitInts.`32`
import typingsJapgolly.nodegit.nodegitInts.`4096`
import typingsJapgolly.nodegit.nodegitInts.`4194304`
import typingsJapgolly.nodegit.nodegitInts.`4`
import typingsJapgolly.nodegit.nodegitInts.`512`
import typingsJapgolly.nodegit.nodegitInts.`524288`
import typingsJapgolly.nodegit.nodegitInts.`64`
import typingsJapgolly.nodegit.nodegitInts.`65535`
import typingsJapgolly.nodegit.nodegitInts.`65536`
import typingsJapgolly.nodegit.nodegitInts.`8192`
import typingsJapgolly.nodegit.nodegitInts.`8388608`
import typingsJapgolly.nodegit.nodegitInts.`8`
import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.referenceMod.Reference
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkoutMod {
  
  @JSImport("nodegit/checkout", "Checkout")
  @js.native
  open class Checkout () extends StObject
  /* static members */
  object Checkout {
    
    @JSImport("nodegit/checkout", "Checkout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Patch head checkout to automatically coerce objects.
      */
    inline def head(repo: Repository): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def head(repo: Repository, options: CheckoutOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Patch index checkout to automatically coerce objects.
      */
    inline def index(repo: Repository, The: Index): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(repo.asInstanceOf[js.Any], The.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def index(repo: Repository, The: Index, options: CheckoutOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(repo.asInstanceOf[js.Any], The.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def initOptions(opts: CheckoutOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tree(repo: Repository, treeish: Commit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def tree(repo: Repository, treeish: Commit, options: CheckoutOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    /**
      * Patch tree checkout to automatically coerce objects.
      */
    inline def tree(repo: Repository, treeish: Oid): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def tree(repo: Repository, treeish: Oid, options: CheckoutOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def tree(repo: Repository, treeish: Reference): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def tree(repo: Repository, treeish: Reference, options: CheckoutOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def tree(repo: Repository, treeish: Tree): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def tree(repo: Repository, treeish: Tree, options: CheckoutOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`8`
      - typingsJapgolly.nodegit.nodegitInts.`16`
      - typingsJapgolly.nodegit.nodegitInts.`65535`
    */
    trait NOTIFY extends StObject
    object NOTIFY {
      
      inline def ALL: `65535` = 65535.asInstanceOf[`65535`]
      
      inline def CONFLICT: `1` = 1.asInstanceOf[`1`]
      
      inline def DIRTY: `2` = 2.asInstanceOf[`2`]
      
      inline def IGNORED: `16` = 16.asInstanceOf[`16`]
      
      inline def NONE: `0` = 0.asInstanceOf[`0`]
      
      inline def UNTRACKED: `8` = 8.asInstanceOf[`8`]
      
      inline def UPDATED: `4` = 4.asInstanceOf[`4`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
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
      - typingsJapgolly.nodegit.nodegitInts.`262144`
      - typingsJapgolly.nodegit.nodegitInts.`524288`
      - typingsJapgolly.nodegit.nodegitInts.`1048576`
      - typingsJapgolly.nodegit.nodegitInts.`2097152`
      - typingsJapgolly.nodegit.nodegitInts.`4194304`
      - typingsJapgolly.nodegit.nodegitInts.`8388608`
      - typingsJapgolly.nodegit.nodegitInts.`65536`
      - typingsJapgolly.nodegit.nodegitInts.`131072`
    */
    trait STRATEGY extends StObject
    object STRATEGY {
      
      inline def ALLOW_CONFLICTS: `16` = 16.asInstanceOf[`16`]
      
      inline def CONFLICT_STYLE_DIFF3: `2097152` = 2097152.asInstanceOf[`2097152`]
      
      inline def CONFLICT_STYLE_MERGE: `1048576` = 1048576.asInstanceOf[`1048576`]
      
      inline def DISABLE_PATHSPEC_MATCH: `8192` = 8192.asInstanceOf[`8192`]
      
      inline def DONT_OVERWRITE_IGNORED: `524288` = 524288.asInstanceOf[`524288`]
      
      inline def DONT_REMOVE_EXISTING: `4194304` = 4194304.asInstanceOf[`4194304`]
      
      inline def DONT_UPDATE_INDEX: `256` = 256.asInstanceOf[`256`]
      
      inline def DONT_WRITE_INDEX: `8388608` = 8388608.asInstanceOf[`8388608`]
      
      inline def FORCE: `2` = 2.asInstanceOf[`2`]
      
      inline def NONE: `0` = 0.asInstanceOf[`0`]
      
      inline def NO_REFRESH: `512` = 512.asInstanceOf[`512`]
      
      inline def RECREATE_MISSING: `4` = 4.asInstanceOf[`4`]
      
      inline def REMOVE_IGNORED: `64` = 64.asInstanceOf[`64`]
      
      inline def REMOVE_UNTRACKED: `32` = 32.asInstanceOf[`32`]
      
      inline def SAFE: `1` = 1.asInstanceOf[`1`]
      
      inline def SKIP_LOCKED_DIRECTORIES: `262144` = 262144.asInstanceOf[`262144`]
      
      inline def SKIP_UNMERGED: `1024` = 1024.asInstanceOf[`1024`]
      
      inline def UPDATE_ONLY: `128` = 128.asInstanceOf[`128`]
      
      inline def UPDATE_SUBMODULES: `65536` = 65536.asInstanceOf[`65536`]
      
      inline def UPDATE_SUBMODULES_IF_CHANGED: `131072` = 131072.asInstanceOf[`131072`]
      
      inline def USE_OURS: `2048` = 2048.asInstanceOf[`2048`]
      
      inline def USE_THEIRS: `4096` = 4096.asInstanceOf[`4096`]
    }
  }
}
