package typingsJapgolly.materialUiCore.withStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined IncludeTheme extends true ? {  theme  :@material-ui/core.@material-ui/core/styles/createMuiTheme.Theme} : {} & {  classes  :@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<T extends string ? T : T extends @material-ui/core.@material-ui/core/styles/withStyles.StyleRulesCallback<infer K> ? K : T extends @material-ui/core.@material-ui/core/styles/withStyles.StyleRules<infer K> ? K : never>} */
@js.native
trait WithStyles[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */, IncludeTheme /* <: js.UndefOr[Boolean] */] extends js.Object {
  var classes: ClassNameMap[_ | T] = js.native
}

object WithStyles {
  @scala.inline
  def apply[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */, IncludeTheme /* <: js.UndefOr[Boolean] */](classes: ClassNameMap[_ | T]): WithStyles[T, IncludeTheme] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithStyles[T, IncludeTheme]]
  }
}

