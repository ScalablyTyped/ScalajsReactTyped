package typingsJapgolly.karma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConstructorFn = js.Function | (org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, js.Any])
  type ConstructorFnType = js.Tuple2[typingsJapgolly.karma.karmaStrings.`type`, typingsJapgolly.karma.mod.ConstructorFn]
  type FactoryFn = js.Function1[/* repeated */ js.Any, js.Any]
  type FactoryFnType = js.Tuple2[typingsJapgolly.karma.karmaStrings.factory, typingsJapgolly.karma.mod.FactoryFn]
  type InlinePluginDef = typingsJapgolly.std.Record[typingsJapgolly.karma.mod.PluginName, typingsJapgolly.karma.mod.InlinePluginType]
  type InlinePluginType = typingsJapgolly.karma.mod.FactoryFnType | typingsJapgolly.karma.mod.ConstructorFnType | typingsJapgolly.karma.mod.ValueType
  type PathProxyPairs = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsJapgolly.karma.mod.ProxyOptions]
  type PluginName = java.lang.String
  type ServerCallback = js.Function1[/* exitCode */ scala.Double, scala.Unit]
  type ValueType = js.Tuple2[typingsJapgolly.karma.karmaStrings.value, js.Any]
}
