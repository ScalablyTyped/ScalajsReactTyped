package typingsJapgolly.inkBigText

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.inkBigText.inkBigTextStrings.`3d`
import typingsJapgolly.inkBigText.inkBigTextStrings.black
import typingsJapgolly.inkBigText.inkBigTextStrings.block
import typingsJapgolly.inkBigText.inkBigTextStrings.blue
import typingsJapgolly.inkBigText.inkBigTextStrings.center
import typingsJapgolly.inkBigText.inkBigTextStrings.chrome
import typingsJapgolly.inkBigText.inkBigTextStrings.cyan
import typingsJapgolly.inkBigText.inkBigTextStrings.green
import typingsJapgolly.inkBigText.inkBigTextStrings.grid
import typingsJapgolly.inkBigText.inkBigTextStrings.huge
import typingsJapgolly.inkBigText.inkBigTextStrings.left
import typingsJapgolly.inkBigText.inkBigTextStrings.magenta
import typingsJapgolly.inkBigText.inkBigTextStrings.pallet
import typingsJapgolly.inkBigText.inkBigTextStrings.red
import typingsJapgolly.inkBigText.inkBigTextStrings.right
import typingsJapgolly.inkBigText.inkBigTextStrings.shade
import typingsJapgolly.inkBigText.inkBigTextStrings.simple
import typingsJapgolly.inkBigText.inkBigTextStrings.simple3d
import typingsJapgolly.inkBigText.inkBigTextStrings.simpleBlock
import typingsJapgolly.inkBigText.inkBigTextStrings.slick
import typingsJapgolly.inkBigText.inkBigTextStrings.tiny
import typingsJapgolly.inkBigText.inkBigTextStrings.transparent
import typingsJapgolly.inkBigText.inkBigTextStrings.white
import typingsJapgolly.inkBigText.inkBigTextStrings.yellow
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-big-text", JSImport.Namespace)
  @js.native
  val ^ : FC[BigTextProps] = js.native
  
  // note: BigTextProps.colors are based on cfonts (https://github.com/dominikwilkowski/cfonts). I will have commented out
  // some of the accepted inputs. Becuase it also allows for hex colors, I decided to not narrow it down
  // from a string type. A regex would be VERY useful here, but is unfortunately unsupported
  // (see this issue: https://github.com/Microsoft/TypeScript/issues/6579). I will happily update this type if
  // this feature ever gets added! That way the colors[] will be typed as any of the accepted colors OR a valid hex color.
  // However until then, the type will be string.
  // The official cfont docs state the following would be accepted (in addition to any valid hex):
  // type DefinedColors =
  //     | 'system'
  //     | 'black'
  //     | 'red'
  //     | 'green'
  //     | 'yellow'
  //     | 'blue'
  //     | 'magenta'
  //     | 'cyan'
  //     | 'white'
  //     | 'gray'
  //     | 'redBright'
  //     | 'greenBright'
  //     | 'yellowBright'
  //     | 'blueBright'
  //     | 'magentaBright'
  //     | 'cyanBright'
  //     | 'whiteBright';
  trait BigTextProps extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var backgroundColor: js.UndefOr[transparent | black | red | green | yellow | blue | magenta | cyan | white] = js.undefined
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var font: js.UndefOr[
        block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
      ] = js.undefined
    
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var space: js.UndefOr[Boolean] = js.undefined
    
    var text: String
  }
  object BigTextProps {
    
    inline def apply(text: String): BigTextProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BigTextProps]
    }
    
    extension [Self <: BigTextProps](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(value: transparent | black | red | green | yellow | blue | magenta | cyan | white): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setFont(
        value: block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[BigTextProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[BigTextProps] = ^
}
