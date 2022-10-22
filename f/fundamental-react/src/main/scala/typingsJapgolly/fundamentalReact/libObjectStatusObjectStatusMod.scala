package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`1`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`6`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`7`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`8`
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.l
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectStatusObjectStatusMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/ObjectStatus/ObjectStatus", JSImport.Default)
  @js.native
  val default: FunctionComponent[ObjectStatusProps] = js.native
  
  trait ObjectStatusProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement | HTMLSpanElement] {
    
    var glyph: js.UndefOr[String] = js.undefined
    
    var indication: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[l] = js.undefined
    
    var status: js.UndefOr[ObjectStatusTypes] = js.undefined
  }
  object ObjectStatusProps {
    
    inline def apply(): ObjectStatusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectStatusProps]
    }
    
    extension [Self <: ObjectStatusProps](x: Self) {
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setIndication(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
      
      inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setSize(value: l): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: ObjectStatusTypes): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.negative
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.critical
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.positive
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.informative
  */
  trait ObjectStatusTypes extends StObject
  object ObjectStatusTypes {
    
    inline def critical: typingsJapgolly.fundamentalReact.fundamentalReactStrings.critical = "critical".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.critical]
    
    inline def informative: typingsJapgolly.fundamentalReact.fundamentalReactStrings.informative = "informative".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.informative]
    
    inline def negative: typingsJapgolly.fundamentalReact.fundamentalReactStrings.negative = "negative".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.negative]
    
    inline def positive: typingsJapgolly.fundamentalReact.fundamentalReactStrings.positive = "positive".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.positive]
  }
  
  type _To = FunctionComponent[ObjectStatusProps]
  
  /* This means you don't have to write `default`, but can instead just say `libObjectStatusObjectStatusMod.foo` */
  override def _to: FunctionComponent[ObjectStatusProps] = default
}
