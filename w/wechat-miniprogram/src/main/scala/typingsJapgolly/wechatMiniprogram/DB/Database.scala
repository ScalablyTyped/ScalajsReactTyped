package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class of all exposed cloud database instances
  */
trait Database extends StObject {
  
  val Geo: IGeo
  
  def RegExp(options: IRegExpOptions): typingsJapgolly.wechatMiniprogram.DB.RegExp
  @JSName("RegExp")
  val RegExp_Original: IRegExpConstructor
  
  def collection(collectionName: String): CollectionReference
  
  val command: DatabaseCommand
  
  val config: ICloudConfig
  
  def serverDate(): ServerDate
}
object Database {
  
  inline def apply(
    Geo: IGeo,
    RegExp: IRegExpConstructor,
    collection: String => CollectionReference,
    command: DatabaseCommand,
    config: ICloudConfig,
    serverDate: CallbackTo[ServerDate]
  ): Database = {
    val __obj = js.Dynamic.literal(Geo = Geo.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], collection = js.Any.fromFunction1(collection), command = command.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], serverDate = serverDate.toJsFn)
    __obj.asInstanceOf[Database]
  }
  
  extension [Self <: Database](x: Self) {
    
    inline def setCollection(value: String => CollectionReference): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    inline def setCommand(value: DatabaseCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setGeo(value: IGeo): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
    
    inline def setRegExp(value: IRegExpConstructor): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
    
    inline def setServerDate(value: CallbackTo[ServerDate]): Self = StObject.set(x, "serverDate", value.toJsFn)
  }
}
