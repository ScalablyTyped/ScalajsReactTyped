package typingsJapgolly.grpcProtoLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grpcProtoLoader.mod.ServiceDefinition
    - typingsJapgolly.grpcProtoLoader.mod.MessageTypeDefinition
    - typingsJapgolly.grpcProtoLoader.mod.EnumTypeDefinition
  */
  type AnyDefinition = typingsJapgolly.grpcProtoLoader.mod._AnyDefinition | typingsJapgolly.grpcProtoLoader.mod.ServiceDefinition
  type Deserialize[T] = js.Function1[/* bytes */ typingsJapgolly.node.Buffer, T]
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.grpcProtoLoader.mod.AnyDefinition]
  type Serialize[T] = js.Function1[/* value */ T, typingsJapgolly.node.Buffer]
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.grpcProtoLoader.mod.MethodDefinition[js.Object, js.Object]]
}
