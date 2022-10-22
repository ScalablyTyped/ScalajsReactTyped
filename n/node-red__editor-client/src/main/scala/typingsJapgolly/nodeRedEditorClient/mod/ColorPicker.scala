package typingsJapgolly.nodeRedEditorClient.mod

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.nodeRedEditorClient.anon.CellHeight
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPicker extends StObject {
  
  def create(options: CellHeight): JQuery[HTMLDivElement]
}
object ColorPicker {
  
  inline def apply(create: CellHeight => JQuery[HTMLDivElement]): ColorPicker = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ColorPicker]
  }
  
  extension [Self <: ColorPicker](x: Self) {
    
    inline def setCreate(value: CellHeight => JQuery[HTMLDivElement]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
