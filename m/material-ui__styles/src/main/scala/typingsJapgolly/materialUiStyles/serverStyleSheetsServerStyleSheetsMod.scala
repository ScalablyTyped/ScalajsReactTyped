package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverStyleSheetsServerStyleSheetsMod {
  
  @JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
  @js.native
  trait ServerStyleSheets extends StObject {
    
    def collect(children: Node): Element = js.native
    def collect(children: Node, options: js.Object): Element = js.native
    
    def getStyleElement(): Element = js.native
    def getStyleElement(props: js.Object): Element = js.native
  }
}
