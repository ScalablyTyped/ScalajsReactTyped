package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import typingsJapgolly.antd.libFormFormMod.RequiredMark
import typingsJapgolly.antd.libFormHooksUseFormMod.FormInstance
import typingsJapgolly.antd.libFormInterfaceMod.FormLabelAlign
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.rcFieldForm.esFormContextMod.FormChangeInfo
import typingsJapgolly.rcFieldForm.esFormContextMod.FormFinishInfo
import typingsJapgolly.rcFieldForm.esInterfaceMod.Meta
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormContextMod {
  
  @JSImport("antd/lib/form/context", "FormContext")
  @js.native
  val FormContext: Context[FormContextProps] = js.native
  
  @JSImport("antd/lib/form/context", "FormItemInputContext")
  @js.native
  val FormItemInputContext: Context[FormItemStatusContextProps] = js.native
  
  @JSImport("antd/lib/form/context", "FormItemPrefixContext")
  @js.native
  val FormItemPrefixContext: Context[FormItemPrefixContextProps] = js.native
  
  @JSImport("antd/lib/form/context", "FormProvider")
  @js.native
  val FormProvider: FC[FormProviderProps] = js.native
  
  @JSImport("antd/lib/form/context", "NoFormStyle")
  @js.native
  val NoFormStyle: FC[NoFormStyleProps] = js.native
  
  @JSImport("antd/lib/form/context", "NoStyleItemContext")
  @js.native
  val NoStyleItemContext: Context[ReportMetaChange | Null] = js.native
  
  trait FormContextProps extends StObject {
    
    var colon: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[FormInstance[Any]] = js.undefined
    
    def itemRef(name: js.Array[String | Double]): js.Function1[/* node */ Element, Unit]
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
    
    var labelCol: js.UndefOr[ColProps] = js.undefined
    
    var labelWrap: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var requiredMark: js.UndefOr[RequiredMark] = js.undefined
    
    var vertical: Boolean
    
    var wrapperCol: js.UndefOr[ColProps] = js.undefined
  }
  object FormContextProps {
    
    inline def apply(itemRef: js.Array[String | Double] => js.Function1[/* node */ Element, Unit], vertical: Boolean): FormContextProps = {
      val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef), vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormContextProps]
    }
    
    extension [Self <: FormContextProps](x: Self) {
      
      inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      inline def setForm(value: FormInstance[Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setItemRef(value: js.Array[String | Double] => js.Function1[/* node */ Element, Unit]): Self = StObject.set(x, "itemRef", js.Any.fromFunction1(value))
      
      inline def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      inline def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      inline def setLabelWrap(value: Boolean): Self = StObject.set(x, "labelWrap", value.asInstanceOf[js.Any])
      
      inline def setLabelWrapUndefined: Self = StObject.set(x, "labelWrap", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      inline def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  trait FormItemPrefixContextProps extends StObject {
    
    var prefixCls: String
    
    var status: js.UndefOr[ValidateStatus] = js.undefined
  }
  object FormItemPrefixContextProps {
    
    inline def apply(prefixCls: String): FormItemPrefixContextProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemPrefixContextProps]
    }
    
    extension [Self <: FormItemPrefixContextProps](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait FormItemStatusContextProps extends StObject {
    
    var feedbackIcon: js.UndefOr[Node] = js.undefined
    
    var hasFeedback: js.UndefOr[Boolean] = js.undefined
    
    var isFormItemInput: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[ValidateStatus] = js.undefined
  }
  object FormItemStatusContextProps {
    
    inline def apply(): FormItemStatusContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemStatusContextProps]
    }
    
    extension [Self <: FormItemStatusContextProps](x: Self) {
      
      inline def setFeedbackIcon(value: VdomNode): Self = StObject.set(x, "feedbackIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFeedbackIconNull: Self = StObject.set(x, "feedbackIcon", null)
      
      inline def setFeedbackIconUndefined: Self = StObject.set(x, "feedbackIcon", js.undefined)
      
      inline def setFeedbackIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "feedbackIcon", js.Array(value*))
      
      inline def setFeedbackIconVdomElement(value: VdomElement): Self = StObject.set(x, "feedbackIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      inline def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      inline def setIsFormItemInput(value: Boolean): Self = StObject.set(x, "isFormItemInput", value.asInstanceOf[js.Any])
      
      inline def setIsFormItemInputUndefined: Self = StObject.set(x, "isFormItemInput", js.undefined)
      
      inline def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-field-form.rc-field-form/es/FormContext.FormProviderProps, 'validateMessages'> */
  trait FormProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object FormProviderProps {
    
    inline def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    extension [Self <: FormProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Callback): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2((t0: /* name */ String, t1: /* info */ FormChangeInfo) => (value(t0, t1)).runNow()))
      
      inline def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      inline def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Callback): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2((t0: /* name */ String, t1: /* info */ FormFinishInfo) => (value(t0, t1)).runNow()))
      
      inline def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{  status :boolean | undefined,   override :boolean | undefined}> */
  trait NoFormStyleProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
  }
  object NoFormStyleProps {
    
    inline def apply(): NoFormStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoFormStyleProps]
    }
    
    extension [Self <: NoFormStyleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type ReportMetaChange = js.Function2[/* meta */ Meta, /* uniqueKeys */ js.Array[Key], Unit]
}
