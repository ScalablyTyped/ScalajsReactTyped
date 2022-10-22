package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.OmitPolyfillTagPropssizeo
import typingsJapgolly.wixStyleReact.distTypesTagListMod.TagListActionButtonProps
import typingsJapgolly.wixStyleReact.distTypesTagListMod.TagListProps
import typingsJapgolly.wixStyleReact.distTypesTagListMod.TagListSize
import typingsJapgolly.wixStyleReact.distTypesTagListMod.ToggleMoreButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagList {
  
  inline def apply(tags: js.Array[OmitPolyfillTagPropssizeo]): Builder = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagListProps]))
  }
  
  @JSImport("wix-style-react", "TagList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.TagList] {
    
    inline def actionButton(value: TagListActionButtonProps): this.type = set("actionButton", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def initiallyExpanded(value: Boolean): this.type = set("initiallyExpanded", value.asInstanceOf[js.Any])
    
    inline def maxVisibleTags(value: Double): this.type = set("maxVisibleTags", value.asInstanceOf[js.Any])
    
    inline def onTagRemove(value: /* id */ String => Callback): this.type = set("onTagRemove", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
    
    inline def size(value: TagListSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def toggleMoreButton(value: (/* amountOfHiddenTags */ Double, /* isExpanded */ Boolean) => ToggleMoreButtonProps): this.type = set("toggleMoreButton", js.Any.fromFunction2(value))
  }
  
  def withProps(p: TagListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
