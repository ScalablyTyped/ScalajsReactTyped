package typingsJapgolly.angularEs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsJapgolly.std.TypedPropertyDescriptor[js.Any], 
    typingsJapgolly.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
}
