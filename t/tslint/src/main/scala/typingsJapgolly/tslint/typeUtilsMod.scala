package typingsJapgolly.tslint

import typingsJapgolly.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/typeUtils", JSImport.Namespace)
@js.native
object typeUtilsMod extends js.Object {
  def typeIsOrHasBaseType(`type`: Type, parentType: Type): Boolean = js.native
}

