package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsTabGroupMod {
  
  @JSImport("fundamental-react/lib/Tabs/TabGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TabGroupProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/Tabs/TabGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/Tabs/TabGroup", "default.displayName")
    @js.native
    def displayName: typingsJapgolly.fundamentalReact.fundamentalReactStrings.TabGroup = js.native
    inline def displayName_=(x: typingsJapgolly.fundamentalReact.fundamentalReactStrings.TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type TabGroup = japgolly.scalajs.react.facade.React.Component[TabGroupProps & js.Object, js.Object]
  
  trait TabGroupProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var onTabClick: js.UndefOr[js.Function2[/* event */ ReactMouseEventFrom[Element], /* index */ Double, Unit]] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Any] = js.undefined
    
    var tabGroupProps: js.UndefOr[Any] = js.undefined
  }
  object TabGroupProps {
    
    inline def apply(): TabGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabGroupProps]
    }
    
    extension [Self <: TabGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setOnTabClick(value: (/* event */ ReactMouseEventFrom[Element], /* index */ Double) => Callback): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[Element], t1: /* index */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabGroupProps(value: Any): Self = StObject.set(x, "tabGroupProps", value.asInstanceOf[js.Any])
      
      inline def setTabGroupPropsUndefined: Self = StObject.set(x, "tabGroupProps", js.undefined)
    }
  }
}
