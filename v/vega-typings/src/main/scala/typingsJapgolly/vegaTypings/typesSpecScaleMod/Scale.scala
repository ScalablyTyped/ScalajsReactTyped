package typingsJapgolly.vegaTypings.typesSpecScaleMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.time
import typingsJapgolly.vegaTypings.vegaTypingsStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.OrdinalScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.BandScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.PointScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.SequentialScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.TimeScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.IdentityScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.LinearScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.LogScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.SymLogScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.PowScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.SqrtScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.QuantileScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.QuantizeScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.ThresholdScale
  - typingsJapgolly.vegaTypings.typesSpecScaleMod.BinOrdinalScale
*/
trait Scale extends StObject
object Scale {
  
  inline def BandScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("band")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.BandScale]
  }
  
  inline def BinOrdinalScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin-ordinal")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.BinOrdinalScale]
  }
  
  inline def IdentityScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.IdentityScale]
  }
  
  inline def LinearScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.LinearScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.LinearScale]
  }
  
  inline def LogScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.LogScale]
  }
  
  inline def OrdinalScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordinal")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.OrdinalScale]
  }
  
  inline def PointScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.PointScale]
  }
  
  inline def PowScale(exponent: Double | SignalRef, name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pow")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.PowScale]
  }
  
  inline def QuantileScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.QuantileScale]
  }
  
  inline def QuantizeScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.QuantizeScale]
  }
  
  inline def SequentialScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequential")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.SequentialScale]
  }
  
  inline def SqrtScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sqrt")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.SqrtScale]
  }
  
  inline def SymLogScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symlog")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.SymLogScale]
  }
  
  inline def ThresholdScale(name: String): typingsJapgolly.vegaTypings.typesSpecScaleMod.ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.ThresholdScale]
  }
  
  inline def TimeScale(name: String, `type`: time | utc): typingsJapgolly.vegaTypings.typesSpecScaleMod.TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecScaleMod.TimeScale]
  }
}
