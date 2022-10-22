package typingsJapgolly.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ltx.srcElementMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCreateElementMod {
  
  @JSImport("ltx/src/createElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String, attrs: String, children: Node*): typingsJapgolly.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.ltx.srcElementMod.default]
  inline def default(name: String, attrs: StringDictionary[Any], children: Node*): typingsJapgolly.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.ltx.srcElementMod.default]
  inline def default(name: String, attrs: Unit, children: Node*): typingsJapgolly.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.ltx.srcElementMod.default]
}
