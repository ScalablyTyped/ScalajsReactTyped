package typingsJapgolly.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ltx.srcElementMod.Node
import typingsJapgolly.ltx.srcElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateElementMod {
  
  inline def apply(name: String, attrs: String, children: Node*): default = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  inline def apply(name: String, attrs: StringDictionary[Any], children: Node*): default = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  inline def apply(name: String, attrs: Unit, children: Node*): default = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  
  @JSImport("ltx/lib/createElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
