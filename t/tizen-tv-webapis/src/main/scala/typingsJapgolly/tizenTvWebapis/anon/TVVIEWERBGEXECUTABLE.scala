package typingsJapgolly.tizenTvWebapis.anon

import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TVVIEWERBGEXECUTABLE extends StObject {
  
  /**
    * Whether the application can be executed in the background
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TV_VIEWER_BG_EXECUTABLE: `0`
}
object TVVIEWERBGEXECUTABLE {
  
  inline def apply(): TVVIEWERBGEXECUTABLE = {
    val __obj = js.Dynamic.literal(TV_VIEWER_BG_EXECUTABLE = 0)
    __obj.asInstanceOf[TVVIEWERBGEXECUTABLE]
  }
  
  extension [Self <: TVVIEWERBGEXECUTABLE](x: Self) {
    
    inline def setTV_VIEWER_BG_EXECUTABLE(value: `0`): Self = StObject.set(x, "TV_VIEWER_BG_EXECUTABLE", value.asInstanceOf[js.Any])
  }
}
