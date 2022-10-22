package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.anon.ChildrenRef
import typingsJapgolly.antd.anon.Fn0
import typingsJapgolly.antd.anon.FnCall
import typingsJapgolly.antd.anon.FnCallDependenciesForm
import typingsJapgolly.antd.libFormContextMod.FormProviderProps
import typingsJapgolly.antd.libFormErrorListMod.ErrorListProps
import typingsJapgolly.antd.libFormFormItemMod.FormItemInterface
import typingsJapgolly.antd.libFormFormListMod.FormListProps
import typingsJapgolly.antd.libFormFormMod.FormProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormMod extends Shortcut {
  
  @JSImport("antd/lib/form", JSImport.Default)
  @js.native
  val default: FormInterface = js.native
  
  @js.native
  trait FormInterface
    extends StObject
       with InternalFormType {
    
    var ErrorList: js.Function1[
        /* hasHelpHelpStatusErrorsWarningsRootClassNameFieldIdOnVisibleChanged */ ErrorListProps, 
        Element
      ] = js.native
    
    var Item: FormItemInterface = js.native
    
    var List: FC[FormListProps] = js.native
    
    var Provider: FC[FormProviderProps] = js.native
    
    /** @deprecated Only for warning usage. Do not use. */
    def create(): Unit = js.native
    
    var useForm: FnCall = js.native
    
    var useFormInstance: Fn0 = js.native
    
    var useWatch: FnCallDependenciesForm = js.native
  }
  
  @js.native
  trait InternalFormType extends StObject {
    
    def apply[Values](props: ChildrenRef[Values] & FormProps[Values]): japgolly.scalajs.react.facade.React.Element = js.native
  }
  
  type _To = FormInterface
  
  /* This means you don't have to write `default`, but can instead just say `libFormMod.foo` */
  override def _to: FormInterface = default
}
