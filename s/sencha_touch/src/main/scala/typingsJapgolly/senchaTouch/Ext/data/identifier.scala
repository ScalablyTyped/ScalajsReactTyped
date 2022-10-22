package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifier {
  
  trait ISequential
    extends StObject
       with ISimple {
    
    /** [Method] Returns the value of seed
      * @returns Number
      */
    var getSeed: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (String) */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var seed: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of seed
      * @param seed Number The new value.
      */
    var setSeed: js.UndefOr[js.Function1[/* seed */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object ISequential {
    
    inline def apply(): ISequential = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISequential]
    }
    
    extension [Self <: ISequential](x: Self) {
      
      inline def setGetSeed(value: CallbackTo[Double]): Self = StObject.set(x, "getSeed", value.toJsFn)
      
      inline def setGetSeedUndefined: Self = StObject.set(x, "getSeed", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSetSeed(value: /* seed */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setSeed", js.Any.fromFunction1((t0: /* seed */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetSeedUndefined: Self = StObject.set(x, "setSeed", js.undefined)
    }
  }
  
  trait ISimple
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of prefix
      * @returns String
      */
    var getPrefix: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Sets the value of prefix
      * @param prefix String The new value.
      */
    var setPrefix: js.UndefOr[js.Function1[/* prefix */ js.UndefOr[String], Unit]] = js.undefined
  }
  object ISimple {
    
    inline def apply(): ISimple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimple]
    }
    
    extension [Self <: ISimple](x: Self) {
      
      inline def setGetPrefix(value: CallbackTo[String]): Self = StObject.set(x, "getPrefix", value.toJsFn)
      
      inline def setGetPrefixUndefined: Self = StObject.set(x, "getPrefix", js.undefined)
      
      inline def setSetPrefix(value: /* prefix */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setPrefix", js.Any.fromFunction1((t0: /* prefix */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetPrefixUndefined: Self = StObject.set(x, "setPrefix", js.undefined)
    }
  }
  
  trait IUuid
    extends StObject
       with ISimple {
    
    /** [Method] Returns the value of id
      * @returns Object
      */
    var getId: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of version
      * @returns Number
      */
    var getVersion: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Object) */
    var id: js.UndefOr[Any] = js.undefined
    
    /** [Method] Reconfigures this generator given new config properties
      * @param config Object
      */
    var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Property] (Number/Object) */
    var salt: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the value of id
      * @param id Object The new value.
      */
    var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of version
      * @param version Number The new value.
      */
    var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Property] (Number/Object) */
    var timestamp: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var version: js.UndefOr[Double] = js.undefined
  }
  object IUuid {
    
    inline def apply(): IUuid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IUuid]
    }
    
    extension [Self <: IUuid](x: Self) {
      
      inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setGetVersion(value: CallbackTo[Double]): Self = StObject.set(x, "getVersion", value.toJsFn)
      
      inline def setGetVersionUndefined: Self = StObject.set(x, "getVersion", js.undefined)
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setReconfigure(value: /* config */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "reconfigure", js.Any.fromFunction1((t0: /* config */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
      
      inline def setSalt(value: Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSetId(value: /* id */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setId", js.Any.fromFunction1((t0: /* id */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
      
      inline def setSetVersion(value: /* version */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setVersion", js.Any.fromFunction1((t0: /* version */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetVersionUndefined: Self = StObject.set(x, "setVersion", js.undefined)
      
      inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
