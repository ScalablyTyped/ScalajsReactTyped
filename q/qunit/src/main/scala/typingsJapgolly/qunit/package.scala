package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qunit {
  type QUnit = typingsJapgolly.qunit.QUnit_
  type moduleFunc1 = js.Function3[
    /* name */ java.lang.String, 
    /* hooks */ js.UndefOr[typingsJapgolly.qunit.Hooks], 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ typingsJapgolly.qunit.NestedHooks, scala.Unit]], 
    scala.Unit
  ]
  type moduleFunc2 = js.Function2[
    /* name */ java.lang.String, 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ typingsJapgolly.qunit.NestedHooks, scala.Unit]], 
    scala.Unit
  ]
}
