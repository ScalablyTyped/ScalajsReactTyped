package typingsJapgolly.reactMdAppBar

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdAppBar.typesUseInheritContextMod.AppBarColorInherit
import typingsJapgolly.reactMdButton.typesButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAppBarNavMod {
  
  @JSImport("@react-md/app-bar/types/AppBarNav", "AppBarNav")
  @js.native
  val AppBarNav: ForwardRefExoticComponent[AppBarNavProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait AppBarNavProps
    extends StObject
       with ButtonProps
       with AppBarColorInherit
  object AppBarNavProps {
    
    inline def apply(): AppBarNavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarNavProps]
    }
  }
}
