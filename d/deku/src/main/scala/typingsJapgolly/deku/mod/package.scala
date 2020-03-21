package typingsJapgolly.deku

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Dispatch = js.Function1[/* action */ js.Any, js.Any]
  type Render = js.Function2[
    /* vnode */ typingsJapgolly.deku.mod.VirtualElement, 
    /* context */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
    * Thunk object passed to `element`
    */
  type Thunk = typingsJapgolly.deku.mod.Component | (js.Function1[
    /* model */ typingsJapgolly.deku.mod.Model, 
    typingsJapgolly.deku.mod.VirtualElement
  ])
}
