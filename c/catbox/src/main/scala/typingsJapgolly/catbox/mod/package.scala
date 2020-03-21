package typingsJapgolly.catbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnginePrototypeOrObject = typingsJapgolly.catbox.mod.EnginePrototype[js.Any] | typingsJapgolly.catbox.mod.ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[
    /* id */ typingsJapgolly.catbox.mod.Id, 
    /* flags */ typingsJapgolly.catbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
  type Id = java.lang.String | typingsJapgolly.catbox.AnonId
}
