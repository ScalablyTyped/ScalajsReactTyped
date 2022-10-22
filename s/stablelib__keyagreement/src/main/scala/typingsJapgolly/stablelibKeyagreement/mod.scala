package typingsJapgolly.stablelibKeyagreement

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait KeyAgreement extends StObject {
    
    /**
      * Accept offer message and return new accept message, which should be sent
      * back to the offering party.
      *
      * Also derives shared key, so the accepting party can call getSharedKey()
      * right after calling accept.
      */
    def accept(offerMsg: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    /** Accept message length in bytes */
    val acceptMessageLength: Double
    
    /**
      * Cleans the temporary instance data.
      */
    def clean(): Unit
    
    /**
      * Offering party finishes key agreement by receiving accept message and
      * passing it to finish(). After calling finish(), offering party can call
      * sharedKey() to get shared key.
      */
    def finish(acceptMsg: js.typedarray.Uint8Array): this.type
    
    /**
      * Returns the agreed shared key.
      * - Offering party should call this after finish().
      * - Accepting party should call this after accept().
      */
    def getSharedKey(): js.typedarray.Uint8Array
    
    /**
      * Offer returns a new offer message, which should be send to the accepting
      * party.
      */
    def offer(): js.typedarray.Uint8Array
    
    /** Offer message length in bytes */
    val offerMessageLength: Double
    
    /**
      * Restores offering party's state.
      */
    def restoreState(serializedState: js.typedarray.Uint8Array): this.type
    
    /**
      * Serializes secret offering party state into byte array.
      *
      * This function should be called after offer() if the offering party
      * cannot keep KeyAgreement instance in memory. When it receives accept
      * message, it can create a new instance and call restoreState() on it with
      * the serialized state to recover to continue the agreement.
      */
    def saveState(): js.typedarray.Uint8Array
    
    /** Saved state length in bytes **/
    val savedStateLength: Double
    
    /** Shared key length in bytes **/
    val sharedKeyLength: Double
  }
  object KeyAgreement {
    
    inline def apply(
      accept: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      acceptMessageLength: Double,
      clean: Callback,
      finish: js.typedarray.Uint8Array => KeyAgreement,
      getSharedKey: CallbackTo[js.typedarray.Uint8Array],
      offer: CallbackTo[js.typedarray.Uint8Array],
      offerMessageLength: Double,
      restoreState: js.typedarray.Uint8Array => KeyAgreement,
      saveState: CallbackTo[js.typedarray.Uint8Array],
      savedStateLength: Double,
      sharedKeyLength: Double
    ): KeyAgreement = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acceptMessageLength = acceptMessageLength.asInstanceOf[js.Any], clean = clean.toJsFn, finish = js.Any.fromFunction1(finish), getSharedKey = getSharedKey.toJsFn, offer = offer.toJsFn, offerMessageLength = offerMessageLength.asInstanceOf[js.Any], restoreState = js.Any.fromFunction1(restoreState), saveState = saveState.toJsFn, savedStateLength = savedStateLength.asInstanceOf[js.Any], sharedKeyLength = sharedKeyLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyAgreement]
    }
    
    extension [Self <: KeyAgreement](x: Self) {
      
      inline def setAccept(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setAcceptMessageLength(value: Double): Self = StObject.set(x, "acceptMessageLength", value.asInstanceOf[js.Any])
      
      inline def setClean(value: Callback): Self = StObject.set(x, "clean", value.toJsFn)
      
      inline def setFinish(value: js.typedarray.Uint8Array => KeyAgreement): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setGetSharedKey(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getSharedKey", value.toJsFn)
      
      inline def setOffer(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "offer", value.toJsFn)
      
      inline def setOfferMessageLength(value: Double): Self = StObject.set(x, "offerMessageLength", value.asInstanceOf[js.Any])
      
      inline def setRestoreState(value: js.typedarray.Uint8Array => KeyAgreement): Self = StObject.set(x, "restoreState", js.Any.fromFunction1(value))
      
      inline def setSaveState(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "saveState", value.toJsFn)
      
      inline def setSavedStateLength(value: Double): Self = StObject.set(x, "savedStateLength", value.asInstanceOf[js.Any])
      
      inline def setSharedKeyLength(value: Double): Self = StObject.set(x, "sharedKeyLength", value.asInstanceOf[js.Any])
    }
  }
}
