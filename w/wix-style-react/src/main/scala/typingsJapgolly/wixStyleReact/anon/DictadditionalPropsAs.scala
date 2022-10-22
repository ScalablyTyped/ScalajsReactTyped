package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictadditionalPropsAs
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var as: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.thead, typingsJapgolly.wixStyleReact.wixStyleReactStrings.map, typingsJapgolly.wixStyleReact.wixStyleReactStrings.main */ Any
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}
object DictadditionalPropsAs {
  
  inline def apply(
    as: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.thead, typingsJapgolly.wixStyleReact.wixStyleReactStrings.map, typingsJapgolly.wixStyleReact.wixStyleReactStrings.main */ Any
  ): DictadditionalPropsAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsAs]
  }
  
  extension [Self <: DictadditionalPropsAs](x: Self) {
    
    inline def setAs(
      value: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.thead, typingsJapgolly.wixStyleReact.wixStyleReactStrings.map, typingsJapgolly.wixStyleReact.wixStyleReactStrings.main */ Any
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
