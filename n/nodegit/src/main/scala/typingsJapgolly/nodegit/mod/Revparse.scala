package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typingsJapgolly.nodegit.revParseMod.Revparse

/* static members */
@JSImport("nodegit", "Revparse")
@js.native
object Revparse extends js.Object {
  def ext(
    objectOut: typingsJapgolly.nodegit.objectMod.Object,
    referenceOut: typingsJapgolly.nodegit.referenceMod.Reference,
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = js.native
  def single(repo: typingsJapgolly.nodegit.repositoryMod.Repository, spec: String): js.Promise[typingsJapgolly.nodegit.objectMod.Object] = js.native
}

