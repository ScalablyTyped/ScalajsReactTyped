package typingsJapgolly.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayLanguagePluginInterfaceMod {
  type FormatModule = js.Function1[/* options */ typingsJapgolly.relayCompiler.AnonConcreteText, java.lang.String]
  type GraphQLTagFinder = js.Function2[
    /* text */ java.lang.String, 
    /* filePath */ java.lang.String, 
    js.Array[typingsJapgolly.relayCompiler.relayLanguagePluginInterfaceMod.GraphQLTag]
  ]
  type PluginInitializer = js.Function0[typingsJapgolly.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface]
}
