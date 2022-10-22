package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antdMobile.anon.Form
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFormFormSubscribeMod {
  
  @JSImport("antd-mobile/es/components/form/form-subscribe", "FormSubscribe")
  @js.native
  val FormSubscribe: FC[FormSubscribeProps] = js.native
  
  @JSImport("antd-mobile/es/components/form/form-subscribe", "Watcher")
  @js.native
  val Watcher: NamedExoticComponent[Form] = js.native
  
  type ChildrenType[Values] = RenderChildren[Values]
  
  trait FormSubscribeProps extends StObject {
    
    var children: ChildrenType[Any]
    
    var to: js.Array[NamePath]
  }
  object FormSubscribeProps {
    
    inline def apply(
      children: (/* changedValues */ Record[String, Any], /* form */ FormInstance[Any]) => Node,
      to: js.Array[NamePath]
    ): FormSubscribeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSubscribeProps]
    }
    
    extension [Self <: FormSubscribeProps](x: Self) {
      
      inline def setChildren(value: (/* changedValues */ Record[String, Any], /* form */ FormInstance[Any]) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setTo(value: js.Array[NamePath]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: NamePath*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  type RenderChildren[Values] = js.Function2[/* changedValues */ Record[String, Any], /* form */ FormInstance[Values], Node]
}
