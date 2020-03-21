package typingsJapgolly.rrule

import typingsJapgolly.rrule.iterresultMod.default
import typingsJapgolly.rrule.typesMod.IterResultType
import typingsJapgolly.rrule.typesMod.ParsedOptions
import typingsJapgolly.rrule.typesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iter", JSImport.Namespace)
@js.native
object iterMod extends js.Object {
  def iter[M /* <: QueryMethodTypes */](iterResult: default[M], options: ParsedOptions): IterResultType[M] = js.native
}

