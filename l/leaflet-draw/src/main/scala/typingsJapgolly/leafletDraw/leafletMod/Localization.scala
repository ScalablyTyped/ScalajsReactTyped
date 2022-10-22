package typingsJapgolly.leafletDraw.leafletMod

import typingsJapgolly.leafletDraw.anon.Cancel
import typingsJapgolly.leafletDraw.anon.Circle
import typingsJapgolly.leafletDraw.anon.Error
import typingsJapgolly.leafletDraw.anon.Radius
import typingsJapgolly.leafletDraw.anon.TooltipCont
import typingsJapgolly.leafletDraw.anon.TooltipEnd
import typingsJapgolly.leafletDraw.anon.TooltipText
import typingsJapgolly.leafletDraw.anon.TooltipTextString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localization {
  
  trait Action extends StObject {
    
    var text: String
    
    var title: String
  }
  object Action {
    
    inline def apply(text: String, title: String): Action = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Draw extends StObject {
    
    var handlers: DrawHandlers
    
    var toolbar: typingsJapgolly.leafletDraw.leafletMod.Localization.DrawToolbar
  }
  object Draw {
    
    inline def apply(handlers: DrawHandlers, toolbar: typingsJapgolly.leafletDraw.leafletMod.Localization.DrawToolbar): typingsJapgolly.leafletDraw.leafletMod.Localization.Draw = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.leafletDraw.leafletMod.Localization.Draw]
    }
    
    extension [Self <: typingsJapgolly.leafletDraw.leafletMod.Localization.Draw](x: Self) {
      
      inline def setHandlers(value: DrawHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: typingsJapgolly.leafletDraw.leafletMod.Localization.DrawToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawHandlers extends StObject {
    
    var circle: Radius
    
    var circlemarker: typingsJapgolly.leafletDraw.anon.Tooltip
    
    var marker: typingsJapgolly.leafletDraw.anon.Tooltip
    
    var polygon: TooltipCont
    
    var polyline: Error
    
    var rectangle: typingsJapgolly.leafletDraw.anon.Tooltip
    
    var simpleshape: TooltipEnd
  }
  object DrawHandlers {
    
    inline def apply(
      circle: Radius,
      circlemarker: typingsJapgolly.leafletDraw.anon.Tooltip,
      marker: typingsJapgolly.leafletDraw.anon.Tooltip,
      polygon: TooltipCont,
      polyline: Error,
      rectangle: typingsJapgolly.leafletDraw.anon.Tooltip,
      simpleshape: TooltipEnd
    ): DrawHandlers = {
      val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawHandlers]
    }
    
    extension [Self <: DrawHandlers](x: Self) {
      
      inline def setCircle(value: Radius): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCirclemarker(value: typingsJapgolly.leafletDraw.anon.Tooltip): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: typingsJapgolly.leafletDraw.anon.Tooltip): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setPolygon(value: TooltipCont): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolyline(value: Error): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setRectangle(value: typingsJapgolly.leafletDraw.anon.Tooltip): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setSimpleshape(value: TooltipEnd): Self = StObject.set(x, "simpleshape", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawLocal extends StObject {
    
    var draw: typingsJapgolly.leafletDraw.leafletMod.Localization.Draw
    
    var edit: typingsJapgolly.leafletDraw.leafletMod.Localization.Edit
  }
  object DrawLocal {
    
    inline def apply(
      draw: typingsJapgolly.leafletDraw.leafletMod.Localization.Draw,
      edit: typingsJapgolly.leafletDraw.leafletMod.Localization.Edit
    ): DrawLocal = {
      val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawLocal]
    }
    
    extension [Self <: DrawLocal](x: Self) {
      
      inline def setDraw(value: typingsJapgolly.leafletDraw.leafletMod.Localization.Draw): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setEdit(value: typingsJapgolly.leafletDraw.leafletMod.Localization.Edit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawToolbar extends StObject {
    
    var actions: Action
    
    var buttons: Circle
    
    var finish: Action
    
    var undo: Action
  }
  object DrawToolbar {
    
    inline def apply(actions: Action, buttons: Circle, finish: Action, undo: Action): typingsJapgolly.leafletDraw.leafletMod.Localization.DrawToolbar = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.leafletDraw.leafletMod.Localization.DrawToolbar]
    }
    
    extension [Self <: typingsJapgolly.leafletDraw.leafletMod.Localization.DrawToolbar](x: Self) {
      
      inline def setActions(value: Action): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: Circle): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: Action): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setUndo(value: Action): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Edit extends StObject {
    
    var handlers: EditHandlers
    
    var toolbar: typingsJapgolly.leafletDraw.leafletMod.Localization.EditToolbar
  }
  object Edit {
    
    inline def apply(handlers: EditHandlers, toolbar: typingsJapgolly.leafletDraw.leafletMod.Localization.EditToolbar): typingsJapgolly.leafletDraw.leafletMod.Localization.Edit = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.leafletDraw.leafletMod.Localization.Edit]
    }
    
    extension [Self <: typingsJapgolly.leafletDraw.leafletMod.Localization.Edit](x: Self) {
      
      inline def setHandlers(value: EditHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: typingsJapgolly.leafletDraw.leafletMod.Localization.EditToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditHandlers extends StObject {
    
    var edit: TooltipText
    
    var remove: TooltipTextString
  }
  object EditHandlers {
    
    inline def apply(edit: TooltipText, remove: TooltipTextString): EditHandlers = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditHandlers]
    }
    
    extension [Self <: EditHandlers](x: Self) {
      
      inline def setEdit(value: TooltipText): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: TooltipTextString): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditToolbar extends StObject {
    
    var actions: Cancel
    
    var buttons: typingsJapgolly.leafletDraw.anon.Edit
  }
  object EditToolbar {
    
    inline def apply(actions: Cancel, buttons: typingsJapgolly.leafletDraw.anon.Edit): typingsJapgolly.leafletDraw.leafletMod.Localization.EditToolbar = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.leafletDraw.leafletMod.Localization.EditToolbar]
    }
    
    extension [Self <: typingsJapgolly.leafletDraw.leafletMod.Localization.EditToolbar](x: Self) {
      
      inline def setActions(value: Cancel): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: typingsJapgolly.leafletDraw.anon.Edit): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tooltip extends StObject {
    
    var cont: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[String] = js.undefined
  }
  object Tooltip {
    
    inline def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    extension [Self <: Tooltip](x: Self) {
      
      inline def setCont(value: String): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContUndefined: Self = StObject.set(x, "cont", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
