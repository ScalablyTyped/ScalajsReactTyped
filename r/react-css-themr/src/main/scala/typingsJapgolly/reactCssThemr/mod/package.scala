package typingsJapgolly.reactCssThemr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TMapThemrProps[P] = js.Function2[
    /* ownProps */ P, 
    /* theme */ typingsJapgolly.reactCssThemr.mod.TReactCSSThemrTheme, 
    P with typingsJapgolly.reactCssThemr.AnonTheme
  ]
  type ThemedComponent[P, S] = japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object]
}
