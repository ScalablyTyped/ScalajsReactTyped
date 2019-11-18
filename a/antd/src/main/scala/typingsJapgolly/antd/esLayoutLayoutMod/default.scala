package typingsJapgolly.antd.esLayoutLayoutMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.antd.PartialBasicProps
import typingsJapgolly.antd.WeakValidationMapBasicProps
import typingsJapgolly.antd.esLayoutSiderMod.SiderProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.react.reactMod.GetDerivedStateFromError
import typingsJapgolly.react.reactMod.GetDerivedStateFromProps
import typingsJapgolly.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/layout/layout", JSImport.Default)
@js.native
class default protected ()
  extends Component[BasicProps, ComponentState, js.Any] {
  def this(props: BasicProps) = this()
  def this(props: BasicProps, context: js.Any) = this()
}

@JSImport("antd/es/layout/layout", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* props */ BasicProps, Component[BasicProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ BasicProps, 
      /* context */ js.Any, 
      Component[BasicProps, ComponentState, js.Any]
    ] {
  var Content: ComponentClassP[BasicProps with js.Object] = js.native
  var Footer: ComponentClassP[BasicProps with js.Object] = js.native
  var Header: ComponentClassP[BasicProps with js.Object] = js.native
  var Sider: ComponentClassP[SiderProps with js.Object] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialBasicProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[BasicProps, js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[BasicProps, js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapBasicProps] = js.native
}

