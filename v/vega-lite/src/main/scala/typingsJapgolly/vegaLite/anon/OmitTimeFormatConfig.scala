package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmitTimeFormatConfig extends StObject {
  
  var config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]
  
  var omitTimeFormatConfig: js.UndefOr[Boolean] = js.undefined
  
  var specifiedFormat: js.UndefOr[String] = js.undefined
  
  var timeUnit: js.UndefOr[typingsJapgolly.vegaLite.buildSrcTimeunitMod.TimeUnit] = js.undefined
}
object OmitTimeFormatConfig {
  
  inline def apply(config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): OmitTimeFormatConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTimeFormatConfig]
  }
  
  extension [Self <: OmitTimeFormatConfig](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setOmitTimeFormatConfig(value: Boolean): Self = StObject.set(x, "omitTimeFormatConfig", value.asInstanceOf[js.Any])
    
    inline def setOmitTimeFormatConfigUndefined: Self = StObject.set(x, "omitTimeFormatConfig", js.undefined)
    
    inline def setSpecifiedFormat(value: String): Self = StObject.set(x, "specifiedFormat", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedFormatUndefined: Self = StObject.set(x, "specifiedFormat", js.undefined)
    
    inline def setTimeUnit(value: typingsJapgolly.vegaLite.buildSrcTimeunitMod.TimeUnit): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
