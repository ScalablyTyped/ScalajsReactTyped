package typingsJapgolly.androiduix.android.support.v4.view.ViewPager

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.support.v4.view.PagerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAdapterChangeListener extends js.Object {
  def onAdapterChanged(oldAdapter: PagerAdapter, newAdapter: PagerAdapter): Unit
}

object OnAdapterChangeListener {
  @scala.inline
  def apply(onAdapterChanged: (PagerAdapter, PagerAdapter) => Callback): OnAdapterChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAdapterChanged")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.support.v4.view.PagerAdapter, t1: typingsJapgolly.androiduix.android.support.v4.view.PagerAdapter) => onAdapterChanged(t0, t1).runNow()))
    __obj.asInstanceOf[OnAdapterChangeListener]
  }
}

