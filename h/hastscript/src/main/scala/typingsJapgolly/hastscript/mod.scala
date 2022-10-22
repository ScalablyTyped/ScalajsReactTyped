package typingsJapgolly.hastscript

import typingsJapgolly.hast.mod.Element
import typingsJapgolly.hast.mod.Root
import typingsJapgolly.hastscript.libCoreMod.HChild
import typingsJapgolly.hastscript.libCoreMod.HProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hastscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def h(): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("h")().asInstanceOf[Root]
  inline def h(selector: String, children: HChild*): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
  inline def h(selector: String, properties: Unit, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def h(selector: String, properties: HProperties, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def h(selector: Null, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
  inline def h(selector: Unit, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
  
  inline def s(): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("s")().asInstanceOf[Root]
  inline def s(selector: String, children: HChild*): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
  inline def s(selector: String, properties: Unit, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("s")((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def s(selector: String, properties: HProperties, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("s")((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def s(selector: Null, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
  inline def s(selector: Unit, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
  
  type Child = typingsJapgolly.hastscript.libMod.Child
  
  type Properties = typingsJapgolly.hastscript.libMod.Properties
}
