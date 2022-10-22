package typingsJapgolly.rcSteps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.rcSteps.anon.Current
import typingsJapgolly.rcSteps.anon.Description
import typingsJapgolly.rcSteps.anon.Index
import typingsJapgolly.rcSteps.libInterfaceMod.Icons
import typingsJapgolly.rcSteps.libInterfaceMod.Status
import typingsJapgolly.rcSteps.libStepMod.StepProps
import typingsJapgolly.rcSteps.rcStepsStrings.horizontal
import typingsJapgolly.rcSteps.rcStepsStrings.navigation
import typingsJapgolly.rcSteps.rcStepsStrings.small
import typingsJapgolly.rcSteps.rcStepsStrings.vertical
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsMod {
  
  @JSImport("rc-steps/lib/Steps", JSImport.Default)
  @js.native
  open class default () extends Steps
  /* static members */
  object default {
    
    @JSImport("rc-steps/lib/Steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-steps/lib/Steps", "default.Step")
    @js.native
    def Step: Instantiable0[typingsJapgolly.rcSteps.libStepMod.default] = js.native
    inline def Step_=(x: Instantiable0[typingsJapgolly.rcSteps.libStepMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-steps/lib/Steps", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type ProgressDotRender = js.Function2[/* iconDot */ Any, /* info */ Description, Node]
  
  type StepIconRender = js.Function1[/* info */ Index, Node]
  
  @js.native
  trait Steps
    extends Component[StepsProps, js.Object, Any] {
    
    def onStepClick(next: Double): Unit = js.native
  }
  
  trait StepsProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var iconPrefix: js.UndefOr[String] = js.undefined
    
    var icons: js.UndefOr[Icons] = js.undefined
    
    var initial: js.UndefOr[Double] = js.undefined
    
    var items: js.UndefOr[js.Array[StepProps]] = js.undefined
    
    var labelPlacement: js.UndefOr[horizontal | vertical] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var progressDot: js.UndefOr[ProgressDotRender | Boolean] = js.undefined
    
    var size: js.UndefOr[typingsJapgolly.rcSteps.rcStepsStrings.default | small] = js.undefined
    
    var status: js.UndefOr[Status] = js.undefined
    
    var stepIcon: js.UndefOr[StepIconRender] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[typingsJapgolly.rcSteps.rcStepsStrings.default | navigation] = js.undefined
  }
  object StepsProps {
    
    inline def apply(): StepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setIcons(value: Icons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setItems(value: js.Array[StepProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: StepProps*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabelPlacement(value: horizontal | vertical): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setOnChange(value: /* current */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* current */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProgressDot(value: ProgressDotRender | Boolean): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      inline def setProgressDotFunction2(value: (/* iconDot */ Any, /* info */ Description) => Node): Self = StObject.set(x, "progressDot", js.Any.fromFunction2(value))
      
      inline def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      inline def setSize(value: typingsJapgolly.rcSteps.rcStepsStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStepIcon(value: /* info */ Index => Node): Self = StObject.set(x, "stepIcon", js.Any.fromFunction1(value))
      
      inline def setStepIconUndefined: Self = StObject.set(x, "stepIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: typingsJapgolly.rcSteps.rcStepsStrings.default | navigation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
