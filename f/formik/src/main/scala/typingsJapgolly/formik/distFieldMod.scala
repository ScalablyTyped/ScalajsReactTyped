package typingsJapgolly.formik

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.formik.anon.Name
import typingsJapgolly.formik.distTypesMod.FieldHelperProps
import typingsJapgolly.formik.distTypesMod.FieldInputProps
import typingsJapgolly.formik.distTypesMod.FieldMetaProps
import typingsJapgolly.formik.distTypesMod.FieldValidator
import typingsJapgolly.formik.distTypesMod.FormikProps
import typingsJapgolly.formik.distTypesMod.GenericFieldHTMLAttributes
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldMod {
  
  @JSImport("formik/dist/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Field(hasValidateNameRenderChildrenIsComponentProps: FieldAttributes[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(hasValidateNameRenderChildrenIsComponentProps.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useField[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(propsOrFieldName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]]]
  inline def useField[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(propsOrFieldName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]]]
  
  type FieldAttributes[T] = GenericFieldHTMLAttributes & FieldConfig[T] & T & Name
  
  trait FieldConfig[V] extends StObject {
    
    /**
      * Component to render. Can either be a string e.g. 'select', 'input', or 'textarea', or a component.
      */
    var as: js.UndefOr[
        (ComponentType[FieldInputProps[V] | js.Object]) | String | ForwardRefExoticComponent[Any]
      ] = js.undefined
    
    /**
      * Children render function <Field name>{props => ...}</Field>)
      */
    var children: js.UndefOr[(js.Function1[/* props */ FieldProps[V, Any], Node]) | Node] = js.undefined
    
    /**
      * Field component to render. Can either be a string like 'select' or a component.
      */
    var component: js.UndefOr[
        String | (ComponentType[(FieldProps[V, Any]) | js.Object]) | ForwardRefExoticComponent[Any]
      ] = js.undefined
    
    /** Inner ref */
    var innerRef: js.UndefOr[js.Function1[/* instance */ Any, Unit]] = js.undefined
    
    /**
      * Field name
      */
    var name: String
    
    /**
      * Render prop (works like React router's <Route render={props =>} />)
      * @deprecated
      */
    var render: js.UndefOr[js.Function1[/* props */ FieldProps[V, Any], Node]] = js.undefined
    
    /** HTML input type */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Validate a single field value independently
      */
    var validate: js.UndefOr[FieldValidator] = js.undefined
    
    /** Field value */
    var value: js.UndefOr[Any] = js.undefined
  }
  object FieldConfig {
    
    inline def apply[V](name: String): FieldConfig[V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldConfig[V]]
    }
    
    extension [Self <: FieldConfig[?], V](x: Self & FieldConfig[V]) {
      
      inline def setAs(value: (ComponentType[FieldInputProps[V] | js.Object]) | String | ForwardRefExoticComponent[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: (js.Function1[/* props */ FieldProps[V, Any], Node]) | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ FieldProps[V, Any] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponent(value: String | (ComponentType[(FieldProps[V, Any]) | js.Object]) | ForwardRefExoticComponent[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setInnerRef(value: /* instance */ Any => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: /* instance */ Any) => value(t0).runNow()))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* props */ FieldProps[V, Any] => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: /* value */ Any => String | Unit | (js.Promise[String | Unit])): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FieldHookConfig[T] = GenericFieldHTMLAttributes & FieldConfig[T]
  
  trait FieldProps[V, FormValues] extends StObject {
    
    var field: FieldInputProps[V]
    
    var form: FormikProps[FormValues]
    
    var meta: FieldMetaProps[V]
  }
  object FieldProps {
    
    inline def apply[V, FormValues](field: FieldInputProps[V], form: FormikProps[FormValues], meta: FieldMetaProps[V]): FieldProps[V, FormValues] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldProps[V, FormValues]]
    }
    
    extension [Self <: FieldProps[?, ?], V, FormValues](x: Self & (FieldProps[V, FormValues])) {
      
      inline def setField(value: FieldInputProps[V]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setForm(value: FormikProps[FormValues]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: FieldMetaProps[V]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
