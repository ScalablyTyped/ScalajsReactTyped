package typingsJapgolly.ink

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ink.inkStrings.`truncate-end`
import typingsJapgolly.ink.inkStrings.`truncate-middle`
import typingsJapgolly.ink.inkStrings.`truncate-start`
import typingsJapgolly.ink.inkStrings.end
import typingsJapgolly.ink.inkStrings.middle
import typingsJapgolly.ink.inkStrings.truncate
import typingsJapgolly.ink.inkStrings.wrap
import typingsJapgolly.react.mod.FC
import typingsJapgolly.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsTextMod extends Shortcut {
  
  /**
    * This component can display text, and change its style to make it colorful, bold, underline, italic or strikethrough.
    */
  @JSImport("ink/build/components/Text", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Same as `color`, but for background.
      */
    val backgroundColor: js.UndefOr[
        LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
      ] = js.undefined
    
    /**
      * Make the text bold.
      */
    val bold: js.UndefOr[Boolean] = js.undefined
    
    val children: js.UndefOr[Node] = js.undefined
    
    /**
      * Change text color. Ink uses chalk under the hood, so all its functionality is supported.
      */
    val color: js.UndefOr[
        LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
      ] = js.undefined
    
    /**
      * Dim the color (emit a small amount of light).
      */
    val dimColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverse background and foreground colors.
      */
    val inverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the text italic.
      */
    val italic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the text crossed with a line.
      */
    val strikethrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the text underlined.
      */
    val underline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This property tells Ink to wrap or truncate text if its width is larger than container.
      * If `wrap` is passed (by default), Ink will wrap text and split it into multiple lines.
      * If `truncate-*` is passed, Ink will truncate text instead, which will result in one line of text with the rest cut off.
      */
    val wrap: js.UndefOr[
        typingsJapgolly.ink.inkStrings.wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
      ] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBackgroundColor(
        value: LiteralUnion[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
              String
            ]
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(
        value: LiteralUnion[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
              String
            ]
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDimColor(value: Boolean): Self = StObject.set(x, "dimColor", value.asInstanceOf[js.Any])
      
      inline def setDimColorUndefined: Self = StObject.set(x, "dimColor", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      inline def setWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsTextMod.foo` */
  override def _to: FC[Props] = default
}
