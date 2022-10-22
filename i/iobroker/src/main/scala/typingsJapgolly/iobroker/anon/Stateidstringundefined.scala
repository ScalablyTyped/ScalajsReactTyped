package typingsJapgolly.iobroker.anon

import typingsJapgolly.iobroker.mod.global.ioBroker.StateQuality
import typingsJapgolly.iobroker.mod.global.ioBroker.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined iobroker.iobroker.<global>.ioBroker.State & {  id :string | undefined} */
trait Stateidstringundefined extends StObject {
  
  /** Direction flag: false for desired value and true for actual value. Default: false. */
  var ack: Boolean
  
  /** Optional comment */
  var c: js.UndefOr[String] = js.undefined
  
  /** Optional time in seconds after which the state is reset to null */
  var expire: js.UndefOr[Double] = js.undefined
  
  /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
  var from: String
  
  var id: js.UndefOr[String] = js.undefined
  
  /** Unix timestamp of the last time the value changed */
  var lc: Double
  
  /** Optional quality of the state value */
  var q: js.UndefOr[StateQuality] = js.undefined
  
  /** Unix timestamp. Default: current time */
  var ts: Double
  
  /** The user who set this value */
  var user: js.UndefOr[String] = js.undefined
  
  /** The value of the state. */
  var `val`: StateValue
}
object Stateidstringundefined {
  
  inline def apply(ack: Boolean, from: String, lc: Double, ts: Double): Stateidstringundefined = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(null)
    __obj.asInstanceOf[Stateidstringundefined]
  }
  
  extension [Self <: Stateidstringundefined](x: Self) {
    
    inline def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLc(value: Double): Self = StObject.set(x, "lc", value.asInstanceOf[js.Any])
    
    inline def setQ(value: StateQuality): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVal(value: StateValue): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValNull: Self = StObject.set(x, "val", null)
  }
}
