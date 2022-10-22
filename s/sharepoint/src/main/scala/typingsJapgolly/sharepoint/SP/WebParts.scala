package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebParts {
  
  @js.native
  sealed trait PersonalizationScope extends StObject
  @JSGlobal("SP.WebParts.PersonalizationScope")
  @js.native
  object PersonalizationScope extends StObject {
    
    @js.native
    sealed trait shared
      extends StObject
         with PersonalizationScope
    
    @js.native
    sealed trait user
      extends StObject
         with PersonalizationScope
  }
  
  @js.native
  trait LimitedWebPartManager
    extends StObject
       with ClientObject {
    
    def addWebPart(webPart: WebPart, zoneId: String, zoneIndex: Double): WebPartDefinition = js.native
    
    def get_hasPersonalizedParts(): Boolean = js.native
    
    def get_scope(): PersonalizationScope = js.native
    
    def get_webParts(): WebPartDefinitionCollection = js.native
    
    def importWebPart(webPartXml: String): WebPartDefinition = js.native
  }
  
  trait TileData
    extends StObject
       with ClientValueObject {
    
    def get_backgroundImageLocation(): String
    
    def get_description(): String
    
    def get_iD(): Double
    
    def get_linkLocation(): String
    
    def get_tileOrder(): Double
    
    def get_title(): String
    
    def set_backgroundImageLocation(value: String): Unit
    
    def set_description(value: String): Unit
    
    def set_iD(value: Double): Unit
    
    def set_linkLocation(value: String): Unit
    
    def set_tileOrder(value: Double): Unit
    
    def set_title(value: String): Unit
  }
  object TileData {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_backgroundImageLocation: CallbackTo[String],
      get_description: CallbackTo[String],
      get_iD: CallbackTo[Double],
      get_linkLocation: CallbackTo[String],
      get_tileOrder: CallbackTo[Double],
      get_title: CallbackTo[String],
      get_typeId: CallbackTo[String],
      set_backgroundImageLocation: String => Callback,
      set_description: String => Callback,
      set_iD: Double => Callback,
      set_linkLocation: String => Callback,
      set_tileOrder: Double => Callback,
      set_title: String => Callback,
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): TileData = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_backgroundImageLocation = get_backgroundImageLocation.toJsFn, get_description = get_description.toJsFn, get_iD = get_iD.toJsFn, get_linkLocation = get_linkLocation.toJsFn, get_tileOrder = get_tileOrder.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, set_backgroundImageLocation = js.Any.fromFunction1((t0: String) => set_backgroundImageLocation(t0).runNow()), set_description = js.Any.fromFunction1((t0: String) => set_description(t0).runNow()), set_iD = js.Any.fromFunction1((t0: Double) => set_iD(t0).runNow()), set_linkLocation = js.Any.fromFunction1((t0: String) => set_linkLocation(t0).runNow()), set_tileOrder = js.Any.fromFunction1((t0: Double) => set_tileOrder(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[TileData]
    }
    
    extension [Self <: TileData](x: Self) {
      
      inline def setGet_backgroundImageLocation(value: CallbackTo[String]): Self = StObject.set(x, "get_backgroundImageLocation", value.toJsFn)
      
      inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
      
      inline def setGet_iD(value: CallbackTo[Double]): Self = StObject.set(x, "get_iD", value.toJsFn)
      
      inline def setGet_linkLocation(value: CallbackTo[String]): Self = StObject.set(x, "get_linkLocation", value.toJsFn)
      
      inline def setGet_tileOrder(value: CallbackTo[Double]): Self = StObject.set(x, "get_tileOrder", value.toJsFn)
      
      inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
      
      inline def setSet_backgroundImageLocation(value: String => Callback): Self = StObject.set(x, "set_backgroundImageLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_description(value: String => Callback): Self = StObject.set(x, "set_description", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_iD(value: Double => Callback): Self = StObject.set(x, "set_iD", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_linkLocation(value: String => Callback): Self = StObject.set(x, "set_linkLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_tileOrder(value: Double => Callback): Self = StObject.set(x, "set_tileOrder", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait WebPart
    extends StObject
       with ClientObject {
    
    def get_hidden(): Boolean = js.native
    
    def get_isClosed(): Boolean = js.native
    
    def get_properties(): PropertyValues = js.native
    
    def get_subtitle(): String = js.native
    
    def get_title(): String = js.native
    
    def get_titleUrl(): String = js.native
    
    def get_zoneIndex(): Double = js.native
    
    def set_hidden(value: Boolean): Unit = js.native
    
    def set_title(value: String): Unit = js.native
    
    def set_titleUrl(value: String): Unit = js.native
  }
  
  @js.native
  trait WebPartDefinition
    extends StObject
       with ClientObject {
    
    def closeWebPart(): Unit = js.native
    
    def deleteWebPart(): Unit = js.native
    
    def get_id(): Guid = js.native
    
    def get_webPart(): WebPart = js.native
    
    def get_zoneId(): String = js.native
    
    def moveWebPartTo(zoneID: String, zoneIndex: Double): Unit = js.native
    
    def openWebPart(): Unit = js.native
    
    def saveWebPartChanges(): Unit = js.native
  }
  
  @js.native
  trait WebPartDefinitionCollection
    extends StObject
       with ClientObjectCollection[WebPartDefinition] {
    
    def getByControlId(controlId: String): WebPartDefinition = js.native
    
    def getById(id: Guid): WebPartDefinition = js.native
    
    def get_item(index: Double): WebPartDefinition = js.native
    
    def itemAt(index: Double): WebPartDefinition = js.native
  }
}
