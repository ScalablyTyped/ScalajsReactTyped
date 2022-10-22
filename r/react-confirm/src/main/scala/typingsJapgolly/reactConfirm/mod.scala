package typingsJapgolly.reactConfirm

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-confirm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def confirmable[P](component: ComponentType[ReactConfirmProps & P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmable")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  
  inline def createConfirmation(component: ComponentType[Any]): js.Function1[/* props */ Any, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfirmation")(component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, js.Promise[String]]]
  inline def createConfirmation(component: ComponentType[Any], unmountDelay: Double): js.Function1[/* props */ Any, js.Promise[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfirmation")(component.asInstanceOf[js.Any], unmountDelay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, js.Promise[String]]]
  
  @js.native
  trait ReactConfirmProps extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(value: String): Unit = js.native
    
    var confirmation: String | Element = js.native
    
    def dismiss(): Unit = js.native
    
    def proceed(): Unit = js.native
    def proceed(value: String): Unit = js.native
    
    var show: Boolean = js.native
  }
}
