package typingsJapgolly.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentProviderMod {
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, java.lang.String | org.scalajs.dom.raw.HTMLElement]
  type AgGridRegisteredComponentInput[A /* <: typingsJapgolly.agGrid.iComponentMod.IComponent[_] */] = typingsJapgolly.agGrid.componentProviderMod.AgGridComponentFunctionInput | typingsJapgolly.agGrid.AnonInstantiableA[A]
  type RegisteredComponentInput[A /* <: typingsJapgolly.agGrid.iComponentMod.IComponent[_] with B */, B] = typingsJapgolly.agGrid.componentProviderMod.AgGridRegisteredComponentInput[A] | typingsJapgolly.agGrid.AnonInstantiableB[B]
}
