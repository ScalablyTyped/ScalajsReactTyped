package typingsJapgolly.zfont

import typingsJapgolly.zdog.mod.Group
import typingsJapgolly.zdog.mod.GroupOptions
import typingsJapgolly.zdog.mod.Shape
import typingsJapgolly.zdog.mod.ShapeOptions
import typingsJapgolly.zfont.anon.Typeofzdog
import typingsJapgolly.zfont.zfontBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Zfont {
    
    @JSGlobal("Zfont")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(x: Typeofzdog): Typeofzdog = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(x.asInstanceOf[js.Any]).asInstanceOf[Typeofzdog]
    
    /* augmented module */
    object zdogMod {
      
      @JSImport("zdog", JSImport.Namespace)
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Represents a font that can be used by an instance of either {@link Text} or {@link TextGroup}.
        * @see {@link https://github.com/jaames/zfont#zdogfont Zfont API}
        */
      @JSImport("zdog", "Font")
      @js.native
      open class Font protected () extends StObject {
        def this(options: typingsJapgolly.zfont.mod.zdogAugmentingMod.FontOptions) = this()
        
        /**
          * Returns a Promise which resolves once this font has finished loading.
          * @see {@link https://github.com/jaames/zfont#waitforload Zfont API}
          */
        def waitForLoad(): js.Promise[Unit] = js.native
      }
      
      /**
        * An object used for rendering text.
        * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
        */
      @JSImport("zdog", "Text")
      @js.native
      open class Text[T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */] protected () extends Shape {
        def this(options: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextOptions[T]) = this()
        
        /** @see {@link TextOptions#font} */
        var font: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font = js.native
        
        /** @see {@link TextOptions#fontSize} */
        var fontSize: Double = js.native
        
        /** @see {@link TextOptions#textAlign} */
        var textAlign: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign = js.native
        
        /** @see {@link TextOptions#textBaseline} */
        var textBaseline: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline = js.native
        
        /** @see {@link TextOptions#value} */
        var value: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText = js.native
      }
      
      /**
        * This class is very similar to {@link Text}, except it acts as a {@link Group} instead, and each text glyph is rendered as its own shape.
        * This is helpful for more advanced use-cases where you need control over each character.
        * @see {@link https://github.com/jaames/zfont#zdogtextgroup Zfont API}
        * @see {@link  Zfont API}
        */
      @JSImport("zdog", "TextGroup")
      @js.native
      open class TextGroup[T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */] protected () extends Group {
        def this(options: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextGroupOptions[T]) = this()
        
        /**
          * @see {@link TextGroupOptions#color}
          * @see {@link https://github.com/jaames/zfont#color Zfont API}
          */
        var color: String = js.native
        
        /**
          * @see {@link TextGroupOptions#fill}
          * @see {@link https://github.com/jaames/zfont#fill Zfont API}
          */
        var fill: Boolean = js.native
        
        /**
          * @see {@link TextGroupOptions#font}
          * @see {@link https://github.com/jaames/zfont#font-1 Zfont API}
          */
        var font: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font = js.native
        
        /**
          * @see {@link TextGroupOptions#fontSize}
          * @see {@link https://github.com/jaames/zfont#fontsize-1 Zfont API}
          */
        var fontSize: Double = js.native
        
        /**
          * @see {@link TextGroupOptions#stroke}
          * @see {@link https://github.com/jaames/zfont#stroke Zfont API}
          */
        var stroke: Double | `false` = js.native
        
        /**
          * @see {@link TextGroupOptions#textAlign}
          * @see {@link https://github.com/jaames/zfont#textalign-1 Zfont API}
          */
        var textAlign: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign = js.native
        
        /**
          * @see {@link TextGroupOptions#textBaseline}
          * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API}
          */
        var textBaseline: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline = js.native
        
        /**
          * @see {@link TextGroupOptions#value}
          * @see {@link https://github.com/jaames/zfont#value-1 Zfont API}
          */
        var value: T = js.native
      }
      
      /**
        * Returns a {@link Promise} which resolves as soon as all the fonts currently added to the scene are loaded and ready for use.
        * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
        */
      inline def waitForFonts(): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForFonts")().asInstanceOf[js.Promise[js.Array[Unit]]]
      
      /**
        * @see {@link Font}
        * @see {@link https://github.com/jaames/zfont#options Zfont API}
        */
      trait FontOptions extends StObject {
        
        /** Font URL path. This can be a `.ttf` or `.otf` font, check out the {@link https://github.com/photopea/Typr.js Typr.js repo} for more details about font support. */
        val src: String
      }
      object FontOptions {
        
        inline def apply(src: String): FontOptions = {
          val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
          __obj.asInstanceOf[FontOptions]
        }
        
        extension [Self <: FontOptions](x: Self) {
          
          inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        }
      }
      
      /** @see {@link https://github.com/jaames/zfont#multiline-text Zfont API} */
      type MultilineText = String | js.Array[String]
      
      /**
        * Horizontal text alignment (equivalent to the CSS `text-align` property).
        * @see {@link https://github.com/jaames/zfont#textalign Zfont API} (Text)
        * @see {@link https://github.com/jaames/zfont#textalign-1 Zfont API} (TextGroup)
        */
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.zfont.zfontStrings.left
        - typingsJapgolly.zfont.zfontStrings.center
        - typingsJapgolly.zfont.zfontStrings.right
      */
      trait TextAlign extends StObject
      object TextAlign {
        
        inline def center: typingsJapgolly.zfont.zfontStrings.center = "center".asInstanceOf[typingsJapgolly.zfont.zfontStrings.center]
        
        inline def left: typingsJapgolly.zfont.zfontStrings.left = "left".asInstanceOf[typingsJapgolly.zfont.zfontStrings.left]
        
        inline def right: typingsJapgolly.zfont.zfontStrings.right = "right".asInstanceOf[typingsJapgolly.zfont.zfontStrings.right]
      }
      
      /**
        * Vertical text alignment, equivalent to the HTML5 canvas' {@link CanvasRenderingContext2D.textBaseline textBaseline} property.
        * @see {@link https://github.com/jaames/zfont#textbaseline Zfont API} (Text)
        * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API} (TextGroup)
        */
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.zfont.zfontStrings.top
        - typingsJapgolly.zfont.zfontStrings.middle
        - typingsJapgolly.zfont.zfontStrings.bottom
      */
      trait TextBaseline extends StObject
      object TextBaseline {
        
        inline def bottom: typingsJapgolly.zfont.zfontStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.zfont.zfontStrings.bottom]
        
        inline def middle: typingsJapgolly.zfont.zfontStrings.middle = "middle".asInstanceOf[typingsJapgolly.zfont.zfontStrings.middle]
        
        inline def top: typingsJapgolly.zfont.zfontStrings.top = "top".asInstanceOf[typingsJapgolly.zfont.zfontStrings.top]
      }
      
      /**
        * @see {@link TextGroup}
        * @see {@link https://github.com/jaames/zfont#options-2 Zfont API}
        */
      trait TextGroupOptions[T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */]
        extends StObject
           with GroupOptions {
        
        /**
          * @default '#333'
          * @see {@link TextGroup#color}
          */
        val color: js.UndefOr[String] = js.undefined
        
        /**
          * @default false
          * @see {@link TextGroup#fill}
          */
        val fill: js.UndefOr[Boolean] = js.undefined
        
        /** @see {@link TextGroup#font} */
        val font: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font
        
        /**
          * Measured in pixels.
          * @default 64
          * @see {@link TextGroup#fontSize}
          */
        val fontSize: js.UndefOr[Double] = js.undefined
        
        /**
          * @default 1
          * @see {@link TextGroup#stroke}
          */
        val stroke: js.UndefOr[Double | `false`] = js.undefined
        
        /**
          * @default 'left'
          * @see {@link TextGroup#textAlign}
          */
        val textAlign: js.UndefOr[typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign] = js.undefined
        
        /**
          * @default 'bottom'
          * @see {@link TextGroup#textBaseline}
          */
        val textBaseline: js.UndefOr[typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline] = js.undefined
        
        /**
          * @default ''
          * @see {@link TextGroup#value}
          */
        val value: js.UndefOr[T] = js.undefined
      }
      object TextGroupOptions {
        
        inline def apply[T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */](font: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font): TextGroupOptions[T] = {
          val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
          __obj.asInstanceOf[TextGroupOptions[T]]
        }
        
        extension [Self <: TextGroupOptions[?], T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */](x: Self & TextGroupOptions[T]) {
          
          inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
          
          inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
          
          inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
          
          inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
          
          inline def setFont(value: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
          
          inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
          
          inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
          
          inline def setStroke(value: Double | `false`): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
          
          inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
          
          inline def setTextAlign(value: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
          
          inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
          
          inline def setTextBaseline(value: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
          
          inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
          
          inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      /**
        * @see {@link Text}
        * @see {@link https://github.com/jaames/zfont#options-1 Zfont API}
        */
      trait TextOptions[T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */]
        extends StObject
           with ShapeOptions {
        
        /** @see {@link Text#font} */
        val font: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font
        
        /**
          * Measured in pixels.
          * @default 64
          * @see {@link Text#fontSize}
          */
        val fontSize: js.UndefOr[Double] = js.undefined
        
        /**
          * @default 'left'
          * @see {@link Text#textAlign}
          */
        val textAlign: js.UndefOr[typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign] = js.undefined
        
        /**
          * @default 'bottom'
          * @see {@link Text#textBaseline}
          */
        val textBaseline: js.UndefOr[typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline] = js.undefined
        
        /**
          * @default ''
          * @see {@link Text#value}
          */
        val value: js.UndefOr[T] = js.undefined
      }
      object TextOptions {
        
        inline def apply[T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */](font: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font): TextOptions[T] = {
          val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
          __obj.asInstanceOf[TextOptions[T]]
        }
        
        extension [Self <: TextOptions[?], T /* <: typingsJapgolly.zfont.mod.zdogAugmentingMod.MultilineText */](x: Self & TextOptions[T]) {
          
          inline def setFont(value: typingsJapgolly.zfont.mod.zdogAugmentingMod.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
          
          inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
          
          inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
          
          inline def setTextAlign(value: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
          
          inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
          
          inline def setTextBaseline(value: typingsJapgolly.zfont.mod.zdogAugmentingMod.TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
          
          inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
          
          inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
    }
  }
}
