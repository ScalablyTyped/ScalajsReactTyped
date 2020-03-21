package typingsJapgolly.firebaseDatabase.mod

import typingsJapgolly.firebaseDatabase.pathMod.Path
import typingsJapgolly.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "OnDisconnect")
@js.native
class OnDisconnect protected ()
  extends typingsJapgolly.firebaseDatabase.onDisconnectMod.OnDisconnect {
  /**
    * @param {!Repo} repo_
    * @param {!Path} path_
    */
  def this(repo_ : Repo, path_ : Path) = this()
}

