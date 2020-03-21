package typingsJapgolly.tinajsTina.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tinajsTina.PartialComponentDefinitioCompute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tinajs/tina", "Component")
@js.native
class Component () extends js.Object {
  var data: StringDictionary[js.Any] = js.native
  def setData(data: StringDictionary[js.Any]): Unit = js.native
}

/* static members */
@JSImport("@tinajs/tina", "Component")
@js.native
object Component extends js.Object {
  def define(definitions: PartialComponentDefinitioCompute): Unit = js.native
  def mixin(definitions: PartialComponentDefinitioCompute): Unit = js.native
}

