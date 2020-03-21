package typingsJapgolly.reactFns

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/hoistStatics", JSImport.Namespace)
@js.native
object hoistStaticsMod extends js.Object {
  def hoistNonReactStatics[P](targetComponent: ComponentClassP[P with js.Object], sourceComponent: ComponentClassP[js.Object]): ComponentClassP[P with js.Object] = js.native
  def hoistNonReactStatics[P](
    targetComponent: ComponentClassP[P with js.Object],
    sourceComponent: ComponentClassP[js.Object],
    blacklist: StringDictionary[Boolean]
  ): ComponentClassP[P with js.Object] = js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
}

