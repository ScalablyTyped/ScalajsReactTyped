package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.RTCDataChannel
import org.scalajs.dom.RTCDataChannelInit
import org.scalajs.dom.RTCOfferOptions
import typingsJapgolly.std.RTCAnswerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerOptionsMod {
  
  trait SessionDescriptionHandlerOptions
    extends StObject
       with typingsJapgolly.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions {
    
    /**
      * Answer options to use when creating an answer.
      */
    var answerOptions: js.UndefOr[RTCAnswerOptions] = js.undefined
    
    /**
      * If true, create a data channel when making initial offer.
      */
    var dataChannel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A human-readable name to use when creating the data channel.
      */
    var dataChannelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration options for creating the data channel.
      */
    var dataChannelOptions: js.UndefOr[RTCDataChannelInit] = js.undefined
    
    /**
      * If true, offer and answer directions will be set to place peer on hold.
      */
    var hold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum duration to wait in ms for ICE gathering to complete.
      * No timeout if undefined or zero.
      */
    var iceGatheringTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Offer options to use when creating an offer.
      */
    var offerOptions: js.UndefOr[RTCOfferOptions] = js.undefined
    
    /**
      * Called upon creating a data channel.
      */
    var onDataChannel: js.UndefOr[js.Function1[/* dataChannel */ RTCDataChannel, Unit]] = js.undefined
  }
  object SessionDescriptionHandlerOptions {
    
    inline def apply(): SessionDescriptionHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDescriptionHandlerOptions]
    }
    
    extension [Self <: SessionDescriptionHandlerOptions](x: Self) {
      
      inline def setAnswerOptions(value: RTCAnswerOptions): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
      
      inline def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
      
      inline def setDataChannel(value: Boolean): Self = StObject.set(x, "dataChannel", value.asInstanceOf[js.Any])
      
      inline def setDataChannelLabel(value: String): Self = StObject.set(x, "dataChannelLabel", value.asInstanceOf[js.Any])
      
      inline def setDataChannelLabelUndefined: Self = StObject.set(x, "dataChannelLabel", js.undefined)
      
      inline def setDataChannelOptions(value: RTCDataChannelInit): Self = StObject.set(x, "dataChannelOptions", value.asInstanceOf[js.Any])
      
      inline def setDataChannelOptionsUndefined: Self = StObject.set(x, "dataChannelOptions", js.undefined)
      
      inline def setDataChannelUndefined: Self = StObject.set(x, "dataChannel", js.undefined)
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setIceGatheringTimeout(value: Double): Self = StObject.set(x, "iceGatheringTimeout", value.asInstanceOf[js.Any])
      
      inline def setIceGatheringTimeoutUndefined: Self = StObject.set(x, "iceGatheringTimeout", js.undefined)
      
      inline def setOfferOptions(value: RTCOfferOptions): Self = StObject.set(x, "offerOptions", value.asInstanceOf[js.Any])
      
      inline def setOfferOptionsUndefined: Self = StObject.set(x, "offerOptions", js.undefined)
      
      inline def setOnDataChannel(value: /* dataChannel */ RTCDataChannel => Callback): Self = StObject.set(x, "onDataChannel", js.Any.fromFunction1((t0: /* dataChannel */ RTCDataChannel) => value(t0).runNow()))
      
      inline def setOnDataChannelUndefined: Self = StObject.set(x, "onDataChannel", js.undefined)
    }
  }
}
