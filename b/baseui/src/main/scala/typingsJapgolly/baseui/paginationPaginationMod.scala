package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.baseui.anon.IsFocusVisibleBoolean
import typingsJapgolly.baseui.anon.Labels
import typingsJapgolly.baseui.anon.Value
import typingsJapgolly.baseui.localeTypesMod.Locale
import typingsJapgolly.baseui.paginationTypesMod.PaginationProps
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationMod {
  
  @JSImport("baseui/pagination/pagination", JSImport.Default)
  @js.native
  open class default () extends Pagination
  /* static members */
  object default {
    
    @JSImport("baseui/pagination/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pagination/pagination", "default.defaultProps")
    @js.native
    def defaultProps: Labels = js.native
    inline def defaultProps_=(x: Labels): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PageOption extends StObject {
    
    var label: Double
  }
  object PageOption {
    
    inline def apply(label: Double): PageOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageOption]
    }
    
    extension [Self <: PageOption](x: Self) {
      
      inline def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pagination extends PureComponent[PaginationProps, IsFocusVisibleBoolean, Any] {
    
    def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
    
    def getMenuOptions(numPages: Double): js.Array[Any] = js.native
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
    
    def onMenuItemSelect(data: Value): Unit = js.native
    
    def onNextClick(event: ReactEventFrom[Any & Element]): Unit = js.native
    
    def onPrevClick(event: ReactEventFrom[Any & Element]): Unit = js.native
  }
}
