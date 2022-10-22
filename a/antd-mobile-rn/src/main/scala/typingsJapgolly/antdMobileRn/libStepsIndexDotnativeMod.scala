package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobileRn.anon.Direction
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.horizontal
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.vertical
import typingsJapgolly.antdMobileRn.libStepsPropsTypeMod.StepsPropsType
import typingsJapgolly.antdMobileRn.libStepsStyleIndexDotnativeMod.IStepsStyle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/steps/index.native", JSImport.Default)
  @js.native
  open class default protected () extends Steps {
    def this(props: StepsNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/steps/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/steps/index.native", "default.Step")
    @js.native
    def Step: Any = js.native
    inline def Step_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/steps/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    inline def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Steps extends Component[StepsNativeProps, Any, Any] {
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  trait StepsNativeProps
    extends StObject
       with StepsProps {
    
    @JSName("styles")
    var styles_StepsNativeProps: js.UndefOr[IStepsStyle] = js.undefined
  }
  object StepsNativeProps {
    
    inline def apply(children: js.Array[Element]): StepsNativeProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsNativeProps]
    }
    
    extension [Self <: StepsNativeProps](x: Self) {
      
      inline def setStyles(value: IStepsStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait StepsProps
    extends StObject
       with StepsPropsType {
    
    @JSName("children")
    var children_StepsProps: js.Array[Element]
    
    var direction: js.UndefOr[vertical | horizontal] = js.undefined
    
    var finishIcon: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
  }
  object StepsProps {
    
    inline def apply(children: js.Array[Element]): StepsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFinishIcon(value: String): Self = StObject.set(x, "finishIcon", value.asInstanceOf[js.Any])
      
      inline def setFinishIconUndefined: Self = StObject.set(x, "finishIcon", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
