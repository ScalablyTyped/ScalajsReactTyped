package typingsJapgolly.atStorybookReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.atStorybookReact.Anon_Kind
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.react.reactMod._Global_.JSX.Element

  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = ComponentType[js.Object] | Element
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
}
