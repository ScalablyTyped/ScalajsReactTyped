package typingsJapgolly.mobx

import typingsJapgolly.mobx.decoratorsMod.BabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/actiondecorator", JSImport.Namespace)
@js.native
object actiondecoratorMod extends js.Object {
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): AnonGet | AnonSet | Null = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): AnonGet | AnonSet | Null = js.native
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | AnonConfigurable | AnonEnumerable
  ] = js.native
}

