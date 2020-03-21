package typingsJapgolly.oja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddableFunction = js.Function1[/* runtime */ typingsJapgolly.oja.mod.Flow, scala.Unit]
  type AddableToAction = typingsJapgolly.oja.mod.Action | typingsJapgolly.oja.mod.AddableFunction
  type ConsumerCallback = js.Function2[/* payload */ js.Any, /* runtime */ typingsJapgolly.oja.mod.Flow, scala.Unit]
  type DefinitionFunction = js.Function2[
    /* publisher */ typingsJapgolly.oja.mod.StageContext, 
    /* runtime */ typingsJapgolly.oja.mod.Flow, 
    js.Any
  ]
  type Primitive = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | js.Symbol | scala.Null]
}
