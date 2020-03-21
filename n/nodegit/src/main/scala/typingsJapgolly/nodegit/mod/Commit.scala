package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Commit")
@js.native
class Commit ()
  extends typingsJapgolly.nodegit.commitMod.Commit

/* static members */
@JSImport("nodegit", "Commit")
@js.native
object Commit extends js.Object {
  def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typingsJapgolly.nodegit.treeMod.Tree,
    parentCount: Double,
    parents: js.Array[_]
  ): typingsJapgolly.nodegit.oidMod.Oid = js.native
  def createV(
    id: typingsJapgolly.nodegit.oidMod.Oid,
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typingsJapgolly.nodegit.treeMod.Tree,
    parentCount: Double
  ): Double = js.native
  def createWithSignature(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commitContent: String,
    signature: String,
    signatureField: String
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  /**
    * Retrieves the commit pointed to by the oid
    *
    *
    */
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = js.native
  def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = js.native
}

