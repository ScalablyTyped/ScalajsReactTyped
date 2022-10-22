package typingsJapgolly.storybookAddonJest

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsMessageMod extends Shortcut {
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/components/Message", JSImport.Default)
  @js.native
  val default: FunctionComponent[MessageProps] = js.native
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/components/Message", "Message")
  @js.native
  val Message: FunctionComponent[MessageProps] = js.native
  
  trait MessageProps extends StObject {
    
    var msg: String
  }
  object MessageProps {
    
    inline def apply(msg: String): MessageProps = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageProps]
    }
    
    extension [Self <: MessageProps](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[MessageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTs3Dot9ComponentsMessageMod.foo` */
  override def _to: FunctionComponent[MessageProps] = default
}
