package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.repositoryMod.RepositoryInitOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Repository")
@js.native
open class Repository ()
  extends typingsJapgolly.nodegit.repositoryMod.Repository
/* static members */
object Repository {
  
  @JSImport("nodegit", "Repository")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a branch with the passed in name pointing to the commit
    */
  inline def discover(startPath: String, acrossFs: Double, ceilingDirs: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("discover")(startPath.asInstanceOf[js.Any], acrossFs.asInstanceOf[js.Any], ceilingDirs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def init(path: String, isBare: Double): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(path.asInstanceOf[js.Any], isBare.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  
  inline def initExt(repoPath: String): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("initExt")(repoPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  inline def initExt(repoPath: String, options: RepositoryInitOptions): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("initExt")(repoPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  
  inline def open(path: String): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  
  inline def openBare(barePath: String): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("openBare")(barePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  
  inline def openExt(path: String): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  inline def openExt(path: String, flags: Double): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  inline def openExt(path: String, flags: Double, ceilingDirs: String): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], ceilingDirs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  inline def openExt(path: String, flags: Unit, ceilingDirs: String): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], ceilingDirs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  
  inline def openFromWorktree(wt: typingsJapgolly.nodegit.worktreeMod.Worktree): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFromWorktree")(wt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
  
  inline def wrapOdb(odb: typingsJapgolly.nodegit.odbMod.Odb): js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapOdb")(odb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.repositoryMod.Repository]]
}
