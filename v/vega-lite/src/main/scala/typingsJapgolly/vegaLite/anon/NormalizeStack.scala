package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.DatumDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.PrimitiveValue
import typingsJapgolly.vegaLite.buildSrcDatetimeMod.DateTime
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcUtilMod.Dict
import typingsJapgolly.vegaLite.vegaLiteStrings.datum
import typingsJapgolly.vegaLite.vegaLiteStrings.datumDotdatum
import typingsJapgolly.vegaLite.vegaLiteStrings.parent
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizeStack extends StObject {
  
  var config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]
  
  var expr: js.UndefOr[datum | parent | datumDotdatum] = js.undefined
  
  var fieldOrDatumDef: (typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var format: String | Dict[Any]
  
  var formatType: String
  
  var normalizeStack: js.UndefOr[Boolean] = js.undefined
}
object NormalizeStack {
  
  inline def apply(
    config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef],
    fieldOrDatumDef: (typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    format: String | Dict[Any],
    formatType: String
  ): NormalizeStack = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeStack]
  }
  
  extension [Self <: NormalizeStack](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: datum | parent | datumDotdatum): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setFieldOrDatumDef(
      value: (typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStack(value: Boolean): Self = StObject.set(x, "normalizeStack", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStackUndefined: Self = StObject.set(x, "normalizeStack", js.undefined)
  }
}
