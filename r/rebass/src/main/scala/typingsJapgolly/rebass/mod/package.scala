package typingsJapgolly.rebass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // tslint:disable-next-line no-empty-interface
  type LinkKnownProps = typingsJapgolly.rebass.mod.BoxKnownProps
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type SxStyleProp = typingsJapgolly.styledSystemCss.mod.SystemStyleObject | (typingsJapgolly.std.Record[
    java.lang.String, 
    typingsJapgolly.styledSystemCss.mod.SystemStyleObject | (typingsJapgolly.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String]) | (typingsJapgolly.std.Record[
      java.lang.String, 
      typingsJapgolly.styledSystemCss.mod.SystemStyleObject | (typingsJapgolly.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String])
    ])
  ])
}
