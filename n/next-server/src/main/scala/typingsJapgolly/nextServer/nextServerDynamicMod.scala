package typingsJapgolly.nextServer

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nextServer.dynamicMod.DynamicOptions
import typingsJapgolly.nextServer.dynamicMod.LoadableFn
import typingsJapgolly.nextServer.dynamicMod.LoadableOptions
import typingsJapgolly.nextServer.dynamicMod.Loader
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Namespace)
@js.native
object nextServerDynamicMod extends js.Object {
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClassP[P with js.Object]) | FunctionComponent[P] | js.Function0[Element] = js.native
}

