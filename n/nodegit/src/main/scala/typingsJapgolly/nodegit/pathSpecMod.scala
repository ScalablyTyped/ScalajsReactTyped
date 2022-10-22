package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.diffDeltaMod.DiffDelta
import typingsJapgolly.nodegit.diffMod.Diff
import typingsJapgolly.nodegit.mod.Index
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`16`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2`
import typingsJapgolly.nodegit.nodegitInts.`32`
import typingsJapgolly.nodegit.nodegitInts.`4`
import typingsJapgolly.nodegit.nodegitInts.`8`
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.strArrayMod.Strarray
import typingsJapgolly.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathSpecMod {
  
  @JSImport("nodegit/path-spec", "Pathspec")
  @js.native
  open class Pathspec () extends StObject {
    
    def free(): Unit = js.native
    
    def matchDiff(diff: Diff, flags: Double): js.Promise[Any] = js.native
    
    def matchIndex(index: Index, flags: Double): js.Promise[Any] = js.native
    
    def matchTree(tree: Tree, flags: Double): js.Promise[Any] = js.native
    
    def matchWorkdir(repo: Repository, flags: Double): js.Promise[Any] = js.native
    
    def matchesPath(flags: Double, path: String): Double = js.native
  }
  /* static members */
  object Pathspec {
    
    @JSImport("nodegit/path-spec", "Pathspec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(pathspec: String): Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[Pathspec]
    inline def create(pathspec: js.Array[String]): Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[Pathspec]
    inline def create(pathspec: Strarray): Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[Pathspec]
    
    inline def matchListDiffEntry(m: Any, pos: Double): DiffDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListDiffEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[DiffDelta]
    
    inline def matchListEntry(m: Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def matchListEntrycount(m: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def matchListFailedEntry(m: Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def matchListFailedEntrycount(m: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`8`
      - typingsJapgolly.nodegit.nodegitInts.`16`
      - typingsJapgolly.nodegit.nodegitInts.`32`
    */
    trait FLAG extends StObject
    object FLAG {
      
      inline def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      inline def FAILURES_ONLY: `32` = 32.asInstanceOf[`32`]
      
      inline def FIND_FAILURES: `16` = 16.asInstanceOf[`16`]
      
      inline def IGNORE_CASE: `1` = 1.asInstanceOf[`1`]
      
      inline def NO_GLOB: `4` = 4.asInstanceOf[`4`]
      
      inline def NO_MATCH_ERROR: `8` = 8.asInstanceOf[`8`]
      
      inline def USE_CASE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
