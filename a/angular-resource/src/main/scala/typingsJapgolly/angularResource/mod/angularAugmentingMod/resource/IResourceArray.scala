package typingsJapgolly.angularResource.mod.angularAugmentingMod.resource

import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Really just a regular Array object with $promise and $resolve attached to it
  */
@js.native
trait IResourceArray[T] extends Array[T with IResource[T]] {
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: IPromise[IResourceArray[T]] = js.native
  @JSName("$resolved")
  var $resolved: Boolean = js.native
  @JSName("$cancelRequest")
  def $cancelRequest(): Unit = js.native
}

