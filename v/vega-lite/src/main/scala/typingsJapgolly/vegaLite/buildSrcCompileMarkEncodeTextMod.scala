package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.PartialRecordVgEncodeChan
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDefWithCondition
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringValueDefWithCondition
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TextDef
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaLite.vegaLiteStrings.datum
import typingsJapgolly.vegaLite.vegaLiteStrings.datumDotdatum
import typingsJapgolly.vegaLite.vegaLiteStrings.description
import typingsJapgolly.vegaLite.vegaLiteStrings.href
import typingsJapgolly.vegaLite.vegaLiteStrings.url
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeTextMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def text(model: UnitModel): PartialRecordVgEncodeChan = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan]
  inline def text(
    model: UnitModel,
    channel: typingsJapgolly.vegaLite.vegaLiteStrings.text | href | url | description
  ): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  inline def textRef(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: js.Array[StringFieldDef[String]],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Null, config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Unit, config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Unit, config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: StringFieldDefWithCondition[String],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: StringValueDefWithCondition[String, StandardType], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: TextDef[String], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: TextDef[String], config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
}
