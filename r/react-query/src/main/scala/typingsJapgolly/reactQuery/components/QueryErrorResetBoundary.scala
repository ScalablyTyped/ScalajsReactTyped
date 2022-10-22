package typingsJapgolly.reactQuery.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactQuery.typesReactQueryErrorResetBoundaryMod.QueryErrorResetBoundaryProps
import typingsJapgolly.reactQuery.typesReactQueryErrorResetBoundaryMod.QueryErrorResetBoundaryValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QueryErrorResetBoundary {
  
  @JSImport("react-query", "QueryErrorResetBoundary")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: (js.Function1[/* value */ QueryErrorResetBoundaryValue, Node]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* value */ QueryErrorResetBoundaryValue => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: QueryErrorResetBoundary.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: QueryErrorResetBoundaryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
