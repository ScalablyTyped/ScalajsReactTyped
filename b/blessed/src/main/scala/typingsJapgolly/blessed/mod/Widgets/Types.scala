package typingsJapgolly.blessed.mod.Widgets

import japgolly.scalajs.react.Callback
import typingsJapgolly.blessed.anon.Bg
import typingsJapgolly.blessed.blessedStrings.bg
import typingsJapgolly.blessed.blessedStrings.block
import typingsJapgolly.blessed.blessedStrings.center
import typingsJapgolly.blessed.blessedStrings.line
import typingsJapgolly.blessed.blessedStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Types {
  
  trait Cursor extends StObject {
    
    /**
      * Have blessed draw a custom cursor and hide the terminal cursor (experimental).
      */
    var artificial: Boolean
    
    /**
      * Whether the cursor blinks.
      */
    var blink: Boolean
    
    /**
      * Color of the color. Accepts any valid color value (null is default).
      */
    var color: String
    
    /**
      * Shape of the cursor. Can be: block, underline, or line.
      */
    var shape: Boolean
  }
  object Cursor {
    
    inline def apply(artificial: Boolean, blink: Boolean, color: String, shape: Boolean): Cursor = {
      val __obj = js.Dynamic.literal(artificial = artificial.asInstanceOf[js.Any], blink = blink.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor]
    }
    
    extension [Self <: Cursor](x: Self) {
      
      inline def setArtificial(value: Boolean): Self = StObject.set(x, "artificial", value.asInstanceOf[js.Any])
      
      inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setShape(value: Boolean): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListbarCommand extends StObject {
    
    def callback(): Unit
    
    var key: String
  }
  object ListbarCommand {
    
    inline def apply(callback: Callback, key: String): ListbarCommand = {
      val __obj = js.Dynamic.literal(callback = callback.toJsFn, key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListbarCommand]
    }
    
    extension [Self <: ListbarCommand](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blessed.blessedStrings.left
    - typingsJapgolly.blessed.blessedStrings.center
    - typingsJapgolly.blessed.blessedStrings.right
  */
  trait TAlign extends StObject
  object TAlign {
    
    inline def center: typingsJapgolly.blessed.blessedStrings.center = "center".asInstanceOf[typingsJapgolly.blessed.blessedStrings.center]
    
    inline def left: typingsJapgolly.blessed.blessedStrings.left = "left".asInstanceOf[typingsJapgolly.blessed.blessedStrings.left]
    
    inline def right: typingsJapgolly.blessed.blessedStrings.right = "right".asInstanceOf[typingsJapgolly.blessed.blessedStrings.right]
  }
  
  trait TBorder extends StObject {
    
    /**
      * Border foreground and background, must be numbers (-1 for default).
      */
    var bg: js.UndefOr[Double] = js.undefined
    
    /**
      * Border attributes.
      */
    var bold: js.UndefOr[String] = js.undefined
    
    /**
      * Character to use if bg type, default is space.
      */
    var ch: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[Double] = js.undefined
    
    /**
      * Type of border (line or bg). bg by default.
      */
    var `type`: js.UndefOr[line | bg] = js.undefined
    
    var underline: js.UndefOr[String] = js.undefined
  }
  object TBorder {
    
    inline def apply(): TBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TBorder]
    }
    
    extension [Self <: TBorder](x: Self) {
      
      inline def setBg(value: Double): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      inline def setFg(value: Double): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setType(value: line | bg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait TCursor extends StObject {
    
    /**
      * Have blessed draw a custom cursor and hide the terminal cursor (experimental).
      */
    var artificial: Boolean
    
    /**
      * Whether the cursor blinks.
      */
    var blink: Boolean
    
    /**
      * Color of the color. Accepts any valid color value (null is default).
      */
    var color: String
    
    /**
      * Shape of the cursor. Can be: block, underline, or line.
      */
    var shape: block | underline | line
  }
  object TCursor {
    
    inline def apply(artificial: Boolean, blink: Boolean, color: String, shape: block | underline | line): TCursor = {
      val __obj = js.Dynamic.literal(artificial = artificial.asInstanceOf[js.Any], blink = blink.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TCursor]
    }
    
    extension [Self <: TCursor](x: Self) {
      
      inline def setArtificial(value: Boolean): Self = StObject.set(x, "artificial", value.asInstanceOf[js.Any])
      
      inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setShape(value: block | underline | line): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  trait TImage extends StObject {
    
    /**
      * Image bitmap.
      */
    var bmp: Any
    
    /**
      * Image cellmap (bitmap scaled down to cell size).
      */
    var cellmap: Any
    
    /**
      * Pixel height.
      */
    var height: Double
    
    /**
      * Pixel width.
      */
    var width: Double
  }
  object TImage {
    
    inline def apply(bmp: Any, cellmap: Any, height: Double, width: Double): TImage = {
      val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], cellmap = cellmap.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TImage]
    }
    
    extension [Self <: TImage](x: Self) {
      
      inline def setBmp(value: Any): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
      
      inline def setCellmap(value: Any): Self = StObject.set(x, "cellmap", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blessed.blessedStrings.mousedown
    - typingsJapgolly.blessed.blessedStrings.mouseup
    - typingsJapgolly.blessed.blessedStrings.mousemove
  */
  trait TMouseAction extends StObject
  object TMouseAction {
    
    inline def mousedown: typingsJapgolly.blessed.blessedStrings.mousedown = "mousedown".asInstanceOf[typingsJapgolly.blessed.blessedStrings.mousedown]
    
    inline def mousemove: typingsJapgolly.blessed.blessedStrings.mousemove = "mousemove".asInstanceOf[typingsJapgolly.blessed.blessedStrings.mousemove]
    
    inline def mouseup: typingsJapgolly.blessed.blessedStrings.mouseup = "mouseup".asInstanceOf[typingsJapgolly.blessed.blessedStrings.mouseup]
  }
  
  type TPosition = String | Double
  
  trait TStyle extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var blink: js.UndefOr[Boolean] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var border: js.UndefOr[line | bg | TBorder] = js.undefined
    
    var ch: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var hover: js.UndefOr[Boolean] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var scrollbar: js.UndefOr[Bg] = js.undefined
    
    var track: js.UndefOr[Bg] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object TStyle {
    
    inline def apply(): TStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TStyle]
    }
    
    extension [Self <: TStyle](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      inline def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setBorder(value: line | bg | TBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setScrollbar(value: Bg): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setTrack(value: Bg): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type TTopLeft = String | Double | center
}
