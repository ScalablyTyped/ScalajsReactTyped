package typingsJapgolly.antd.affixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AffixStatus extends js.Object

@JSImport("antd/lib/affix", "AffixStatus")
@js.native
object AffixStatus extends js.Object {
  @js.native
  sealed trait None extends AffixStatus
  
  @js.native
  sealed trait Prepare extends AffixStatus
  
}

