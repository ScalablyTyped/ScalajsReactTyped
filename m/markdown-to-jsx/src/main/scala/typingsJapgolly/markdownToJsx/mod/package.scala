package typingsJapgolly.markdownToJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentOverride[P, S] = java.lang.String | (japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]) | typingsJapgolly.react.mod.SFC[P] | (typingsJapgolly.markdownToJsx.AnonComponent[P, S])
  type Markdown = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.markdownToJsx.mod.MarkdownProps with js.Object, js.Object]
}
