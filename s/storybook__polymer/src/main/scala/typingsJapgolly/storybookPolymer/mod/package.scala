package typingsJapgolly.storybookPolymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DecoratorParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RenderFunction = js.Function0[
    typingsJapgolly.storybookPolymer.mod.Renderable | js.Array[typingsJapgolly.storybookPolymer.mod.Renderable]
  ]
  type Renderable = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateResult */ js.Any
  type StoryDecorator = js.Function2[
    /* story */ typingsJapgolly.storybookPolymer.mod.RenderFunction, 
    /* context */ typingsJapgolly.storybookPolymer.AnonKind, 
    typingsJapgolly.storybookPolymer.mod.Renderable | scala.Null
  ]
}
