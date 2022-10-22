package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ReturnType
import typingsJapgolly.wixStyleReact.distTypesCommonMod.FocusOptionsPolyfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOutside extends StObject {
  
  def clickOutside(): Unit
  
  def exists(): Boolean
  
  def open(): ReturnType[
    js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
  ]
}
object ClickOutside {
  
  inline def apply(
    clickOutside: Callback,
    exists: CallbackTo[Boolean],
    open: CallbackTo[
      ReturnType[
        js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
      ]
    ]
  ): ClickOutside = {
    val __obj = js.Dynamic.literal(clickOutside = clickOutside.toJsFn, exists = exists.toJsFn, open = open.toJsFn)
    __obj.asInstanceOf[ClickOutside]
  }
  
  extension [Self <: ClickOutside](x: Self) {
    
    inline def setClickOutside(value: Callback): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setOpen(
      value: CallbackTo[
          ReturnType[
            js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
          ]
        ]
    ): Self = StObject.set(x, "open", value.toJsFn)
  }
}
