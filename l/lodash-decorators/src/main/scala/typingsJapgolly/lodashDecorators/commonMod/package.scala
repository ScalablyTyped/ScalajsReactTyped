package typingsJapgolly.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BiTypedDecorator = js.Function0[typingsJapgolly.lodashDecorators.commonMod.LodashDecorator] with typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator1[T] = (js.Function1[
    /* arg */ js.UndefOr[T], 
    typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator2[T, T2] = (js.Function2[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecoratorN = (js.Function1[/* repeated */ js.Any, typingsJapgolly.lodashDecorators.commonMod.LodashDecorator]) with typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
  type BiTypedMethodDecorator = js.Function0[typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator] with typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator1[T] = (js.Function1[
    /* arg */ js.UndefOr[T], 
    typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator2[T, T2] = (js.Function2[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecoratorN = (js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
  type LodashDecorator = typingsJapgolly.std.MethodDecorator with typingsJapgolly.std.PropertyDecorator
  type LodashMethodDecorator = typingsJapgolly.std.MethodDecorator
  type ResolvableFunction = java.lang.String | js.Function
}
