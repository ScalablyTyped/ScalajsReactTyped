package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.localesLocalesMod.LocalesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Locales", JSImport.Namespace)
@js.native
object localesMod extends js.Object {
  @js.native
  class Locales ()
    extends typingsJapgolly.reactFns.localesLocalesMod.Locales
  
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
}

