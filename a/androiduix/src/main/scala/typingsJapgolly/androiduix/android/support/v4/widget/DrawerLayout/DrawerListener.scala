package typingsJapgolly.androiduix.android.support.v4.widget.DrawerLayout

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerListener extends js.Object {
  def onDrawerClosed(drawerView: View): Unit
  def onDrawerOpened(drawerView: View): Unit
  def onDrawerSlide(drawerView: View, slideOffset: Double): Unit
  def onDrawerStateChanged(newState: Double): Unit
}

object DrawerListener {
  @scala.inline
  def apply(
    onDrawerClosed: View => Callback,
    onDrawerOpened: View => Callback,
    onDrawerSlide: (View, Double) => Callback,
    onDrawerStateChanged: Double => Callback
  ): DrawerListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDrawerClosed")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => onDrawerClosed(t0).runNow()))
    __obj.updateDynamic("onDrawerOpened")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => onDrawerOpened(t0).runNow()))
    __obj.updateDynamic("onDrawerSlide")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Double) => onDrawerSlide(t0, t1).runNow()))
    __obj.updateDynamic("onDrawerStateChanged")(js.Any.fromFunction1((t0: scala.Double) => onDrawerStateChanged(t0).runNow()))
    __obj.asInstanceOf[DrawerListener]
  }
}

