package typingsJapgolly.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object abstractMod {
  type TraverseCallback = js.Function2[
    /* reflection */ typingsJapgolly.typedoc.abstractMod.Reflection, 
    /* property */ typingsJapgolly.typedoc.abstractMod.TraverseProperty, 
    scala.Boolean | scala.Unit
  ]
}
