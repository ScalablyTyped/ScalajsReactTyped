package typingsJapgolly.blueprintjsCore

import org.scalajs.dom.HTMLTableElement
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IElementRefProps
import typingsJapgolly.react.mod.TableHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHtmlTableHtmlTableMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/html-table/htmlTable", "HTMLTable")
  @js.native
  open class HTMLTable protected ()
    extends AbstractPureComponent2[HTMLTableProps, js.Object, js.Object] {
    def this(props: HTMLTableProps) = this()
    def this(props: HTMLTableProps, context: Any) = this()
  }
  
  type HTMLTableProps = IHTMLTableProps
  
  trait IHTMLTableProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement]
       with IElementRefProps[HTMLTableElement] {
    
    /** Enables borders between rows and cells. */
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    /** Use small, condensed appearance. */
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    /** Enables hover styles on row. */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /** Use an alternate background color on odd rows. */
    var striped: js.UndefOr[Boolean] = js.undefined
  }
  object IHTMLTableProps {
    
    inline def apply(): IHTMLTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTMLTableProps]
    }
    
    extension [Self <: IHTMLTableProps](x: Self) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    }
  }
}
