package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTabsProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with RippleComponent {
  var activeTab: js.UndefOr[Double] = js.undefined
  @JSName("onChange")
  var onChange_HeaderTabsProps: js.UndefOr[FormEventHandler[Header]] = js.undefined
}

object HeaderTabsProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    RippleComponent: RippleComponent = null,
    activeTab: Int | Double = null,
    onChange: ReactEventFrom[Header with Element] => Callback = null
  ): HeaderTabsProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (RippleComponent != null) js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactMdl.mod.Header with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    __obj.asInstanceOf[HeaderTabsProps]
  }
}

