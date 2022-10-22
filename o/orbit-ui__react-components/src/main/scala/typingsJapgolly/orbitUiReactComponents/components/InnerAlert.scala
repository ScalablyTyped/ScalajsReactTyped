package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distAlertSrcAlertMod.InnerAlertProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.cancel
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.confirmation
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.destructive
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.negative
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.primary
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.secondary
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.warning
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerAlert {
  
  inline def apply(primaryButtonLabel: String): Builder = {
    val __props = js.Dynamic.literal(primaryButtonLabel = primaryButtonLabel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InnerAlertProps]))
  }
  
  @JSImport("@orbit-ui/react-components", "InnerAlert")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocusButton(value: primary | secondary | cancel): this.type = set("autoFocusButton", value.asInstanceOf[js.Any])
    
    inline def cancelButtonLabel(value: String): this.type = set("cancelButtonLabel", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onCancelButtonClick(value: /* event */ ReactMouseEventFrom[Element] => Callback): this.type = set("onCancelButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def onPrimaryButtonClick(value: /* event */ ReactMouseEventFrom[Element] => Callback): this.type = set("onPrimaryButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def onSecondaryButtonClick(value: /* event */ ReactMouseEventFrom[Element] => Callback): this.type = set("onSecondaryButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def primaryButtonDisabled(value: Boolean): this.type = set("primaryButtonDisabled", value.asInstanceOf[js.Any])
    
    inline def secondaryButtonDisabled(value: Boolean): this.type = set("secondaryButtonDisabled", value.asInstanceOf[js.Any])
    
    inline def secondaryButtonLabel(value: String): this.type = set("secondaryButtonLabel", value.asInstanceOf[js.Any])
    
    inline def variant(value: confirmation | destructive | warning | negative): this.type = set("variant", value.asInstanceOf[js.Any])
    
    inline def wrapperProps(value: Record[String, Any]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InnerAlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
