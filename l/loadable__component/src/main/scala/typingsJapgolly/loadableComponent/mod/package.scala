package typingsJapgolly.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultComponent[P] = typingsJapgolly.react.mod.ComponentType[P] | typingsJapgolly.loadableComponent.mod.DefaultImportedComponent[P]
  type LoadableComponent[T] = (typingsJapgolly.react.mod.ComponentType[T with typingsJapgolly.loadableComponent.AnonFallback]) with typingsJapgolly.loadableComponent.mod.LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.loadableComponent.AnonChildren[TModule]] with TModule with typingsJapgolly.loadableComponent.mod.LoadableComponentMethods[js.Object]
}
