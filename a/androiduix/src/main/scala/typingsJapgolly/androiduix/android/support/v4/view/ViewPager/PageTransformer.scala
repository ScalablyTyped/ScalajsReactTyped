package typingsJapgolly.androiduix.android.support.v4.view.ViewPager

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTransformer extends js.Object {
  def transformPage(page: View, position: Double): Unit
}

object PageTransformer {
  @scala.inline
  def apply(transformPage: (View, Double) => Callback): PageTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transformPage")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Double) => transformPage(t0, t1).runNow()))
    __obj.asInstanceOf[PageTransformer]
  }
}

