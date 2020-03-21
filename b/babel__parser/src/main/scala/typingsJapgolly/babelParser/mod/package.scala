package typingsJapgolly.babelParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelParser.babelParserStrings.asyncGenerators
    - typingsJapgolly.babelParser.babelParserStrings.bigInt
    - typingsJapgolly.babelParser.babelParserStrings.classPrivateMethods
    - typingsJapgolly.babelParser.babelParserStrings.classPrivateProperties
    - typingsJapgolly.babelParser.babelParserStrings.classProperties
    - typingsJapgolly.babelParser.babelParserStrings.decorators
    - typingsJapgolly.babelParser.babelParserStrings.`decorators-legacy`
    - typingsJapgolly.babelParser.babelParserStrings.doExpressions
    - typingsJapgolly.babelParser.babelParserStrings.dynamicImport
    - typingsJapgolly.babelParser.babelParserStrings.estree
    - typingsJapgolly.babelParser.babelParserStrings.exportDefaultFrom
    - typingsJapgolly.babelParser.babelParserStrings.exportNamespaceFrom
    - typingsJapgolly.babelParser.babelParserStrings.flow
    - typingsJapgolly.babelParser.babelParserStrings.flowComments
    - typingsJapgolly.babelParser.babelParserStrings.functionBind
    - typingsJapgolly.babelParser.babelParserStrings.functionSent
    - typingsJapgolly.babelParser.babelParserStrings.importMeta
    - typingsJapgolly.babelParser.babelParserStrings.jsx
    - typingsJapgolly.babelParser.babelParserStrings.logicalAssignment
    - typingsJapgolly.babelParser.babelParserStrings.nullishCoalescingOperator
    - typingsJapgolly.babelParser.babelParserStrings.numericSeparator
    - typingsJapgolly.babelParser.babelParserStrings.objectRestSpread
    - typingsJapgolly.babelParser.babelParserStrings.optionalCatchBinding
    - typingsJapgolly.babelParser.babelParserStrings.optionalChaining
    - typingsJapgolly.babelParser.babelParserStrings.partialApplication
    - typingsJapgolly.babelParser.babelParserStrings.pipelineOperator
    - typingsJapgolly.babelParser.babelParserStrings.placeholders
    - typingsJapgolly.babelParser.babelParserStrings.throwExpressions
    - typingsJapgolly.babelParser.babelParserStrings.topLevelAwait
    - typingsJapgolly.babelParser.babelParserStrings.typescript
    - typingsJapgolly.babelParser.babelParserStrings.v8intrinsic
    - typingsJapgolly.babelParser.mod.ParserPluginWithOptions
  */
  type ParserPlugin = typingsJapgolly.babelParser.mod._ParserPlugin | typingsJapgolly.babelParser.mod.ParserPluginWithOptions
  type ParserPluginWithOptions = js.Tuple2[
    typingsJapgolly.babelParser.babelParserStrings.decorators | typingsJapgolly.babelParser.babelParserStrings.pipelineOperator | typingsJapgolly.babelParser.babelParserStrings.flow, 
    typingsJapgolly.babelParser.mod.DecoratorsPluginOptions | typingsJapgolly.babelParser.mod.FlowPluginOptions | typingsJapgolly.babelParser.mod.PipelineOperatorPluginOptions
  ]
}
