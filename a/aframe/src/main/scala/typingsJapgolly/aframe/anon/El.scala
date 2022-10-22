package typingsJapgolly.aframe.anon

import org.scalajs.dom.Element
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait El extends StObject {
  
  var el: Element | (Entity[ObjectMap[Component[Any, System[Any]]]])
}
object El {
  
  inline def apply(el: Element | (Entity[ObjectMap[Component[Any, System[Any]]]])): El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[El]
  }
  
  extension [Self <: El](x: Self) {
    
    inline def setEl(value: Element | (Entity[ObjectMap[Component[Any, System[Any]]]])): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
