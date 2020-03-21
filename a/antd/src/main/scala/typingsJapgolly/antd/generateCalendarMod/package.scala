package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generateCalendarMod {
  type HeaderRender[DateType] = js.Function1[
    /* config */ typingsJapgolly.antd.AnonOnChange[DateType], 
    japgolly.scalajs.react.raw.React.Node
  ]
  type InjectDefaultProps[Props] = (typingsJapgolly.std.Omit[
    Props, 
    typingsJapgolly.antd.antdStrings.locale | typingsJapgolly.antd.antdStrings.generateConfig | typingsJapgolly.antd.antdStrings.prevIcon | typingsJapgolly.antd.antdStrings.nextIcon | typingsJapgolly.antd.antdStrings.superPrevIcon | typingsJapgolly.antd.antdStrings.superNextIcon
  ]) with typingsJapgolly.antd.AnonLocale
}
