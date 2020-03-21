package typingsJapgolly.linguiReact.withI18nMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.linguiReact.linguiReactStrings.i18n
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react/withI18n", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClassP[(Pick[_, Exclude[String, i18n]]) with js.Object]
  ] = js.native
  def apply(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClassP[(Pick[_, Exclude[String, i18n]]) with js.Object]
  ] = js.native
}

