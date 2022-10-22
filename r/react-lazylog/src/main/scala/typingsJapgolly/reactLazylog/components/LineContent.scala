package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.anon.Text
import typingsJapgolly.reactLazylog.buildLineContentMod.LineContentProps
import typingsJapgolly.reactLazylog.buildLineContentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineContent {
  
  inline def apply(data: js.Array[Text], number: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineContentProps]))
  }
  
  @JSImport("react-lazylog/build/LineContent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def formatPart(value: /* text */ String => Node): this.type = set("formatPart", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
