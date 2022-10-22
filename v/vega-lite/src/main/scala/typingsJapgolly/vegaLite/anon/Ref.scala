package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcChannelMod.PolarPositionChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.PositionChannel
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel
  
  var config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef]
  
  var fieldDef: typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]
  
  var markDef: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef]
  
  var ref: VgValueRef
}
object Ref {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef],
    fieldDef: typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any],
    markDef: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef],
    ref: VgValueRef
  ): Ref = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setMarkDef(
      value: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef]
    ): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setRef(value: VgValueRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
