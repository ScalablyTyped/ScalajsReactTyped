package typingsJapgolly.reactBulmaComponents.anon

import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.ul
import typingsJapgolly.reactBulmaComponents.srcComponentsMenuMod.MenuListComponentProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponentWithoutRenderAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  var List: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`
}
object List {
  
  inline def apply(List: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`): typingsJapgolly.reactBulmaComponents.anon.List = {
    val __obj = js.Dynamic.literal(List = List.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactBulmaComponents.anon.List]
  }
  
  extension [Self <: typingsJapgolly.reactBulmaComponents.anon.List](x: Self) {
    
    inline def setList(value: (BulmaComponentWithoutRenderAs[MenuListComponentProps, ul]) & `1`): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
  }
}
