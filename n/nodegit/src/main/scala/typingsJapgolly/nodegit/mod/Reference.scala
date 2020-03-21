package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reference")
@js.native
class Reference ()
  extends typingsJapgolly.nodegit.referenceMod.Reference

/* static members */
@JSImport("nodegit", "Reference")
@js.native
object Reference extends js.Object {
  def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    force: Double,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def createMatching(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    force: Double,
    currentId: typingsJapgolly.nodegit.oidMod.Oid,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def dwim(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def dwim(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def ensureLog(repo: typingsJapgolly.nodegit.repositoryMod.Repository, refname: String): Double = js.native
  def hasLog(repo: typingsJapgolly.nodegit.repositoryMod.Repository, refname: String): Double = js.native
  def isValidName(refname: String): Double = js.native
  def list(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def nameToId(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = js.native
  def remove(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): Double = js.native
  def symbolicCreate(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
  def symbolicCreateMatching(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    currentValue: String,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = js.native
}

