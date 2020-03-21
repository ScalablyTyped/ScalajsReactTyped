package typingsJapgolly.datastoreLevel.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDatastoreConstructor
  extends Instantiable1[/* path */ String, LevelDatastore[Buffer]]
     with Instantiable2[/* path */ String, /* options */ LevelDatastoreOptions, LevelDatastore[Buffer]] {
  def apply(path: String): LevelDatastore[Buffer] = js.native
  def apply(path: String, options: LevelDatastoreOptions): LevelDatastore[Buffer] = js.native
}

