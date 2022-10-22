package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.anon.Html
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxChildren
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxComponent
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsJsxMod {
  
  @JSImport("typedoc/dist/lib/utils/jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/utils/jsx", "Fragment")
  @js.native
  val Fragment: js.Symbol = js.native
  
  inline def Raw(_props: Html): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(_props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def createElement(tag: String, props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
  inline def createElement(tag: String, props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
  inline def createElement(tag: js.Symbol, props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
  inline def createElement(tag: js.Symbol, props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
  inline def createElement(tag: JsxComponent[Any], props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
  inline def createElement(tag: JsxComponent[Any], props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
  
  inline def renderElement(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")().asInstanceOf[String]
  inline def renderElement(element: JsxElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any]).asInstanceOf[String]
}
