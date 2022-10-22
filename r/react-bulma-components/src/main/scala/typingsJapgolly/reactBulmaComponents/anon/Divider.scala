package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.hr
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typingsJapgolly.reactBulmaComponents.srcComponentsDropdownMod.DropdownItemProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.RenderAsComponent
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Divider extends StObject {
  
  def Divider(props: Omit[ElementProps[js.Object, hr], renderAs]): Element
  
  def Item[TValue, TComponent /* <: RenderAsComponent */](props: DropdownItemProps[TValue] & (ElementProps[DropdownItemProps[TValue], TComponent])): Element
}
object Divider {
  
  inline def apply(
    Divider: Omit[ElementProps[js.Object, hr], renderAs] => Element,
    Item: DropdownItemProps[Any] & (ElementProps[DropdownItemProps[Any], Any]) => Element
  ): Divider = {
    val __obj = js.Dynamic.literal(Divider = js.Any.fromFunction1(Divider), Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Divider]
  }
  
  extension [Self <: Divider](x: Self) {
    
    inline def setDivider(value: Omit[ElementProps[js.Object, hr], renderAs] => Element): Self = StObject.set(x, "Divider", js.Any.fromFunction1(value))
    
    inline def setItem(value: DropdownItemProps[Any] & (ElementProps[DropdownItemProps[Any], Any]) => Element): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
