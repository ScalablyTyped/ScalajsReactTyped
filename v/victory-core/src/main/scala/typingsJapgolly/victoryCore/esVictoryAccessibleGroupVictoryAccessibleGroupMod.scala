package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.victoryCore.anon.Ariadescribedby
import typingsJapgolly.victoryCore.anon.ClassNameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryAccessibleGroupVictoryAccessibleGroupMod {
  
  @JSImport("victory-core/es/victory-accessible-group/victory-accessible-group", "VictoryAccessibleGroup")
  @js.native
  open class VictoryAccessibleGroup protected ()
    extends Component[VictoryAccessibleGroupProps, js.Object, Any] {
    def this(props: VictoryAccessibleGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryAccessibleGroupProps, context: Any) = this()
  }
  /* static members */
  object VictoryAccessibleGroup {
    
    @JSImport("victory-core/es/victory-accessible-group/victory-accessible-group", "VictoryAccessibleGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-accessible-group/victory-accessible-group", "VictoryAccessibleGroup.defaultProps")
    @js.native
    def defaultProps: ClassNameString = js.native
    inline def defaultProps_=(x: ClassNameString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-accessible-group/victory-accessible-group", "VictoryAccessibleGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-accessible-group/victory-accessible-group", "VictoryAccessibleGroup.propTypes")
    @js.native
    def propTypes: Ariadescribedby = js.native
    inline def propTypes_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryAccessibleGroupProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object VictoryAccessibleGroupProps {
    
    inline def apply(): VictoryAccessibleGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryAccessibleGroupProps]
    }
    
    extension [Self <: VictoryAccessibleGroupProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
