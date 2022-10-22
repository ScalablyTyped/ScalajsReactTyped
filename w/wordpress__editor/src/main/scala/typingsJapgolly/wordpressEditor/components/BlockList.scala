package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.componentsBlockListMod.BlockList.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockList {
  
  @JSImport("@wordpress/editor", "BlockList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def renderAppender(value: CallbackTo[Element]): this.type = set("renderAppender", value.toJsFn)
    
    inline def rootClientId(value: String): this.type = set("rootClientId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BlockList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
