package typingsJapgolly.hapiCatbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnginePrototypeOrObject = typingsJapgolly.hapiCatbox.mod.EnginePrototype[js.Any] | typingsJapgolly.hapiCatbox.mod.ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[
    /* id */ typingsJapgolly.hapiCatbox.mod.Id, 
    /* flags */ typingsJapgolly.hapiCatbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
  type Id = java.lang.String | typingsJapgolly.hapiCatbox.AnonId
}
