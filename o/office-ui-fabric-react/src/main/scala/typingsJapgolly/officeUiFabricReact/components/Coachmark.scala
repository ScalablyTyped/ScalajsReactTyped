package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmark
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkProps
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkStyles
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkPositioningContainerPositioningContainerDottypesMod.IPositioningContainerProps
import typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubble
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Coachmark {
  
  @JSImport("office-ui-fabric-react", "Coachmark")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkCoachmarkDotbaseMod.CoachmarkBase
        ] {
    
    inline def ariaAlertText(value: String): this.type = set("ariaAlertText", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedByText(value: String): this.type = set("ariaDescribedByText", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledByText(value: String): this.type = set("ariaLabelledByText", value.asInstanceOf[js.Any])
    
    inline def beaconColorOne(value: String): this.type = set("beaconColorOne", value.asInstanceOf[js.Any])
    
    inline def beaconColorTwo(value: String): this.type = set("beaconColorTwo", value.asInstanceOf[js.Any])
    
    inline def beakHeight(value: Double): this.type = set("beakHeight", value.asInstanceOf[js.Any])
    
    inline def beakWidth(value: Double): this.type = set("beakWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[ICoachmark]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ ICoachmark | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ICoachmark | Null) => value(t0).runNow()))
    
    inline def delayBeforeCoachmarkAnimation(value: Double): this.type = set("delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
    
    inline def delayBeforeMouseOpen(value: Double): this.type = set("delayBeforeMouseOpen", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def isCollapsed(value: Boolean): this.type = set("isCollapsed", value.asInstanceOf[js.Any])
    
    inline def isPositionForced(value: Boolean): this.type = set("isPositionForced", value.asInstanceOf[js.Any])
    
    inline def mouseProximityOffset(value: Double): this.type = set("mouseProximityOffset", value.asInstanceOf[js.Any])
    
    inline def onAnimationOpenEnd(value: Callback): this.type = set("onAnimationOpenEnd", value.toJsFn)
    
    inline def onAnimationOpenStart(value: Callback): this.type = set("onAnimationOpenStart", value.toJsFn)
    
    inline def onDismiss(value: /* ev */ js.UndefOr[Any] => Callback): this.type = set("onDismiss", js.Any.fromFunction1((t0: /* ev */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def onMouseMove(value: /* e */ MouseEvent => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: /* e */ MouseEvent) => value(t0).runNow()))
    
    inline def persistentBeak(value: Boolean): this.type = set("persistentBeak", value.asInstanceOf[js.Any])
    
    inline def positioningContainerProps(value: IPositioningContainerProps): this.type = set("positioningContainerProps", value.asInstanceOf[js.Any])
    
    inline def preventDismissOnLostFocus(value: Boolean): this.type = set("preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    inline def preventFocusOnMount(value: Boolean): this.type = set("preventFocusOnMount", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def target(value: HTMLElement | String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetNull: this.type = set("target", null)
    
    inline def teachingBubbleRef(value: ITeachingBubble): this.type = set("teachingBubbleRef", value.asInstanceOf[js.Any])
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Coachmark.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICoachmarkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
