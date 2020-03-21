package typingsJapgolly.postcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.postcss.mod.Plugin_[js.Any]
    - typingsJapgolly.postcss.mod.Transformer
    - typingsJapgolly.postcss.AnonPostcss
    - typingsJapgolly.postcss.mod.Processor
  */
  type AcceptedPlugin = typingsJapgolly.postcss.mod._AcceptedPlugin | typingsJapgolly.postcss.mod.Plugin_[js.Any]
  type Builder = js.Function3[
    /* part */ java.lang.String, 
    /* node */ js.UndefOr[typingsJapgolly.postcss.mod.Node], 
    /* type */ js.UndefOr[
      typingsJapgolly.postcss.postcssStrings.start | typingsJapgolly.postcss.postcssStrings.end
    ], 
    scala.Unit
  ]
  type JsonComment = typingsJapgolly.postcss.mod.JsonNode
  type JsonRoot = typingsJapgolly.postcss.mod.JsonContainer
  type Parser = js.Function2[
    /* css */ typingsJapgolly.postcss.mod.ParserInput, 
    /* opts */ js.UndefOr[typingsJapgolly.postcss.PickProcessOptionsmapfrom], 
    typingsJapgolly.postcss.mod.Root_
  ]
  type ParserInput = java.lang.String | typingsJapgolly.postcss.AnonToString
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], typingsJapgolly.postcss.mod.Transformer]
  type RootNewProps = typingsJapgolly.postcss.mod.ContainerNewProps
  type Stringifier = js.Function2[
    /* node */ typingsJapgolly.postcss.mod.Node, 
    /* builder */ typingsJapgolly.postcss.mod.Builder, 
    scala.Unit
  ]
  type TransformCallback = js.Function2[
    /* root */ typingsJapgolly.postcss.mod.Root_, 
    /* result */ typingsJapgolly.postcss.mod.Result, 
    js.Promise[js.Any] | js.Any
  ]
}
