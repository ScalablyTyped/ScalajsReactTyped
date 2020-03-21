package typingsJapgolly.firebaseDatabase.indexNodeMod

import typingsJapgolly.firebaseDatabase.pathMod.Path
import typingsJapgolly.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "OnDisconnect")
@js.native
class OnDisconnect protected ()
  extends typingsJapgolly.firebaseDatabase.onDisconnectMod.OnDisconnect {
  /**
    * @param {!Repo} repo_
    * @param {!Path} path_
    */
  def this(repo_ : Repo, path_ : Path) = this()
}

