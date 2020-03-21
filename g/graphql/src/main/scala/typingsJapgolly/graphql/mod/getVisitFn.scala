package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.visitorMod.VisitFn
import typingsJapgolly.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getVisitFn")
@js.native
object getVisitFn extends js.Object {
  def apply(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
}

