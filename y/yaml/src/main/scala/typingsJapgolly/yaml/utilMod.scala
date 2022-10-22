package typingsJapgolly.yaml

import typingsJapgolly.yaml.distLogMod.LogLevelId
import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.distNodesScalarMod.Scalar
import typingsJapgolly.yaml.distNodesToJSMod.ToJSContext
import typingsJapgolly.yaml.distSchemaTypesMod.CollectionTag
import typingsJapgolly.yaml.distSchemaTypesMod.ScalarTag
import typingsJapgolly.yaml.distStringifyFoldFlowLinesMod.FoldMode
import typingsJapgolly.yaml.distStringifyFoldFlowLinesMod.FoldOptions
import typingsJapgolly.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("yaml/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(logLevel: LogLevelId, messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(logLevel.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def findPair[K, V](items: js.Iterable[Pair[K, V]], key: Any): js.UndefOr[Pair[K, V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPair")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Pair[K, V]]]
  
  inline def foldFlowLines(text: String, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(
    text: String,
    indent: String,
    mode: Unit,
    hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow: FoldOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(text: String, indent: String, mode: FoldMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(
    text: String,
    indent: String,
    mode: FoldMode,
    hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow: FoldOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("yaml/util", "mapTag")
  @js.native
  val mapTag: CollectionTag = js.native
  
  @JSImport("yaml/util", "seqTag")
  @js.native
  val seqTag: CollectionTag = js.native
  
  @JSImport("yaml/util", "stringTag")
  @js.native
  val stringTag: ScalarTag = js.native
  
  inline def stringifyNumber(hasFormatMinFractionDigitsTagValue: Scalar[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyNumber")(hasFormatMinFractionDigitsTagValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyString(item: Scalar[Any], ctx: StringifyContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: Scalar[Any], ctx: StringifyContext, onComment: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(
    item: Scalar[Any],
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: Scalar[Any], ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJS(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toJS(value: Any, arg: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJS(value: Any, arg: String, ctx: ToJSContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJS(value: Any, arg: Null, ctx: ToJSContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def warn(logLevel: LogLevelId, warning: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warn(logLevel: LogLevelId, warning: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
