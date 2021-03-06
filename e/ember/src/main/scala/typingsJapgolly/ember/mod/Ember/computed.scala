package typingsJapgolly.ember.mod.Ember

import typingsJapgolly.emberObject.AnonId
import typingsJapgolly.emberObject.AnonUntil
import typingsJapgolly.emberObject.typesMod.ComputedPropertyCallback
import typingsJapgolly.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.computed")
@js.native
object computed extends js.Object {
  def apply(deps: java.lang.String*): MethodDecorator = js.native
  def apply(
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    k7: java.lang.String,
    rest: js.Any*
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def apply[T](cb: ComputedPropertyCallback[T]): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: java.lang.String, cb: ComputedPropertyCallback[T]): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, cb: ComputedPropertyCallback[T]): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, k3: java.lang.String, cb: ComputedPropertyCallback[T]): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[T, T] = js.native
  def alias(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def and(dependentKeys: java.lang.String*): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def bool(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def collect(dependentKeys: java.lang.String*): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def deprecatingAlias(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: AnonId): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: AnonUntil): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def empty(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def equal(dependentKey: java.lang.String, value: js.Any): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def filter(
    dependentKey: java.lang.String,
    additionalDependentKeys: js.Array[java.lang.String],
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filter(
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String, value: js.Any): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def gt(dependentKey: java.lang.String, value: Double): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def gte(dependentKey: java.lang.String, value: Double): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def intersect(propertyKeys: java.lang.String*): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def lt(dependentKey: java.lang.String, value: Double): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def lte(dependentKey: java.lang.String, value: Double): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def map[U](
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[U], js.Array[U]] = js.native
  def mapBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def `match`(dependentKey: java.lang.String, regexp: js.RegExp): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def max(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def min(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def none(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def not(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def notEmpty(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def oneWay(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def or(dependentKeys: java.lang.String*): typingsJapgolly.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def readOnly(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def reads(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[_, _] = js.native
  def setDiff(setAProperty: java.lang.String, setBProperty: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(
    itemsKey: java.lang.String,
    dependentKeys: js.Array[java.lang.String],
    sortDefinition: java.lang.String
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(
    itemsKey: java.lang.String,
    dependentKeys: js.Array[java.lang.String],
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(itemsKey: java.lang.String, sortDefinition: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(
    itemsKey: java.lang.String,
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sum(dependentKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def union(propertyKeys: java.lang.String*): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniq(propertyKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniqBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typingsJapgolly.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
}

