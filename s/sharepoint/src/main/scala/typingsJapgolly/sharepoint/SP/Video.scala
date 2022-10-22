package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  trait EmbedCodeConfiguration
    extends StObject
       with ClientValueObject {
    
    def get_autoPlay(): Boolean
    
    def get_displayTitle(): Boolean
    
    def get_linkToOwnerProfilePage(): Boolean
    
    def get_linkToVideoHomePage(): Boolean
    
    def get_loop(): Boolean
    
    def get_pixelHeight(): Double
    
    def get_pixelWidth(): Double
    
    def get_previewImagePath(): String
    
    def get_startTime(): Double
    
    def set_autoPlay(value: Boolean): Boolean
    
    def set_displayTitle(value: Boolean): Boolean
    
    def set_linkToOwnerProfilePage(value: Boolean): Boolean
    
    def set_linkToVideoHomePage(value: Boolean): Boolean
    
    def set_loop(value: Boolean): Boolean
    
    def set_pixelHeight(value: Double): Double
    
    def set_pixelWidth(value: Double): Double
    
    def set_previewImagePath(value: String): String
    
    def set_startTime(value: Double): Double
  }
  object EmbedCodeConfiguration {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_autoPlay: CallbackTo[Boolean],
      get_displayTitle: CallbackTo[Boolean],
      get_linkToOwnerProfilePage: CallbackTo[Boolean],
      get_linkToVideoHomePage: CallbackTo[Boolean],
      get_loop: CallbackTo[Boolean],
      get_pixelHeight: CallbackTo[Double],
      get_pixelWidth: CallbackTo[Double],
      get_previewImagePath: CallbackTo[String],
      get_startTime: CallbackTo[Double],
      get_typeId: CallbackTo[String],
      set_autoPlay: Boolean => Boolean,
      set_displayTitle: Boolean => Boolean,
      set_linkToOwnerProfilePage: Boolean => Boolean,
      set_linkToVideoHomePage: Boolean => Boolean,
      set_loop: Boolean => Boolean,
      set_pixelHeight: Double => Double,
      set_pixelWidth: Double => Double,
      set_previewImagePath: String => String,
      set_startTime: Double => Double,
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): EmbedCodeConfiguration = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_autoPlay = get_autoPlay.toJsFn, get_displayTitle = get_displayTitle.toJsFn, get_linkToOwnerProfilePage = get_linkToOwnerProfilePage.toJsFn, get_linkToVideoHomePage = get_linkToVideoHomePage.toJsFn, get_loop = get_loop.toJsFn, get_pixelHeight = get_pixelHeight.toJsFn, get_pixelWidth = get_pixelWidth.toJsFn, get_previewImagePath = get_previewImagePath.toJsFn, get_startTime = get_startTime.toJsFn, get_typeId = get_typeId.toJsFn, set_autoPlay = js.Any.fromFunction1(set_autoPlay), set_displayTitle = js.Any.fromFunction1(set_displayTitle), set_linkToOwnerProfilePage = js.Any.fromFunction1(set_linkToOwnerProfilePage), set_linkToVideoHomePage = js.Any.fromFunction1(set_linkToVideoHomePage), set_loop = js.Any.fromFunction1(set_loop), set_pixelHeight = js.Any.fromFunction1(set_pixelHeight), set_pixelWidth = js.Any.fromFunction1(set_pixelWidth), set_previewImagePath = js.Any.fromFunction1(set_previewImagePath), set_startTime = js.Any.fromFunction1(set_startTime), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[EmbedCodeConfiguration]
    }
    
    extension [Self <: EmbedCodeConfiguration](x: Self) {
      
      inline def setGet_autoPlay(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_autoPlay", value.toJsFn)
      
      inline def setGet_displayTitle(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_displayTitle", value.toJsFn)
      
      inline def setGet_linkToOwnerProfilePage(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_linkToOwnerProfilePage", value.toJsFn)
      
      inline def setGet_linkToVideoHomePage(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_linkToVideoHomePage", value.toJsFn)
      
      inline def setGet_loop(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_loop", value.toJsFn)
      
      inline def setGet_pixelHeight(value: CallbackTo[Double]): Self = StObject.set(x, "get_pixelHeight", value.toJsFn)
      
      inline def setGet_pixelWidth(value: CallbackTo[Double]): Self = StObject.set(x, "get_pixelWidth", value.toJsFn)
      
      inline def setGet_previewImagePath(value: CallbackTo[String]): Self = StObject.set(x, "get_previewImagePath", value.toJsFn)
      
      inline def setGet_startTime(value: CallbackTo[Double]): Self = StObject.set(x, "get_startTime", value.toJsFn)
      
      inline def setSet_autoPlay(value: Boolean => Boolean): Self = StObject.set(x, "set_autoPlay", js.Any.fromFunction1(value))
      
      inline def setSet_displayTitle(value: Boolean => Boolean): Self = StObject.set(x, "set_displayTitle", js.Any.fromFunction1(value))
      
      inline def setSet_linkToOwnerProfilePage(value: Boolean => Boolean): Self = StObject.set(x, "set_linkToOwnerProfilePage", js.Any.fromFunction1(value))
      
      inline def setSet_linkToVideoHomePage(value: Boolean => Boolean): Self = StObject.set(x, "set_linkToVideoHomePage", js.Any.fromFunction1(value))
      
      inline def setSet_loop(value: Boolean => Boolean): Self = StObject.set(x, "set_loop", js.Any.fromFunction1(value))
      
      inline def setSet_pixelHeight(value: Double => Double): Self = StObject.set(x, "set_pixelHeight", js.Any.fromFunction1(value))
      
      inline def setSet_pixelWidth(value: Double => Double): Self = StObject.set(x, "set_pixelWidth", js.Any.fromFunction1(value))
      
      inline def setSet_previewImagePath(value: String => String): Self = StObject.set(x, "set_previewImagePath", js.Any.fromFunction1(value))
      
      inline def setSet_startTime(value: Double => Double): Self = StObject.set(x, "set_startTime", js.Any.fromFunction1(value))
    }
  }
  
  type VideoSet = typingsJapgolly.sharepoint.SP.DocumentSet.DocumentSet
}
