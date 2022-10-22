package typingsJapgolly.senchaTouch.Ext.device

import japgolly.scalajs.react.Callback
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object push {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Property] (Number) */
    var ALERT: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var BADGE: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var SOUND: js.UndefOr[Double] = js.undefined
    
    /** [Method] Registers a push notification
      * @param config Object The configuration for to pass when registering this push notification service.
      */
    var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setALERT(value: Double): Self = StObject.set(x, "ALERT", value.asInstanceOf[js.Any])
      
      inline def setALERTUndefined: Self = StObject.set(x, "ALERT", js.undefined)
      
      inline def setBADGE(value: Double): Self = StObject.set(x, "BADGE", value.asInstanceOf[js.Any])
      
      inline def setBADGEUndefined: Self = StObject.set(x, "BADGE", js.undefined)
      
      inline def setRegister(value: /* config */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: /* config */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setSOUND(value: Double): Self = StObject.set(x, "SOUND", value.asInstanceOf[js.Any])
      
      inline def setSOUNDUndefined: Self = StObject.set(x, "SOUND", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Method] Registers a push notification  */
    @JSName("register")
    var register_ICordova: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    extension [Self <: ICordova](x: Self) {
      
      inline def setRegister(value: Callback): Self = StObject.set(x, "register", value.toJsFn)
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] Registers a push notification  */
    @JSName("register")
    var register_ISencha: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    extension [Self <: ISencha](x: Self) {
      
      inline def setRegister(value: Callback): Self = StObject.set(x, "register", value.toJsFn)
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
}
