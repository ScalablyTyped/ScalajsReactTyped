package typingsJapgolly.dynmap.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dynmap.anon.ComponentchatpopupsRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRecord
  extends StObject
     with /* componentname */ StringDictionary[js.UndefOr[typingsJapgolly.dynmap.anon.Component]] {
  
  var chat: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var chatballoon: js.UndefOr[ComponentchatpopupsRecord] = js.undefined
  
  var chatbox: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var coord: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var inactive: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var link: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var markers: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var playermarkers: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var testcomponent: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
  
  var timeofdayclock: js.UndefOr[typingsJapgolly.dynmap.anon.Component] = js.undefined
}
object ComponentRecord {
  
  inline def apply(): ComponentRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRecord]
  }
  
  extension [Self <: ComponentRecord](x: Self) {
    
    inline def setChat(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
    
    inline def setChatballoon(value: ComponentchatpopupsRecord): Self = StObject.set(x, "chatballoon", value.asInstanceOf[js.Any])
    
    inline def setChatballoonUndefined: Self = StObject.set(x, "chatballoon", js.undefined)
    
    inline def setChatbox(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "chatbox", value.asInstanceOf[js.Any])
    
    inline def setChatboxUndefined: Self = StObject.set(x, "chatbox", js.undefined)
    
    inline def setCoord(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    inline def setCoordUndefined: Self = StObject.set(x, "coord", js.undefined)
    
    inline def setInactive(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setLink(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setMarkers(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setPlayermarkers(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "playermarkers", value.asInstanceOf[js.Any])
    
    inline def setPlayermarkersUndefined: Self = StObject.set(x, "playermarkers", js.undefined)
    
    inline def setTestcomponent(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "testcomponent", value.asInstanceOf[js.Any])
    
    inline def setTestcomponentUndefined: Self = StObject.set(x, "testcomponent", js.undefined)
    
    inline def setTimeofdayclock(value: typingsJapgolly.dynmap.anon.Component): Self = StObject.set(x, "timeofdayclock", value.asInstanceOf[js.Any])
    
    inline def setTimeofdayclockUndefined: Self = StObject.set(x, "timeofdayclock", js.undefined)
  }
}
