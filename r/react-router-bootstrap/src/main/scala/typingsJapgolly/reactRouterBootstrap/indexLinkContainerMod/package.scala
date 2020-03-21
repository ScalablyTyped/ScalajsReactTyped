package typingsJapgolly.reactRouterBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object indexLinkContainerMod {
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = japgolly.scalajs.react.raw.React.ComponentClassP[
    typingsJapgolly.reactRouterDom.mod.NavLinkProps[typingsJapgolly.history.mod.LocationState] with js.Object
  ]
}
