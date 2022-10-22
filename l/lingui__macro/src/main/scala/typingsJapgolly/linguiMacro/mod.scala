package typingsJapgolly.linguiMacro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiCore.cjsI18nMod.MessageDescriptor
import typingsJapgolly.linguiCore.mod.I18n_
import typingsJapgolly.linguiMacro.anon.FnCall
import typingsJapgolly.linguiReact.cjsTransMod.TransRenderProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Record
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/macro", "Plural")
  @js.native
  val Plural_ : Any & ComponentType[ChoiceProps] = js.native
  
  @JSImport("@lingui/macro", "SelectOrdinal")
  @js.native
  val SelectOrdinal_ : Any & ComponentType[ChoiceProps] = js.native
  
  @JSImport("@lingui/macro", "Select")
  @js.native
  val Select_ : Any & ComponentType[SelectProps] = js.native
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  val Trans: Any & ComponentType[TransProps] = js.native
  
  inline def defineMessage(descriptor: MessageDescriptor): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(descriptor.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  
  inline def plural(value: String, options: ChoiceOptions[String] & BasicType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def plural(value: String, options: ChoiceOptions[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def plural(value: Double, options: ChoiceOptions[String] & BasicType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def plural(value: Double, options: ChoiceOptions[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def select(value: String, choices: (Record[String, String]) & BasicType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def select(value: String, choices: ChoiceOptions[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def selectOrdinal(value: String, options: ChoiceOptions[String] & BasicType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def selectOrdinal(value: String, options: ChoiceOptions[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def selectOrdinal(value: Double, options: ChoiceOptions[String] & BasicType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def selectOrdinal(value: Double, options: ChoiceOptions[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def t(descriptor: MessageDescriptor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(descriptor.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def t(i18n: I18n_): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(i18n.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def t(literals: TemplateStringsArray, placeholders: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(scala.List(literals.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  trait BasicType extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object BasicType {
    
    inline def apply(): BasicType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicType]
    }
    
    extension [Self <: BasicType](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait ChoiceOptions[T]
    extends StObject
       with UnderscoreDigit[T] {
    
    var few: js.UndefOr[T] = js.undefined
    
    var many: js.UndefOr[T] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var one: js.UndefOr[T] = js.undefined
    
    var other: js.UndefOr[T] = js.undefined
    
    var zero: js.UndefOr[T] = js.undefined
  }
  object ChoiceOptions {
    
    inline def apply[T](): ChoiceOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChoiceOptions[T]]
    }
    
    extension [Self <: ChoiceOptions[?], T](x: Self & ChoiceOptions[T]) {
      
      inline def setFew(value: T): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setMany(value: T): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOne(value: T): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: T): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setZero(value: T): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  trait ChoiceProps
    extends StObject
       with ChoiceOptions[String] {
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object ChoiceProps {
    
    inline def apply(): ChoiceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChoiceProps]
    }
    
    extension [Self <: ChoiceProps](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectProps
    extends StObject
       with Values {
    
    var other: Any
    
    var value: String
  }
  object SelectProps {
    
    inline def apply(other: Any, value: String): SelectProps = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
      inline def setOther(value: Any): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[ComponentType[TransRenderProps]] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ TransRenderProps, Element | Null]] = js.undefined
    
    var values: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object TransProps {
    
    inline def apply(): TransProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransProps]
    }
    
    extension [Self <: TransProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setComponent(value: ComponentType[TransRenderProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRender(value: /* props */ TransRenderProps => Element | Null): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setValues(value: Record[String, Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type UnderscoreDigit[T] = StringDictionary[T]
  
  /**
    * The types should be changed after this PR is merged
    * https://github.com/Microsoft/TypeScript/pull/26797
    *
    * then we should be able to specify that key of values is same type as value.
    * We would be able to remove separate type Values = {...} definition
    * eg.
    * type SelectProps<Values> = {
    *  value?: Values
    *  [key: Values]: string
    * }
    *
    */
  type Values = StringDictionary[String]
}
