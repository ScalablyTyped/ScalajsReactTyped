package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.anon.IsLoading
import typingsJapgolly.baseui.selectTypesMod.DropdownProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectDropdownMod {
  
  @JSImport("baseui/select/dropdown", JSImport.Default)
  @js.native
  open class default () extends SelectDropdown
  
  @js.native
  trait SelectDropdown
    extends Component[DropdownProps, js.Object, Any] {
    
    def getHighlightedIndex(): Double = js.native
    
    def getItemLabel(option: StringDictionary[Any]): Element = js.native
    
    def getSharedProps(): IsLoading = js.native
    
    def onMouseDown(e: ReactEventFrom[org.scalajs.dom.Element]): Unit = js.native
  }
}
