package typingsJapgolly.hoistNonReactStatics.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoist-non-react-statics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: ComponentType[_] */, S /* <: ComponentType[_] */, C /* <: StringDictionary[`true`] */](TargetComponent: T, SourceComponent: S): T with (NonReactStatics[S, C]) = js.native
  def apply[T /* <: ComponentType[_] */, S /* <: ComponentType[_] */, C /* <: StringDictionary[`true`] */](TargetComponent: T, SourceComponent: S, customStatic: C): T with (NonReactStatics[S, C]) = js.native
}

