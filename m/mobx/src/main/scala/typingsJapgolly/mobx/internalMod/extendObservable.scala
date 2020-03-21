package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.observableMod.CreateObservableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "extendObservable")
@js.native
object extendObservable extends js.Object {
  def apply[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def apply[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def apply[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.extendObservable with js.Any
  ): A with B = js.native
  def apply[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.extendObservable with js.Any,
    options: CreateObservableOptions
  ): A with B = js.native
}

