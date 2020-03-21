package typingsJapgolly.firebaseDatabase.indexNodeMod

import typingsJapgolly.firebaseDatabase.AnonTIMESTAMP
import typingsJapgolly.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "Database")
@js.native
class Database protected ()
  extends typingsJapgolly.firebaseDatabase.databaseMod.Database {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repo_
    */
  def this(repo_ : Repo) = this()
}

/* static members */
@JSImport("@firebase/database/dist/index.node", "Database")
@js.native
object Database extends js.Object {
  val ServerValue: AnonTIMESTAMP = js.native
}

