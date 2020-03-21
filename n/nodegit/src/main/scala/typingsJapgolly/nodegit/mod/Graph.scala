package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Graph")
@js.native
class Graph ()
  extends typingsJapgolly.nodegit.graphMod.Graph

/* static members */
@JSImport("nodegit", "Graph")
@js.native
object Graph extends js.Object {
  def aheadBehind(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    local: typingsJapgolly.nodegit.oidMod.Oid,
    upstream: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
  def descendantOf(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.oidMod.Oid,
    ancestor: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}

