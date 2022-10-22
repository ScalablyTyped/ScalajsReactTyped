package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsBreadcrumbBreadcrumbDividerMod.BreadcrumbDividerProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsBreadcrumbBreadcrumbSectionMod.BreadcrumbSectionProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  object Divider {
    
    @JSImport("semantic-ui-react", "Breadcrumb.Divider")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Divider.type): SharedBuilder_BreadcrumbDividerProps_616721206 = new SharedBuilder_BreadcrumbDividerProps_616721206(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbDividerProps): SharedBuilder_BreadcrumbDividerProps_616721206 = new SharedBuilder_BreadcrumbDividerProps_616721206(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Section {
    
    @JSImport("semantic-ui-react", "Breadcrumb.Section")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Section.type): SharedBuilder_BreadcrumbSectionProps_1656734377[typingsJapgolly.semanticUiReact.mod.Breadcrumb.Section] = new SharedBuilder_BreadcrumbSectionProps_1656734377[typingsJapgolly.semanticUiReact.mod.Breadcrumb.Section](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbSectionProps): SharedBuilder_BreadcrumbSectionProps_1656734377[typingsJapgolly.semanticUiReact.mod.Breadcrumb.Section] = new SharedBuilder_BreadcrumbSectionProps_1656734377[typingsJapgolly.semanticUiReact.mod.Breadcrumb.Section](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Breadcrumb] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def divider(value: SemanticShorthandContent): this.type = set("divider", value.asInstanceOf[js.Any])
    
    inline def dividerNull: this.type = set("divider", null)
    
    inline def dividerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("divider", js.Array(value*))
    
    inline def dividerVdomElement(value: VdomElement): this.type = set("divider", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction3(
      value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def sections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): this.type = set("sections", value.asInstanceOf[js.Any])
    
    inline def sectionsVarargs(value: SemanticShorthandItem[BreadcrumbSectionProps]*): this.type = set("sections", js.Array(value*))
    
    inline def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
