package typingsJapgolly.es6Shim

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Reflect")
@js.native
object Reflect extends js.Object {
  @JSName("apply")
  def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = js.native
  def defineProperty(target: js.Any, propertyKey: KeyOfProperty, attributes: js.PropertyDescriptor): Boolean = js.native
  def deleteProperty(target: js.Any, propertyKey: KeyOfProperty): Boolean = js.native
  def enumerate(target: js.Any): IterableIteratorShim[_] = js.native
  def get(target: js.Any, propertyKey: KeyOfProperty): js.Any = js.native
  def get(target: js.Any, propertyKey: KeyOfProperty, receiver: js.Any): js.Any = js.native
  def getOwnPropertyDescriptor(target: js.Any, propertyKey: KeyOfProperty): js.PropertyDescriptor = js.native
  def getPrototypeOf(target: js.Any): js.Any = js.native
  def has(target: js.Any, propertyKey: KeyOfProperty): Boolean = js.native
  def isExtensible(target: js.Any): Boolean = js.native
  def ownKeys(target: js.Any): Array[KeyOfProperty] = js.native
  def preventExtensions(target: js.Any): Boolean = js.native
  def set(target: js.Any, propertyKey: KeyOfProperty, value: js.Any): Boolean = js.native
  def set(target: js.Any, propertyKey: KeyOfProperty, value: js.Any, receiver: js.Any): Boolean = js.native
  def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
}

