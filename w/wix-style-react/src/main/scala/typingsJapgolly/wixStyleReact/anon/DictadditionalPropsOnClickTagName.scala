package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictadditionalPropsOnClickTagName
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var tagName: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTaAbbr */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.thead, typingsJapgolly.wixStyleReact.wixStyleReactStrings.map, typingsJapgolly.wixStyleReact.wixStyleReactStrings.main */ Any
}
object DictadditionalPropsOnClickTagName {
  
  inline def apply(
    tagName: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTaAbbr */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.thead, typingsJapgolly.wixStyleReact.wixStyleReactStrings.map, typingsJapgolly.wixStyleReact.wixStyleReactStrings.main */ Any
  ): DictadditionalPropsOnClickTagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsOnClickTagName]
  }
  
  extension [Self <: DictadditionalPropsOnClickTagName](x: Self) {
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTagName(
      value: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTaAbbr */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.thead, typingsJapgolly.wixStyleReact.wixStyleReactStrings.map, typingsJapgolly.wixStyleReact.wixStyleReactStrings.main */ Any
    ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
