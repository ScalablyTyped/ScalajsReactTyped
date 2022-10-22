package typingsJapgolly.nteractTransformVdom

import japgolly.scalajs.react.Callback
import typingsJapgolly.nteractTransformVdom.libEventToObjectMod.SerializedEvent
import typingsJapgolly.nteractTransformVdom.libObjectToReactMod.VDOMEl
import typingsJapgolly.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MediaType extends StObject {
    
    var mediaType: String
    
    def onVDOMEvent(): Unit
  }
  object MediaType {
    
    inline def apply(mediaType: String, onVDOMEvent: Callback): MediaType = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = onVDOMEvent.toJsFn)
      __obj.asInstanceOf[MediaType]
    }
    
    extension [Self <: MediaType](x: Self) {
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setOnVDOMEvent(value: Callback): Self = StObject.set(x, "onVDOMEvent", value.toJsFn)
    }
  }
  
  /* Inlined std.Partial<@nteract/transform-vdom.@nteract/transform-vdom.Props> */
  trait PartialProps extends StObject {
    
    var data: js.UndefOr[VDOMEl] = js.undefined
    
    var mediaType: js.UndefOr[applicationSlashvdomDotv1Plussignjson] = js.undefined
    
    var onVDOMEvent: js.UndefOr[js.Function2[/* targetName */ String, /* event */ SerializedEvent[Any], Unit]] = js.undefined
  }
  object PartialProps {
    
    inline def apply(): PartialProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialProps]
    }
    
    extension [Self <: PartialProps](x: Self) {
      
      inline def setData(value: VDOMEl): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setOnVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[Any]) => Callback): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction2((t0: /* targetName */ String, t1: /* event */ SerializedEvent[Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnVDOMEventUndefined: Self = StObject.set(x, "onVDOMEvent", js.undefined)
    }
  }
}
