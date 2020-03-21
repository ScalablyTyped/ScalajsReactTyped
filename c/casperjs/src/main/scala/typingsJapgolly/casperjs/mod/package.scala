package typingsJapgolly.casperjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FunctionOnTimeout = js.ThisFunction2[
    /* this */ typingsJapgolly.casperjs.mod.Casper, 
    /* timeout */ scala.Double, 
    /* details */ js.Any, 
    scala.Unit
  ]
  type FunctionThen = js.ThisFunction1[
    /* this */ typingsJapgolly.casperjs.mod.Casper, 
    /* response */ typingsJapgolly.casperjs.mod.HttpResponse, 
    scala.Unit
  ]
}
