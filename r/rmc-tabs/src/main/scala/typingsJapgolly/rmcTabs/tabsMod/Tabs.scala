package typingsJapgolly.rmcTabs.tabsMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.rcGesture.mod.IGestureStatus
import typingsJapgolly.rmcTabs.AnonOnPanMove
import typingsJapgolly.rmcTabs.ReadonlychildrenReactNode
import typingsJapgolly.rmcTabs.TypeofDefaultTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends typingsJapgolly.rmcTabs.tabsBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var layout: HTMLDivElement = js.native
  var onPan: AnonOnPanMove = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean): String = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean, useLeft: Boolean): String = js.native
  def goToTab(
    index: Double,
    force: Boolean,
    usePaged: js.UndefOr[scala.Nothing],
    props: ReadonlychildrenReactNode
  ): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean, props: ReadonlychildrenReactNode): Boolean = js.native
  def onSwipe(status: IGestureStatus): Unit = js.native
  def renderContent(): Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[Node]
    ]
  ): Element = js.native
  def setContentLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

