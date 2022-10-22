package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepContentMod.StepContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepGroupMod.StepGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepMod.StepProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepTitleMod.StepTitleProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Step.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_StepContentProps_346528489 = new SharedBuilder_StepContentProps_346528489(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StepContentProps): SharedBuilder_StepContentProps_346528489 = new SharedBuilder_StepContentProps_346528489(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "Step.Description")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Description.type): SharedBuilder_StepDescriptionProps1143921112 = new SharedBuilder_StepDescriptionProps1143921112(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StepDescriptionProps): SharedBuilder_StepDescriptionProps1143921112 = new SharedBuilder_StepDescriptionProps1143921112(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Step.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_StepGroupProps1660011682 = new SharedBuilder_StepGroupProps1660011682(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StepGroupProps): SharedBuilder_StepGroupProps1660011682 = new SharedBuilder_StepGroupProps1660011682(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("semantic-ui-react", "Step.Title")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Title.type): SharedBuilder_StepTitleProps_1759314943 = new SharedBuilder_StepTitleProps_1759314943(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StepTitleProps): SharedBuilder_StepTitleProps_1759314943 = new SharedBuilder_StepTitleProps_1759314943(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Step")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def completed(value: Boolean): this.type = set("completed", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def description(value: SemanticShorthandItem[StepDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionFunction3(
      value: (/* component */ ElementType, StepDescriptionProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction3(
      value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ StepProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ StepProps) => (value(t0, t1)).runNow()))
    
    inline def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
    
    inline def title(value: SemanticShorthandItem[StepTitleProps]): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleFunction3(
      value: (/* component */ ElementType, StepTitleProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("title", js.Any.fromFunction3(value))
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
