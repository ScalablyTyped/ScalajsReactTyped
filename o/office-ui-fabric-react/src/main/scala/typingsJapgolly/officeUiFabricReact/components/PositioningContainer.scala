package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libCommonDirectionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkPositioningContainerPositioningContainerDottypesMod.IPositioningContainer
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkPositioningContainerPositioningContainerDottypesMod.IPositioningContainerProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.IPositionedData
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libIrectangleMod.IRectangle
import typingsJapgolly.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PositioningContainer {
  
  @JSImport("office-ui-fabric-react", "PositioningContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.PositioningContainer] {
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def bounds(value: IRectangle): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IPositioningContainer]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IPositioningContainer | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IPositioningContainer | Null) => value(t0).runNow()))
    
    inline def coverTarget(value: Boolean): this.type = set("coverTarget", value.asInstanceOf[js.Any])
    
    inline def directionalHint(value: DirectionalHint): this.type = set("directionalHint", value.asInstanceOf[js.Any])
    
    inline def directionalHintFixed(value: Boolean): this.type = set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    inline def directionalHintForRTL(value: DirectionalHint): this.type = set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    inline def doNotLayer(value: Boolean): this.type = set("doNotLayer", value.asInstanceOf[js.Any])
    
    inline def finalHeight(value: Double): this.type = set("finalHeight", value.asInstanceOf[js.Any])
    
    inline def minPagePadding(value: Double): this.type = set("minPagePadding", value.asInstanceOf[js.Any])
    
    inline def offsetFromTarget(value: Double): this.type = set("offsetFromTarget", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: /* ev */ js.UndefOr[Any] => Callback): this.type = set("onDismiss", js.Any.fromFunction1((t0: /* ev */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def onLayerMounted(value: Callback): this.type = set("onLayerMounted", value.toJsFn)
    
    inline def onPositioned(value: /* positions */ js.UndefOr[IPositionedData] => Callback): this.type = set("onPositioned", js.Any.fromFunction1((t0: /* positions */ js.UndefOr[IPositionedData]) => value(t0).runNow()))
    
    inline def positioningContainerMaxHeight(value: Double): this.type = set("positioningContainerMaxHeight", value.asInstanceOf[js.Any])
    
    inline def positioningContainerWidth(value: Double): this.type = set("positioningContainerWidth", value.asInstanceOf[js.Any])
    
    inline def preventDismissOnScroll(value: Boolean): this.type = set("preventDismissOnScroll", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def setInitialFocus(value: Boolean): this.type = set("setInitialFocus", value.asInstanceOf[js.Any])
    
    inline def target(value: HTMLElement | String | MouseEvent | Point): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetNull: this.type = set("target", null)
    
    inline def targetPoint(value: Point): this.type = set("targetPoint", value.asInstanceOf[js.Any])
    
    inline def useTargetPoint(value: Boolean): this.type = set("useTargetPoint", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PositioningContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPositioningContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
