package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Ignore")
@js.native
class Ignore ()
  extends typingsJapgolly.nodegit.ignoreMod.Ignore

/* static members */
@JSImport("nodegit", "Ignore")
@js.native
object Ignore extends js.Object {
  def addRule(repo: typingsJapgolly.nodegit.repositoryMod.Repository, rules: String): Double = js.native
  def clearInternalRules(repo: typingsJapgolly.nodegit.repositoryMod.Repository): Double = js.native
  def pathIsIgnored(repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): js.Promise[Double] = js.native
}

