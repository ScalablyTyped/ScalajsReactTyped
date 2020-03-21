package typingsJapgolly.zenObservableTs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.zenObservableTs.typesMod.ZenObservable.ObservableLike
import typingsJapgolly.zenObservableTs.zenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", JSImport.Default)
@js.native
object default
  extends Instantiable1[
      /* subscriber */ Subscriber[js.Object], 
      typingsJapgolly.zenObservableTs.zenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: ArrayLike[R]): typingsJapgolly.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): typingsJapgolly.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def from[R](observable: typingsJapgolly.zenObservableTs.zenObservableMod.Observable[R]): typingsJapgolly.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def of[R](args: R*): typingsJapgolly.zenObservableTs.zenObservableMod.Observable[R] = js.native
}

