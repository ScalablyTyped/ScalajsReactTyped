package typingsJapgolly.reactNativeReadMoreText.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeReadMoreText.mod.ReadMoreProps
import typingsJapgolly.reactNativeReadMoreText.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeReadMoreText {
  
  inline def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => Node,
    renderTruncatedFooter: js.Function0[Unit] => Node
  ): Builder = {
    val __props = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReadMoreProps]))
  }
  
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onReady(value: Callback): this.type = set("onReady", value.toJsFn)
  }
  
  def withProps(p: ReadMoreProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
