package typingsJapgolly.hastscript

import typingsJapgolly.hast.mod.Element
import typingsJapgolly.hast.mod.Root
import typingsJapgolly.hastscript.anon.Children
import typingsJapgolly.hastscript.libRuntimeMod.JSXProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgJsxRuntimeMod {
  
  @JSImport("hastscript/svg/jsx-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hastscript/svg/jsx-runtime", "Fragment")
  @js.native
  val Fragment: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  
  inline def jsx(`type`: String, props: JSXProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsx(`type`: String, props: JSXProps, key: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsx(`type`: Null, props: Children): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def jsx(`type`: Null, props: Children, key: String): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def jsx(`type`: Unit, props: Children): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def jsx(`type`: Unit, props: Children, key: String): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  inline def jsxs(`type`: String, props: JSXProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsxs(`type`: String, props: JSXProps, key: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsxs(`type`: Null, props: Children): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def jsxs(`type`: Null, props: Children, key: String): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def jsxs(`type`: Unit, props: Children): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def jsxs(`type`: Unit, props: Children, key: String): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Root]
}
