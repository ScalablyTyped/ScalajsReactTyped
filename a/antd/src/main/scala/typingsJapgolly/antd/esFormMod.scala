package typingsJapgolly.antd

import typingsJapgolly.antd.esFormFormMod.FormComponentProps
import typingsJapgolly.antd.esFormFormMod.FormCreateOption
import typingsJapgolly.antd.esFormFormMod.FormProps
import typingsJapgolly.antd.esFormInterfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/form", JSImport.Namespace)
@js.native
object esFormMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.antd.esFormFormMod.default {
    def this(props: FormProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: TypeofClassFormItem = js.native
    var createFormField: js.Any = js.native
    var defaultProps: Anon_Colon = js.native
    var propTypes: Anon_ArgsChildren = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
  }
  
}

