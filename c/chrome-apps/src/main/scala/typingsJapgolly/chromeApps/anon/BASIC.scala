package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.basic_
import typingsJapgolly.chromeApps.chromeAppsStrings.image_
import typingsJapgolly.chromeApps.chromeAppsStrings.list_
import typingsJapgolly.chromeApps.chromeAppsStrings.progress_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BASIC extends StObject {
  
  var BASIC: basic_
  
  var IMAGE: image_
  
  var LIST: list_
  
  var PROGRESS: progress_
}
object BASIC {
  
  inline def apply(): BASIC = {
    val __obj = js.Dynamic.literal(BASIC = "basic", IMAGE = "image", LIST = "list", PROGRESS = "progress")
    __obj.asInstanceOf[BASIC]
  }
  
  extension [Self <: BASIC](x: Self) {
    
    inline def setBASIC(value: basic_): Self = StObject.set(x, "BASIC", value.asInstanceOf[js.Any])
    
    inline def setIMAGE(value: image_): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    inline def setLIST(value: list_): Self = StObject.set(x, "LIST", value.asInstanceOf[js.Any])
    
    inline def setPROGRESS(value: progress_): Self = StObject.set(x, "PROGRESS", value.asInstanceOf[js.Any])
  }
}
