package typingsJapgolly.fluentReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.fluentBundle.esmBundleMod.FluentVariable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLocalizedMod {
  
  @JSImport("@fluent/react/esm/localized", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: LocalizedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Localized(props: LocalizedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Localized")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait LocalizedProps extends StObject {
    
    var attrs: js.UndefOr[Record[String, Boolean]] = js.undefined
    
    var children: js.UndefOr[Node | js.Array[Node]] = js.undefined
    
    var elems: js.UndefOr[Record[String, Element]] = js.undefined
    
    var id: String
    
    var vars: js.UndefOr[Record[String, FluentVariable]] = js.undefined
  }
  object LocalizedProps {
    
    inline def apply(id: String): LocalizedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizedProps]
    }
    
    extension [Self <: LocalizedProps](x: Self) {
      
      inline def setAttrs(value: Record[String, Boolean]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setChildren(value: Node | js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setElems(value: Record[String, Element]): Self = StObject.set(x, "elems", value.asInstanceOf[js.Any])
      
      inline def setElemsUndefined: Self = StObject.set(x, "elems", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVars(value: Record[String, FluentVariable]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
}
