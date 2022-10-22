package typingsJapgolly.antd.components

import typingsJapgolly.antd.anon.ChildrenRef
import typingsJapgolly.antd.anon.Errors
import typingsJapgolly.antd.libFormContextMod.FormProviderProps
import typingsJapgolly.antd.libFormErrorListMod.ErrorListProps
import typingsJapgolly.antd.libFormFormItemMod.FormItemProps
import typingsJapgolly.antd.libFormFormListMod.FormListFieldData
import typingsJapgolly.antd.libFormFormListMod.FormListOperation
import typingsJapgolly.antd.libFormFormListMod.FormListProps
import typingsJapgolly.antd.libFormFormMod.FormProps
import typingsJapgolly.antd.libFormHooksUseFormMod.FormInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Form {
  
  inline def apply[Values](): SharedBuilder_ChildrenRefFormProps1991638476[FormInstance[Values], Values] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_ChildrenRefFormProps1991638476[FormInstance[Values], Values](js.Array(this.component, __props.asInstanceOf[ChildrenRef[Values] & FormProps[Values]]))
  }
  
  object ErrorList {
    
    @JSImport("antd", "Form.ErrorList")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ErrorList.type): SharedBuilder_ErrorListProps_870714246 = new SharedBuilder_ErrorListProps_870714246(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* hasHelpHelpStatusErrorsWarningsRootClassNameFieldIdOnVisibleChanged */ ErrorListProps): SharedBuilder_ErrorListProps_870714246 = new SharedBuilder_ErrorListProps_870714246(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Form {
    
    inline def apply[Values](): SharedBuilder_FormItemProps1021875723[Values] = {
      val __props = js.Dynamic.literal()
      new SharedBuilder_FormItemProps1021875723[Values](js.Array(this.component, __props.asInstanceOf[FormItemProps[Values]]))
    }
    
    @JSImport("antd", "Form.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make[Values](companion: Form.type): SharedBuilder_FormItemProps1021875723[Values] = new SharedBuilder_FormItemProps1021875723[Values](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps[Values](p: FormItemProps[Values]): SharedBuilder_FormItemProps1021875723[Values] = new SharedBuilder_FormItemProps1021875723[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object List {
    
    inline def apply(
      children: (js.Array[FormListFieldData], FormListOperation, Errors) => japgolly.scalajs.react.facade.React.Node,
      name: String | Double | (js.Array[String | Double])
    ): SharedBuilder_FormListProps_1773376707 = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
      new SharedBuilder_FormListProps_1773376707(js.Array(this.component, __props.asInstanceOf[FormListProps]))
    }
    
    @JSImport("antd", "Form.List")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: FormListProps): SharedBuilder_FormListProps_1773376707 = new SharedBuilder_FormListProps_1773376707(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Provider {
    
    @JSImport("antd", "Form.Provider")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Provider.type): SharedBuilder_FormProviderProps1136047338 = new SharedBuilder_FormProviderProps1136047338(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps1136047338 = new SharedBuilder_FormProviderProps1136047338(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Form")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[Values](companion: Form.type): SharedBuilder_ChildrenRefFormProps1991638476[FormInstance[Values], Values] = new SharedBuilder_ChildrenRefFormProps1991638476[FormInstance[Values], Values](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Values](p: ChildrenRef[Values] & FormProps[Values]): SharedBuilder_ChildrenRefFormProps1991638476[FormInstance[Values], Values] = new SharedBuilder_ChildrenRefFormProps1991638476[FormInstance[Values], Values](js.Array(this.component, p.asInstanceOf[js.Any]))
}
