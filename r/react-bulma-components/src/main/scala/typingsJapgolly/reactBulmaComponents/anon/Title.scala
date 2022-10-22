package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.footer
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.header
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.p
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.section
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsModalMod.ModalCardHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var Body: BulmaComponent[js.Object, section]
  
  var Footer: BulmaComponent[js.Object, footer]
  
  var Header: BulmaComponent[ModalCardHeaderProps, header]
  
  var Title: BulmaComponent[js.Object, p]
}
object Title {
  
  inline def apply(
    Body: /* props */ js.Object & (ElementProps[js.Object, section]) => Element,
    Footer: /* props */ js.Object & (ElementProps[js.Object, footer]) => Element,
    Header: /* props */ ModalCardHeaderProps & (ElementProps[ModalCardHeaderProps, header]) => Element,
    Title: /* props */ js.Object & (ElementProps[js.Object, p]) => Element
  ): Title = {
    val __obj = js.Dynamic.literal(Body = js.Any.fromFunction1(Body), Footer = js.Any.fromFunction1(Footer), Header = js.Any.fromFunction1(Header), Title = js.Any.fromFunction1(Title))
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setBody(value: /* props */ js.Object & (ElementProps[js.Object, section]) => Element): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setFooter(value: /* props */ js.Object & (ElementProps[js.Object, footer]) => Element): Self = StObject.set(x, "Footer", js.Any.fromFunction1(value))
    
    inline def setHeader(value: /* props */ ModalCardHeaderProps & (ElementProps[ModalCardHeaderProps, header]) => Element): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
    
    inline def setTitle(value: /* props */ js.Object & (ElementProps[js.Object, p]) => Element): Self = StObject.set(x, "Title", js.Any.fromFunction1(value))
  }
}
