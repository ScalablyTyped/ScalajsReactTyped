package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends typingsJapgolly.nodegit.tagMod.Tag

/* static members */
@JSImport("nodegit", "Tag")
@js.native
object Tag extends js.Object {
  def annotationCreate(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsJapgolly.nodegit.objectMod.Object,
    tagger: typingsJapgolly.nodegit.signatureMod.Signature,
    message: String
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsJapgolly.nodegit.objectMod.Object,
    tagger: typingsJapgolly.nodegit.signatureMod.Signature,
    message: String,
    force: Double
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  def createLightweight(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsJapgolly.nodegit.objectMod.Object,
    force: Double
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  def delete(repo: typingsJapgolly.nodegit.repositoryMod.Repository, tagName: String): js.Promise[Double] = js.native
  def list(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def listMatch(tagNames: String, pattern: String, repo: typingsJapgolly.nodegit.repositoryMod.Repository): Double = js.native
  def listMatch(
    tagNames: js.Array[String],
    pattern: String,
    repo: typingsJapgolly.nodegit.repositoryMod.Repository
  ): Double = js.native
  def listMatch(
    tagNames: typingsJapgolly.nodegit.strArrayMod.Strarray,
    pattern: String,
    repo: typingsJapgolly.nodegit.repositoryMod.Repository
  ): Double = js.native
  /**
    * Retrieves the tag pointed to by the oid
    *
    *
    */
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.tagMod.Tag] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.tagMod.Tag] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.tagMod.Tag): js.Promise[typingsJapgolly.nodegit.tagMod.Tag] = js.native
  def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsJapgolly.nodegit.tagMod.Tag] = js.native
}

