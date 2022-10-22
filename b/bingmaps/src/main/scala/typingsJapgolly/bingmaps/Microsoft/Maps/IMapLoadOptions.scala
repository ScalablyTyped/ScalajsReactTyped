package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapLoadOptions
  extends StObject
     with IMapOptions
     with IViewOptions {
  
  /** 
    * @deprecated
    * The Bing Maps Key used to authenticate the application.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference. This option will continue to work.
    */
  var credentials: js.UndefOr[String] = js.undefined
}
object IMapLoadOptions {
  
  inline def apply(): IMapLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapLoadOptions]
  }
  
  extension [Self <: IMapLoadOptions](x: Self) {
    
    inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
  }
}
