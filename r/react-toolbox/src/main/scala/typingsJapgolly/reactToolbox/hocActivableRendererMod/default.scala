package typingsJapgolly.reactToolbox.hocActivableRendererMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/hoc/ActivableRenderer", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P](): (js.Function1[/* target */ ComponentClassP[P with js.Object], ComponentClassP[P with js.Object]]) with (js.Function1[/* clazz */ StatelessComponent[P], StatelessComponent[P]]) = js.native
  def apply[P](options: ActivableRendererFactoryOptions): (js.Function1[/* target */ ComponentClassP[P with js.Object], ComponentClassP[P with js.Object]]) with (js.Function1[/* clazz */ StatelessComponent[P], StatelessComponent[P]]) = js.native
}

