package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.formContextMod.FormProviderProps
import typingsJapgolly.antd.formFormMod.FormProps
import typingsJapgolly.antd.formItemMod.FormItemProps
import typingsJapgolly.antd.formListMod.FormListProps
import typingsJapgolly.antd.formUtilMod.FormInstance
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  @js.native
  trait Form extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    var Item: js.Function1[/* props */ FormItemProps, Element] = js.native
    var List: FC[FormListProps] = js.native
    var Provider: FC[FormProviderProps] = js.native
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
    /** @deprecated Only for warning usage. Do not use. */
    def create(): Unit = js.native
  }
  
  val default: Form = js.native
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}

