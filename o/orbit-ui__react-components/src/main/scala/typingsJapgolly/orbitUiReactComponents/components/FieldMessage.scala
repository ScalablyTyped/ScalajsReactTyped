package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldMessageMod.InnerFieldMessageProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.error
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.neutral
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldMessage {
  
  inline def apply(tone: neutral | success | error): Builder = {
    val __props = js.Dynamic.literal(tone = tone.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MergeWithAs[HTMLElement, InnerFieldMessageProps]]))
  }
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldMessage", "FieldMessage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MergeWithAs[HTMLElement, InnerFieldMessageProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
