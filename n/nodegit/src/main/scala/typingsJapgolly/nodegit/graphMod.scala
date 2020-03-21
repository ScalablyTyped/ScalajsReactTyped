package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/graph", JSImport.Namespace)
@js.native
object graphMod extends js.Object {
  @js.native
  class Graph () extends js.Object
  
  /* static members */
  @js.native
  object Graph extends js.Object {
    def aheadBehind(repo: Repository, local: Oid, upstream: Oid): js.Promise[Double] = js.native
    def descendantOf(repo: Repository, commit: Oid, ancestor: Oid): js.Promise[Double] = js.native
  }
  
}

