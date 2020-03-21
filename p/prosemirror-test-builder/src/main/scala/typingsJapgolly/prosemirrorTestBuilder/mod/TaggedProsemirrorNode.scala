package typingsJapgolly.prosemirrorTestBuilder.mod

import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedProsemirrorNode[S /* <: Schema[_, _] */]
  extends Node[js.Any]
     with TaggedFlatObject[S]

