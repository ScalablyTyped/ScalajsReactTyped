package typingsJapgolly.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentChild = js.UndefOr[
    typingsJapgolly.preact.mod.VNode[js.Any] | js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type ComponentChildren = js.Array[typingsJapgolly.preact.mod.ComponentChild] | typingsJapgolly.preact.mod.ComponentChild
  type ComponentConstructor[P, S] = typingsJapgolly.preact.mod.ComponentClass[P, S]
  type ComponentFactory[P] = typingsJapgolly.preact.mod.ComponentType[P]
  type ComponentType[P] = (typingsJapgolly.preact.mod.ComponentClass[P, js.Object]) | typingsJapgolly.preact.mod.FunctionComponent[P]
  //
  // Context
  // -----------------------------------
  type Consumer[T] = typingsJapgolly.preact.mod.FunctionComponent[typingsJapgolly.preact.Anon0[T]]
  type FunctionalComponent[P] = typingsJapgolly.preact.mod.FunctionComponent[P]
  //
  // Preact Component interface
  // -----------------------------------
  type Key = java.lang.String | scala.Double | js.Any
  type PreactConsumer[T] = typingsJapgolly.preact.mod.Consumer[T]
  type PreactContext[T] = typingsJapgolly.preact.mod.Context[T]
  type PreactProvider[T] = typingsJapgolly.preact.mod.Provider[T]
  type Provider[T] = typingsJapgolly.preact.mod.FunctionComponent[typingsJapgolly.preact.AnonValue[T]]
  type Ref[T] = typingsJapgolly.preact.mod.RefObject[T] | typingsJapgolly.preact.mod.RefCallback[T]
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  type RenderableProps[P, RefType] = P with typingsJapgolly.preact.mod.Attributes with typingsJapgolly.preact.AnonRef[RefType]
}
