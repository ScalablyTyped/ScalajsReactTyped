package typingsJapgolly.jupyterlabCodemirror.modeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mode {
  /**
    * The interface for a codemirror spec resolver.
    */
  type ISpecLoader = js.Function1[
    /* spec */ typingsJapgolly.jupyterlabCodemirror.modeMod.Mode.ISpec, 
    js.Promise[scala.Boolean]
  ]
}
