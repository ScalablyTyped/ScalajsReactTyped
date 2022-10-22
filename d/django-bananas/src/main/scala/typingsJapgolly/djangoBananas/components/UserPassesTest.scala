package typingsJapgolly.djangoBananas.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.djangoBananas.authUserPassesTestMod.UserPassesTestProps
import typingsJapgolly.djangoBananas.mod.UserInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserPassesTest {
  
  inline def apply(testFunc: UserInterface => Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(testFunc = js.Any.fromFunction1(testFunc))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[UserPassesTestProps]))
  }
  
  @JSImport("django-bananas/auth/UserPassesTest", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: UserPassesTestProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
