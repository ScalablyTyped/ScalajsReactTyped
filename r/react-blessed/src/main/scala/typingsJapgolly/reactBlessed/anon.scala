package typingsJapgolly.reactBlessed

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blessed.mod.Widgets.Events.IKeyEventArg
import typingsJapgolly.blessed.mod.Widgets.Events.IMouseEventArg
import typingsJapgolly.blessed.mod.Widgets.NodeEventType
import typingsJapgolly.blessed.mod.Widgets.NodeGenericEventType
import typingsJapgolly.blessed.mod.Widgets.NodeMouseEventType
import typingsJapgolly.blessed.mod.Widgets.NodeScreenEventType
import typingsJapgolly.blessed.mod.Widgets.Screen
import typingsJapgolly.reactBlessed.mod.ElementStyle
import typingsJapgolly.reactBlessed.reactBlessedStrings.complete
import typingsJapgolly.reactBlessed.reactBlessedStrings.keypress
import typingsJapgolly.reactBlessed.reactBlessedStrings.reset
import typingsJapgolly.reactBlessed.reactBlessedStrings.scroll
import typingsJapgolly.reactBlessed.reactBlessedStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bg extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
  }
  object Bg {
    
    inline def apply(): Bg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bg]
    }
    
    extension [Self <: Bg](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[ElementStyle] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: ElementStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Class[K] extends StObject {
    
    var `class`: js.UndefOr[K | js.Array[K]] = js.undefined
  }
  object Class {
    
    inline def apply[K](): Class[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Class[K]]
    }
    
    extension [Self <: Class[?], K](x: Self & Class[K]) {
      
      inline def setClass(value: K | js.Array[K]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setClassVarargs(value: K*): Self = StObject.set(x, "class", js.Array(value*))
    }
  }
  
  trait Fg extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var track: js.UndefOr[Bg] = js.undefined
  }
  object Fg {
    
    inline def apply(): Fg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fg]
    }
    
    extension [Self <: Fg](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setTrack(value: Bg): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def apply(event: reset | complete, callback: js.Function0[Unit]): this.type = js.native
    def apply(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def apply(event: String, listener: js.Function2[/* ch */ Any, /* key */ IKeyEventArg, Unit]): this.type = js.native
    def apply(event: NodeEventType, callback: js.Function1[/* arg */ this.type, Unit]): this.type = js.native
    def apply(event: NodeGenericEventType, callback: js.Function0[Unit]): this.type = js.native
    def apply(event: NodeMouseEventType, callback: js.Function1[/* arg */ IMouseEventArg, Unit]): this.type = js.native
    def apply(event: NodeScreenEventType, callback: js.Function1[/* arg */ Screen, Unit]): this.type = js.native
    def apply(event: keypress, callback: js.Function2[/* ch */ String, /* key */ IKeyEventArg, Unit]): this.type = js.native
    def apply(event: scroll, callback: js.Function0[Unit]): this.type = js.native
    def apply(event: warning, callback: js.Function1[/* text */ String, Unit]): this.type = js.native
  }
}
