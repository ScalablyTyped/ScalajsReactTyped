package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Abstract
import typingsJapgolly.inversify.interfacesMod.interfaces.Container
import typingsJapgolly.inversify.interfacesMod.interfaces.Newable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/binding_utils", JSImport.Namespace)
@js.native
object bindingUtilsMod extends js.Object {
  def multiBindToService(container: Container): js.Function1[
    /* service */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[_] | Abstract[_], Unit]
  ] = js.native
}

