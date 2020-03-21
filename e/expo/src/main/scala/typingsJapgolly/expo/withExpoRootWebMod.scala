package typingsJapgolly.expo

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.expo.withExpoRootTypesMod.InitialProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/launch/withExpoRoot.web", JSImport.Namespace)
@js.native
object withExpoRootWebMod extends js.Object {
  def default[P /* <: InitialProps */](AppRootComponent: ComponentType[P]): ComponentClassP[P with js.Object] = js.native
}

