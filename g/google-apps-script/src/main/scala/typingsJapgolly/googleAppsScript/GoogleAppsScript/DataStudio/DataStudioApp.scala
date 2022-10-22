package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataStudioApp allows scripts to interact with developer-oriented features for Data Studio.
  */
trait DataStudioApp extends StObject {
  
  def createCommunityConnector(): CommunityConnector
}
object DataStudioApp {
  
  inline def apply(createCommunityConnector: CallbackTo[CommunityConnector]): DataStudioApp = {
    val __obj = js.Dynamic.literal(createCommunityConnector = createCommunityConnector.toJsFn)
    __obj.asInstanceOf[DataStudioApp]
  }
  
  extension [Self <: DataStudioApp](x: Self) {
    
    inline def setCreateCommunityConnector(value: CallbackTo[CommunityConnector]): Self = StObject.set(x, "createCommunityConnector", value.toJsFn)
  }
}
