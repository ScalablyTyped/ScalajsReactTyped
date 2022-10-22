package typingsJapgolly.formik.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.formik.distTypesMod.FormikContextType
import typingsJapgolly.react.mod.ConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormikConsumer {
  
  inline def apply(children: FormikContextType[Any] => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[FormikContextType[Any]]]))
  }
  
  @JSImport("formik", "FormikConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[FormikContextType[Any]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
