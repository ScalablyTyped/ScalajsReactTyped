package typingsJapgolly.winrt.anon

import typingsJapgolly.winrt.Windows.UI.Text.TabAlignment
import typingsJapgolly.winrt.Windows.UI.Text.TabLeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: TabAlignment
  
  var leader: TabLeader
  
  var position: Double
}
object Align {
  
  inline def apply(align: TabAlignment, leader: TabLeader, position: Double): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: TabAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setLeader(value: TabLeader): Self = StObject.set(x, "leader", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
