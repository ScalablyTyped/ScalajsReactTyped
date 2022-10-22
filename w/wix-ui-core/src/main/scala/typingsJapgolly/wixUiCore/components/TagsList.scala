package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagsListMod.TagsListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagsList {
  
  @JSImport("wix-ui-core/dist/es/src", "TagsList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ ReactEventFrom[HTMLDivElement] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLDivElement]) => value(t0).runNow()))
  }
  
  implicit def make(companion: TagsList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TagsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
