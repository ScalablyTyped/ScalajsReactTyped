package typingsJapgolly.antd

import typingsJapgolly.antd.libFormFormMod.FormComponentProps
import typingsJapgolly.antd.libFormFormMod.FormCreateOption
import typingsJapgolly.antd.libFormFormMod.FormProps
import typingsJapgolly.antd.libFormInterfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object libFormMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.antd.libFormFormMod.default {
    def this(props: FormProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: TypeofClassFormItemDefaultProps = js.native
    var createFormField: js.Any = js.native
    var defaultProps: Anon_Colon = js.native
    var propTypes: Anon_ArgsChildren = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
  }
  
}

