package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsPageContentMod.PageBackground
import typingsJapgolly.grommet.es6ComponentsPageContentMod.PageContentExtendedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageContent {
  
  @JSImport("grommet/es6", "PageContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: String | PageBackground): this.type = set("background", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PageContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageContentExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
