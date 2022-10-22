package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EmptyState {
  
  inline def apply(
    align: Any,
    children: Any,
    className: Any,
    classNames: Any,
    dataHook: Any,
    image: Any,
    subtitle: Any,
    theme: Any,
    title: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ClassNames]))
  }
  
  @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClassNames): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
