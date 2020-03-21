package typingsJapgolly.reactNativeScrollableTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RenderTabProperties = js.Function5[
    /* name */ java.lang.String, 
    /* pageIndex */ scala.Double, 
    /* isTabActive */ scala.Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], 
    /* onLayoutHandler */ js.UndefOr[
      js.Function1[/* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent, scala.Unit]
    ], 
    japgolly.scalajs.react.raw.React.Element
  ]
  type TabBarProps[T] = T with typingsJapgolly.reactNativeScrollableTabView.AnonActiveTab
  type TabProps[T] = T with typingsJapgolly.reactNativeScrollableTabView.AnonTabLabel
}
