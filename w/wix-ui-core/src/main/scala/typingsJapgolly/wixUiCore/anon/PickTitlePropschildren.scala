package typingsJapgolly.wixUiCore.anon

import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputTitleTitleMod.TitleChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/es/src/components/signature-input/title/Title.TitleProps, 'children'> */
trait PickTitlePropschildren extends StObject {
  
  var children: js.UndefOr[TitleChildrenFn] = js.undefined
}
object PickTitlePropschildren {
  
  inline def apply(): PickTitlePropschildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTitlePropschildren]
  }
  
  extension [Self <: PickTitlePropschildren](x: Self) {
    
    inline def setChildren(value: /* childrenFn */ GetTitleProps => typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
