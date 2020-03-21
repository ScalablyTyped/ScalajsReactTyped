package typingsJapgolly.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentDefinition[T /* <: js.Object */] = T with typingsJapgolly.aframe.PartialComponentanySystem with (typingsJapgolly.std.ThisType[
    T with (typingsJapgolly.aframe.mod.Component[_, typingsJapgolly.aframe.mod.System[_]])
  ])
  type GeometryDefinition[T /* <: js.Object */, U] = T with typingsJapgolly.std.Partial[typingsJapgolly.aframe.mod.Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ typingsJapgolly.aframe.aframeStrings.MultiPropertySchema with js.Any
  type NodeDefinition[T /* <: js.Object */] = T with typingsJapgolly.aframe.PartialANode
  type ObjectMap[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Schema_[T /* <: js.Object */] = typingsJapgolly.aframe.mod.SinglePropertySchema[T] | typingsJapgolly.aframe.mod.MultiPropertySchema[T]
  type ShaderDefinition[T /* <: js.Object */] = T with typingsJapgolly.aframe.PartialShader
  type SystemDefinition[T /* <: js.Object */] = T with typingsJapgolly.aframe.PartialSystemany
}
