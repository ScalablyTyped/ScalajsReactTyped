package typingsJapgolly.prosemirrorMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MarkSerializerMethod[S /* <: typingsJapgolly.prosemirrorModel.mod.Schema[_, _] */] = js.Function4[
    /* state */ typingsJapgolly.prosemirrorMarkdown.mod.MarkdownSerializerState[S], 
    /* mark */ typingsJapgolly.prosemirrorModel.mod.Mark[S], 
    /* parent */ typingsJapgolly.prosemirrorModel.mod.Fragment[S], 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
